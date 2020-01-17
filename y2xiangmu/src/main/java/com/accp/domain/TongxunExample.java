package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class TongxunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TongxunExample() {
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

        public Criteria andYuangongnoIsNull() {
            addCriterion("YuanGongNo is null");
            return (Criteria) this;
        }

        public Criteria andYuangongnoIsNotNull() {
            addCriterion("YuanGongNo is not null");
            return (Criteria) this;
        }

        public Criteria andYuangongnoEqualTo(String value) {
            addCriterion("YuanGongNo =", value, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoNotEqualTo(String value) {
            addCriterion("YuanGongNo <>", value, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoGreaterThan(String value) {
            addCriterion("YuanGongNo >", value, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoGreaterThanOrEqualTo(String value) {
            addCriterion("YuanGongNo >=", value, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoLessThan(String value) {
            addCriterion("YuanGongNo <", value, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoLessThanOrEqualTo(String value) {
            addCriterion("YuanGongNo <=", value, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoLike(String value) {
            addCriterion("YuanGongNo like", value, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoNotLike(String value) {
            addCriterion("YuanGongNo not like", value, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoIn(List<String> values) {
            addCriterion("YuanGongNo in", values, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoNotIn(List<String> values) {
            addCriterion("YuanGongNo not in", values, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoBetween(String value1, String value2) {
            addCriterion("YuanGongNo between", value1, value2, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andYuangongnoNotBetween(String value1, String value2) {
            addCriterion("YuanGongNo not between", value1, value2, "yuangongno");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andZhiboIsNull() {
            addCriterion("ZhiBo is null");
            return (Criteria) this;
        }

        public Criteria andZhiboIsNotNull() {
            addCriterion("ZhiBo is not null");
            return (Criteria) this;
        }

        public Criteria andZhiboEqualTo(String value) {
            addCriterion("ZhiBo =", value, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboNotEqualTo(String value) {
            addCriterion("ZhiBo <>", value, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboGreaterThan(String value) {
            addCriterion("ZhiBo >", value, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboGreaterThanOrEqualTo(String value) {
            addCriterion("ZhiBo >=", value, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboLessThan(String value) {
            addCriterion("ZhiBo <", value, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboLessThanOrEqualTo(String value) {
            addCriterion("ZhiBo <=", value, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboLike(String value) {
            addCriterion("ZhiBo like", value, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboNotLike(String value) {
            addCriterion("ZhiBo not like", value, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboIn(List<String> values) {
            addCriterion("ZhiBo in", values, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboNotIn(List<String> values) {
            addCriterion("ZhiBo not in", values, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboBetween(String value1, String value2) {
            addCriterion("ZhiBo between", value1, value2, "zhibo");
            return (Criteria) this;
        }

        public Criteria andZhiboNotBetween(String value1, String value2) {
            addCriterion("ZhiBo not between", value1, value2, "zhibo");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNull() {
            addCriterion("ShouJi is null");
            return (Criteria) this;
        }

        public Criteria andShoujiIsNotNull() {
            addCriterion("ShouJi is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiEqualTo(String value) {
            addCriterion("ShouJi =", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotEqualTo(String value) {
            addCriterion("ShouJi <>", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThan(String value) {
            addCriterion("ShouJi >", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiGreaterThanOrEqualTo(String value) {
            addCriterion("ShouJi >=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThan(String value) {
            addCriterion("ShouJi <", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLessThanOrEqualTo(String value) {
            addCriterion("ShouJi <=", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiLike(String value) {
            addCriterion("ShouJi like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotLike(String value) {
            addCriterion("ShouJi not like", value, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiIn(List<String> values) {
            addCriterion("ShouJi in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotIn(List<String> values) {
            addCriterion("ShouJi not in", values, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiBetween(String value1, String value2) {
            addCriterion("ShouJi between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andShoujiNotBetween(String value1, String value2) {
            addCriterion("ShouJi not between", value1, value2, "shouji");
            return (Criteria) this;
        }

        public Criteria andBumenidIsNull() {
            addCriterion("BuMenId is null");
            return (Criteria) this;
        }

        public Criteria andBumenidIsNotNull() {
            addCriterion("BuMenId is not null");
            return (Criteria) this;
        }

        public Criteria andBumenidEqualTo(Integer value) {
            addCriterion("BuMenId =", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidNotEqualTo(Integer value) {
            addCriterion("BuMenId <>", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidGreaterThan(Integer value) {
            addCriterion("BuMenId >", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BuMenId >=", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidLessThan(Integer value) {
            addCriterion("BuMenId <", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidLessThanOrEqualTo(Integer value) {
            addCriterion("BuMenId <=", value, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidIn(List<Integer> values) {
            addCriterion("BuMenId in", values, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidNotIn(List<Integer> values) {
            addCriterion("BuMenId not in", values, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidBetween(Integer value1, Integer value2) {
            addCriterion("BuMenId between", value1, value2, "bumenid");
            return (Criteria) this;
        }

        public Criteria andBumenidNotBetween(Integer value1, Integer value2) {
            addCriterion("BuMenId not between", value1, value2, "bumenid");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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