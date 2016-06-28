package com.me2me.sns.dao;

import com.me2me.sns.dto.GetSnsCircleDto;
import com.me2me.sns.dto.SnsCircleDto;
import com.me2me.sns.mapper.SnsCircleMapper;
import com.me2me.sns.model.SnsCircle;
import com.me2me.sns.model.SnsCircleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 上海拙心网络科技有限公司出品
 * Author: 代宝磊
 * Date: 2016/6/28
 * Time :14:41
 */
@Repository
public class SnsMybatisDao {

    @Autowired
    private SnsCircleMapper snsCircleMapper;

    public List<SnsCircle> getSnsCircle(long uid,long topicId,long sinceId,int type){
        SnsCircleExample example = new SnsCircleExample();
        SnsCircleExample.Criteria criteria = example.createCriteria();
        criteria.andOwnerEqualTo(uid);
        criteria.andInternalStatusEqualTo(type);
        //// TODO: 2016/6/28
        return snsCircleMapper.selectByExample(example);

    }


    public List<SnsCircleDto> getSnsCircle(GetSnsCircleDto getSnsCircleDto){
        return snsCircleMapper.getSnsCircle(getSnsCircleDto);

    }

    public int getSnsCircleCount(GetSnsCircleDto getSnsCircleDto){
        return snsCircleMapper.getSnsCircleCount(getSnsCircleDto);

    }


}