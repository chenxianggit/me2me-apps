package com.me2me.article.model;

public class ArticleContentType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_content_type.id
     *
     * @mbggenerated Wed May 18 14:56:06 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column article_content_type.content_type
     *
     * @mbggenerated Wed May 18 14:56:06 CST 2016
     */
    private String contentType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_content_type.id
     *
     * @return the value of article_content_type.id
     *
     * @mbggenerated Wed May 18 14:56:06 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_content_type.id
     *
     * @param id the value for article_content_type.id
     *
     * @mbggenerated Wed May 18 14:56:06 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column article_content_type.content_type
     *
     * @return the value of article_content_type.content_type
     *
     * @mbggenerated Wed May 18 14:56:06 CST 2016
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column article_content_type.content_type
     *
     * @param contentType the value for article_content_type.content_type
     *
     * @mbggenerated Wed May 18 14:56:06 CST 2016
     */
    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }
}