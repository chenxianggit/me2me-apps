package com.me2me.content.model;

import java.util.Date;

import com.me2me.common.web.BaseEntity;

public class AdBanner implements BaseEntity  {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad_banner.id
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad_banner.ad_banner_name
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    private String adBannerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad_banner.banner_position
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    private String bannerPosition;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad_banner.status
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ad_banner.create_time
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_banner.id
     *
     * @return the value of ad_banner.id
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_banner.id
     *
     * @param id the value for ad_banner.id
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_banner.ad_banner_name
     *
     * @return the value of ad_banner.ad_banner_name
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public String getAdBannerName() {
        return adBannerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_banner.ad_banner_name
     *
     * @param adBannerName the value for ad_banner.ad_banner_name
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public void setAdBannerName(String adBannerName) {
        this.adBannerName = adBannerName == null ? null : adBannerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_banner.banner_position
     *
     * @return the value of ad_banner.banner_position
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public String getBannerPosition() {
        return bannerPosition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_banner.banner_position
     *
     * @param bannerPosition the value for ad_banner.banner_position
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public void setBannerPosition(String bannerPosition) {
        this.bannerPosition = bannerPosition == null ? null : bannerPosition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_banner.status
     *
     * @return the value of ad_banner.status
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_banner.status
     *
     * @param status the value for ad_banner.status
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ad_banner.create_time
     *
     * @return the value of ad_banner.create_time
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ad_banner.create_time
     *
     * @param createTime the value for ad_banner.create_time
     *
     * @mbggenerated Tue Sep 19 18:04:55 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}