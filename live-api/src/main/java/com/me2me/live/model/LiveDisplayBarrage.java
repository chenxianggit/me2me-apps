package com.me2me.live.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class LiveDisplayBarrage implements BaseEntity{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_barrage.id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_barrage.topic_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long topicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_barrage.uid
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_barrage.barrage
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private String barrage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_barrage.top_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long topId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_barrage.bottom_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Long bottomId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column live_display_barrage.create_time
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_barrage.id
     *
     * @return the value of live_display_barrage.id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_barrage.id
     *
     * @param id the value for live_display_barrage.id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_barrage.topic_id
     *
     * @return the value of live_display_barrage.topic_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_barrage.topic_id
     *
     * @param topicId the value for live_display_barrage.topic_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_barrage.uid
     *
     * @return the value of live_display_barrage.uid
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_barrage.uid
     *
     * @param uid the value for live_display_barrage.uid
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_barrage.barrage
     *
     * @return the value of live_display_barrage.barrage
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public String getBarrage() {
        return barrage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_barrage.barrage
     *
     * @param barrage the value for live_display_barrage.barrage
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setBarrage(String barrage) {
        this.barrage = barrage == null ? null : barrage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_barrage.top_id
     *
     * @return the value of live_display_barrage.top_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getTopId() {
        return topId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_barrage.top_id
     *
     * @param topId the value for live_display_barrage.top_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setTopId(Long topId) {
        this.topId = topId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_barrage.bottom_id
     *
     * @return the value of live_display_barrage.bottom_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Long getBottomId() {
        return bottomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_barrage.bottom_id
     *
     * @param bottomId the value for live_display_barrage.bottom_id
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setBottomId(Long bottomId) {
        this.bottomId = bottomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column live_display_barrage.create_time
     *
     * @return the value of live_display_barrage.create_time
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column live_display_barrage.create_time
     *
     * @param createTime the value for live_display_barrage.create_time
     *
     * @mbggenerated Wed Jul 27 17:10:27 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}