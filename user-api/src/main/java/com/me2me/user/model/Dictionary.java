package com.me2me.user.model;

import com.me2me.common.web.BaseEntity;

public class Dictionary implements BaseEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.id
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.tid
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    private Long tid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.value
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    private String value;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dictionary.sort
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    private Integer sort;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.id
     *
     * @return the value of dictionary.id
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.id
     *
     * @param id the value for dictionary.id
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.tid
     *
     * @return the value of dictionary.tid
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public Long getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.tid
     *
     * @param tid the value for dictionary.tid
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public void setTid(Long tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.value
     *
     * @return the value of dictionary.value
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.value
     *
     * @param value the value for dictionary.value
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dictionary.sort
     *
     * @return the value of dictionary.sort
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dictionary.sort
     *
     * @param sort the value for dictionary.sort
     *
     * @mbggenerated Mon Feb 29 16:27:09 CST 2016
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}