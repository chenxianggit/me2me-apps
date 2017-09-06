package com.me2me.live.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiftHistoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    public GiftHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
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
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Long value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Long value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Long value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Long value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Long value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Long value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Long> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Long> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Long value1, Long value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Long value1, Long value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNull() {
            addCriterion("topic_id is null");
            return (Criteria) this;
        }

        public Criteria andTopicIdIsNotNull() {
            addCriterion("topic_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopicIdEqualTo(Long value) {
            addCriterion("topic_id =", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotEqualTo(Long value) {
            addCriterion("topic_id <>", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThan(Long value) {
            addCriterion("topic_id >", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("topic_id >=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThan(Long value) {
            addCriterion("topic_id <", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdLessThanOrEqualTo(Long value) {
            addCriterion("topic_id <=", value, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdIn(List<Long> values) {
            addCriterion("topic_id in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotIn(List<Long> values) {
            addCriterion("topic_id not in", values, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdBetween(Long value1, Long value2) {
            addCriterion("topic_id between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andTopicIdNotBetween(Long value1, Long value2) {
            addCriterion("topic_id not between", value1, value2, "topicId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNull() {
            addCriterion("gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Long value) {
            addCriterion("gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Long value) {
            addCriterion("gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Long value) {
            addCriterion("gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Long value) {
            addCriterion("gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Long value) {
            addCriterion("gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Long> values) {
            addCriterion("gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Long> values) {
            addCriterion("gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Long value1, Long value2) {
            addCriterion("gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Long value1, Long value2) {
            addCriterion("gift_id not between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdIsNull() {
            addCriterion("fragment_id is null");
            return (Criteria) this;
        }

        public Criteria andFragmentIdIsNotNull() {
            addCriterion("fragment_id is not null");
            return (Criteria) this;
        }

        public Criteria andFragmentIdEqualTo(Long value) {
            addCriterion("fragment_id =", value, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdNotEqualTo(Long value) {
            addCriterion("fragment_id <>", value, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdGreaterThan(Long value) {
            addCriterion("fragment_id >", value, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fragment_id >=", value, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdLessThan(Long value) {
            addCriterion("fragment_id <", value, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdLessThanOrEqualTo(Long value) {
            addCriterion("fragment_id <=", value, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdIn(List<Long> values) {
            addCriterion("fragment_id in", values, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdNotIn(List<Long> values) {
            addCriterion("fragment_id not in", values, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdBetween(Long value1, Long value2) {
            addCriterion("fragment_id between", value1, value2, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andFragmentIdNotBetween(Long value1, Long value2) {
            addCriterion("fragment_id not between", value1, value2, "fragmentId");
            return (Criteria) this;
        }

        public Criteria andGiftCountIsNull() {
            addCriterion("gift_count is null");
            return (Criteria) this;
        }

        public Criteria andGiftCountIsNotNull() {
            addCriterion("gift_count is not null");
            return (Criteria) this;
        }

        public Criteria andGiftCountEqualTo(Integer value) {
            addCriterion("gift_count =", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotEqualTo(Integer value) {
            addCriterion("gift_count <>", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountGreaterThan(Integer value) {
            addCriterion("gift_count >", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_count >=", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountLessThan(Integer value) {
            addCriterion("gift_count <", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountLessThanOrEqualTo(Integer value) {
            addCriterion("gift_count <=", value, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountIn(List<Integer> values) {
            addCriterion("gift_count in", values, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotIn(List<Integer> values) {
            addCriterion("gift_count not in", values, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountBetween(Integer value1, Integer value2) {
            addCriterion("gift_count between", value1, value2, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftCountNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_count not between", value1, value2, "giftCount");
            return (Criteria) this;
        }

        public Criteria andGiftPriceIsNull() {
            addCriterion("gift_price is null");
            return (Criteria) this;
        }

        public Criteria andGiftPriceIsNotNull() {
            addCriterion("gift_price is not null");
            return (Criteria) this;
        }

        public Criteria andGiftPriceEqualTo(Integer value) {
            addCriterion("gift_price =", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotEqualTo(Integer value) {
            addCriterion("gift_price <>", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceGreaterThan(Integer value) {
            addCriterion("gift_price >", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_price >=", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceLessThan(Integer value) {
            addCriterion("gift_price <", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceLessThanOrEqualTo(Integer value) {
            addCriterion("gift_price <=", value, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceIn(List<Integer> values) {
            addCriterion("gift_price in", values, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotIn(List<Integer> values) {
            addCriterion("gift_price not in", values, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceBetween(Integer value1, Integer value2) {
            addCriterion("gift_price between", value1, value2, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_price not between", value1, value2, "giftPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceIsNull() {
            addCriterion("gift_topic_price is null");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceIsNotNull() {
            addCriterion("gift_topic_price is not null");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceEqualTo(Integer value) {
            addCriterion("gift_topic_price =", value, "giftTopicPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceNotEqualTo(Integer value) {
            addCriterion("gift_topic_price <>", value, "giftTopicPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceGreaterThan(Integer value) {
            addCriterion("gift_topic_price >", value, "giftTopicPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("gift_topic_price >=", value, "giftTopicPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceLessThan(Integer value) {
            addCriterion("gift_topic_price <", value, "giftTopicPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceLessThanOrEqualTo(Integer value) {
            addCriterion("gift_topic_price <=", value, "giftTopicPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceIn(List<Integer> values) {
            addCriterion("gift_topic_price in", values, "giftTopicPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceNotIn(List<Integer> values) {
            addCriterion("gift_topic_price not in", values, "giftTopicPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceBetween(Integer value1, Integer value2) {
            addCriterion("gift_topic_price between", value1, value2, "giftTopicPrice");
            return (Criteria) this;
        }

        public Criteria andGiftTopicPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("gift_topic_price not between", value1, value2, "giftTopicPrice");
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
     * This class corresponds to the database table gift_history
     *
     * @mbggenerated do_not_delete_during_merge Wed Sep 06 19:12:13 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table gift_history
     *
     * @mbggenerated Wed Sep 06 19:12:13 CST 2017
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