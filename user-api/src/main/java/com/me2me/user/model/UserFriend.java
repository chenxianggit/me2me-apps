package com.me2me.user.model;

import java.util.Date;

import com.me2me.common.web.BaseEntity;

public class UserFriend implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.id
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.source_uid
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    private Long sourceUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.target_uid
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    private Long targetUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.from_uid
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    private Long fromUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.silence_time
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    private Date silenceTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.create_time
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.status
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.id
     *
     * @return the value of user_friend.id
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.id
     *
     * @param id the value for user_friend.id
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.source_uid
     *
     * @return the value of user_friend.source_uid
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public Long getSourceUid() {
        return sourceUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.source_uid
     *
     * @param sourceUid the value for user_friend.source_uid
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public void setSourceUid(Long sourceUid) {
        this.sourceUid = sourceUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.target_uid
     *
     * @return the value of user_friend.target_uid
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public Long getTargetUid() {
        return targetUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.target_uid
     *
     * @param targetUid the value for user_friend.target_uid
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public void setTargetUid(Long targetUid) {
        this.targetUid = targetUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.from_uid
     *
     * @return the value of user_friend.from_uid
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public Long getFromUid() {
        return fromUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.from_uid
     *
     * @param fromUid the value for user_friend.from_uid
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public void setFromUid(Long fromUid) {
        this.fromUid = fromUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.silence_time
     *
     * @return the value of user_friend.silence_time
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public Date getSilenceTime() {
        return silenceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.silence_time
     *
     * @param silenceTime the value for user_friend.silence_time
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public void setSilenceTime(Date silenceTime) {
        this.silenceTime = silenceTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.create_time
     *
     * @return the value of user_friend.create_time
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.create_time
     *
     * @param createTime the value for user_friend.create_time
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.status
     *
     * @return the value of user_friend.status
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.status
     *
     * @param status the value for user_friend.status
     *
     * @mbggenerated Mon Jan 15 16:15:07 CST 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}