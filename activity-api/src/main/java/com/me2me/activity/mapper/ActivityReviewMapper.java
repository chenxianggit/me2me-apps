package com.me2me.activity.mapper;

import com.me2me.activity.model.ActivityReview;
import com.me2me.activity.model.ActivityReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    int countByExample(ActivityReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    int deleteByExample(ActivityReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    int insert(ActivityReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    int insertSelective(ActivityReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    List<ActivityReview> selectByExample(ActivityReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    ActivityReview selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    int updateByExampleSelective(@Param("record") ActivityReview record, @Param("example") ActivityReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    int updateByExample(@Param("record") ActivityReview record, @Param("example") ActivityReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    int updateByPrimaryKeySelective(ActivityReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_review
     *
     * @mbggenerated Mon Jul 18 11:09:19 CST 2016
     */
    int updateByPrimaryKey(ActivityReview record);
}