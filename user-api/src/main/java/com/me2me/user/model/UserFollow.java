package com.me2me.user.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class UserFollow implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.id
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.source_uid
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    private Long sourceUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.target_uid
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    private Long targetUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_follow.create_time
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.id
     *
     * @return the value of user_follow.id
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.id
     *
     * @param id the value for user_follow.id
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.source_uid
     *
     * @return the value of user_follow.source_uid
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    public Long getSourceUid() {
        return sourceUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.source_uid
     *
     * @param sourceUid the value for user_follow.source_uid
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    public void setSourceUid(Long sourceUid) {
        this.sourceUid = sourceUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.target_uid
     *
     * @return the value of user_follow.target_uid
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    public Long getTargetUid() {
        return targetUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.target_uid
     *
     * @param targetUid the value for user_follow.target_uid
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    public void setTargetUid(Long targetUid) {
        this.targetUid = targetUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_follow.create_time
     *
     * @return the value of user_follow.create_time
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_follow.create_time
     *
     * @param createTime the value for user_follow.create_time
     *
     * @mbggenerated Wed Apr 13 15:53:14 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}