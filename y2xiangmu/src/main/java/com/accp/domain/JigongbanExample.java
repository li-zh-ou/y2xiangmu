package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class JigongbanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JigongbanExample() {
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

        public Criteria andBanidIsNull() {
            addCriterion("BanId is null");
            return (Criteria) this;
        }

        public Criteria andBanidIsNotNull() {
            addCriterion("BanId is not null");
            return (Criteria) this;
        }

        public Criteria andBanidEqualTo(Integer value) {
            addCriterion("BanId =", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidNotEqualTo(Integer value) {
            addCriterion("BanId <>", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidGreaterThan(Integer value) {
            addCriterion("BanId >", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("BanId >=", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidLessThan(Integer value) {
            addCriterion("BanId <", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidLessThanOrEqualTo(Integer value) {
            addCriterion("BanId <=", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidIn(List<Integer> values) {
            addCriterion("BanId in", values, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidNotIn(List<Integer> values) {
            addCriterion("BanId not in", values, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidBetween(Integer value1, Integer value2) {
            addCriterion("BanId between", value1, value2, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidNotBetween(Integer value1, Integer value2) {
            addCriterion("BanId not between", value1, value2, "banid");
            return (Criteria) this;
        }

        public Criteria andBannameIsNull() {
            addCriterion("BanName is null");
            return (Criteria) this;
        }

        public Criteria andBannameIsNotNull() {
            addCriterion("BanName is not null");
            return (Criteria) this;
        }

        public Criteria andBannameEqualTo(String value) {
            addCriterion("BanName =", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameNotEqualTo(String value) {
            addCriterion("BanName <>", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameGreaterThan(String value) {
            addCriterion("BanName >", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameGreaterThanOrEqualTo(String value) {
            addCriterion("BanName >=", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameLessThan(String value) {
            addCriterion("BanName <", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameLessThanOrEqualTo(String value) {
            addCriterion("BanName <=", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameLike(String value) {
            addCriterion("BanName like", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameNotLike(String value) {
            addCriterion("BanName not like", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameIn(List<String> values) {
            addCriterion("BanName in", values, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameNotIn(List<String> values) {
            addCriterion("BanName not in", values, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameBetween(String value1, String value2) {
            addCriterion("BanName between", value1, value2, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameNotBetween(String value1, String value2) {
            addCriterion("BanName not between", value1, value2, "banname");
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

        public Criteria andBaineiIsNull() {
            addCriterion("BaiNei is null");
            return (Criteria) this;
        }

        public Criteria andBaineiIsNotNull() {
            addCriterion("BaiNei is not null");
            return (Criteria) this;
        }

        public Criteria andBaineiEqualTo(String value) {
            addCriterion("BaiNei =", value, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiNotEqualTo(String value) {
            addCriterion("BaiNei <>", value, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiGreaterThan(String value) {
            addCriterion("BaiNei >", value, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiGreaterThanOrEqualTo(String value) {
            addCriterion("BaiNei >=", value, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiLessThan(String value) {
            addCriterion("BaiNei <", value, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiLessThanOrEqualTo(String value) {
            addCriterion("BaiNei <=", value, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiLike(String value) {
            addCriterion("BaiNei like", value, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiNotLike(String value) {
            addCriterion("BaiNei not like", value, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiIn(List<String> values) {
            addCriterion("BaiNei in", values, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiNotIn(List<String> values) {
            addCriterion("BaiNei not in", values, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiBetween(String value1, String value2) {
            addCriterion("BaiNei between", value1, value2, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaineiNotBetween(String value1, String value2) {
            addCriterion("BaiNei not between", value1, value2, "bainei");
            return (Criteria) this;
        }

        public Criteria andBaiwaiIsNull() {
            addCriterion("BaiWai is null");
            return (Criteria) this;
        }

        public Criteria andBaiwaiIsNotNull() {
            addCriterion("BaiWai is not null");
            return (Criteria) this;
        }

        public Criteria andBaiwaiEqualTo(String value) {
            addCriterion("BaiWai =", value, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiNotEqualTo(String value) {
            addCriterion("BaiWai <>", value, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiGreaterThan(String value) {
            addCriterion("BaiWai >", value, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiGreaterThanOrEqualTo(String value) {
            addCriterion("BaiWai >=", value, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiLessThan(String value) {
            addCriterion("BaiWai <", value, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiLessThanOrEqualTo(String value) {
            addCriterion("BaiWai <=", value, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiLike(String value) {
            addCriterion("BaiWai like", value, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiNotLike(String value) {
            addCriterion("BaiWai not like", value, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiIn(List<String> values) {
            addCriterion("BaiWai in", values, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiNotIn(List<String> values) {
            addCriterion("BaiWai not in", values, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiBetween(String value1, String value2) {
            addCriterion("BaiWai between", value1, value2, "baiwai");
            return (Criteria) this;
        }

        public Criteria andBaiwaiNotBetween(String value1, String value2) {
            addCriterion("BaiWai not between", value1, value2, "baiwai");
            return (Criteria) this;
        }

        public Criteria andWanneiIsNull() {
            addCriterion("WanNei is null");
            return (Criteria) this;
        }

        public Criteria andWanneiIsNotNull() {
            addCriterion("WanNei is not null");
            return (Criteria) this;
        }

        public Criteria andWanneiEqualTo(String value) {
            addCriterion("WanNei =", value, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiNotEqualTo(String value) {
            addCriterion("WanNei <>", value, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiGreaterThan(String value) {
            addCriterion("WanNei >", value, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiGreaterThanOrEqualTo(String value) {
            addCriterion("WanNei >=", value, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiLessThan(String value) {
            addCriterion("WanNei <", value, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiLessThanOrEqualTo(String value) {
            addCriterion("WanNei <=", value, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiLike(String value) {
            addCriterion("WanNei like", value, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiNotLike(String value) {
            addCriterion("WanNei not like", value, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiIn(List<String> values) {
            addCriterion("WanNei in", values, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiNotIn(List<String> values) {
            addCriterion("WanNei not in", values, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiBetween(String value1, String value2) {
            addCriterion("WanNei between", value1, value2, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanneiNotBetween(String value1, String value2) {
            addCriterion("WanNei not between", value1, value2, "wannei");
            return (Criteria) this;
        }

        public Criteria andWanwaiIsNull() {
            addCriterion("WanWai is null");
            return (Criteria) this;
        }

        public Criteria andWanwaiIsNotNull() {
            addCriterion("WanWai is not null");
            return (Criteria) this;
        }

        public Criteria andWanwaiEqualTo(String value) {
            addCriterion("WanWai =", value, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiNotEqualTo(String value) {
            addCriterion("WanWai <>", value, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiGreaterThan(String value) {
            addCriterion("WanWai >", value, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiGreaterThanOrEqualTo(String value) {
            addCriterion("WanWai >=", value, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiLessThan(String value) {
            addCriterion("WanWai <", value, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiLessThanOrEqualTo(String value) {
            addCriterion("WanWai <=", value, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiLike(String value) {
            addCriterion("WanWai like", value, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiNotLike(String value) {
            addCriterion("WanWai not like", value, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiIn(List<String> values) {
            addCriterion("WanWai in", values, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiNotIn(List<String> values) {
            addCriterion("WanWai not in", values, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiBetween(String value1, String value2) {
            addCriterion("WanWai between", value1, value2, "wanwai");
            return (Criteria) this;
        }

        public Criteria andWanwaiNotBetween(String value1, String value2) {
            addCriterion("WanWai not between", value1, value2, "wanwai");
            return (Criteria) this;
        }

        public Criteria andBaizaiIsNull() {
            addCriterion("BaiZai is null");
            return (Criteria) this;
        }

        public Criteria andBaizaiIsNotNull() {
            addCriterion("BaiZai is not null");
            return (Criteria) this;
        }

        public Criteria andBaizaiEqualTo(String value) {
            addCriterion("BaiZai =", value, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiNotEqualTo(String value) {
            addCriterion("BaiZai <>", value, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiGreaterThan(String value) {
            addCriterion("BaiZai >", value, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiGreaterThanOrEqualTo(String value) {
            addCriterion("BaiZai >=", value, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiLessThan(String value) {
            addCriterion("BaiZai <", value, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiLessThanOrEqualTo(String value) {
            addCriterion("BaiZai <=", value, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiLike(String value) {
            addCriterion("BaiZai like", value, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiNotLike(String value) {
            addCriterion("BaiZai not like", value, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiIn(List<String> values) {
            addCriterion("BaiZai in", values, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiNotIn(List<String> values) {
            addCriterion("BaiZai not in", values, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiBetween(String value1, String value2) {
            addCriterion("BaiZai between", value1, value2, "baizai");
            return (Criteria) this;
        }

        public Criteria andBaizaiNotBetween(String value1, String value2) {
            addCriterion("BaiZai not between", value1, value2, "baizai");
            return (Criteria) this;
        }

        public Criteria andWanzaiIsNull() {
            addCriterion("WanZai is null");
            return (Criteria) this;
        }

        public Criteria andWanzaiIsNotNull() {
            addCriterion("WanZai is not null");
            return (Criteria) this;
        }

        public Criteria andWanzaiEqualTo(String value) {
            addCriterion("WanZai =", value, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiNotEqualTo(String value) {
            addCriterion("WanZai <>", value, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiGreaterThan(String value) {
            addCriterion("WanZai >", value, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiGreaterThanOrEqualTo(String value) {
            addCriterion("WanZai >=", value, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiLessThan(String value) {
            addCriterion("WanZai <", value, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiLessThanOrEqualTo(String value) {
            addCriterion("WanZai <=", value, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiLike(String value) {
            addCriterion("WanZai like", value, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiNotLike(String value) {
            addCriterion("WanZai not like", value, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiIn(List<String> values) {
            addCriterion("WanZai in", values, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiNotIn(List<String> values) {
            addCriterion("WanZai not in", values, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiBetween(String value1, String value2) {
            addCriterion("WanZai between", value1, value2, "wanzai");
            return (Criteria) this;
        }

        public Criteria andWanzaiNotBetween(String value1, String value2) {
            addCriterion("WanZai not between", value1, value2, "wanzai");
            return (Criteria) this;
        }

        public Criteria andRanyouIsNull() {
            addCriterion("RanYou is null");
            return (Criteria) this;
        }

        public Criteria andRanyouIsNotNull() {
            addCriterion("RanYou is not null");
            return (Criteria) this;
        }

        public Criteria andRanyouEqualTo(String value) {
            addCriterion("RanYou =", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotEqualTo(String value) {
            addCriterion("RanYou <>", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouGreaterThan(String value) {
            addCriterion("RanYou >", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouGreaterThanOrEqualTo(String value) {
            addCriterion("RanYou >=", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouLessThan(String value) {
            addCriterion("RanYou <", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouLessThanOrEqualTo(String value) {
            addCriterion("RanYou <=", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouLike(String value) {
            addCriterion("RanYou like", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotLike(String value) {
            addCriterion("RanYou not like", value, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouIn(List<String> values) {
            addCriterion("RanYou in", values, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotIn(List<String> values) {
            addCriterion("RanYou not in", values, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouBetween(String value1, String value2) {
            addCriterion("RanYou between", value1, value2, "ranyou");
            return (Criteria) this;
        }

        public Criteria andRanyouNotBetween(String value1, String value2) {
            addCriterion("RanYou not between", value1, value2, "ranyou");
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