package com.me2me.content.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class AtReview implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column at_review.id
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column at_review.review_id
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    private Long reviewId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column at_review.review_type
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    private Integer reviewType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column at_review.from_uid
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    private Long fromUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column at_review.to_uid
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    private Long toUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column at_review.review
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    private String review;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column at_review.create_time
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column at_review.id
     *
     * @return the value of at_review.id
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column at_review.id
     *
     * @param id the value for at_review.id
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column at_review.review_id
     *
     * @return the value of at_review.review_id
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public Long getReviewId() {
        return reviewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column at_review.review_id
     *
     * @param reviewId the value for at_review.review_id
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column at_review.review_type
     *
     * @return the value of at_review.review_type
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public Integer getReviewType() {
        return reviewType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column at_review.review_type
     *
     * @param reviewType the value for at_review.review_type
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public void setReviewType(Integer reviewType) {
        this.reviewType = reviewType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column at_review.from_uid
     *
     * @return the value of at_review.from_uid
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public Long getFromUid() {
        return fromUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column at_review.from_uid
     *
     * @param fromUid the value for at_review.from_uid
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public void setFromUid(Long fromUid) {
        this.fromUid = fromUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column at_review.to_uid
     *
     * @return the value of at_review.to_uid
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public Long getToUid() {
        return toUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column at_review.to_uid
     *
     * @param toUid the value for at_review.to_uid
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public void setToUid(Long toUid) {
        this.toUid = toUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column at_review.review
     *
     * @return the value of at_review.review
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public String getReview() {
        return review;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column at_review.review
     *
     * @param review the value for at_review.review
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public void setReview(String review) {
        this.review = review == null ? null : review.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column at_review.create_time
     *
     * @return the value of at_review.create_time
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column at_review.create_time
     *
     * @param createTime the value for at_review.create_time
     *
     * @mbggenerated Wed Jun 29 16:39:36 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}