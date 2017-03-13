package com.me2me.user.model;

import com.me2me.common.web.BaseEntity;

import java.util.Date;

public class IosWapx implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.id
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.udid
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private String udid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.app
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private String app;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.idfa
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private String idfa;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.openudid
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private String openudid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.os
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private String os;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.callbackurl
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private String callbackurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.ip
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.status
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ios_wapx.update_time
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.id
     *
     * @return the value of ios_wapx.id
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.id
     *
     * @param id the value for ios_wapx.id
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.udid
     *
     * @return the value of ios_wapx.udid
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public String getUdid() {
        return udid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.udid
     *
     * @param udid the value for ios_wapx.udid
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setUdid(String udid) {
        this.udid = udid == null ? null : udid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.app
     *
     * @return the value of ios_wapx.app
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public String getApp() {
        return app;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.app
     *
     * @param app the value for ios_wapx.app
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setApp(String app) {
        this.app = app == null ? null : app.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.idfa
     *
     * @return the value of ios_wapx.idfa
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public String getIdfa() {
        return idfa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.idfa
     *
     * @param idfa the value for ios_wapx.idfa
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setIdfa(String idfa) {
        this.idfa = idfa == null ? null : idfa.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.openudid
     *
     * @return the value of ios_wapx.openudid
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public String getOpenudid() {
        return openudid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.openudid
     *
     * @param openudid the value for ios_wapx.openudid
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setOpenudid(String openudid) {
        this.openudid = openudid == null ? null : openudid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.os
     *
     * @return the value of ios_wapx.os
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public String getOs() {
        return os;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.os
     *
     * @param os the value for ios_wapx.os
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.callbackurl
     *
     * @return the value of ios_wapx.callbackurl
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public String getCallbackurl() {
        return callbackurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.callbackurl
     *
     * @param callbackurl the value for ios_wapx.callbackurl
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setCallbackurl(String callbackurl) {
        this.callbackurl = callbackurl == null ? null : callbackurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.ip
     *
     * @return the value of ios_wapx.ip
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.ip
     *
     * @param ip the value for ios_wapx.ip
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.status
     *
     * @return the value of ios_wapx.status
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.status
     *
     * @param status the value for ios_wapx.status
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ios_wapx.update_time
     *
     * @return the value of ios_wapx.update_time
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ios_wapx.update_time
     *
     * @param updateTime the value for ios_wapx.update_time
     *
     * @mbggenerated Mon Mar 13 15:35:20 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}