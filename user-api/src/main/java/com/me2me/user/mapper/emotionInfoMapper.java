package com.me2me.user.mapper;

import com.me2me.user.model.emotionInfo;
import com.me2me.user.model.emotionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface emotionInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    int countByExample(emotionInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    int deleteByExample(emotionInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    int insert(emotionInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    int insertSelective(emotionInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    List<emotionInfo> selectByExample(emotionInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    emotionInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    int updateByExampleSelective(@Param("record") emotionInfo record, @Param("example") emotionInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    int updateByExample(@Param("record") emotionInfo record, @Param("example") emotionInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    int updateByPrimaryKeySelective(emotionInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    int updateByPrimaryKey(emotionInfo record);
}