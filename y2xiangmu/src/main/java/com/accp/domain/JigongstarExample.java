package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class JigongstarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JigongstarExample() {
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

        public Criteria andJistaridIsNull() {
            addCriterion("JiStarId is null");
            return (Criteria) this;
        }

        public Criteria andJistaridIsNotNull() {
            addCriterion("JiStarId is not null");
            return (Criteria) this;
        }

        public Criteria andJistaridEqualTo(Integer value) {
            addCriterion("JiStarId =", value, "jistarid");
            return (Criteria) this;
        }

        public Criteria andJistaridNotEqualTo(Integer value) {
            addCriterion("JiStarId <>", value, "jistarid");
            return (Criteria) this;
        }

        public Criteria andJistaridGreaterThan(Integer value) {
            addCriterion("JiStarId >", value, "jistarid");
            return (Criteria) this;
        }

        public Criteria andJistaridGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiStarId >=", value, "jistarid");
            return (Criteria) this;
        }

        public Criteria andJistaridLessThan(Integer value) {
            addCriterion("JiStarId <", value, "jistarid");
            return (Criteria) this;
        }

        public Criteria andJistaridLessThanOrEqualTo(Integer value) {
            addCriterion("JiStarId <=", value, "jistarid");
            return (Criteria) this;
        }

        public Criteria andJistaridIn(List<Integer> values) {
            addCriterion("JiStarId in", values, "jistarid");
            return (Criteria) this;
        }

        public Criteria andJistaridNotIn(List<Integer> values) {
            addCriterion("JiStarId not in", values, "jistarid");
            return (Criteria) this;
        }

        public Criteria andJistaridBetween(Integer value1, Integer value2) {
            addCriterion("JiStarId between", value1, value2, "jistarid");
            return (Criteria) this;
        }

        public Criteria andJistaridNotBetween(Integer value1, Integer value2) {
            addCriterion("JiStarId not between", value1, value2, "jistarid");
            return (Criteria) this;
        }

        public Criteria andStarnameIsNull() {
            addCriterion("StarName is null");
            return (Criteria) this;
        }

        public Criteria andStarnameIsNotNull() {
            addCriterion("StarName is not null");
            return (Criteria) this;
        }

        public Criteria andStarnameEqualTo(String value) {
            addCriterion("StarName =", value, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameNotEqualTo(String value) {
            addCriterion("StarName <>", value, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameGreaterThan(String value) {
            addCriterion("StarName >", value, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameGreaterThanOrEqualTo(String value) {
            addCriterion("StarName >=", value, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameLessThan(String value) {
            addCriterion("StarName <", value, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameLessThanOrEqualTo(String value) {
            addCriterion("StarName <=", value, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameLike(String value) {
            addCriterion("StarName like", value, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameNotLike(String value) {
            addCriterion("StarName not like", value, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameIn(List<String> values) {
            addCriterion("StarName in", values, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameNotIn(List<String> values) {
            addCriterion("StarName not in", values, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameBetween(String value1, String value2) {
            addCriterion("StarName between", value1, value2, "starname");
            return (Criteria) this;
        }

        public Criteria andStarnameNotBetween(String value1, String value2) {
            addCriterion("StarName not between", value1, value2, "starname");
            return (Criteria) this;
        }

        public Criteria andTichengIsNull() {
            addCriterion("TiCheng is null");
            return (Criteria) this;
        }

        public Criteria andTichengIsNotNull() {
            addCriterion("TiCheng is not null");
            return (Criteria) this;
        }

        public Criteria andTichengEqualTo(String value) {
            addCriterion("TiCheng =", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengNotEqualTo(String value) {
            addCriterion("TiCheng <>", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengGreaterThan(String value) {
            addCriterion("TiCheng >", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengGreaterThanOrEqualTo(String value) {
            addCriterion("TiCheng >=", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengLessThan(String value) {
            addCriterion("TiCheng <", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengLessThanOrEqualTo(String value) {
            addCriterion("TiCheng <=", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengLike(String value) {
            addCriterion("TiCheng like", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengNotLike(String value) {
            addCriterion("TiCheng not like", value, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengIn(List<String> values) {
            addCriterion("TiCheng in", values, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengNotIn(List<String> values) {
            addCriterion("TiCheng not in", values, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengBetween(String value1, String value2) {
            addCriterion("TiCheng between", value1, value2, "ticheng");
            return (Criteria) this;
        }

        public Criteria andTichengNotBetween(String value1, String value2) {
            addCriterion("TiCheng not between", value1, value2, "ticheng");
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