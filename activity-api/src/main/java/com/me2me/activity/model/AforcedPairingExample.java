package com.me2me.activity.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AforcedPairingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    public AforcedPairingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
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
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
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

        public Criteria andAuidIsNull() {
            addCriterion("auid is null");
            return (Criteria) this;
        }

        public Criteria andAuidIsNotNull() {
            addCriterion("auid is not null");
            return (Criteria) this;
        }

        public Criteria andAuidEqualTo(Long value) {
            addCriterion("auid =", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidNotEqualTo(Long value) {
            addCriterion("auid <>", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidGreaterThan(Long value) {
            addCriterion("auid >", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidGreaterThanOrEqualTo(Long value) {
            addCriterion("auid >=", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidLessThan(Long value) {
            addCriterion("auid <", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidLessThanOrEqualTo(Long value) {
            addCriterion("auid <=", value, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidIn(List<Long> values) {
            addCriterion("auid in", values, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidNotIn(List<Long> values) {
            addCriterion("auid not in", values, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidBetween(Long value1, Long value2) {
            addCriterion("auid between", value1, value2, "auid");
            return (Criteria) this;
        }

        public Criteria andAuidNotBetween(Long value1, Long value2) {
            addCriterion("auid not between", value1, value2, "auid");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andTargetUidIsNull() {
            addCriterion("target_uid is null");
            return (Criteria) this;
        }

        public Criteria andTargetUidIsNotNull() {
            addCriterion("target_uid is not null");
            return (Criteria) this;
        }

        public Criteria andTargetUidEqualTo(Long value) {
            addCriterion("target_uid =", value, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetUidNotEqualTo(Long value) {
            addCriterion("target_uid <>", value, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetUidGreaterThan(Long value) {
            addCriterion("target_uid >", value, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetUidGreaterThanOrEqualTo(Long value) {
            addCriterion("target_uid >=", value, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetUidLessThan(Long value) {
            addCriterion("target_uid <", value, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetUidLessThanOrEqualTo(Long value) {
            addCriterion("target_uid <=", value, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetUidIn(List<Long> values) {
            addCriterion("target_uid in", values, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetUidNotIn(List<Long> values) {
            addCriterion("target_uid not in", values, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetUidBetween(Long value1, Long value2) {
            addCriterion("target_uid between", value1, value2, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetUidNotBetween(Long value1, Long value2) {
            addCriterion("target_uid not between", value1, value2, "targetUid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidIsNull() {
            addCriterion("target_auid is null");
            return (Criteria) this;
        }

        public Criteria andTargetAuidIsNotNull() {
            addCriterion("target_auid is not null");
            return (Criteria) this;
        }

        public Criteria andTargetAuidEqualTo(Long value) {
            addCriterion("target_auid =", value, "targetAuid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidNotEqualTo(Long value) {
            addCriterion("target_auid <>", value, "targetAuid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidGreaterThan(Long value) {
            addCriterion("target_auid >", value, "targetAuid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidGreaterThanOrEqualTo(Long value) {
            addCriterion("target_auid >=", value, "targetAuid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidLessThan(Long value) {
            addCriterion("target_auid <", value, "targetAuid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidLessThanOrEqualTo(Long value) {
            addCriterion("target_auid <=", value, "targetAuid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidIn(List<Long> values) {
            addCriterion("target_auid in", values, "targetAuid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidNotIn(List<Long> values) {
            addCriterion("target_auid not in", values, "targetAuid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidBetween(Long value1, Long value2) {
            addCriterion("target_auid between", value1, value2, "targetAuid");
            return (Criteria) this;
        }

        public Criteria andTargetAuidNotBetween(Long value1, Long value2) {
            addCriterion("target_auid not between", value1, value2, "targetAuid");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table a_forced_pairing
     *
     * @mbggenerated do_not_delete_during_merge Thu Dec 15 19:35:29 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table a_forced_pairing
     *
     * @mbggenerated Thu Dec 15 19:35:29 CST 2016
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