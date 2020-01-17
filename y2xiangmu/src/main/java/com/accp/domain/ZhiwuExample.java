package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class ZhiwuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZhiwuExample() {
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

        public Criteria andZhiwuidIsNull() {
            addCriterion("ZhiWuId is null");
            return (Criteria) this;
        }

        public Criteria andZhiwuidIsNotNull() {
            addCriterion("ZhiWuId is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwuidEqualTo(Integer value) {
            addCriterion("ZhiWuId =", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidNotEqualTo(Integer value) {
            addCriterion("ZhiWuId <>", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidGreaterThan(Integer value) {
            addCriterion("ZhiWuId >", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZhiWuId >=", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidLessThan(Integer value) {
            addCriterion("ZhiWuId <", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidLessThanOrEqualTo(Integer value) {
            addCriterion("ZhiWuId <=", value, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidIn(List<Integer> values) {
            addCriterion("ZhiWuId in", values, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidNotIn(List<Integer> values) {
            addCriterion("ZhiWuId not in", values, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidBetween(Integer value1, Integer value2) {
            addCriterion("ZhiWuId between", value1, value2, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwuidNotBetween(Integer value1, Integer value2) {
            addCriterion("ZhiWuId not between", value1, value2, "zhiwuid");
            return (Criteria) this;
        }

        public Criteria andZhiwunameIsNull() {
            addCriterion("zhiWuName is null");
            return (Criteria) this;
        }

        public Criteria andZhiwunameIsNotNull() {
            addCriterion("zhiWuName is not null");
            return (Criteria) this;
        }

        public Criteria andZhiwunameEqualTo(String value) {
            addCriterion("zhiWuName =", value, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameNotEqualTo(String value) {
            addCriterion("zhiWuName <>", value, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameGreaterThan(String value) {
            addCriterion("zhiWuName >", value, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameGreaterThanOrEqualTo(String value) {
            addCriterion("zhiWuName >=", value, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameLessThan(String value) {
            addCriterion("zhiWuName <", value, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameLessThanOrEqualTo(String value) {
            addCriterion("zhiWuName <=", value, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameLike(String value) {
            addCriterion("zhiWuName like", value, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameNotLike(String value) {
            addCriterion("zhiWuName not like", value, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameIn(List<String> values) {
            addCriterion("zhiWuName in", values, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameNotIn(List<String> values) {
            addCriterion("zhiWuName not in", values, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameBetween(String value1, String value2) {
            addCriterion("zhiWuName between", value1, value2, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andZhiwunameNotBetween(String value1, String value2) {
            addCriterion("zhiWuName not between", value1, value2, "zhiwuname");
            return (Criteria) this;
        }

        public Criteria andGongziIsNull() {
            addCriterion("GongZi is null");
            return (Criteria) this;
        }

        public Criteria andGongziIsNotNull() {
            addCriterion("GongZi is not null");
            return (Criteria) this;
        }

        public Criteria andGongziEqualTo(String value) {
            addCriterion("GongZi =", value, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziNotEqualTo(String value) {
            addCriterion("GongZi <>", value, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziGreaterThan(String value) {
            addCriterion("GongZi >", value, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziGreaterThanOrEqualTo(String value) {
            addCriterion("GongZi >=", value, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziLessThan(String value) {
            addCriterion("GongZi <", value, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziLessThanOrEqualTo(String value) {
            addCriterion("GongZi <=", value, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziLike(String value) {
            addCriterion("GongZi like", value, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziNotLike(String value) {
            addCriterion("GongZi not like", value, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziIn(List<String> values) {
            addCriterion("GongZi in", values, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziNotIn(List<String> values) {
            addCriterion("GongZi not in", values, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziBetween(String value1, String value2) {
            addCriterion("GongZi between", value1, value2, "gongzi");
            return (Criteria) this;
        }

        public Criteria andGongziNotBetween(String value1, String value2) {
            addCriterion("GongZi not between", value1, value2, "gongzi");
            return (Criteria) this;
        }

        public Criteria andBumenidIsNull() {
            addCriterion("buMenId is null");
            return (Criteria) this;
        }

        public Criteria andBumenidIsNotNull() {
            addCriterion("buMenId is not null");
            return (Criteria) this;
        }

        public Criteria andBumenidEqualTo(Integer value) {
            addCriterion("buMenId =", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidNotEqualTo(Integer value) {
            addCriterion("buMenId <>", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidGreaterThan(Integer value) {
            addCriterion("buMenId >", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("buMenId >=", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidLessThan(Integer value) {
            addCriterion("buMenId <", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidLessThanOrEqualTo(Integer value) {
            addCriterion("buMenId <=", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidIn(List<Integer> values) {
            addCriterion("buMenId in", values, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidNotIn(List<Integer> values) {
            addCriterion("buMenId not in", values, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidBetween(Integer value1, Integer value2) {
            addCriterion("buMenId between", value1, value2, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidNotBetween(Integer value1, Integer value2) {
            addCriterion("buMenId not between", value1, value2, "bumenid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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