package com.me2me.user.mapper;

import com.me2me.user.dto.PushUserNoticeDto;
import com.me2me.user.model.UserNotice;
import com.me2me.user.model.UserNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserNoticeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    int countByExample(UserNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    int deleteByExample(UserNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    int insert(UserNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    int insertSelective(UserNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    List<UserNotice> selectByExample(UserNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    UserNotice selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    int updateByExampleSelective(@Param("record") UserNotice record, @Param("example") UserNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    int updateByExample(@Param("record") UserNotice record, @Param("example") UserNoticeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    int updateByPrimaryKeySelective(UserNotice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_notice
     *
     * @mbggenerated Wed Jun 29 13:28:20 CST 2016
     */
    int updateByPrimaryKey(UserNotice record);
}