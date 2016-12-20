package com.me2me.activity.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class Atask implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_task.id
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_task.title
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_task.link_url
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    private String linkUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_task.type
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_task.status
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_task.activity_id
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    private Long activityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_task.update_time
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_task.id
     *
     * @return the value of a_task.id
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_task.id
     *
     * @param id the value for a_task.id
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_task.title
     *
     * @return the value of a_task.title
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_task.title
     *
     * @param title the value for a_task.title
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_task.link_url
     *
     * @return the value of a_task.link_url
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_task.link_url
     *
     * @param linkUrl the value for a_task.link_url
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_task.type
     *
     * @return the value of a_task.type
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_task.type
     *
     * @param type the value for a_task.type
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_task.status
     *
     * @return the value of a_task.status
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_task.status
     *
     * @param status the value for a_task.status
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_task.activity_id
     *
     * @return the value of a_task.activity_id
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_task.activity_id
     *
     * @param activityId the value for a_task.activity_id
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_task.update_time
     *
     * @return the value of a_task.update_time
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_task.update_time
     *
     * @param updateTime the value for a_task.update_time
     *
     * @mbggenerated Tue Dec 20 10:33:40 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}