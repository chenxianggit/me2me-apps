package com.me2me.common.web;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/2/26.
 */

/**
 * 系统返回信息描述枚举类
 */
public enum  ResponseStatus {



    USER_SING_UP_SUCCESS("用户注册成功","user sign up success",2000),

    USER_LOGIN_SUCCESS("用户登录成功","user login success",2001),

    USER_MODIFY_ENCRYPT_SUCCESS("用户密码修改成功","user modifyEncrypt success",2002),

    USER_MODIFY_HOBBY_SUCCESS("用户爱好修改成功","user modifyHobby success",2003),

    USER_VERIFY_GET_SUCCESS("验证码发送成功","user verify get success",2004),

    USER_VERIFY_CHECK_SUCCESS("验证码通过","user verify check success",2005),

    USER_MODIFY_AVATAR_SUCCESS("用户头像修改成功","user modify avatar success",2006),

    USER_MODIFY_NICK_NAME_SUCCESS("用昵称像修改成功","user modify nickName success",2007),

    USER_MODIFY_PROFILE_SUCCESS("用户资料修改成功","user modify profile success",2008),

    USER_ADD_FRIEND_SUCCESS("用户创建好友成功","user create friend success",20020),

    USER_REMOVE_FRIEND_SUCCESS("用户删除好友成功","user remove friend success",20021),

    USER_CREATE_GROUP_SUCCESS("用户创建群组成功","user create group success",20022),

    ADD_GROUP_MEMBER_SUCCESS("添加群成员成功","add group member success",20023),

    REMOVE_GROUP_MEMBER_SUCCESS("移除群成员成功","remove group member success",20023),

    PUBLISH_ARTICLE_SUCCESS("用户发表文章成功","user publish article success",20040),

    CONTENT_USER_LIKES_SUCCESS("用户点赞成功","content user likes success",20041),

    USER_FIND_ENCRYPT_SUCCESS("用户密码找回成功","user find encrypt success",20042),

    CONTENT_USER_CANCEL_LIKES_SUCCESS("用户取消点赞成功","content user cancel likes success",20043),

    PASTE_TAG_SUCCESS("打标签成功","paste tag success",20060),

    CONTENT_DELETE_SUCCESS("删除成功","content delete success",20043),

    CONTENT_TAGS_LIKES_SUCCESS("标签发布成功","content tags likes success",20044),

    CONTENT_GET_SUCCESS("获取内容详情","content get success",20045),

    GET_QINIU_TOKEN_SUCCESS("获取七牛token成功","get qiniu token success",20050),

    GET_USER_NOTICE_SUCCESS("获取用户提醒成功","get user notice success",20051),

    GET_USER_TIPS_SUCCESS("获取用户消息成功","get user tips success",20052),

    CLEAN_USER_TIPS_SUCCESS("清空用户消息成功","clean user tips success",20053),

    USER_CREATE_REPORT_SUCCESS("举报成功","user create report success",20054),

    USER_CREATE_LIVE_SUCCESS("直播创建成功","user create live success",20055),

    GET_LIVE_TIME_LINE_SUCCESS("获取直播信息成功","get live time line success",20056),

    USER_SPEAK_SUCCESS("用户发言成功","user speak success",20057),

    GET_USER_TAGS_SUCCESS("获取用户标签成功","get user tags success",20058),

    USER_TAGS_LIKES_SUCCESS("点赞成功","user tags likes success",20059),

    USER_TAGS_LIKES_CANCEL_SUCCESS("取消点赞成功","user tags likes cancel success",20060),

    USER_FINISH_LIVE_SUCCESS("直接结束成功","user finish live success",20061),

    GET_MY_LIVE_SUCCESS("获取我的直播列表成功","get my live success",20062),

    GET_LIVES_SUCCESS("获取直播列表成功","get lives success",20063),

    SET_LIVE_FAVORITE_SUCCESS("关注成功","set live favorite success",20064),

    CANCEL_LIVE_FAVORITE_SUCCESS("取消关注成功","cancel live favorite success",20065),












    USER_PASSWORD_ERROR("用户密码错误","user password error",5000),

    USER_NOT_EXISTS("该用户不存在","user not exists",5001),

    USER_VERIFY_GET_ERROR("验证码发送失败","user verify get error",5002),

    USER_VERIFY_CHECK_ERROR("验证码不正确","user verify check error",5003),

    USER_VERIFY_ERROR("验证码发送次数超限","user verify error",5004),

    USER_MODIFY_ENCRYPT_PASSWORD_NOT_SAME_ERROR("两次密码输入不一致"," user the two passwords are not the same",5005),

    USER_MODIFY_USER_PROFILE_ERROR("用户信息修改错误","user modify user profile error",5006),

    USER_FIND_ENCRYPT_PASSWORD_NOT_SAME_ERROR("用户找回密码两次密码不一致","user find encrypt password not same error",5007),

    USER_MOBILE_DUPLICATE("手机号码已经注册过了","user mobile duplicate",5008),

    DATA_DOES_NOT_EXIST("请求的数据不存在","data does not exist ",5009),

    DATA_IS_DELETE("请求的数据已删除","data is delete ",50010),

    USER_MOBILE_NO_SIGN_UP("手机号码还未注册","user mobile no sign up",50011),

    FINISH_LIVE_NO_POWER("您没有权限或者直播已经结束","finish live no power",50012),

    USER_LIVE_IS_OVER("直接已经结束","user live is over",20062),





    USER_ADD_FRIEND_ERROR("不能自己添加自己为好友","can't add yourself",50020);

    public String message;

    public String englishMessage;

    public int status;

    ResponseStatus(String message,String englishMessage,int status){
        this.message = message;
        this.englishMessage = englishMessage;
        this.status = status;
    }

}
