package com.me2me.live.model;

public class TopicFragmentWithBLOBs extends TopicFragment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_fragment.fragment
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    private String fragment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column topic_fragment.extra
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    private String extra;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_fragment.fragment
     *
     * @return the value of topic_fragment.fragment
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    public String getFragment() {
        return fragment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic_fragment.fragment
     *
     * @param fragment the value for topic_fragment.fragment
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    public void setFragment(String fragment) {
        this.fragment = fragment == null ? null : fragment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column topic_fragment.extra
     *
     * @return the value of topic_fragment.extra
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    public String getExtra() {
        return extra;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column topic_fragment.extra
     *
     * @param extra the value for topic_fragment.extra
     *
     * @mbggenerated Mon Aug 14 16:42:16 CST 2017
     */
    public void setExtra(String extra) {
        this.extra = extra == null ? null : extra.trim();
    }
}