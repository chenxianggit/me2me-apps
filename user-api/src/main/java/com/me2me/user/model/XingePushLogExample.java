package com.me2me.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XingePushLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    public XingePushLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
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
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
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

        public Criteria andRetCodeIsNull() {
            addCriterion("ret_code is null");
            return (Criteria) this;
        }

        public Criteria andRetCodeIsNotNull() {
            addCriterion("ret_code is not null");
            return (Criteria) this;
        }

        public Criteria andRetCodeEqualTo(Integer value) {
            addCriterion("ret_code =", value, "retCode");
            return (Criteria) this;
        }

        public Criteria andRetCodeNotEqualTo(Integer value) {
            addCriterion("ret_code <>", value, "retCode");
            return (Criteria) this;
        }

        public Criteria andRetCodeGreaterThan(Integer value) {
            addCriterion("ret_code >", value, "retCode");
            return (Criteria) this;
        }

        public Criteria andRetCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ret_code >=", value, "retCode");
            return (Criteria) this;
        }

        public Criteria andRetCodeLessThan(Integer value) {
            addCriterion("ret_code <", value, "retCode");
            return (Criteria) this;
        }

        public Criteria andRetCodeLessThanOrEqualTo(Integer value) {
            addCriterion("ret_code <=", value, "retCode");
            return (Criteria) this;
        }

        public Criteria andRetCodeIn(List<Integer> values) {
            addCriterion("ret_code in", values, "retCode");
            return (Criteria) this;
        }

        public Criteria andRetCodeNotIn(List<Integer> values) {
            addCriterion("ret_code not in", values, "retCode");
            return (Criteria) this;
        }

        public Criteria andRetCodeBetween(Integer value1, Integer value2) {
            addCriterion("ret_code between", value1, value2, "retCode");
            return (Criteria) this;
        }

        public Criteria andRetCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("ret_code not between", value1, value2, "retCode");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(Integer value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(Integer value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(Integer value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(Integer value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<Integer> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<Integer> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(Integer value1, Integer value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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
     * This class corresponds to the database table xinge_push_log
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 02 14:36:13 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table xinge_push_log
     *
     * @mbggenerated Thu Jun 02 14:36:13 CST 2016
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