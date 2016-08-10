package com.me2me.monitor.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class AccessCounter implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access_counter.id
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access_counter.type
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access_counter.access_count
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    private Integer accessCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access_counter.channel
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    private Integer channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column access_counter.create_time
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access_counter.id
     *
     * @return the value of access_counter.id
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access_counter.id
     *
     * @param id the value for access_counter.id
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access_counter.type
     *
     * @return the value of access_counter.type
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access_counter.type
     *
     * @param type the value for access_counter.type
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access_counter.access_count
     *
     * @return the value of access_counter.access_count
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public Integer getAccessCount() {
        return accessCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access_counter.access_count
     *
     * @param accessCount the value for access_counter.access_count
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public void setAccessCount(Integer accessCount) {
        this.accessCount = accessCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access_counter.channel
     *
     * @return the value of access_counter.channel
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public Integer getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access_counter.channel
     *
     * @param channel the value for access_counter.channel
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column access_counter.create_time
     *
     * @return the value of access_counter.create_time
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column access_counter.create_time
     *
     * @param createTime the value for access_counter.create_time
     *
     * @mbggenerated Mon Jun 13 20:16:07 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}