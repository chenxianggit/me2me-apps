package com.me2me.user.mapper;

import com.me2me.user.model.UserReport;
import com.me2me.user.model.UserReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    int countByExample(UserReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    int deleteByExample(UserReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    int insert(UserReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    int insertSelective(UserReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    List<UserReport> selectByExample(UserReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    UserReport selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    int updateByExampleSelective(@Param("record") UserReport record, @Param("example") UserReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    int updateByExample(@Param("record") UserReport record, @Param("example") UserReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    int updateByPrimaryKeySelective(UserReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_report
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    int updateByPrimaryKey(UserReport record);
}