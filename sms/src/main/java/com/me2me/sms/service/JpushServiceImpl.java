package com.me2me.sms.service;

import cn.jpush.api.JPushClient;
import cn.jpush.api.common.resp.APIConnectionException;
import cn.jpush.api.common.resp.APIRequestException;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.notification.AndroidNotification;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/8/9.
 */
@Service
public class JPushServiceImpl implements JPushService{


    private final JPushClient jPushClient;

    /**
     * 初始化JPushclient
     */
    public JPushServiceImpl(){
        this.jPushClient = new JPushClient(masterSecret,appKey);
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
    public void payloadById(String regId,String message) {
        PushPayload payload = PushPayload
                .newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.registrationId(regId))
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
    public void payloadByIdExtra(String regId,String message,JsonObject jsonExtra) {
        PushPayload payload = PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())
                .setAudience(Audience.registrationId(regId))
                .setNotification(Notification.newBuilder()
                        // android 平台
                        .setAlert(message)
                        .addPlatformNotification(AndroidNotification.newBuilder()
                                .addExtra("extra", jsonExtra)
                                .build())
                        // ios 平台
                        .addPlatformNotification(IosNotification.newBuilder()
                                .incrBadge(1)
                                .addExtra("extra",jsonExtra).build())
                        .build())
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
