package com.me2me.live.mapper;

import com.me2me.live.model.LiveDisplayReview;
import com.me2me.live.model.LiveDisplayReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LiveDisplayReviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    int countByExample(LiveDisplayReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    int deleteByExample(LiveDisplayReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    int insert(LiveDisplayReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    int insertSelective(LiveDisplayReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    List<LiveDisplayReview> selectByExample(LiveDisplayReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    LiveDisplayReview selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    int updateByExampleSelective(@Param("record") LiveDisplayReview record, @Param("example") LiveDisplayReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    int updateByExample(@Param("record") LiveDisplayReview record, @Param("example") LiveDisplayReviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    int updateByPrimaryKeySelective(LiveDisplayReview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_display_review
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    int updateByPrimaryKey(LiveDisplayReview record);
}