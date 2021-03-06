package com.me2me.user.mapper;

import com.me2me.user.model.JpushToken;
import com.me2me.user.model.JpushTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JpushTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    int countByExample(JpushTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    int deleteByExample(JpushTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    int insert(JpushToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    int insertSelective(JpushToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    List<JpushToken> selectByExample(JpushTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    JpushToken selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    int updateByExampleSelective(@Param("record") JpushToken record, @Param("example") JpushTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    int updateByExample(@Param("record") JpushToken record, @Param("example") JpushTokenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    int updateByPrimaryKeySelective(JpushToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jpush_token
     *
     * @mbggenerated Tue Aug 09 15:10:48 CST 2016
     */
    int updateByPrimaryKey(JpushToken record);
}