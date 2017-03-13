package com.me2me.sms.service;

import com.google.common.base.Splitter;
import com.me2me.cache.service.CacheService;
import com.me2me.common.sms.YunXinSms;
import com.me2me.common.web.Response;
import com.me2me.common.web.ResponseStatus;
import com.me2me.core.event.ApplicationEventBus;
import com.me2me.sms.channel.MessageClient;
import com.me2me.sms.dto.VerifyDto;
import com.me2me.sms.event.VerifyEvent;
import com.me2me.sms.exception.SendMessageLimitException;
import com.me2me.sms.exception.SendMessageTimeException;
import com.me2me.sms.listener.VerifyCodeListener;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

import lombok.extern.slf4j.Slf4j;


/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/3/1.
 */
@Service
@Slf4j
public class SmsServiceImpl implements SmsService {

    @Autowired
    private ApplicationEventBus applicationEventBus;

    @Autowired
    private CacheService cacheService;

    private static final String VERIFY_PREFIX = "verify:";

    private Splitter splitter = Splitter.on("@").trimResults();

    @Autowired
    private VerifyCodeListener verifyCodeListener;

    @Autowired
    private MessageClient messageClient;

    /**
     * 发送验证码
     * @param verifyDto
     */
    @Override
    public Response send(VerifyDto verifyDto){
    	try{
    		verifyCodeListener.send(new VerifyEvent(verifyDto.getMobile(),verifyDto.getVerifyCode(),verifyDto.getChannel(),verifyDto.getIsTest()));
    	}catch(Exception e){
    		if(e instanceof SendMessageLimitException || e instanceof SendMessageTimeException){
    			return Response.success(20094,e.getMessage());
    		}else{
    			return Response.failure(e.getMessage());
    		}
    	}
    	return Response.success(ResponseStatus.USER_VERIFY_GET_SUCCESS.status,ResponseStatus.USER_VERIFY_GET_SUCCESS.message);
    }

    /**
     * 校验验证码
     * @param verifyDto
     */
    @Override
    public boolean verify(VerifyDto verifyDto) {
        // 网易云信通道验证
        if(verifyDto.getChannel()== ChannelType.NET_CLOUD_SMS.index) {
            return YunXinSms.verify(verifyDto.getMobile(), verifyDto.getVerifyCode());
        }
        // 获取redis中的数据
        String verifyCodeAndSendTimeMillis = cacheService.get(VERIFY_PREFIX+verifyDto.getMobile());
        if(!StringUtils.isEmpty(verifyCodeAndSendTimeMillis)){
            String verifyCode = splitter.splitToList(verifyCodeAndSendTimeMillis).get(0);
            if(verifyDto.getVerifyCode().equals(verifyCode))
                return true;
            return false;
        }
        return false;
    }

    @Override
    public boolean sendMessage(String nickName ,String awardName ,String mobile ,String OperateMobile) {
        Boolean isTrue = YunXinSms.sendSms2(nickName ,awardName ,mobile ,OperateMobile);
        if(isTrue){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean sendQIMessage(String mobile) {
        Boolean isTrue = YunXinSms.sendSms3(mobile);
        if(isTrue){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean sendQIauditMessage(List mobileList) {
        Boolean isTrue = YunXinSms.sendSms4(mobileList);
        if(isTrue){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void send7daySignUp(String mobile) {
        HashMap<String,Object> result = null;
        //没有需要传的数据传空，否则报错
        result = messageClient.getCcpRestSmsSDK().sendTemplateSMS(mobile,"142378",new String[]{""});
        System.out.println(result);
    }

    @Override
    public void send7dayApply(List mobileList) {
        String mobiles = getListToString(mobileList);
        HashMap<String,Object> result = null;
        result = messageClient.getCcpRestSmsSDK().sendTemplateSMS(mobiles,"106877",new String[]{"测试","5"});
    }

    @Override
    public void send7dayCommon(String templateId, List<String> mobileList, List<String> messageList) {
    	StringBuilder msb = new StringBuilder();
    	if(null != mobileList && mobileList.size() > 0){
    		for(String m : mobileList){
    			msb.append(",").append(m.trim());
    		}
    	}
    	String mobile = msb.toString();
    	if(mobile.length() > 0){
    		mobile = mobile.substring(1);
    	}
    	
    	try{
    		if(null == messageList || messageList.size() == 0){
        		messageClient.getCcpRestSmsSDK().sendTemplateSMS(mobile, templateId, new String[]{""});
        	}else{
        		String[] msgs = new String[messageList.size()];
        		for(int i=0;i<messageList.size();i++){
        			msgs[i] = messageList.get(i);
        		}
        		messageClient.getCcpRestSmsSDK().sendTemplateSMS(mobile, templateId, msgs);
        	}
    	}catch(Exception e){
    		log.error("发送短信失败", e);
    	}
    }

    /**
     * List转换成String逗号分隔的形式
     *
     * @param list
     * @return
     */
    private String getListToString(List list) {
        return StringUtils.join(list.toArray(), ",");
    }
}
