package com.me2me.user.service;

import com.me2me.common.web.Response;
import com.me2me.common.web.ResponseStatus;
import com.me2me.user.dao.UserMybatisDao;
import com.me2me.user.dto.*;
import com.me2me.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/2/26.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMybatisDao userMybatisDao;

    /**
     * 用户注册
     * @param userDto
     * @return
     */
    public Response signUp(UserSignUpDto userDto) {
        return null;
    }

    /**
     * 用户登录
     * @param userLoginDto
     * @return
     */
    public Response login(UserLoginDto userLoginDto) {
        User user = userMybatisDao.getUserByUserName(userLoginDto.getUserName());
        if(user != null){
            if(userLoginDto.getEncrypt().equals(user.getEncrypt())){
                // 则用户登录成功
                LoginSuccessDto loginSuccessDto = new LoginSuccessDto();
                loginSuccessDto.setUid(user.getUid());
                loginSuccessDto.setUserName(user.getUserName());
                return Response.success(ResponseStatus.USER_LOGIN_SUCCESS.status,ResponseStatus.USER_LOGIN_SUCCESS.message,loginSuccessDto);
            }else{
                // 用户密码不正确
                return Response.failure(ResponseStatus.USER_PASSWORD_ERROR.status,ResponseStatus.USER_PASSWORD_ERROR.message);
            }

        }else{
            return Response.failure(ResponseStatus.USER_NOT_EXISTS.status,ResponseStatus.USER_NOT_EXISTS.message);
        }
    }

    public Response verify(VerifyDto verifyDto) {
        return null;
    }

    public Response modifyEncrypt(ModifyEncryptDto modifyEncryptDto){
        User user = userMybatisDao.getUserByUserName(modifyEncryptDto.getUserName());
        if(user != null){
            if(!modifyEncryptDto.getOldEncrypt().equals(user.getEncrypt())){
                return Response.failure(ResponseStatus.USER_PASSWORD_ERROR.status,ResponseStatus.USER_PASSWORD_ERROR.message);
            }else{
                user.setEncrypt(modifyEncryptDto.getFirstEncrypt());
                userMybatisDao.modifyUser(user);
                return Response.failure(ResponseStatus.USER_MODIFYENCRYPT_SUCCESS.status,ResponseStatus.USER_MODIFYENCRYPT_SUCCESS.message);
            }
        }else {
            return Response.failure(ResponseStatus.USER_NOT_EXISTS.status,ResponseStatus.USER_NOT_EXISTS.message);
        }
    }
}
