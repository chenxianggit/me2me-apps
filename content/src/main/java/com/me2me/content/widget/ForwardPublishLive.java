package com.me2me.content.widget;

import com.me2me.common.web.Response;
import com.me2me.content.dto.ContentDto;
import com.me2me.content.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/6/13
 * Time :14:50
 */
@Component
public class ForwardPublishLive  extends AbstractPublish implements Publish {

    @Autowired
    private ContentService contentService;

    public Response publish(ContentDto contentDto){
        return Response.success();
    }
}
