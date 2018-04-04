package com.me2me.user.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class VersionControl implements BaseEntity{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column version_control.id
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column version_control.version
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    private String version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column version_control.platform
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    private Integer platform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column version_control.update_description
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    private String updateDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column version_control.update_url
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    private String updateUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column version_control.force_update
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    private Integer forceUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column version_control.update_time
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column version_control.id
     *
     * @return the value of version_control.id
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column version_control.id
     *
     * @param id the value for version_control.id
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column version_control.version
     *
     * @return the value of version_control.version
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column version_control.version
     *
     * @param version the value for version_control.version
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column version_control.platform
     *
     * @return the value of version_control.platform
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column version_control.platform
     *
     * @param platform the value for version_control.platform
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column version_control.update_description
     *
     * @return the value of version_control.update_description
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public String getUpdateDescription() {
        return updateDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column version_control.update_description
     *
     * @param updateDescription the value for version_control.update_description
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription == null ? null : updateDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column version_control.update_url
     *
     * @return the value of version_control.update_url
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public String getUpdateUrl() {
        return updateUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column version_control.update_url
     *
     * @param updateUrl the value for version_control.update_url
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl == null ? null : updateUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column version_control.force_update
     *
     * @return the value of version_control.force_update
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public Integer getForceUpdate() {
        return forceUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column version_control.force_update
     *
     * @param forceUpdate the value for version_control.force_update
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public void setForceUpdate(Integer forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column version_control.update_time
     *
     * @return the value of version_control.update_time
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column version_control.update_time
     *
     * @param updateTime the value for version_control.update_time
     *
     * @mbggenerated Tue May 17 11:16:50 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}