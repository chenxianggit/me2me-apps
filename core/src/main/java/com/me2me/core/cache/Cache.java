package com.me2me.core.cache;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/6/6.
 */
public interface Cache {

    void set(String key,String value);

    String get(String key);

}
