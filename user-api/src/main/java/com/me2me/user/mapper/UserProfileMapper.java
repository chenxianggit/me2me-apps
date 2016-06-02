package com.me2me.user.mapper;

import com.me2me.user.model.UserProfile;
import com.me2me.user.model.UserProfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserProfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    int countByExample(UserProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    int deleteByExample(UserProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    int insert(UserProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    int insertSelective(UserProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    List<UserProfile> selectByExample(UserProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    UserProfile selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    int updateByExampleSelective(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    int updateByExample(@Param("record") UserProfile record, @Param("example") UserProfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    int updateByPrimaryKeySelective(UserProfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_profile
     *
     * @mbggenerated Thu Jun 02 11:24:27 CST 2016
     */
    int updateByPrimaryKey(UserProfile record);
}