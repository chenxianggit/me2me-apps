package com.me2me.activity.model;

import java.util.Date;

public class ArecommendUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_recommend_user.id
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_recommend_user.auid
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    private Long auid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_recommend_user.uid
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_recommend_user.rec_users
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    private String recUsers;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_recommend_user.rec_time_key
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    private String recTimeKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_recommend_user.type
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column a_recommend_user.create_time
     *
     * @mbggenerated Wed Dec 14 15:38:13 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_recommend_user.id
     *
     * @return the value of a_recommend_user.id
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_recommend_user.id
     *
     * @param id the value for a_recommend_user.id
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_recommend_user.auid
     *
     * @return the value of a_recommend_user.auid
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public Long getAuid() {
        return auid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_recommend_user.auid
     *
     * @param auid the value for a_recommend_user.auid
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public void setAuid(Long auid) {
        this.auid = auid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_recommend_user.uid
     *
     * @return the value of a_recommend_user.uid
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_recommend_user.uid
     *
     * @param uid the value for a_recommend_user.uid
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_recommend_user.rec_users
     *
     * @return the value of a_recommend_user.rec_users
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public String getRecUsers() {
        return recUsers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_recommend_user.rec_users
     *
     * @param recUsers the value for a_recommend_user.rec_users
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public void setRecUsers(String recUsers) {
        this.recUsers = recUsers == null ? null : recUsers.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_recommend_user.rec_time_key
     *
     * @return the value of a_recommend_user.rec_time_key
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public String getRecTimeKey() {
        return recTimeKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_recommend_user.rec_time_key
     *
     * @param recTimeKey the value for a_recommend_user.rec_time_key
     *
     * @mbggenerated Wed Dec 14 15:38:12 CST 2016
     */
    public void setRecTimeKey(String recTimeKey) {
        this.recTimeKey = recTimeKey == null ? null : recTimeKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_recommend_user.type
     *
     * @return the value of a_recommend_user.type
     *
     * @mbggenerated Wed Dec 14 15:38:13 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_recommend_user.type
     *
     * @param type the value for a_recommend_user.type
     *
     * @mbggenerated Wed Dec 14 15:38:13 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column a_recommend_user.create_time
     *
     * @return the value of a_recommend_user.create_time
     *
     * @mbggenerated Wed Dec 14 15:38:13 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column a_recommend_user.create_time
     *
     * @param createTime the value for a_recommend_user.create_time
     *
     * @mbggenerated Wed Dec 14 15:38:13 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}