package com.me2me.sns.service;

import com.me2me.common.Constant;
import com.me2me.common.web.Response;
import com.me2me.common.web.ResponseStatus;
import com.me2me.common.web.Specification;
import com.me2me.live.dto.SpeakDto;
import com.me2me.live.model.LiveFavorite;
import com.me2me.live.model.Topic;
import com.me2me.live.model.TopicFragment;
import com.me2me.live.service.LiveService;
import com.me2me.sns.dao.SnsMybatisDao;
import com.me2me.sns.dto.*;
import com.me2me.user.dto.FollowDto;
import com.me2me.user.model.UserProfile;
import com.me2me.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/6/27.
 */
@Service
@Slf4j
public class SnsServiceImpl implements SnsService {

    @Autowired
    private SnsMybatisDao snsMybatisDao;

    @Autowired
    private UserService userService;

    @Autowired
    private LiveService liveService;

    @Override
    public Response showMemberConsole(long owner,long topicId) {
        ShowMemberConsoleDto showMemberConsoleDto = new ShowMemberConsoleDto();
        GetSnsCircleDto dto = new GetSnsCircleDto();
        dto.setUid(owner);
        dto.setSinceId(0);
        dto.setTopicId(topicId);
        dto.setType(Specification.SnsCircle.IN.index);
        List<SnsCircleDto> list = snsMybatisDao.getSnsCircle(dto);
        for(SnsCircleDto circleDto : list){
            ShowMemberConsoleDto.UserElement userElement = ShowMemberConsoleDto.createUserElement();
            userElement.setUid(circleDto.getUid());
            userElement.setAvatar(Constant.QINIU_DOMAIN + "/" + circleDto.getAvatar());
            userElement.setIntroduced(circleDto.getIntroduced());
            userElement.setNickName(circleDto.getNickName());
            userElement.setInternalStatus(circleDto.getInternalStatus());
            showMemberConsoleDto.getInCircle().add(userElement);
        }
        dto.setType(Specification.SnsCircle.IN.index);
        int inCount = snsMybatisDao.getSnsCircleCount(dto);
        dto.setType(Specification.SnsCircle.OUT.index);
        int outCount = snsMybatisDao.getSnsCircleCount(dto);
        dto.setType(Specification.SnsCircle.CORE.index);
        int coreCount = snsMybatisDao.getSnsCircleCount(dto);
        showMemberConsoleDto.setMembers(inCount + outCount + coreCount);
        showMemberConsoleDto.setCoreCircleMembers(coreCount);
        showMemberConsoleDto.setInCircleMembers(inCount);
        showMemberConsoleDto.setOutCircleMembers(outCount);
        return Response.success(ResponseStatus.SHOW_MEMBER_CONSOLE_SUCCESS.status,ResponseStatus.SHOW_MEMBER_CONSOLE_SUCCESS.message,showMemberConsoleDto);
    }

    @Override
    public Response showMembers(GetSnsCircleDto dto) {
        log.info("showMembers start ...");
        ShowMembersDto showMembersDto = new ShowMembersDto();
        List<SnsCircleDto> list = snsMybatisDao.getSnsCircleMember(dto);
        log.info("showMembers get data");
        buildMembers(showMembersDto, list);
        log.info("showMembers build data");
        log.info("showMembers end ...");
        return Response.success(ResponseStatus.SHOW_MEMBERS_SUCCESS.status,ResponseStatus.SHOW_MEMBERS_SUCCESS.message,showMembersDto);
    }

    private void buildMembers(ShowMembersDto showMembersDto, List<SnsCircleDto> list) {
        for(SnsCircleDto circleDto : list){
            ShowMembersDto.UserElement userElement = showMembersDto.createUserElement();
            userElement.setUid(circleDto.getUid());
            userElement.setAvatar(Constant.QINIU_DOMAIN + "/" + circleDto.getAvatar());
            userElement.setIntroduced(circleDto.getIntroduced());
            userElement.setNickName(circleDto.getNickName());
            userElement.setInternalStatus(circleDto.getInternalStatus());
            showMembersDto.getMembers().add(userElement);
        }
    }

    @Override
    public Response circleByType(GetSnsCircleDto dto) {
        //先把自己加到核心
        snsMybatisDao.createSnsCircle(dto.getUid(),dto.getUid(),Specification.SnsCircle.CORE.index);
        log.info("getCircleByType start ...");
        ShowSnsCircleDto showSnsCircleDto = new ShowSnsCircleDto();
        List<SnsCircleDto> list = snsMybatisDao.getSnsCircle(dto);
        buildSnsCircle(showSnsCircleDto, list);
        dto.setType(Specification.SnsCircle.IN.index);
        int inCount = snsMybatisDao.getSnsCircleCount(dto);
        dto.setType(Specification.SnsCircle.OUT.index);
        int outCount = snsMybatisDao.getSnsCircleCount(dto);
        dto.setType(Specification.SnsCircle.CORE.index);
        int coreCount = snsMybatisDao.getSnsCircleCount(dto);
        showSnsCircleDto.setMembers(inCount + outCount + coreCount);
        showSnsCircleDto.setCoreCircleMembers(coreCount);
        showSnsCircleDto.setInCircleMembers(inCount);
        showSnsCircleDto.setOutCircleMembers(outCount);
        log.info("getCircleByType start ...");
        return Response.success(showSnsCircleDto);
    }

    private void buildSnsCircle(ShowSnsCircleDto showSnsCircleDto, List<SnsCircleDto> list) {
        for(SnsCircleDto circleDto : list){
            ShowSnsCircleDto.SnsCircleElement snsCircleElement = showSnsCircleDto.createElement();
            snsCircleElement.setUid(circleDto.getUid());
            snsCircleElement.setAvatar(Constant.QINIU_DOMAIN + "/" + circleDto.getAvatar());
            snsCircleElement.setIntroduced(circleDto.getIntroduced());
            snsCircleElement.setNickName(circleDto.getNickName());
            snsCircleElement.setInternalStatus(circleDto.getInternalStatus());
            showSnsCircleDto.getCircleElements().add(snsCircleElement);
        }
    }

    @Override
    public Response subscribed(long uid,long topicId, long topId, long bottomId, int action) {
        Topic topic = liveService.getTopicById(topicId);
        if(action == 0) {
            List<Topic> list = liveService.getTopicList(topic.getUid());
            for (Topic live : list) {
                liveService.setLive2(uid, live.getId(), 0, 0, action);
            }
            FollowDto dto = new FollowDto();
            dto.setSourceUid(uid);
            dto.setTargetUid(topic.getUid());
            dto.setAction(action);
            //关注
            userService.follow(dto);
            //保存圈子关系
            int isFollow = userService.isFollow(uid,topic.getUid());
            int internalStatus = 0;
            if(isFollow == 1){
                internalStatus = 1;
            }
            snsMybatisDao.createSnsCircle(uid,topic.getUid(),internalStatus);
        }else if(action == 1){
            //取消该直播的订阅
            liveService.setLive2(uid, topicId, 0, 0, action);
        }
        return Response.success(ResponseStatus.SET_LIVE_FAVORITE_SUCCESS.status,ResponseStatus.SET_LIVE_FAVORITE_SUCCESS.message);
    }

    @Override
    public Response follow(int action, long targetUid, long sourceUid) {
        FollowDto followDto = new FollowDto();
        followDto.setSourceUid(sourceUid);
        followDto.setTargetUid(targetUid);
        followDto.setAction(action);
        Response response = userService.follow(followDto);
        List<Topic> list = liveService.getMyTopic4Follow(targetUid);
        //关注,订阅所有直播/取消所有直播订阅
        for (Topic topic : list) {
            liveService.setLive2(sourceUid, topic.getId(), 0, 0,action);
        }
        //关注，默认加到圈外人
        if(action == 0) {
            // 判断人员关系,
            // 1如果他是我的粉丝则为相互圈内人
            //2.如果他不是我的粉丝，我是他的圈外人
            int isFollow = userService.isFollow(sourceUid,targetUid);
            int internalStatus = 0;
            if(isFollow == 1 ){
                internalStatus = 1;
                snsMybatisDao.updateSnsCircle(sourceUid,targetUid,internalStatus);
                snsMybatisDao.createSnsCircle(targetUid,sourceUid,internalStatus);
            }else{
                snsMybatisDao.createSnsCircle(sourceUid,targetUid,internalStatus);
            }
            //取消关注，取消圈子信息
        }else if(action == 1){
            //如果是取消关注，如果他是我粉丝，我不是他圈子里的人，他是我的圈外人
            snsMybatisDao.deleteSnsCircle(sourceUid,targetUid);
            // 判断人员关系
            int isFollow = userService.isFollow(sourceUid,targetUid);
            int internalStatus = 0;
            if(isFollow == 1 ){
                snsMybatisDao.updateSnsCircle(targetUid,sourceUid,internalStatus);
            }
        }
        return response;
    }

    @Override
    public Response modifyCircle(long owner,long topicId ,long uid,int action) {
        if(action  == 0) {
            snsMybatisDao.updateSnsCircle(uid, owner, Specification.SnsCircle.IN.index);
            //关注此人
            follow(0,uid,owner);
            liveService.setLive2(uid,topicId,0,0,0);
            liveService.deleteFavoriteDelete(uid,topicId);
            createFragment(owner, topicId, uid);
        }else if(action == 1){
            snsMybatisDao.updateSnsCircle(uid, owner, Specification.SnsCircle.CORE.index);
            //关注此人
            follow(0,uid,owner);
            liveService.setLive2(uid,topicId,0,0,0);
            liveService.deleteFavoriteDelete(uid,topicId);
        }else if(action == 2){
            snsMybatisDao.updateSnsCircle(uid, owner, Specification.SnsCircle.IN.index);
            createFragment(owner, topicId, uid);
        }else if(action == 3){
            snsMybatisDao.updateSnsCircle(uid, owner, Specification.SnsCircle.OUT.index);
            //取消关注此人，取消此人直播的订阅
            follow(1,uid,owner);
        }else if(action == 4){
            snsMybatisDao.updateSnsCircle(uid, owner, Specification.SnsCircle.OUT.index);
            liveService.setLive2(uid, topicId, 0, 0,0);
            liveService.deleteFavoriteDelete(uid,topicId);
            createFragment(owner, topicId, uid);
        }
        return Response.success(ResponseStatus.MODIFY_CIRCLE_SUCCESS.status,ResponseStatus.MODIFY_CIRCLE_SUCCESS.message);
    }

    private void createFragment(long owner, long topicId, long uid) {
        SpeakDto speakDto = new SpeakDto();
        speakDto.setUid(owner);
        speakDto.setType(Specification.LiveSpeakType.INVITED.index);
        TopicFragment fragment = liveService.getLastTopicFragmentByUid(topicId,owner);
        if(fragment != null) {
            speakDto.setBottomId(fragment.getId());
            speakDto.setTopId(fragment.getId());
        }else{
            speakDto.setBottomId(0);
            speakDto.setTopId(0);
        }
        speakDto.setContentType(Specification.LiveContent.TEXT.index);
        UserProfile userProfile = userService.getUserProfileByUid(owner);
        UserProfile fans = userService.getUserProfileByUid(uid);
        speakDto.setFragment("国王" + userProfile.getNickName() + "邀请了" + fans.getNickName()+"加入此直播");
        speakDto.setTopicId(topicId);
        speakDto.setType(Specification.LiveSpeakType.INVITED.index);
        liveService.speak(speakDto);
    }
}
