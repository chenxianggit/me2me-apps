package com.me2me.web.request;

import com.me2me.common.web.Request;
import lombok.Getter;
import lombok.Setter;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/4/21
 * Time :15:02
 */
public class ModifyContentRequest extends Request{

    @Getter
    @Setter
    private long cid;

    @Getter
    @Setter
    private int rights;
}
