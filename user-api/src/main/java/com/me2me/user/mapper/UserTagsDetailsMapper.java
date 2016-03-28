package com.me2me.user.mapper;

import com.me2me.user.model.UserTagsDetails;
import com.me2me.user.model.UserTagsDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTagsDetailsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    int countByExample(UserTagsDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    int deleteByExample(UserTagsDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    int insert(UserTagsDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    int insertSelective(UserTagsDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    List<UserTagsDetails> selectByExample(UserTagsDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    UserTagsDetails selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    int updateByExampleSelective(@Param("record") UserTagsDetails record, @Param("example") UserTagsDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    int updateByExample(@Param("record") UserTagsDetails record, @Param("example") UserTagsDetailsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    int updateByPrimaryKeySelective(UserTagsDetails record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_tags_details
     *
     * @mbggenerated Mon Mar 28 11:13:47 CST 2016
     */
    int updateByPrimaryKey(UserTagsDetails record);
}