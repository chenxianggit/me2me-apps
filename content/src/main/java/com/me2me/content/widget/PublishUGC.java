package com.me2me.content.widget;

import com.me2me.activity.service.ActivityService;
import com.me2me.common.web.Response;
import com.me2me.common.web.Specification;
import com.me2me.content.dto.ContentDto;
import com.me2me.core.event.ApplicationEventBus;
import com.me2me.monitor.event.MonitorEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/6/6.
 */
@Component
public class PublishUGC extends AbstractPublish implements Publish {

    @Autowired
    private ActivityService activityService;

    @Autowired
    private ApplicationEventBus applicationEventBus;


    @Override
    public Response publish(ContentDto contentDto) {
        activityService.joinActivity(contentDto.getContent(),contentDto.getUid());
        applicationEventBus.post(new MonitorEvent(Specification.MonitorType.ACTION.index,Specification.MonitorAction.CONTENT_PUBLISH.index,0,contentDto.getUid()));
        return super.publish(contentDto);
    }

}
