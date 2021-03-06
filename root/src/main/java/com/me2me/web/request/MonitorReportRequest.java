package com.me2me.web.request;

import com.me2me.common.web.Request;
import lombok.Getter;
import lombok.Setter;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/4/5
 * Time :11:43
 */
public class MonitorReportRequest extends Request{

    /**
     * 开始日期
     */
    @Getter
    @Setter
    private String startDate;

    /**
     * 截止日期
     */
    @Getter
    @Setter
    private String endDate;


    /**
     * 类型
     */
    @Getter
    @Setter
    private int type;

    /**
     * 行为类型
     */
    @Getter
    @Setter
    private int actionType;


}
