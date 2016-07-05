package com.me2me.sns.service;

import com.me2me.common.web.Response;
import com.me2me.sns.dto.GetSnsCircleDto;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/6/27.
 */
public interface SnsService {

    /**
     * 获取成员列表（废弃）
     * @return
     */
    Response showMemberConsole(long owner,long topicId);

    /**
     * 邀请列表
     * @return
     */
    Response showMembers(GetSnsCircleDto getSnsCircleDto);

    /**
     * 修改社交关系
     * @return
     */
    Response modifyCircle(long owner,long topicId,long memberUid,int action);

    /**
     * 获取成员列表
     * @return
     */
    Response getCircleByType(GetSnsCircleDto getSnsCircleDto);

    /**
     *订阅
     * @param uid
     * @param topicId
     * @param topId
     * @param bottomId
     * @param action
     * @return
     */
    Response subscribed(long uid,long topicId,long topId,long bottomId,int action);

    /**
     *关注
     * @param action
     * @param targetUid
     * @param sourceUid
     * @return
     */
    Response follow(int action,long targetUid,long sourceUid);

}
