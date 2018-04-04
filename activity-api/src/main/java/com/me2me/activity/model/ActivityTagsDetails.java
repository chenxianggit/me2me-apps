package com.me2me.activity.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class ActivityTagsDetails implements BaseEntity{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_tags_details.id
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_tags_details.activity_id
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    private Long activityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_tags_details.uid
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_tags_details.tid
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    private Long tid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_tags_details.create_time
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_tags_details.id
     *
     * @return the value of activity_tags_details.id
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_tags_details.id
     *
     * @param id the value for activity_tags_details.id
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_tags_details.activity_id
     *
     * @return the value of activity_tags_details.activity_id
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_tags_details.activity_id
     *
     * @param activityId the value for activity_tags_details.activity_id
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_tags_details.uid
     *
     * @return the value of activity_tags_details.uid
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_tags_details.uid
     *
     * @param uid the value for activity_tags_details.uid
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_tags_details.tid
     *
     * @return the value of activity_tags_details.tid
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public Long getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_tags_details.tid
     *
     * @param tid the value for activity_tags_details.tid
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public void setTid(Long tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_tags_details.create_time
     *
     * @return the value of activity_tags_details.create_time
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_tags_details.create_time
     *
     * @param createTime the value for activity_tags_details.create_time
     *
     * @mbggenerated Tue Jun 28 23:15:47 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}