package com.me2me.activity.model;

import java.util.Date;

public class Activity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.id
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.uid
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.issue
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private String issue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_title
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private String activityTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_hash_title
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private String activityHashTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_cover
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private String activityCover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_notice_title
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private String activityNoticeTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_notice_cover
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private String activityNoticeCover;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.finish_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private Date finishTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.start_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.end_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.person_times
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private Integer personTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.create_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.update_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.status
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.id
     *
     * @return the value of activity.id
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.id
     *
     * @param id the value for activity.id
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.uid
     *
     * @return the value of activity.uid
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.uid
     *
     * @param uid the value for activity.uid
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.issue
     *
     * @return the value of activity.issue
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public String getIssue() {
        return issue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.issue
     *
     * @param issue the value for activity.issue
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_title
     *
     * @return the value of activity.activity_title
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public String getActivityTitle() {
        return activityTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_title
     *
     * @param activityTitle the value for activity.activity_title
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_hash_title
     *
     * @return the value of activity.activity_hash_title
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public String getActivityHashTitle() {
        return activityHashTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_hash_title
     *
     * @param activityHashTitle the value for activity.activity_hash_title
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setActivityHashTitle(String activityHashTitle) {
        this.activityHashTitle = activityHashTitle == null ? null : activityHashTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_cover
     *
     * @return the value of activity.activity_cover
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public String getActivityCover() {
        return activityCover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_cover
     *
     * @param activityCover the value for activity.activity_cover
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setActivityCover(String activityCover) {
        this.activityCover = activityCover == null ? null : activityCover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_notice_title
     *
     * @return the value of activity.activity_notice_title
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public String getActivityNoticeTitle() {
        return activityNoticeTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_notice_title
     *
     * @param activityNoticeTitle the value for activity.activity_notice_title
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setActivityNoticeTitle(String activityNoticeTitle) {
        this.activityNoticeTitle = activityNoticeTitle == null ? null : activityNoticeTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_notice_cover
     *
     * @return the value of activity.activity_notice_cover
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public String getActivityNoticeCover() {
        return activityNoticeCover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_notice_cover
     *
     * @param activityNoticeCover the value for activity.activity_notice_cover
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setActivityNoticeCover(String activityNoticeCover) {
        this.activityNoticeCover = activityNoticeCover == null ? null : activityNoticeCover.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.finish_time
     *
     * @return the value of activity.finish_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.finish_time
     *
     * @param finishTime the value for activity.finish_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.start_time
     *
     * @return the value of activity.start_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.start_time
     *
     * @param startTime the value for activity.start_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.end_time
     *
     * @return the value of activity.end_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.end_time
     *
     * @param endTime the value for activity.end_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.person_times
     *
     * @return the value of activity.person_times
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public Integer getPersonTimes() {
        return personTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.person_times
     *
     * @param personTimes the value for activity.person_times
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setPersonTimes(Integer personTimes) {
        this.personTimes = personTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.create_time
     *
     * @return the value of activity.create_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.create_time
     *
     * @param createTime the value for activity.create_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.update_time
     *
     * @return the value of activity.update_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.update_time
     *
     * @param updateTime the value for activity.update_time
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.status
     *
     * @return the value of activity.status
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.status
     *
     * @param status the value for activity.status
     *
     * @mbggenerated Thu May 05 10:52:29 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}