package com.me2me.user.service;

import com.me2me.common.web.Response;
import com.me2me.user.dto.*;
import com.me2me.user.model.UserProfile;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/2/26.
 */
public interface UserService {


     /**
     * 用户注册接口
     * @param userDto
     * @return
     */
    Response signUp(UserSignUpDto userDto);


    /**
     * 用户登录接口
     * @param userLoginDto
     * @return
     */
    Response login(UserLoginDto userLoginDto);


    /**
     * 验证码和校验验证码接口
     * @return
     */
    Response verify(VerifyDto verifyDto);

    /**
     * 用户修改密码
     * @param modifyEncryptDto
     * @return
     */
    Response modifyEncrypt(ModifyEncryptDto modifyEncryptDto);

    /**
     * 修改爱好
     * @param modifyUserHobbyDto
     * @return
     */
    Response modifyUserHobby(ModifyUserHobbyDto modifyUserHobbyDto);

    /**
     * 用户端获取基础数据
     * @param basicDataDto
     * @return
     */
    Response getBasicDataByType(BasicDataDto basicDataDto);

    /**
     * 用户端获取基础数据
     * @return
     */
    Response getBasicData();

    /**
     * 用户信息修改
     * @param modifyUserProfileDto
     * @return
     */
    Response modifyUserProfile(ModifyUserProfileDto modifyUserProfileDto);

    UserProfile getUserProfileByUid(long uid);

    /**
     * 找回密码
     * @param findEncryptDto
     * @return
     */
    Response retrieveEncrypt(FindEncryptDto findEncryptDto);

    /**
     * 给指定的用户贴标签
     * @param pasteTagDto
     * @return
     */
    Response writeTag(PasteTagDto pasteTagDto);

}
