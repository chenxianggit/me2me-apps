package com.me2me.sms.service;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.ClientConfig;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.Map;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/8/9.
 */
@Slf4j
@Service("jPushServiceImpl")
public class JPushServiceImpl implements JPushService{

    private final JPushClient jPushClient;

    private static final int DEFAULT_LIVE_TIME = 86400 * 10;

    @Value("#{app.IOS_PUSH_ENV}")
    private String env;

    /**
     * 初始化JPushclient
     */
    public JPushServiceImpl(){
        ClientConfig config = ClientConfig.getInstance();
        config.setTimeToLive(DEFAULT_LIVE_TIME);
        this.jPushClient = new JPushClient(masterSecret,appKey,null,config);
    }


    @Override
    public void payloadAll(String message) {
        try {
            jPushClient.sendPush(PushPayload.alertAll(message));
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void payloadById(String uid,String message) {
        PushPayload payload = PushPayload
                .newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.alias(uid))
//                .setAudience(Audience.registrationId(regId))
                .setNotification(Notification.alert(message))
                .build();
        try {
            jPushClient.sendPush(payload);
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void payloadByIdExtra(String uid,String message,Map<String,String> extraMaps) {
        //默认为false开发环境，true为生产环境
        Options options;
        if("product".equals(env)) {
            options = Options.newBuilder().setApnsProduction(true).build();
        }else{
            options = Options.newBuilder().setApnsProduction(false).build();
        }
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())
                .setAudience(Audience.alias(uid))
//                .setAudience(Audience.registrationId(regId))
                .setNotification(Notification.newBuilder()
                        // android 平台
                        .setAlert(message)
                        .addPlatformNotification(AndroidNotification.newBuilder()
//                                .addExtra("extra",jsonObject).build())
                                .addExtras(extraMaps).build())
                        // ios 平台
                        .addPlatformNotification(IosNotification.newBuilder()
                                .incrBadge(1)
//                                .addExtra("extra",jsonObject).build())
                                .addExtras(extraMaps).build())
                        .build()).setOptions(options)
                .build();
        try {
            jPushClient.sendPush(payload);
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void payloadByIdForMessage(String uid, String message) {
        Message platformMessage = Message.content(message);
        PushPayload payload = PushPayload
                .newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.alias(uid))
//                .setAudience(Audience.registrationId(regId))
                .setMessage(platformMessage)
                .build();
        try {
            jPushClient.sendPush(payload);
        } catch (APIConnectionException e) {
            e.printStackTrace();
        } catch (APIRequestException e) {
            e.printStackTrace();
        }
    }

}
