package com.me2me.im.model;

import com.me2me.common.web.BaseEntity;

public class GroupMember implements BaseEntity{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_members.id
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_members.gid
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    private Long gid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_members.uid
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    private Long uid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column group_members.remark
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_members.id
     *
     * @return the value of group_members.id
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_members.id
     *
     * @param id the value for group_members.id
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_members.gid
     *
     * @return the value of group_members.gid
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    public Long getGid() {
        return gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_members.gid
     *
     * @param gid the value for group_members.gid
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    public void setGid(Long gid) {
        this.gid = gid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_members.uid
     *
     * @return the value of group_members.uid
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_members.uid
     *
     * @param uid the value for group_members.uid
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column group_members.remark
     *
     * @return the value of group_members.remark
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column group_members.remark
     *
     * @param remark the value for group_members.remark
     *
     * @mbggenerated Tue Mar 01 14:03:50 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}