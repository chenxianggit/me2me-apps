package com.me2me.web;

import com.me2me.common.web.Response;
import com.me2me.common.web.ResponseWapx;
import com.me2me.io.service.FileTransferService;
import com.me2me.user.dto.WapxIosDto;
import com.me2me.web.request.WapxIosRequest;
import com.me2me.web.request.WeChatRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/2/25.
 */
@Controller
@RequestMapping(value = "/api/io")
public class IO extends BaseController {

    @Autowired
    private FileTransferService fileTransferService;

    /**
     * 收藏夹
     */
    @ResponseBody
    @RequestMapping(value = "/getQiniuAccessToken",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public Response getQiniuAccessToken(){
        return fileTransferService.getQiniuAccessToken();
    }


    /**
     * h5第三方登录 调用第三方接口(出外网)
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getUserInfo",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public String getUserInfo(WeChatRequest request) throws Exception {
        return fileTransferService.getUserInfo(request.getCode());
    }

    /**
     * 万普激活接口
     * @param request
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/iosWapxActivate",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public void IosWapxActivate(WapxIosRequest request) {
        fileTransferService.IosWapxActivate(request.getUdid() ,request.getApp() ,request.getIdfa() ,request.getOpenudid());
    }

}
