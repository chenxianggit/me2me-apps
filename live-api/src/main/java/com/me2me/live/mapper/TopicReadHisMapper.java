package com.me2me.live.mapper;

import com.me2me.live.model.TopicReadHis;
import com.me2me.live.model.TopicReadHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopicReadHisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    int countByExample(TopicReadHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    int deleteByExample(TopicReadHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    int insert(TopicReadHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    int insertSelective(TopicReadHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    List<TopicReadHis> selectByExample(TopicReadHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    TopicReadHis selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    int updateByExampleSelective(@Param("record") TopicReadHis record, @Param("example") TopicReadHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    int updateByExample(@Param("record") TopicReadHis record, @Param("example") TopicReadHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    int updateByPrimaryKeySelective(TopicReadHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table topic_read_his
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    int updateByPrimaryKey(TopicReadHis record);
}