package com.me2me.content.model;

public class ContentTags {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_tags.id
     *
     * @mbggenerated Fri Mar 25 13:38:25 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_tags.tag
     *
     * @mbggenerated Fri Mar 25 13:38:25 CST 2016
     */
    private String tag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_tags.hot
     *
     * @mbggenerated Fri Mar 25 13:38:25 CST 2016
     */
    private Integer hot;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_tags.id
     *
     * @return the value of content_tags.id
     *
     * @mbggenerated Fri Mar 25 13:38:25 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_tags.id
     *
     * @param id the value for content_tags.id
     *
     * @mbggenerated Fri Mar 25 13:38:25 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_tags.tag
     *
     * @return the value of content_tags.tag
     *
     * @mbggenerated Fri Mar 25 13:38:25 CST 2016
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_tags.tag
     *
     * @param tag the value for content_tags.tag
     *
     * @mbggenerated Fri Mar 25 13:38:25 CST 2016
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_tags.hot
     *
     * @return the value of content_tags.hot
     *
     * @mbggenerated Fri Mar 25 13:38:25 CST 2016
     */
    public Integer getHot() {
        return hot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_tags.hot
     *
     * @param hot the value for content_tags.hot
     *
     * @mbggenerated Fri Mar 25 13:38:25 CST 2016
     */
    public void setHot(Integer hot) {
        this.hot = hot;
    }
}