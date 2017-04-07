package com.me2me.search.service;

import com.me2me.common.web.Response;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/4/11.
 */
public interface SearchService {

    Response search(String keyword,int page,int pageSize,long uid,int isSearchFans);

    Response assistant(String keyword);
    
    Response associatedWord(String keyword);

    Response allSearch(long uid, String keyword, int searchType, int page, int pageSize);
}
