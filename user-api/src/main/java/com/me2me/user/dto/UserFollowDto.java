package com.me2me.user.dto;

import com.me2me.common.web.BaseEntity;
import lombok.Data;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/4/13.
 */
@Data
public class UserFollowDto implements BaseEntity {

    private long uid;

    private String avatar;

    private String nickName;

    private int isFollowed;

    private int isFollowMe;

    private String introduced;
}
