package com.me2me.live.dao;

import com.google.common.collect.Lists;
import com.me2me.common.web.Specification;
import com.me2me.live.dto.SpeakDto;
import com.me2me.live.mapper.*;
import com.me2me.live.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 赵朋扬
 * Date: 2016/4/11.
 */
@Repository
public class LiveMybatisDao {

    @Autowired
    private TopicMapper topicMapper;

    @Autowired
    private TopicFragmentMapper topicFragmentMapper;

    @Autowired
    private LiveFavoriteMapper liveFavoriteMapper;

    @Autowired
    private LiveReadHistoryMapper liveReadHistoryMapper;

    @Autowired
    private TopicBarrageMapper topicBarrageMapper;

    @Autowired
    private LiveFavoriteDeleteMapper liveFavoriteDeleteMapper;

    @Autowired
    private LiveDisplayBarrageMapper liveDisplayBarrageMapper;

    @Autowired
    private LiveDisplayFragmentMapper liveDisplayFragmentMapper;

    @Autowired
    private  LiveDisplayReviewMapper liveDisplayReviewMapper;


    public void createTopic(Topic topic){
        topicMapper.insertSelective(topic);
    }

    public Topic getTopicById(long topicId){
        return topicMapper.selectByPrimaryKey(topicId);
    }

    public List<TopicFragment> getTopicFragment(long topicId,long sinceId ){
        TopicFragmentExample example = new TopicFragmentExample();
        TopicFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andIdGreaterThan(sinceId);
        example.setOrderByClause("id asc limit 50 "  );
        return topicFragmentMapper.selectByExampleWithBLOBs(example);
    }

    public List<TopicFragment> getTopicFragmentByMode(long topicId,long sinceId,long uid){
        TopicFragmentExample example = new TopicFragmentExample();
        TopicFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andIdGreaterThan(sinceId);
        criteria.andUidEqualTo(uid);
        criteria.andTypeNotEqualTo(Specification.LiveSpeakType.ANCHOR_AT.index);
        example.setOrderByClause("id asc limit 10 "  );
        return topicFragmentMapper.selectByExampleWithBLOBs(example);
    }

    public List<TopicFragment> getTopicReviewByMode(long topicId,long sinceId,long uid){
        TopicFragmentExample example = new TopicFragmentExample();
        TopicFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andIdGreaterThan(sinceId);
        criteria.andUidNotEqualTo(uid);
        TopicFragmentExample.Criteria criteria2 = example.createCriteria();
        criteria2.andTypeEqualTo(Specification.LiveSpeakType.ANCHOR_AT.index);
        example.or(criteria2);
        example.setOrderByClause("id asc limit 30 "  );
        return topicFragmentMapper.selectByExampleWithBLOBs(example);
    }

    public List<TopicFragment> getPrevTopicFragment(long topicId,long sinceId ){
        TopicFragmentExample example = new TopicFragmentExample();
        TopicFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andIdLessThan(sinceId);
        example.setOrderByClause("id desc limit 10 "  );
        return topicFragmentMapper.selectByExampleWithBLOBs(example);
    }

    public TopicFragment getLastTopicFragment(long topicId,long uid ){
        TopicFragmentExample example = new TopicFragmentExample();
        TopicFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andUidEqualTo(uid);
        example.setOrderByClause("id desc limit 1 ");
        List<TopicFragment> topicFragmentList = topicFragmentMapper.selectByExampleWithBLOBs(example);
        return (topicFragmentList != null && topicFragmentList.size() > 0) ? topicFragmentList.get(0) : null;
    }
    public TopicFragment getLastTopicFragmentByUid(long topicId,long uid ){
        TopicFragmentExample example = new TopicFragmentExample();
        TopicFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andUidEqualTo(uid);
        criteria.andTypeEqualTo(Specification.LiveSpeakType.ANCHOR.index);
        example.setOrderByClause("id desc limit 1 ");
        List<TopicFragment> topicFragmentList = topicFragmentMapper.selectByExampleWithBLOBs(example);
        return (topicFragmentList != null && topicFragmentList.size() > 0) ? topicFragmentList.get(0) : null;
    }

    public void createTopicFragment(TopicFragment topicFragment){
        topicFragmentMapper.insertSelective(topicFragment);
    }

    public Topic getTopic(long uid,long topicId){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andIdEqualTo(topicId);
        List<Topic> list = topicMapper.selectByExample(example);
        return (list != null && list.size() > 0) ? list.get(0) : null;
    }
    public void updateTopic(Topic topic){
        topicMapper.updateByPrimaryKeySelective(topic);
    }

    public List<Topic> getMyLives(long uid ,long sinceId ,List<Long> topics){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andIdLessThan(sinceId);
        criteria.andStatusNotEqualTo(Specification.LiveStatus.REMOVE.index);
        TopicExample.Criteria criteriaOr = example.createCriteria();
        if(topics != null && topics.size() > 0) {
            criteriaOr.andIdLessThan(sinceId);
            criteriaOr.andUidNotEqualTo(uid);
            criteriaOr.andIdIn(topics);
            example.or(criteriaOr);
        }
        example.setOrderByClause("id desc, status asc limit 10" );
        return topicMapper.selectByExample(example);
    }

    public int countLives(){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andStatusNotEqualTo(Specification.LiveStatus.LIVING.index);
        return topicMapper.countByExample(example);
    }

    public List<Topic> getMyLivesByUpdateTime(long uid ,long updateTime ,List<Long> topics){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andLongTimeLessThan(updateTime);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -3);
        criteria.andLongTimeGreaterThan(calendar.getTimeInMillis());
        criteria.andStatusNotEqualTo(Specification.LiveStatus.REMOVE.index);
        TopicExample.Criteria criteriaOr = example.createCriteria();
        if(topics != null && topics.size() > 0) {
            criteriaOr.andLongTimeLessThan(updateTime);
            criteriaOr.andLongTimeGreaterThan(calendar.getTimeInMillis());
            criteriaOr.andUidNotEqualTo(uid);
            criteriaOr.andIdIn(topics);
            example.or(criteriaOr);
        }
        //最后更新时间降序排列
        example.setOrderByClause("long_time desc limit 10" );
        return topicMapper.selectByExample(example);
    }

    public int getInactiveLiveCount(long uid , List<Long> topics){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andStatusNotEqualTo(Specification.LiveStatus.REMOVE.index);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR,-3);
        criteria.andLongTimeLessThan(calendar.getTimeInMillis());
        TopicExample.Criteria criteriaOr = example.createCriteria();
        if(topics != null && topics.size() > 0) {
            criteriaOr.andUidNotEqualTo(uid);
            criteriaOr.andIdIn(topics);
            criteriaOr.andLongTimeLessThan(calendar.getTimeInMillis());
            example.or(criteriaOr);
        }
        return topicMapper.countByExample(example);
    }

    public List<Long> getTopicId(long uid){
        List result = Lists.newArrayList();
        LiveFavoriteExample example = new LiveFavoriteExample();
        LiveFavoriteExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        List<LiveFavorite> liveFavoriteList = liveFavoriteMapper.selectByExample(example);
        for(LiveFavorite liveFavorite : liveFavoriteList){
            result.add(liveFavorite.getTopicId());
        }
        return result;
    }

    public List<Topic> getLives(long sinceId){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andIdLessThan(sinceId);
        criteria.andStatusEqualTo(Specification.LiveStatus.LIVING.index);
        example.setOrderByClause(" long_time desc limit 20 ");
        return topicMapper.selectByExample(example);
    }

    public List<Topic> getLivesByUpdateTime(long updateTime){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andLongTimeLessThan(updateTime);
        criteria.andStatusEqualTo(Specification.LiveStatus.LIVING.index);
        example.setOrderByClause(" long_time desc limit 10 ");
        return topicMapper.selectByExample(example);
    }

    public LiveFavorite getLiveFavorite(long uid, long topicId){
        LiveFavoriteExample example = new LiveFavoriteExample();
        LiveFavoriteExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andTopicIdEqualTo(topicId);
        List<LiveFavorite> liveFavoriteList = liveFavoriteMapper.selectByExample(example);
        return  (liveFavoriteList != null && liveFavoriteList.size() > 0) ? liveFavoriteList.get(0) : null;
    }

    public void createLiveFavorite(LiveFavorite liveFavorite){
        liveFavoriteMapper.insertSelective(liveFavorite);
    }

    public void deleteLiveFavorite(LiveFavorite liveFavorite){
        liveFavoriteMapper.deleteByPrimaryKey(liveFavorite.getId());
    }

    public int countFragment(long topicId,long uid ){
        TopicFragmentExample example = new TopicFragmentExample();
        TopicFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andUidNotEqualTo(uid);
        return topicFragmentMapper.countByExample(example);
    }

    public int countFragmentByUid(long topicId,long uid ){
        TopicFragmentExample example = new TopicFragmentExample();
        TopicFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andUidEqualTo(uid);
        return topicFragmentMapper.countByExample(example);
    }

     public List<LiveFavorite> getFavoriteList(long topicId){
         LiveFavoriteExample example = new LiveFavoriteExample();
         LiveFavoriteExample.Criteria criteria = example.createCriteria();
         criteria.andTopicIdEqualTo(topicId);
         example.setOrderByClause(" id asc limit 20");
         return liveFavoriteMapper.selectByExample(example);
     }

    public List<LiveFavorite> getFavoriteAll(long topicId){
        LiveFavoriteExample example = new LiveFavoriteExample();
        LiveFavoriteExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        return liveFavoriteMapper.selectByExample(example);
    }


    public LiveReadHistory getLiveReadHistory(long topicId,long uid){
        LiveReadHistoryExample example = new LiveReadHistoryExample();
        LiveReadHistoryExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andUidEqualTo(uid);
        List<LiveReadHistory> liveReadHistories =  liveReadHistoryMapper.selectByExample(example);
        return (liveReadHistories != null && liveReadHistories.size() > 0) ?liveReadHistories.get(0) : null ;
    }

    public void createLiveReadHistory(long topicId,long uid){
        LiveReadHistory liveReadHistory = new LiveReadHistory();
        liveReadHistory.setTopicId(topicId);
        liveReadHistory.setUid(uid);
        liveReadHistoryMapper.insertSelective(liveReadHistory);

    }

    public void createTopicBarrage(TopicBarrage topicBarrage){
        topicBarrageMapper.insertSelective(topicBarrage);
    }

   /* public List<TopicBarrage> getBarrage(long topicId,long sinceId, long topId ,long bottomId ){
        TopicBarrage topicBarrage = new TopicBarrage();
        topicBarrage.setTopId(topicId);
        topicBarrage.setTopId(topId);
        topicBarrage.setBottomId(bottomId);
        topicBarrage.setId(sinceId);
        return topicBarrageMapper.selectByExampleWithBLOBsDistinct(topicBarrage);
    }*/

    public List<TopicBarrage> getBarrage(long topicId,long sinceId, long topId ,long bottomId ) {
        TopicBarrageExample example = new TopicBarrageExample();
        TopicBarrageExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andTopIdGreaterThanOrEqualTo(topId);
        criteria.andBottomIdEqualTo(bottomId);
        criteria.andIdGreaterThan(sinceId);
        example.setOrderByClause(" id asc limit 20 ");
        return topicBarrageMapper.selectByExampleWithBLOBs(example);
    }

    public TopicBarrage getBarrage(long topicId, long topId ,long bottomId, int type ,long uid ){
        TopicBarrageExample example = new TopicBarrageExample();
        TopicBarrageExample.Criteria criteria =example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andTopIdEqualTo(topId);
        criteria.andBottomIdEqualTo(bottomId);
        criteria.andTypeEqualTo(type);
        criteria.andUidEqualTo(uid);
        List<TopicBarrage> topicBarrages = topicBarrageMapper.selectByExampleWithBLOBs(example);
        return com.me2me.common.utils.Lists.getSingle(topicBarrages);
    }

    public List<Topic> getInactiveLive(long uid,List<Long> topics,long updateTime){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andStatusNotEqualTo(Specification.LiveStatus.REMOVE.index);
        criteria.andLongTimeLessThan(updateTime);
        criteria.andUidEqualTo(uid);
        TopicExample.Criteria criteriaOr = example.createCriteria();
        if(topics != null && topics.size() > 0) {
            criteriaOr.andLongTimeLessThan(updateTime);
            criteriaOr.andUidNotEqualTo(uid);
            criteriaOr.andIdIn(topics);
            example.or(criteriaOr);
        }
        //最后更新时间降序排列
        example.setOrderByClause(" long_time desc limit 10" );
        return topicMapper.selectByExample(example);
    }

    public List<Topic> getMyTopic(long uid){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andStatusNotEqualTo(Specification.LiveStatus.REMOVE.index);
        return topicMapper.selectByExample(example);
    }

    public void deleteLiveFavoriteByUid(long uid,long topicId){
        LiveFavoriteExample example = new LiveFavoriteExample();
        LiveFavoriteExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andTopicIdEqualTo(topicId);
        liveFavoriteMapper.deleteByExample(example);
    }

    public void createFavoriteDelete(long uid,long topicId){
        LiveFavoriteDelete liveFavoriteDelete = new LiveFavoriteDelete();
        liveFavoriteDelete.setUid(uid);
        liveFavoriteDelete.setTopicId(topicId);
        liveFavoriteDeleteMapper.insertSelective(liveFavoriteDelete);
    }

    public LiveFavoriteDelete getFavoriteDelete(long uid,long topicId){
        LiveFavoriteDeleteExample example = new LiveFavoriteDeleteExample();
        LiveFavoriteDeleteExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andTopicIdEqualTo(topicId);
        List<LiveFavoriteDelete> list = liveFavoriteDeleteMapper.selectByExample(example);
       return com.me2me.common.utils.Lists.getSingle(list);
    }

    public void deleteFavoriteDelete(long uid,long topicId) {
        LiveFavoriteDeleteExample example = new LiveFavoriteDeleteExample();
        LiveFavoriteDeleteExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        criteria.andTopicIdEqualTo(topicId);
        liveFavoriteDeleteMapper.deleteByExample(example);
    }

    public List<Topic> getMyTopic4Follow(long uid){
        TopicExample example = new TopicExample();
        TopicExample.Criteria criteria = example.createCriteria();
        criteria.andUidEqualTo(uid);
        return topicMapper.selectByExample(example);
    }

    public List<TopicFragment> getTopicFragment(long topicId){
        TopicFragmentExample example = new TopicFragmentExample();
        TopicFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        example.setOrderByClause("id asc "  );
        return topicFragmentMapper.selectByExampleWithBLOBs(example);
    }

    public void createLiveDisplayFragment(SpeakDto speakDto){
        LiveDisplayFragment displayFragment = new LiveDisplayFragment();
        displayFragment.setUid(speakDto.getUid());
        displayFragment.setFragment(speakDto.getFragment());
        displayFragment.setFragmentImage(speakDto.getFragmentImage());
        displayFragment.setTopicId(speakDto.getTopicId());
        displayFragment.setType(speakDto.getType());
        liveDisplayFragmentMapper.insertSelective(displayFragment);
    }

    public void updateLiveDisplayFragment(SpeakDto speakDto){
        LiveDisplayFragmentExample example = new LiveDisplayFragmentExample();
        liveDisplayFragmentMapper.selectByExample(example);
        LiveDisplayFragment displayFragment = new LiveDisplayFragment();
        displayFragment.setUid(speakDto.getUid());
        displayFragment.setFragment(speakDto.getFragment());
        displayFragment.setFragmentImage(speakDto.getFragmentImage());
        displayFragment.setTopicId(speakDto.getTopicId());
        displayFragment.setType(speakDto.getType());
        liveDisplayFragmentMapper.insertSelective(displayFragment);
    }

    public void createLiveDisplayReview(SpeakDto speakDto){
        LiveDisplayReview displayReview = new LiveDisplayReview();
        displayReview.setUid(speakDto.getUid());
        displayReview.setReview(speakDto.getFragment());
        displayReview.setTopicId(speakDto.getTopicId());
        displayReview.setType(speakDto.getType());
        liveDisplayReviewMapper.insertSelective(displayReview);
    }

    public void createLiveDisplayBarrage(SpeakDto speakDto){
        LiveDisplayBarrage displayBarrage = new LiveDisplayBarrage();
        displayBarrage.setUid(speakDto.getUid());
        displayBarrage.setBarrage(speakDto.getFragment());
        displayBarrage.setTopicId(speakDto.getTopicId());
        liveDisplayBarrageMapper.insertSelective(displayBarrage);
    }

    public List<LiveDisplayFragment> getDisPlayFragmentByMode(long topicId,long sinceId,long uid){
        LiveDisplayFragmentExample example = new LiveDisplayFragmentExample();
        LiveDisplayFragmentExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andIdGreaterThan(sinceId);
        criteria.andUidEqualTo(uid);
        example.setOrderByClause("id asc limit 10 "  );
        return liveDisplayFragmentMapper.selectByExample(example);
    }

    public TopicBarrage getTopicBarrageByTopicId(long topicId,long uid){
        TopicBarrageExample example = new TopicBarrageExample();
        TopicBarrageExample.Criteria criteria = example.createCriteria();
        criteria.andTopicIdEqualTo(topicId);
        criteria.andUidEqualTo(uid);
        criteria.andTypeEqualTo(Specification.LiveSpeakType.LIKES.index);
        List<TopicBarrage> list = topicBarrageMapper.selectByExample(example);
        return com.me2me.common.utils.Lists.getSingle(list);
    }

}
