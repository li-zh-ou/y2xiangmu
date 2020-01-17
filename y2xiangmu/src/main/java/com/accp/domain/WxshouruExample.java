package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WxshouruExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxshouruExample() {
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

        public Criteria andShouruidIsNull() {
            addCriterion("ShouRuId is null");
            return (Criteria) this;
        }

        public Criteria andShouruidIsNotNull() {
            addCriterion("ShouRuId is not null");
            return (Criteria) this;
        }

        public Criteria andShouruidEqualTo(Integer value) {
            addCriterion("ShouRuId =", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidNotEqualTo(Integer value) {
            addCriterion("ShouRuId <>", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidGreaterThan(Integer value) {
            addCriterion("ShouRuId >", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShouRuId >=", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidLessThan(Integer value) {
            addCriterion("ShouRuId <", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidLessThanOrEqualTo(Integer value) {
            addCriterion("ShouRuId <=", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidIn(List<Integer> values) {
            addCriterion("ShouRuId in", values, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidNotIn(List<Integer> values) {
            addCriterion("ShouRuId not in", values, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidBetween(Integer value1, Integer value2) {
            addCriterion("ShouRuId between", value1, value2, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShouRuId not between", value1, value2, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShourutypeIsNull() {
            addCriterion("ShouRuType is null");
            return (Criteria) this;
        }

        public Criteria andShourutypeIsNotNull() {
            addCriterion("ShouRuType is not null");
            return (Criteria) this;
        }

        public Criteria andShourutypeEqualTo(String value) {
            addCriterion("ShouRuType =", value, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeNotEqualTo(String value) {
            addCriterion("ShouRuType <>", value, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeGreaterThan(String value) {
            addCriterion("ShouRuType >", value, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeGreaterThanOrEqualTo(String value) {
            addCriterion("ShouRuType >=", value, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeLessThan(String value) {
            addCriterion("ShouRuType <", value, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeLessThanOrEqualTo(String value) {
            addCriterion("ShouRuType <=", value, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeLike(String value) {
            addCriterion("ShouRuType like", value, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeNotLike(String value) {
            addCriterion("ShouRuType not like", value, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeIn(List<String> values) {
            addCriterion("ShouRuType in", values, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeNotIn(List<String> values) {
            addCriterion("ShouRuType not in", values, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeBetween(String value1, String value2) {
            addCriterion("ShouRuType between", value1, value2, "shourutype");
            return (Criteria) this;
        }

        public Criteria andShourutypeNotBetween(String value1, String value2) {
            addCriterion("ShouRuType not between", value1, value2, "shourutype");
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