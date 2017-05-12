package com.me2me.live.model;

import java.util.Date;

import com.me2me.common.web.BaseEntity;

public class VoteRecord implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_record.id
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_record.uid
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_record.voteId
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    private Long voteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_record.optionId
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    private Long optionid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column vote_record.create_time
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_record.id
     *
     * @return the value of vote_record.id
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_record.id
     *
     * @param id the value for vote_record.id
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_record.uid
     *
     * @return the value of vote_record.uid
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_record.uid
     *
     * @param uid the value for vote_record.uid
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_record.voteId
     *
     * @return the value of vote_record.voteId
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public Long getVoteid() {
        return voteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_record.voteId
     *
     * @param voteid the value for vote_record.voteId
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public void setVoteid(Long voteid) {
        this.voteid = voteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_record.optionId
     *
     * @return the value of vote_record.optionId
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public Long getOptionid() {
        return optionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_record.optionId
     *
     * @param optionid the value for vote_record.optionId
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public void setOptionid(Long optionid) {
        this.optionid = optionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column vote_record.create_time
     *
     * @return the value of vote_record.create_time
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column vote_record.create_time
     *
     * @param createTime the value for vote_record.create_time
     *
     * @mbggenerated Tue May 09 16:04:57 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}