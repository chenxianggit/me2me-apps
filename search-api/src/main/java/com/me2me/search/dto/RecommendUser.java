package com.me2me.search.dto;

import com.me2me.common.web.BaseEntity;

import lombok.Data;

/**
 * 推荐用户。带推荐原因
 * @author zhangjiwei
 * @date Apr 20, 2017
 */
@Data
public class RecommendUser implements BaseEntity{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private long uid;
	private String nickName;
	private String avatar;
	private int v_lv;
	private int  reason;
}