package com.me2me.sms.dto;

import com.me2me.common.web.BaseEntity;
import lombok.Data;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/5/30
 * Time :17:59
 */
@Data
public class PushMessageAndroidDto implements BaseEntity{

    //标题
    private String title;

    //内容
    private String content;

    //token
    private String token;

    private int messageType;


}
