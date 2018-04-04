package com.me2me.user.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class UserReport implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_report.id
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_report.cid
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    private Long cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_report.uid
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_report.reason
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    private Integer reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_report.attachment
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    private String attachment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_report.create_time
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_report.id
     *
     * @return the value of user_report.id
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_report.id
     *
     * @param id the value for user_report.id
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_report.cid
     *
     * @return the value of user_report.cid
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public Long getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_report.cid
     *
     * @param cid the value for user_report.cid
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public void setCid(Long cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_report.uid
     *
     * @return the value of user_report.uid
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_report.uid
     *
     * @param uid the value for user_report.uid
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_report.reason
     *
     * @return the value of user_report.reason
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public Integer getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_report.reason
     *
     * @param reason the value for user_report.reason
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public void setReason(Integer reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_report.attachment
     *
     * @return the value of user_report.attachment
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public String getAttachment() {
        return attachment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_report.attachment
     *
     * @param attachment the value for user_report.attachment
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_report.create_time
     *
     * @return the value of user_report.create_time
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_report.create_time
     *
     * @param createTime the value for user_report.create_time
     *
     * @mbggenerated Wed Apr 06 15:02:30 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}