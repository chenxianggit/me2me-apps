package com.me2me.web;

import com.me2me.activity.dto.CreateActivityDto;
import com.me2me.activity.service.ActivityService;
import com.me2me.common.utils.CommonUtils;
import com.me2me.common.web.Response;
import com.me2me.common.web.Specification;
import com.me2me.content.dto.EditorContentDto;
import com.me2me.content.dto.ShowContentDto;
import com.me2me.content.service.ContentService;
import com.me2me.user.dto.*;
import com.me2me.user.service.UserService;
import com.me2me.web.request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/2/25.
 */
@Controller
@RequestMapping(value = "/api/console")
public class ApplicationConsole extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private ContentService contentService;

    @Autowired
    private ActivityService activityService;

    /**
     * 用户注册接口
     * @return
     */
    @RequestMapping(value = "/bindAccount",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response bindAccount(BindAccountRequest bindAccountRequest){
        UserSignUpDto userSignUpDto = new UserSignUpDto();
        userSignUpDto.setMobile(CommonUtils.getRandom("8",10));
        userSignUpDto.setGender(0);
        userSignUpDto.setEncrypt("123456");
        userSignUpDto.setNickName(bindAccountRequest.getNickName());
        return userService.signUp(userSignUpDto);
    }

    /**
     * 用户注册接口
     * @return
     */
    @RequestMapping(value = "/showContents",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response showContents(ShowContentsRequest showContentsRequest){
        EditorContentDto editorContentDto = new EditorContentDto();
        editorContentDto.setArticleType(showContentsRequest.getArticleType());
        editorContentDto.setPage(showContentsRequest.getPage());
        editorContentDto.setPageSize(showContentsRequest.getPageSize());
        editorContentDto.setKeyword(showContentsRequest.getKeyword());
        return contentService.showContents(editorContentDto);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    /**
     * 运营中心创建活动
     * @return
     */
    @RequestMapping(value = "/createActivity",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response createActivity(CreateActivityRequest request){
        CreateActivityDto createActivityDto = new CreateActivityDto();
        createActivityDto.setUid(request.getUid());
        createActivityDto.setIssue(request.getIssue());
        createActivityDto.setContent(request.getContent());
        createActivityDto.setCover(request.getCover());
        createActivityDto.setTitle(request.getTitle());
        createActivityDto.setHashTitle(request.getHashTitle());
        createActivityDto.setStartTime(request.getStartTime());
        createActivityDto.setEndTime(request.getEndTime());
        return activityService.createActivity(createActivityDto);
    }

    /**
     * 运营中心活动列表
     * @return
     */
    @RequestMapping(value = "/showActivity",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response showActivity(ShowActivityRequest request){
        return activityService.showActivity(request.getPage(),request.getPageSize(),request.getKeyword());
    }

    /**
     * 运营操作接口
     * @return
     */
    @RequestMapping(value = "/option",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Response option(OptionRequest request){
        return contentService.option(request.getId(),request.getOptionAction(),request.getAction());
    }



}
