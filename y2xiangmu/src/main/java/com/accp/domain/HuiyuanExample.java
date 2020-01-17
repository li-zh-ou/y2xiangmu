package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HuiyuanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuiyuanExample() {
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

        public Criteria andKehunoIsNull() {
            addCriterion("KeHuNo is null");
            return (Criteria) this;
        }

        public Criteria andKehunoIsNotNull() {
            addCriterion("KeHuNo is not null");
            return (Criteria) this;
        }

        public Criteria andKehunoEqualTo(String value) {
            addCriterion("KeHuNo =", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoNotEqualTo(String value) {
            addCriterion("KeHuNo <>", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoGreaterThan(String value) {
            addCriterion("KeHuNo >", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoGreaterThanOrEqualTo(String value) {
            addCriterion("KeHuNo >=", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoLessThan(String value) {
            addCriterion("KeHuNo <", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoLessThanOrEqualTo(String value) {
            addCriterion("KeHuNo <=", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoLike(String value) {
            addCriterion("KeHuNo like", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoNotLike(String value) {
            addCriterion("KeHuNo not like", value, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoIn(List<String> values) {
            addCriterion("KeHuNo in", values, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoNotIn(List<String> values) {
            addCriterion("KeHuNo not in", values, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoBetween(String value1, String value2) {
            addCriterion("KeHuNo between", value1, value2, "kehuno");
            return (Criteria) this;
        }

        public Criteria andKehunoNotBetween(String value1, String value2) {
            addCriterion("KeHuNo not between", value1, value2, "kehuno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameIsNull() {
            addCriterion("HuiYuanName is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameIsNotNull() {
            addCriterion("HuiYuanName is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameEqualTo(String value) {
            addCriterion("HuiYuanName =", value, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameNotEqualTo(String value) {
            addCriterion("HuiYuanName <>", value, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameGreaterThan(String value) {
            addCriterion("HuiYuanName >", value, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameGreaterThanOrEqualTo(String value) {
            addCriterion("HuiYuanName >=", value, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameLessThan(String value) {
            addCriterion("HuiYuanName <", value, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameLessThanOrEqualTo(String value) {
            addCriterion("HuiYuanName <=", value, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameLike(String value) {
            addCriterion("HuiYuanName like", value, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameNotLike(String value) {
            addCriterion("HuiYuanName not like", value, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameIn(List<String> values) {
            addCriterion("HuiYuanName in", values, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameNotIn(List<String> values) {
            addCriterion("HuiYuanName not in", values, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameBetween(String value1, String value2) {
            addCriterion("HuiYuanName between", value1, value2, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannameNotBetween(String value1, String value2) {
            addCriterion("HuiYuanName not between", value1, value2, "huiyuanname");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoIsNull() {
            addCriterion("HuiYuanNo is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoIsNotNull() {
            addCriterion("HuiYuanNo is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoEqualTo(String value) {
            addCriterion("HuiYuanNo =", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoNotEqualTo(String value) {
            addCriterion("HuiYuanNo <>", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoGreaterThan(String value) {
            addCriterion("HuiYuanNo >", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoGreaterThanOrEqualTo(String value) {
            addCriterion("HuiYuanNo >=", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoLessThan(String value) {
            addCriterion("HuiYuanNo <", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoLessThanOrEqualTo(String value) {
            addCriterion("HuiYuanNo <=", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoLike(String value) {
            addCriterion("HuiYuanNo like", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoNotLike(String value) {
            addCriterion("HuiYuanNo not like", value, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoIn(List<String> values) {
            addCriterion("HuiYuanNo in", values, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoNotIn(List<String> values) {
            addCriterion("HuiYuanNo not in", values, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoBetween(String value1, String value2) {
            addCriterion("HuiYuanNo between", value1, value2, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuannoNotBetween(String value1, String value2) {
            addCriterion("HuiYuanNo not between", value1, value2, "huiyuanno");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyIsNull() {
            addCriterion("HuiYuanMoney is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyIsNotNull() {
            addCriterion("HuiYuanMoney is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyEqualTo(Double value) {
            addCriterion("HuiYuanMoney =", value, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyNotEqualTo(Double value) {
            addCriterion("HuiYuanMoney <>", value, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyGreaterThan(Double value) {
            addCriterion("HuiYuanMoney >", value, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("HuiYuanMoney >=", value, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyLessThan(Double value) {
            addCriterion("HuiYuanMoney <", value, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyLessThanOrEqualTo(Double value) {
            addCriterion("HuiYuanMoney <=", value, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyIn(List<Double> values) {
            addCriterion("HuiYuanMoney in", values, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyNotIn(List<Double> values) {
            addCriterion("HuiYuanMoney not in", values, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyBetween(Double value1, Double value2) {
            addCriterion("HuiYuanMoney between", value1, value2, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andHuiyuanmoneyNotBetween(Double value1, Double value2) {
            addCriterion("HuiYuanMoney not between", value1, value2, "huiyuanmoney");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeIsNull() {
            addCriterion("RuHuiTime is null");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeIsNotNull() {
            addCriterion("RuHuiTime is not null");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeEqualTo(Date value) {
            addCriterion("RuHuiTime =", value, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeNotEqualTo(Date value) {
            addCriterion("RuHuiTime <>", value, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeGreaterThan(Date value) {
            addCriterion("RuHuiTime >", value, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RuHuiTime >=", value, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeLessThan(Date value) {
            addCriterion("RuHuiTime <", value, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeLessThanOrEqualTo(Date value) {
            addCriterion("RuHuiTime <=", value, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeIn(List<Date> values) {
            addCriterion("RuHuiTime in", values, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeNotIn(List<Date> values) {
            addCriterion("RuHuiTime not in", values, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeBetween(Date value1, Date value2) {
            addCriterion("RuHuiTime between", value1, value2, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andRuhuitimeNotBetween(Date value1, Date value2) {
            addCriterion("RuHuiTime not between", value1, value2, "ruhuitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeIsNull() {
            addCriterion("DaoQiTime is null");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeIsNotNull() {
            addCriterion("DaoQiTime is not null");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeEqualTo(Date value) {
            addCriterion("DaoQiTime =", value, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeNotEqualTo(Date value) {
            addCriterion("DaoQiTime <>", value, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeGreaterThan(Date value) {
            addCriterion("DaoQiTime >", value, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DaoQiTime >=", value, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeLessThan(Date value) {
            addCriterion("DaoQiTime <", value, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeLessThanOrEqualTo(Date value) {
            addCriterion("DaoQiTime <=", value, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeIn(List<Date> values) {
            addCriterion("DaoQiTime in", values, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeNotIn(List<Date> values) {
            addCriterion("DaoQiTime not in", values, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeBetween(Date value1, Date value2) {
            addCriterion("DaoQiTime between", value1, value2, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andDaoqitimeNotBetween(Date value1, Date value2) {
            addCriterion("DaoQiTime not between", value1, value2, "daoqitime");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenIsNull() {
            addCriterion("HuiYuanGraden is null");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenIsNotNull() {
            addCriterion("HuiYuanGraden is not null");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenEqualTo(String value) {
            addCriterion("HuiYuanGraden =", value, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenNotEqualTo(String value) {
            addCriterion("HuiYuanGraden <>", value, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenGreaterThan(String value) {
            addCriterion("HuiYuanGraden >", value, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenGreaterThanOrEqualTo(String value) {
            addCriterion("HuiYuanGraden >=", value, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenLessThan(String value) {
            addCriterion("HuiYuanGraden <", value, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenLessThanOrEqualTo(String value) {
            addCriterion("HuiYuanGraden <=", value, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenLike(String value) {
            addCriterion("HuiYuanGraden like", value, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenNotLike(String value) {
            addCriterion("HuiYuanGraden not like", value, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenIn(List<String> values) {
            addCriterion("HuiYuanGraden in", values, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenNotIn(List<String> values) {
            addCriterion("HuiYuanGraden not in", values, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenBetween(String value1, String value2) {
            addCriterion("HuiYuanGraden between", value1, value2, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andHuiyuangradenNotBetween(String value1, String value2) {
            addCriterion("HuiYuanGraden not between", value1, value2, "huiyuangraden");
            return (Criteria) this;
        }

        public Criteria andYouhuiIsNull() {
            addCriterion("YouHui is null");
            return (Criteria) this;
        }

        public Criteria andYouhuiIsNotNull() {
            addCriterion("YouHui is not null");
            return (Criteria) this;
        }

        public Criteria andYouhuiEqualTo(String value) {
            addCriterion("YouHui =", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotEqualTo(String value) {
            addCriterion("YouHui <>", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiGreaterThan(String value) {
            addCriterion("YouHui >", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiGreaterThanOrEqualTo(String value) {
            addCriterion("YouHui >=", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiLessThan(String value) {
            addCriterion("YouHui <", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiLessThanOrEqualTo(String value) {
            addCriterion("YouHui <=", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiLike(String value) {
            addCriterion("YouHui like", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotLike(String value) {
            addCriterion("YouHui not like", value, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiIn(List<String> values) {
            addCriterion("YouHui in", values, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotIn(List<String> values) {
            addCriterion("YouHui not in", values, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiBetween(String value1, String value2) {
            addCriterion("YouHui between", value1, value2, "youhui");
            return (Criteria) this;
        }

        public Criteria andYouhuiNotBetween(String value1, String value2) {
            addCriterion("YouHui not between", value1, value2, "youhui");
            return (Criteria) this;
        }

        public Criteria andJifenIsNull() {
            addCriterion("JiFen is null");
            return (Criteria) this;
        }

        public Criteria andJifenIsNotNull() {
            addCriterion("JiFen is not null");
            return (Criteria) this;
        }

        public Criteria andJifenEqualTo(Integer value) {
            addCriterion("JiFen =", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotEqualTo(Integer value) {
            addCriterion("JiFen <>", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenGreaterThan(Integer value) {
            addCriterion("JiFen >", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenGreaterThanOrEqualTo(Integer value) {
            addCriterion("JiFen >=", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenLessThan(Integer value) {
            addCriterion("JiFen <", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenLessThanOrEqualTo(Integer value) {
            addCriterion("JiFen <=", value, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenIn(List<Integer> values) {
            addCriterion("JiFen in", values, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotIn(List<Integer> values) {
            addCriterion("JiFen not in", values, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenBetween(Integer value1, Integer value2) {
            addCriterion("JiFen between", value1, value2, "jifen");
            return (Criteria) this;
        }

        public Criteria andJifenNotBetween(Integer value1, Integer value2) {
            addCriterion("JiFen not between", value1, value2, "jifen");
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