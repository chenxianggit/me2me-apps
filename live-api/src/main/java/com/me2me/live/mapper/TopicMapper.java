package com.me2me.live.mapper;

import com.me2me.live.model.Topic;
import com.me2me.live.model.Topic2;
import com.me2me.live.model.TopicExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    int countByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    int deleteByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    int insert(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    int insertSelective(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    List<Topic> selectByExample(TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    Topic selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    int updateByExampleSelective(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    int updateByExample(@Param("record") Topic record, @Param("example") TopicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    int updateByPrimaryKeySelective(Topic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic
     *
     * @mbggenerated Sun Jan 22 09:35:40 CST 2017
     */
    int updateByPrimaryKey(Topic record);

    Topic getRandomDropaRoundAlgorithm(Map<String ,String> map);

    List<Topic2> getMyLivesByUpdateTimeNew(Map map);

}