package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class WxxiangmuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxxiangmuExample() {
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

        public Criteria andXiangmunoIsNull() {
            addCriterion("XiangMuNo is null");
            return (Criteria) this;
        }

        public Criteria andXiangmunoIsNotNull() {
            addCriterion("XiangMuNo is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmunoEqualTo(String value) {
            addCriterion("XiangMuNo =", value, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoNotEqualTo(String value) {
            addCriterion("XiangMuNo <>", value, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoGreaterThan(String value) {
            addCriterion("XiangMuNo >", value, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoGreaterThanOrEqualTo(String value) {
            addCriterion("XiangMuNo >=", value, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoLessThan(String value) {
            addCriterion("XiangMuNo <", value, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoLessThanOrEqualTo(String value) {
            addCriterion("XiangMuNo <=", value, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoLike(String value) {
            addCriterion("XiangMuNo like", value, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoNotLike(String value) {
            addCriterion("XiangMuNo not like", value, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoIn(List<String> values) {
            addCriterion("XiangMuNo in", values, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoNotIn(List<String> values) {
            addCriterion("XiangMuNo not in", values, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoBetween(String value1, String value2) {
            addCriterion("XiangMuNo between", value1, value2, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunoNotBetween(String value1, String value2) {
            addCriterion("XiangMuNo not between", value1, value2, "xiangmuno");
            return (Criteria) this;
        }

        public Criteria andXiangmunameIsNull() {
            addCriterion("XiangMuName is null");
            return (Criteria) this;
        }

        public Criteria andXiangmunameIsNotNull() {
            addCriterion("XiangMuName is not null");
            return (Criteria) this;
        }

        public Criteria andXiangmunameEqualTo(String value) {
            addCriterion("XiangMuName =", value, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameNotEqualTo(String value) {
            addCriterion("XiangMuName <>", value, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameGreaterThan(String value) {
            addCriterion("XiangMuName >", value, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameGreaterThanOrEqualTo(String value) {
            addCriterion("XiangMuName >=", value, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameLessThan(String value) {
            addCriterion("XiangMuName <", value, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameLessThanOrEqualTo(String value) {
            addCriterion("XiangMuName <=", value, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameLike(String value) {
            addCriterion("XiangMuName like", value, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameNotLike(String value) {
            addCriterion("XiangMuName not like", value, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameIn(List<String> values) {
            addCriterion("XiangMuName in", values, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameNotIn(List<String> values) {
            addCriterion("XiangMuName not in", values, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameBetween(String value1, String value2) {
            addCriterion("XiangMuName between", value1, value2, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXiangmunameNotBetween(String value1, String value2) {
            addCriterion("XiangMuName not between", value1, value2, "xiangmuname");
            return (Criteria) this;
        }

        public Criteria andXingmutypeIsNull() {
            addCriterion("XingMuType is null");
            return (Criteria) this;
        }

        public Criteria andXingmutypeIsNotNull() {
            addCriterion("XingMuType is not null");
            return (Criteria) this;
        }

        public Criteria andXingmutypeEqualTo(String value) {
            addCriterion("XingMuType =", value, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeNotEqualTo(String value) {
            addCriterion("XingMuType <>", value, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeGreaterThan(String value) {
            addCriterion("XingMuType >", value, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeGreaterThanOrEqualTo(String value) {
            addCriterion("XingMuType >=", value, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeLessThan(String value) {
            addCriterion("XingMuType <", value, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeLessThanOrEqualTo(String value) {
            addCriterion("XingMuType <=", value, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeLike(String value) {
            addCriterion("XingMuType like", value, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeNotLike(String value) {
            addCriterion("XingMuType not like", value, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeIn(List<String> values) {
            addCriterion("XingMuType in", values, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeNotIn(List<String> values) {
            addCriterion("XingMuType not in", values, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeBetween(String value1, String value2) {
            addCriterion("XingMuType between", value1, value2, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andXingmutypeNotBetween(String value1, String value2) {
            addCriterion("XingMuType not between", value1, value2, "xingmutype");
            return (Criteria) this;
        }

        public Criteria andShoujiaanIsNull() {
            addCriterion("ShouJiaAn is null");
            return (Criteria) this;
        }

        public Criteria andShoujiaanIsNotNull() {
            addCriterion("ShouJiaAn is not null");
            return (Criteria) this;
        }

        public Criteria andShoujiaanEqualTo(String value) {
            addCriterion("ShouJiaAn =", value, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanNotEqualTo(String value) {
            addCriterion("ShouJiaAn <>", value, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanGreaterThan(String value) {
            addCriterion("ShouJiaAn >", value, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanGreaterThanOrEqualTo(String value) {
            addCriterion("ShouJiaAn >=", value, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanLessThan(String value) {
            addCriterion("ShouJiaAn <", value, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanLessThanOrEqualTo(String value) {
            addCriterion("ShouJiaAn <=", value, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanLike(String value) {
            addCriterion("ShouJiaAn like", value, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanNotLike(String value) {
            addCriterion("ShouJiaAn not like", value, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanIn(List<String> values) {
            addCriterion("ShouJiaAn in", values, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanNotIn(List<String> values) {
            addCriterion("ShouJiaAn not in", values, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanBetween(String value1, String value2) {
            addCriterion("ShouJiaAn between", value1, value2, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShoujiaanNotBetween(String value1, String value2) {
            addCriterion("ShouJiaAn not between", value1, value2, "shoujiaan");
            return (Criteria) this;
        }

        public Criteria andShouruidIsNull() {
            addCriterion("ShouRuid is null");
            return (Criteria) this;
        }

        public Criteria andShouruidIsNotNull() {
            addCriterion("ShouRuid is not null");
            return (Criteria) this;
        }

        public Criteria andShouruidEqualTo(Integer value) {
            addCriterion("ShouRuid =", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidNotEqualTo(Integer value) {
            addCriterion("ShouRuid <>", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidGreaterThan(Integer value) {
            addCriterion("ShouRuid >", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ShouRuid >=", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidLessThan(Integer value) {
            addCriterion("ShouRuid <", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidLessThanOrEqualTo(Integer value) {
            addCriterion("ShouRuid <=", value, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidIn(List<Integer> values) {
            addCriterion("ShouRuid in", values, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidNotIn(List<Integer> values) {
            addCriterion("ShouRuid not in", values, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidBetween(Integer value1, Integer value2) {
            addCriterion("ShouRuid between", value1, value2, "shouruid");
            return (Criteria) this;
        }

        public Criteria andShouruidNotBetween(Integer value1, Integer value2) {
            addCriterion("ShouRuid not between", value1, value2, "shouruid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("VIPprice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("VIPprice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(Double value) {
            addCriterion("VIPprice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(Double value) {
            addCriterion("VIPprice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(Double value) {
            addCriterion("VIPprice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(Double value) {
            addCriterion("VIPprice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(Double value) {
            addCriterion("VIPprice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(Double value) {
            addCriterion("VIPprice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<Double> values) {
            addCriterion("VIPprice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<Double> values) {
            addCriterion("VIPprice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(Double value1, Double value2) {
            addCriterion("VIPprice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(Double value1, Double value2) {
            addCriterion("VIPprice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceIsNull() {
            addCriterion("huiPrice is null");
            return (Criteria) this;
        }

        public Criteria andHuipriceIsNotNull() {
            addCriterion("huiPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHuipriceEqualTo(Double value) {
            addCriterion("huiPrice =", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceNotEqualTo(Double value) {
            addCriterion("huiPrice <>", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceGreaterThan(Double value) {
            addCriterion("huiPrice >", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceGreaterThanOrEqualTo(Double value) {
            addCriterion("huiPrice >=", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceLessThan(Double value) {
            addCriterion("huiPrice <", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceLessThanOrEqualTo(Double value) {
            addCriterion("huiPrice <=", value, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceIn(List<Double> values) {
            addCriterion("huiPrice in", values, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceNotIn(List<Double> values) {
            addCriterion("huiPrice not in", values, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceBetween(Double value1, Double value2) {
            addCriterion("huiPrice between", value1, value2, "huiprice");
            return (Criteria) this;
        }

        public Criteria andHuipriceNotBetween(Double value1, Double value2) {
            addCriterion("huiPrice not between", value1, value2, "huiprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceIsNull() {
            addCriterion("xiePrice is null");
            return (Criteria) this;
        }

        public Criteria andXiepriceIsNotNull() {
            addCriterion("xiePrice is not null");
            return (Criteria) this;
        }

        public Criteria andXiepriceEqualTo(Double value) {
            addCriterion("xiePrice =", value, "xieprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceNotEqualTo(Double value) {
            addCriterion("xiePrice <>", value, "xieprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceGreaterThan(Double value) {
            addCriterion("xiePrice >", value, "xieprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceGreaterThanOrEqualTo(Double value) {
            addCriterion("xiePrice >=", value, "xieprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceLessThan(Double value) {
            addCriterion("xiePrice <", value, "xieprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceLessThanOrEqualTo(Double value) {
            addCriterion("xiePrice <=", value, "xieprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceIn(List<Double> values) {
            addCriterion("xiePrice in", values, "xieprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceNotIn(List<Double> values) {
            addCriterion("xiePrice not in", values, "xieprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceBetween(Double value1, Double value2) {
            addCriterion("xiePrice between", value1, value2, "xieprice");
            return (Criteria) this;
        }

        public Criteria andXiepriceNotBetween(Double value1, Double value2) {
            addCriterion("xiePrice not between", value1, value2, "xieprice");
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