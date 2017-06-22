package com.me2me.live.dto;

import com.google.common.collect.Lists;
import com.me2me.common.web.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/4/11
 * Time :18:28
 */
@Data
public class LiveTimeLineDto2 implements BaseEntity {

    private  List<LiveElement> liveElements = Lists.newArrayList();

    private List<LastElement> lastElements =Lists.newArrayList();

    public static LiveElement createElement(){
        return new LiveElement();
    }

    public static LastElement createLastElement(){
        return new LastElement();
    }

    @Data
    public static class LiveElement implements BaseEntity {

        private long uid;

        private String nickName;

        private int isFollowed;

        private long fragmentId;

        private Date createTime;

        private int contentType;

        private int type;

        private String fragment;

        private String fragmentImage;

        private int internalStatus;

        private int reviewCount;

    }


    @Data
    public static class LastElement implements BaseEntity {

        private long uid;

        private String nickName;

        private int level;

        private int isFollowed;

        private long fragmentId;

        private Date createTime;

        private int contentType;

        private int type;

        private String fragment;

        private String fragmentImage;

        private int internalStatus;

        private int reviewCount;

    }

}
