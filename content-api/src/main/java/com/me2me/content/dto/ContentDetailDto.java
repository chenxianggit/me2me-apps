package com.me2me.content.dto;

import com.google.common.collect.Lists;
import com.me2me.common.web.BaseEntity;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/3/28
 * Time :16:10
 */
@Data
public class ContentDetailDto implements BaseEntity {

    private long id;

    private long uid;

    private long tid;

    private String feeling;

    private String avatar;

    private int type;

    private String nickName;

    private int hotValue;

    private int likeCount;

    private Date createTime;

    private int isLike;

    private String content;

    private String coverImage;

    private String title;

    private int contentType;


    private List<ContentTagElement> tags = Lists.newArrayList();

    public static ContentTagElement createElement(){
        return new ContentTagElement();
    }

    @Data
    public static class ContentTagElement implements BaseEntity {

        private String tag;

    }

}
