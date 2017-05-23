package com.me2me.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class emotionInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public emotionInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEmotionnameIsNull() {
            addCriterion("emotionName is null");
            return (Criteria) this;
        }

        public Criteria andEmotionnameIsNotNull() {
            addCriterion("emotionName is not null");
            return (Criteria) this;
        }

        public Criteria andEmotionnameEqualTo(String value) {
            addCriterion("emotionName =", value, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameNotEqualTo(String value) {
            addCriterion("emotionName <>", value, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameGreaterThan(String value) {
            addCriterion("emotionName >", value, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameGreaterThanOrEqualTo(String value) {
            addCriterion("emotionName >=", value, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameLessThan(String value) {
            addCriterion("emotionName <", value, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameLessThanOrEqualTo(String value) {
            addCriterion("emotionName <=", value, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameLike(String value) {
            addCriterion("emotionName like", value, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameNotLike(String value) {
            addCriterion("emotionName not like", value, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameIn(List<String> values) {
            addCriterion("emotionName in", values, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameNotIn(List<String> values) {
            addCriterion("emotionName not in", values, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameBetween(String value1, String value2) {
            addCriterion("emotionName between", value1, value2, "emotionname");
            return (Criteria) this;
        }

        public Criteria andEmotionnameNotBetween(String value1, String value2) {
            addCriterion("emotionName not between", value1, value2, "emotionname");
            return (Criteria) this;
        }

        public Criteria andHappyminIsNull() {
            addCriterion("happyMin is null");
            return (Criteria) this;
        }

        public Criteria andHappyminIsNotNull() {
            addCriterion("happyMin is not null");
            return (Criteria) this;
        }

        public Criteria andHappyminEqualTo(Integer value) {
            addCriterion("happyMin =", value, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappyminNotEqualTo(Integer value) {
            addCriterion("happyMin <>", value, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappyminGreaterThan(Integer value) {
            addCriterion("happyMin >", value, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappyminGreaterThanOrEqualTo(Integer value) {
            addCriterion("happyMin >=", value, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappyminLessThan(Integer value) {
            addCriterion("happyMin <", value, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappyminLessThanOrEqualTo(Integer value) {
            addCriterion("happyMin <=", value, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappyminIn(List<Integer> values) {
            addCriterion("happyMin in", values, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappyminNotIn(List<Integer> values) {
            addCriterion("happyMin not in", values, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappyminBetween(Integer value1, Integer value2) {
            addCriterion("happyMin between", value1, value2, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappyminNotBetween(Integer value1, Integer value2) {
            addCriterion("happyMin not between", value1, value2, "happymin");
            return (Criteria) this;
        }

        public Criteria andHappymaxIsNull() {
            addCriterion("happyMax is null");
            return (Criteria) this;
        }

        public Criteria andHappymaxIsNotNull() {
            addCriterion("happyMax is not null");
            return (Criteria) this;
        }

        public Criteria andHappymaxEqualTo(Integer value) {
            addCriterion("happyMax =", value, "happymax");
            return (Criteria) this;
        }

        public Criteria andHappymaxNotEqualTo(Integer value) {
            addCriterion("happyMax <>", value, "happymax");
            return (Criteria) this;
        }

        public Criteria andHappymaxGreaterThan(Integer value) {
            addCriterion("happyMax >", value, "happymax");
            return (Criteria) this;
        }

        public Criteria andHappymaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("happyMax >=", value, "happymax");
            return (Criteria) this;
        }

        public Criteria andHappymaxLessThan(Integer value) {
            addCriterion("happyMax <", value, "happymax");
            return (Criteria) this;
        }

        public Criteria andHappymaxLessThanOrEqualTo(Integer value) {
            addCriterion("happyMax <=", value, "happymax");
            return (Criteria) this;
        }

        public Criteria andHappymaxIn(List<Integer> values) {
            addCriterion("happyMax in", values, "happymax");
            return (Criteria) this;
        }

        public Criteria andHappymaxNotIn(List<Integer> values) {
            addCriterion("happyMax not in", values, "happymax");
            return (Criteria) this;
        }

        public Criteria andHappymaxBetween(Integer value1, Integer value2) {
            addCriterion("happyMax between", value1, value2, "happymax");
            return (Criteria) this;
        }

        public Criteria andHappymaxNotBetween(Integer value1, Integer value2) {
            addCriterion("happyMax not between", value1, value2, "happymax");
            return (Criteria) this;
        }

        public Criteria andFreeminIsNull() {
            addCriterion("freeMin is null");
            return (Criteria) this;
        }

        public Criteria andFreeminIsNotNull() {
            addCriterion("freeMin is not null");
            return (Criteria) this;
        }

        public Criteria andFreeminEqualTo(Integer value) {
            addCriterion("freeMin =", value, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreeminNotEqualTo(Integer value) {
            addCriterion("freeMin <>", value, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreeminGreaterThan(Integer value) {
            addCriterion("freeMin >", value, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreeminGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeMin >=", value, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreeminLessThan(Integer value) {
            addCriterion("freeMin <", value, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreeminLessThanOrEqualTo(Integer value) {
            addCriterion("freeMin <=", value, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreeminIn(List<Integer> values) {
            addCriterion("freeMin in", values, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreeminNotIn(List<Integer> values) {
            addCriterion("freeMin not in", values, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreeminBetween(Integer value1, Integer value2) {
            addCriterion("freeMin between", value1, value2, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreeminNotBetween(Integer value1, Integer value2) {
            addCriterion("freeMin not between", value1, value2, "freemin");
            return (Criteria) this;
        }

        public Criteria andFreemaxIsNull() {
            addCriterion("freeMax is null");
            return (Criteria) this;
        }

        public Criteria andFreemaxIsNotNull() {
            addCriterion("freeMax is not null");
            return (Criteria) this;
        }

        public Criteria andFreemaxEqualTo(Integer value) {
            addCriterion("freeMax =", value, "freemax");
            return (Criteria) this;
        }

        public Criteria andFreemaxNotEqualTo(Integer value) {
            addCriterion("freeMax <>", value, "freemax");
            return (Criteria) this;
        }

        public Criteria andFreemaxGreaterThan(Integer value) {
            addCriterion("freeMax >", value, "freemax");
            return (Criteria) this;
        }

        public Criteria andFreemaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeMax >=", value, "freemax");
            return (Criteria) this;
        }

        public Criteria andFreemaxLessThan(Integer value) {
            addCriterion("freeMax <", value, "freemax");
            return (Criteria) this;
        }

        public Criteria andFreemaxLessThanOrEqualTo(Integer value) {
            addCriterion("freeMax <=", value, "freemax");
            return (Criteria) this;
        }

        public Criteria andFreemaxIn(List<Integer> values) {
            addCriterion("freeMax in", values, "freemax");
            return (Criteria) this;
        }

        public Criteria andFreemaxNotIn(List<Integer> values) {
            addCriterion("freeMax not in", values, "freemax");
            return (Criteria) this;
        }

        public Criteria andFreemaxBetween(Integer value1, Integer value2) {
            addCriterion("freeMax between", value1, value2, "freemax");
            return (Criteria) this;
        }

        public Criteria andFreemaxNotBetween(Integer value1, Integer value2) {
            addCriterion("freeMax not between", value1, value2, "freemax");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidIsNull() {
            addCriterion("emotionPackId is null");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidIsNotNull() {
            addCriterion("emotionPackId is not null");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidEqualTo(Long value) {
            addCriterion("emotionPackId =", value, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidNotEqualTo(Long value) {
            addCriterion("emotionPackId <>", value, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidGreaterThan(Long value) {
            addCriterion("emotionPackId >", value, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidGreaterThanOrEqualTo(Long value) {
            addCriterion("emotionPackId >=", value, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidLessThan(Long value) {
            addCriterion("emotionPackId <", value, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidLessThanOrEqualTo(Long value) {
            addCriterion("emotionPackId <=", value, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidIn(List<Long> values) {
            addCriterion("emotionPackId in", values, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidNotIn(List<Long> values) {
            addCriterion("emotionPackId not in", values, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidBetween(Long value1, Long value2) {
            addCriterion("emotionPackId between", value1, value2, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andEmotionpackidNotBetween(Long value1, Long value2) {
            addCriterion("emotionPackId not between", value1, value2, "emotionpackid");
            return (Criteria) this;
        }

        public Criteria andTopicidIsNull() {
            addCriterion("topicId is null");
            return (Criteria) this;
        }

        public Criteria andTopicidIsNotNull() {
            addCriterion("topicId is not null");
            return (Criteria) this;
        }

        public Criteria andTopicidEqualTo(Long value) {
            addCriterion("topicId =", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotEqualTo(Long value) {
            addCriterion("topicId <>", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidGreaterThan(Long value) {
            addCriterion("topicId >", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidGreaterThanOrEqualTo(Long value) {
            addCriterion("topicId >=", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidLessThan(Long value) {
            addCriterion("topicId <", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidLessThanOrEqualTo(Long value) {
            addCriterion("topicId <=", value, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidIn(List<Long> values) {
            addCriterion("topicId in", values, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotIn(List<Long> values) {
            addCriterion("topicId not in", values, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidBetween(Long value1, Long value2) {
            addCriterion("topicId between", value1, value2, "topicid");
            return (Criteria) this;
        }

        public Criteria andTopicidNotBetween(Long value1, Long value2) {
            addCriterion("topicId not between", value1, value2, "topicid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table emotion_info
     *
     * @mbggenerated do_not_delete_during_merge Tue May 23 14:16:14 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table emotion_info
     *
     * @mbggenerated Tue May 23 14:16:14 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}