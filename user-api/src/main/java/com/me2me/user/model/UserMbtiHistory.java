package com.me2me.user.model;

import java.io.Serializable;
import java.util.Date;

public class UserMbtiHistory implements Serializable{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mbti_history.id
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mbti_history.uid
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mbti_history.mbti
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    private String mbti;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mbti_history.shared
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    private Integer shared;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mbti_history.create_time
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mbti_history.id
     *
     * @return the value of user_mbti_history.id
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mbti_history.id
     *
     * @param id the value for user_mbti_history.id
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mbti_history.uid
     *
     * @return the value of user_mbti_history.uid
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mbti_history.uid
     *
     * @param uid the value for user_mbti_history.uid
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mbti_history.mbti
     *
     * @return the value of user_mbti_history.mbti
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public String getMbti() {
        return mbti;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mbti_history.mbti
     *
     * @param mbti the value for user_mbti_history.mbti
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public void setMbti(String mbti) {
        this.mbti = mbti == null ? null : mbti.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mbti_history.shared
     *
     * @return the value of user_mbti_history.shared
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public Integer getShared() {
        return shared;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mbti_history.shared
     *
     * @param shared the value for user_mbti_history.shared
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public void setShared(Integer shared) {
        this.shared = shared;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mbti_history.create_time
     *
     * @return the value of user_mbti_history.create_time
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mbti_history.create_time
     *
     * @param createTime the value for user_mbti_history.create_time
     *
     * @mbggenerated Tue May 23 10:39:55 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}