package com.me2me.live.mapper;

import com.me2me.live.model.UserDislike;
import com.me2me.live.model.UserDislikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDislikeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    int countByExample(UserDislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    int deleteByExample(UserDislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    int insert(UserDislike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    int insertSelective(UserDislike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    List<UserDislike> selectByExample(UserDislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    UserDislike selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    int updateByExampleSelective(@Param("record") UserDislike record, @Param("example") UserDislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    int updateByExample(@Param("record") UserDislike record, @Param("example") UserDislikeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    int updateByPrimaryKeySelective(UserDislike record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_dislike
     *
     * @mbggenerated Mon Sep 04 10:36:50 CST 2017
     */
    int updateByPrimaryKey(UserDislike record);
}