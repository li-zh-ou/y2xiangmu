package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CarbaoyangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarbaoyangExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andChepaiIsNull() {
            addCriterion("ChePai is null");
            return (Criteria) this;
        }

        public Criteria andChepaiIsNotNull() {
            addCriterion("ChePai is not null");
            return (Criteria) this;
        }

        public Criteria andChepaiEqualTo(String value) {
            addCriterion("ChePai =", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotEqualTo(String value) {
            addCriterion("ChePai <>", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThan(String value) {
            addCriterion("ChePai >", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiGreaterThanOrEqualTo(String value) {
            addCriterion("ChePai >=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThan(String value) {
            addCriterion("ChePai <", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLessThanOrEqualTo(String value) {
            addCriterion("ChePai <=", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiLike(String value) {
            addCriterion("ChePai like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotLike(String value) {
            addCriterion("ChePai not like", value, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiIn(List<String> values) {
            addCriterion("ChePai in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotIn(List<String> values) {
            addCriterion("ChePai not in", values, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiBetween(String value1, String value2) {
            addCriterion("ChePai between", value1, value2, "chepai");
            return (Criteria) this;
        }

        public Criteria andChepaiNotBetween(String value1, String value2) {
            addCriterion("ChePai not between", value1, value2, "chepai");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameIsNull() {
            addCriterion("BaoYangName is null");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameIsNotNull() {
            addCriterion("BaoYangName is not null");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameEqualTo(String value) {
            addCriterion("BaoYangName =", value, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameNotEqualTo(String value) {
            addCriterion("BaoYangName <>", value, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameGreaterThan(String value) {
            addCriterion("BaoYangName >", value, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameGreaterThanOrEqualTo(String value) {
            addCriterion("BaoYangName >=", value, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameLessThan(String value) {
            addCriterion("BaoYangName <", value, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameLessThanOrEqualTo(String value) {
            addCriterion("BaoYangName <=", value, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameLike(String value) {
            addCriterion("BaoYangName like", value, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameNotLike(String value) {
            addCriterion("BaoYangName not like", value, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameIn(List<String> values) {
            addCriterion("BaoYangName in", values, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameNotIn(List<String> values) {
            addCriterion("BaoYangName not in", values, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameBetween(String value1, String value2) {
            addCriterion("BaoYangName between", value1, value2, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andBaoyangnameNotBetween(String value1, String value2) {
            addCriterion("BaoYangName not between", value1, value2, "baoyangname");
            return (Criteria) this;
        }

        public Criteria andJihuankmIsNull() {
            addCriterion("JiHuankm is null");
            return (Criteria) this;
        }

        public Criteria andJihuankmIsNotNull() {
            addCriterion("JiHuankm is not null");
            return (Criteria) this;
        }

        public Criteria andJihuankmEqualTo(Integer value) {
            addCriterion("JiHuankm =", value, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuankmNotEqualTo(Integer value) {
            addCriterion("JiHuankm <>", value, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuankmGreaterThan(Integer value) {
            addCriterion("JiHuankm >", value, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuankmGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiHuankm >=", value, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuankmLessThan(Integer value) {
            addCriterion("JiHuankm <", value, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuankmLessThanOrEqualTo(Integer value) {
            addCriterion("JiHuankm <=", value, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuankmIn(List<Integer> values) {
            addCriterion("JiHuankm in", values, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuankmNotIn(List<Integer> values) {
            addCriterion("JiHuankm not in", values, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuankmBetween(Integer value1, Integer value2) {
            addCriterion("JiHuankm between", value1, value2, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuankmNotBetween(Integer value1, Integer value2) {
            addCriterion("JiHuankm not between", value1, value2, "jihuankm");
            return (Criteria) this;
        }

        public Criteria andJihuandateIsNull() {
            addCriterion("JiHuanDate is null");
            return (Criteria) this;
        }

        public Criteria andJihuandateIsNotNull() {
            addCriterion("JiHuanDate is not null");
            return (Criteria) this;
        }

        public Criteria andJihuandateEqualTo(Date value) {
            addCriterionForJDBCDate("JiHuanDate =", value, "jihuandate");
            return (Criteria) this;
        }

        public Criteria andJihuandateNotEqualTo(Date value) {
            addCriterionForJDBCDate("JiHuanDate <>", value, "jihuandate");
            return (Criteria) this;
        }

        public Criteria andJihuandateGreaterThan(Date value) {
            addCriterionForJDBCDate("JiHuanDate >", value, "jihuandate");
            return (Criteria) this;
        }

        public Criteria andJihuandateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JiHuanDate >=", value, "jihuandate");
            return (Criteria) this;
        }

        public Criteria andJihuandateLessThan(Date value) {
            addCriterionForJDBCDate("JiHuanDate <", value, "jihuandate");
            return (Criteria) this;
        }

        public Criteria andJihuandateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JiHuanDate <=", value, "jihuandate");
            return (Criteria) this;
        }

        public Criteria andJihuandateIn(List<Date> values) {
            addCriterionForJDBCDate("JiHuanDate in", values, "jihuandate");
            return (Criteria) this;
        }

        public Criteria andJihuandateNotIn(List<Date> values) {
            addCriterionForJDBCDate("JiHuanDate not in", values, "jihuandate");
            return (Criteria) this;
        }

        public Criteria andJihuandateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JiHuanDate between", value1, value2, "jihuandate");
            return (Criteria) this;
        }

        public Criteria andJihuandateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JiHuanDate not between", value1, value2, "jihuandate");
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