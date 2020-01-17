package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CarbankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarbankExample() {
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

        public Criteria andCarbankidIsNull() {
            addCriterion("CarBankId is null");
            return (Criteria) this;
        }

        public Criteria andCarbankidIsNotNull() {
            addCriterion("CarBankId is not null");
            return (Criteria) this;
        }

        public Criteria andCarbankidEqualTo(Integer value) {
            addCriterion("CarBankId =", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidNotEqualTo(Integer value) {
            addCriterion("CarBankId <>", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidGreaterThan(Integer value) {
            addCriterion("CarBankId >", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CarBankId >=", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidLessThan(Integer value) {
            addCriterion("CarBankId <", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidLessThanOrEqualTo(Integer value) {
            addCriterion("CarBankId <=", value, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidIn(List<Integer> values) {
            addCriterion("CarBankId in", values, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidNotIn(List<Integer> values) {
            addCriterion("CarBankId not in", values, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidBetween(Integer value1, Integer value2) {
            addCriterion("CarBankId between", value1, value2, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbankidNotBetween(Integer value1, Integer value2) {
            addCriterion("CarBankId not between", value1, value2, "carbankid");
            return (Criteria) this;
        }

        public Criteria andCarbanknameIsNull() {
            addCriterion("CarBankName is null");
            return (Criteria) this;
        }

        public Criteria andCarbanknameIsNotNull() {
            addCriterion("CarBankName is not null");
            return (Criteria) this;
        }

        public Criteria andCarbanknameEqualTo(String value) {
            addCriterion("CarBankName =", value, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameNotEqualTo(String value) {
            addCriterion("CarBankName <>", value, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameGreaterThan(String value) {
            addCriterion("CarBankName >", value, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("CarBankName >=", value, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameLessThan(String value) {
            addCriterion("CarBankName <", value, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameLessThanOrEqualTo(String value) {
            addCriterion("CarBankName <=", value, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameLike(String value) {
            addCriterion("CarBankName like", value, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameNotLike(String value) {
            addCriterion("CarBankName not like", value, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameIn(List<String> values) {
            addCriterion("CarBankName in", values, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameNotIn(List<String> values) {
            addCriterion("CarBankName not in", values, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameBetween(String value1, String value2) {
            addCriterion("CarBankName between", value1, value2, "carbankname");
            return (Criteria) this;
        }

        public Criteria andCarbanknameNotBetween(String value1, String value2) {
            addCriterion("CarBankName not between", value1, value2, "carbankname");
            return (Criteria) this;
        }

        public Criteria andFirstwordIsNull() {
            addCriterion("firstWord is null");
            return (Criteria) this;
        }

        public Criteria andFirstwordIsNotNull() {
            addCriterion("firstWord is not null");
            return (Criteria) this;
        }

        public Criteria andFirstwordEqualTo(String value) {
            addCriterion("firstWord =", value, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordNotEqualTo(String value) {
            addCriterion("firstWord <>", value, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordGreaterThan(String value) {
            addCriterion("firstWord >", value, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordGreaterThanOrEqualTo(String value) {
            addCriterion("firstWord >=", value, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordLessThan(String value) {
            addCriterion("firstWord <", value, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordLessThanOrEqualTo(String value) {
            addCriterion("firstWord <=", value, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordLike(String value) {
            addCriterion("firstWord like", value, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordNotLike(String value) {
            addCriterion("firstWord not like", value, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordIn(List<String> values) {
            addCriterion("firstWord in", values, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordNotIn(List<String> values) {
            addCriterion("firstWord not in", values, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordBetween(String value1, String value2) {
            addCriterion("firstWord between", value1, value2, "firstword");
            return (Criteria) this;
        }

        public Criteria andFirstwordNotBetween(String value1, String value2) {
            addCriterion("firstWord not between", value1, value2, "firstword");
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