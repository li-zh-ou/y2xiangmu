package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class FadongbankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FadongbankExample() {
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

        public Criteria andFabankidIsNull() {
            addCriterion("FaBankId is null");
            return (Criteria) this;
        }

        public Criteria andFabankidIsNotNull() {
            addCriterion("FaBankId is not null");
            return (Criteria) this;
        }

        public Criteria andFabankidEqualTo(Integer value) {
            addCriterion("FaBankId =", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidNotEqualTo(Integer value) {
            addCriterion("FaBankId <>", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidGreaterThan(Integer value) {
            addCriterion("FaBankId >", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FaBankId >=", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidLessThan(Integer value) {
            addCriterion("FaBankId <", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidLessThanOrEqualTo(Integer value) {
            addCriterion("FaBankId <=", value, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidIn(List<Integer> values) {
            addCriterion("FaBankId in", values, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidNotIn(List<Integer> values) {
            addCriterion("FaBankId not in", values, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidBetween(Integer value1, Integer value2) {
            addCriterion("FaBankId between", value1, value2, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFabankidNotBetween(Integer value1, Integer value2) {
            addCriterion("FaBankId not between", value1, value2, "fabankid");
            return (Criteria) this;
        }

        public Criteria andFanameIsNull() {
            addCriterion("FaName is null");
            return (Criteria) this;
        }

        public Criteria andFanameIsNotNull() {
            addCriterion("FaName is not null");
            return (Criteria) this;
        }

        public Criteria andFanameEqualTo(String value) {
            addCriterion("FaName =", value, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameNotEqualTo(String value) {
            addCriterion("FaName <>", value, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameGreaterThan(String value) {
            addCriterion("FaName >", value, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameGreaterThanOrEqualTo(String value) {
            addCriterion("FaName >=", value, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameLessThan(String value) {
            addCriterion("FaName <", value, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameLessThanOrEqualTo(String value) {
            addCriterion("FaName <=", value, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameLike(String value) {
            addCriterion("FaName like", value, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameNotLike(String value) {
            addCriterion("FaName not like", value, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameIn(List<String> values) {
            addCriterion("FaName in", values, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameNotIn(List<String> values) {
            addCriterion("FaName not in", values, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameBetween(String value1, String value2) {
            addCriterion("FaName between", value1, value2, "faname");
            return (Criteria) this;
        }

        public Criteria andFanameNotBetween(String value1, String value2) {
            addCriterion("FaName not between", value1, value2, "faname");
            return (Criteria) this;
        }

        public Criteria andFanumberIsNull() {
            addCriterion("FaNumber is null");
            return (Criteria) this;
        }

        public Criteria andFanumberIsNotNull() {
            addCriterion("FaNumber is not null");
            return (Criteria) this;
        }

        public Criteria andFanumberEqualTo(String value) {
            addCriterion("FaNumber =", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberNotEqualTo(String value) {
            addCriterion("FaNumber <>", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberGreaterThan(String value) {
            addCriterion("FaNumber >", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberGreaterThanOrEqualTo(String value) {
            addCriterion("FaNumber >=", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberLessThan(String value) {
            addCriterion("FaNumber <", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberLessThanOrEqualTo(String value) {
            addCriterion("FaNumber <=", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberLike(String value) {
            addCriterion("FaNumber like", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberNotLike(String value) {
            addCriterion("FaNumber not like", value, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberIn(List<String> values) {
            addCriterion("FaNumber in", values, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberNotIn(List<String> values) {
            addCriterion("FaNumber not in", values, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberBetween(String value1, String value2) {
            addCriterion("FaNumber between", value1, value2, "fanumber");
            return (Criteria) this;
        }

        public Criteria andFanumberNotBetween(String value1, String value2) {
            addCriterion("FaNumber not between", value1, value2, "fanumber");
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