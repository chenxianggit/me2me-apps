package com.me2me.web.request;

import com.me2me.common.web.Request;
import lombok.Getter;
import lombok.Setter;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/6/27
 * Time :16:56
 */
public class ModifyCircleRequest extends Request{

    @Getter
    @Setter
    private int action;

    @Getter
    @Setter
    private long memberUid;

    @Getter
    @Setter
    private long topicId;
}
