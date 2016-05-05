package com.me2me.activity.dto;

import com.google.common.collect.Lists;
import com.me2me.activity.model.Activity;
import com.me2me.common.web.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/4/26.
 */
@Data
public class ShowActivityDto implements BaseEntity {

    private List<ActivityElement> result = Lists.newArrayList();

    private int total;

    private int totalPage;

    public ActivityElement createElement(){
        return new ActivityElement();
    }


    @Data
    public class ActivityElement implements BaseEntity{

        private long id;

        // 发布者
        private long uid;

        // 活动期次
        private String issue;

        // 活动标题
        private String title;

        // 活动标识
        private String hashTitle;

        // 活动内容
        private String content;

        // 活动封面图
        private String cover;

        // 活动开始时间
        private Date startTime;

        // 活动结束时间
        private Date endTime;

        // 活动状态
        private int status;
    }



}
