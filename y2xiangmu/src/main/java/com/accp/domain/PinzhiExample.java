package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PinzhiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PinzhiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andPinzhiidIsNull() {
            addCriterion("PinZhiId is null");
            return (Criteria) this;
        }

        public Criteria andPinzhiidIsNotNull() {
            addCriterion("PinZhiId is not null");
            return (Criteria) this;
        }

        public Criteria andPinzhiidEqualTo(Integer value) {
            addCriterion("PinZhiId =", value, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andPinzhiidNotEqualTo(Integer value) {
            addCriterion("PinZhiId <>", value, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andPinzhiidGreaterThan(Integer value) {
            addCriterion("PinZhiId >", value, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andPinzhiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PinZhiId >=", value, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andPinzhiidLessThan(Integer value) {
            addCriterion("PinZhiId <", value, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andPinzhiidLessThanOrEqualTo(Integer value) {
            addCriterion("PinZhiId <=", value, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andPinzhiidIn(List<Integer> values) {
            addCriterion("PinZhiId in", values, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andPinzhiidNotIn(List<Integer> values) {
            addCriterion("PinZhiId not in", values, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andPinzhiidBetween(Integer value1, Integer value2) {
            addCriterion("PinZhiId between", value1, value2, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andPinzhiidNotBetween(Integer value1, Integer value2) {
            addCriterion("PinZhiId not between", value1, value2, "pinzhiid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andRequeirIsNull() {
            addCriterion("requeir is null");
            return (Criteria) this;
        }

        public Criteria andRequeirIsNotNull() {
            addCriterion("requeir is not null");
            return (Criteria) this;
        }

        public Criteria andRequeirEqualTo(String value) {
            addCriterion("requeir =", value, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirNotEqualTo(String value) {
            addCriterion("requeir <>", value, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirGreaterThan(String value) {
            addCriterion("requeir >", value, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirGreaterThanOrEqualTo(String value) {
            addCriterion("requeir >=", value, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirLessThan(String value) {
            addCriterion("requeir <", value, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirLessThanOrEqualTo(String value) {
            addCriterion("requeir <=", value, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirLike(String value) {
            addCriterion("requeir like", value, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirNotLike(String value) {
            addCriterion("requeir not like", value, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirIn(List<String> values) {
            addCriterion("requeir in", values, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirNotIn(List<String> values) {
            addCriterion("requeir not in", values, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirBetween(String value1, String value2) {
            addCriterion("requeir between", value1, value2, "requeir");
            return (Criteria) this;
        }

        public Criteria andRequeirNotBetween(String value1, String value2) {
            addCriterion("requeir not between", value1, value2, "requeir");
            return (Criteria) this;
        }

        public Criteria andEnderIsNull() {
            addCriterion("ender is null");
            return (Criteria) this;
        }

        public Criteria andEnderIsNotNull() {
            addCriterion("ender is not null");
            return (Criteria) this;
        }

        public Criteria andEnderEqualTo(Date value) {
            addCriterion("ender =", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderNotEqualTo(Date value) {
            addCriterion("ender <>", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderGreaterThan(Date value) {
            addCriterion("ender >", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderGreaterThanOrEqualTo(Date value) {
            addCriterion("ender >=", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderLessThan(Date value) {
            addCriterion("ender <", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderLessThanOrEqualTo(Date value) {
            addCriterion("ender <=", value, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderIn(List<Date> values) {
            addCriterion("ender in", values, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderNotIn(List<Date> values) {
            addCriterion("ender not in", values, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderBetween(Date value1, Date value2) {
            addCriterion("ender between", value1, value2, "ender");
            return (Criteria) this;
        }

        public Criteria andEnderNotBetween(Date value1, Date value2) {
            addCriterion("ender not between", value1, value2, "ender");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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