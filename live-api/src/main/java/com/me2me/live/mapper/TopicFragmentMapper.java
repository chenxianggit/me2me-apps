package com.me2me.live.mapper;

import com.me2me.live.dto.GetLiveDetailDto;
import com.me2me.live.dto.GetLiveUpdateDto;
import com.me2me.live.model.TopicFragment;
import com.me2me.live.model.TopicFragmentExample;
import com.me2me.live.model.TopicFragmentWithBLOBs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface TopicFragmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int countByExample(TopicFragmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int deleteByExample(TopicFragmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int insert(TopicFragmentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int insertSelective(TopicFragmentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    List<TopicFragmentWithBLOBs> selectByExampleWithBLOBs(TopicFragmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    List<TopicFragment> selectByExample(TopicFragmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    TopicFragmentWithBLOBs selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int updateByExampleSelective(@Param("record") TopicFragmentWithBLOBs record, @Param("example") TopicFragmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") TopicFragmentWithBLOBs record, @Param("example") TopicFragmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int updateByExample(@Param("record") TopicFragment record, @Param("example") TopicFragmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int updateByPrimaryKeySelective(TopicFragmentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(TopicFragmentWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_fragment
     *
     * @mbggenerated Wed Aug 23 17:18:21 CST 2017
     */
    int updateByPrimaryKey(TopicFragment record);

    Map<String,Long> countFragmentByTopicIdWithSince(GetLiveUpdateDto getLiveUpdateDto);

    List<TopicFragmentWithBLOBs> getTopicFragmentForPage(GetLiveDetailDto getLiveDetailDto);

    TopicFragmentWithBLOBs getFragmentByAT(Map map);
    /**
     * 取指定月的图片，for 图库
     * @author zhangjiwei
     * @date May 12, 2017
     * @param month  yyyy-MM
     * @return
     */
    List<TopicFragmentWithBLOBs> getImgFragmentByMonth(@Param("topicId")long topicId,@Param("month")String month);

}