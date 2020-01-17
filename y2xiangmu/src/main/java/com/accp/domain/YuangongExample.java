package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YuangongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YuangongExample() {
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

        public Criteria andYuannoIsNull() {
            addCriterion("yuanNo is null");
            return (Criteria) this;
        }

        public Criteria andYuannoIsNotNull() {
            addCriterion("yuanNo is not null");
            return (Criteria) this;
        }

        public Criteria andYuannoEqualTo(String value) {
            addCriterion("yuanNo =", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoNotEqualTo(String value) {
            addCriterion("yuanNo <>", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoGreaterThan(String value) {
            addCriterion("yuanNo >", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoGreaterThanOrEqualTo(String value) {
            addCriterion("yuanNo >=", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoLessThan(String value) {
            addCriterion("yuanNo <", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoLessThanOrEqualTo(String value) {
            addCriterion("yuanNo <=", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoLike(String value) {
            addCriterion("yuanNo like", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoNotLike(String value) {
            addCriterion("yuanNo not like", value, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoIn(List<String> values) {
            addCriterion("yuanNo in", values, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoNotIn(List<String> values) {
            addCriterion("yuanNo not in", values, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoBetween(String value1, String value2) {
            addCriterion("yuanNo between", value1, value2, "yuanno");
            return (Criteria) this;
        }

        public Criteria andYuannoNotBetween(String value1, String value2) {
            addCriterion("yuanNo not between", value1, value2, "yuanno");
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

        public Criteria andYuannameIsNull() {
            addCriterion("yuanName is null");
            return (Criteria) this;
        }

        public Criteria andYuannameIsNotNull() {
            addCriterion("yuanName is not null");
            return (Criteria) this;
        }

        public Criteria andYuannameEqualTo(String value) {
            addCriterion("yuanName =", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameNotEqualTo(String value) {
            addCriterion("yuanName <>", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameGreaterThan(String value) {
            addCriterion("yuanName >", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameGreaterThanOrEqualTo(String value) {
            addCriterion("yuanName >=", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameLessThan(String value) {
            addCriterion("yuanName <", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameLessThanOrEqualTo(String value) {
            addCriterion("yuanName <=", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameLike(String value) {
            addCriterion("yuanName like", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameNotLike(String value) {
            addCriterion("yuanName not like", value, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameIn(List<String> values) {
            addCriterion("yuanName in", values, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameNotIn(List<String> values) {
            addCriterion("yuanName not in", values, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameBetween(String value1, String value2) {
            addCriterion("yuanName between", value1, value2, "yuanname");
            return (Criteria) this;
        }

        public Criteria andYuannameNotBetween(String value1, String value2) {
            addCriterion("yuanName not between", value1, value2, "yuanname");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
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

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHuaddressIsNull() {
            addCriterion("HuAddress is null");
            return (Criteria) this;
        }

        public Criteria andHuaddressIsNotNull() {
            addCriterion("HuAddress is not null");
            return (Criteria) this;
        }

        public Criteria andHuaddressEqualTo(String value) {
            addCriterion("HuAddress =", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressNotEqualTo(String value) {
            addCriterion("HuAddress <>", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressGreaterThan(String value) {
            addCriterion("HuAddress >", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressGreaterThanOrEqualTo(String value) {
            addCriterion("HuAddress >=", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressLessThan(String value) {
            addCriterion("HuAddress <", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressLessThanOrEqualTo(String value) {
            addCriterion("HuAddress <=", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressLike(String value) {
            addCriterion("HuAddress like", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressNotLike(String value) {
            addCriterion("HuAddress not like", value, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressIn(List<String> values) {
            addCriterion("HuAddress in", values, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressNotIn(List<String> values) {
            addCriterion("HuAddress not in", values, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressBetween(String value1, String value2) {
            addCriterion("HuAddress between", value1, value2, "huaddress");
            return (Criteria) this;
        }

        public Criteria andHuaddressNotBetween(String value1, String value2) {
            addCriterion("HuAddress not between", value1, value2, "huaddress");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("cardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("cardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("cardNumber =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("cardNumber <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("cardNumber >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("cardNumber >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("cardNumber <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("cardNumber <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("cardNumber like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("cardNumber not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("cardNumber in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("cardNumber not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("cardNumber between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("cardNumber not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andWeixingIsNull() {
            addCriterion("WeiXing is null");
            return (Criteria) this;
        }

        public Criteria andWeixingIsNotNull() {
            addCriterion("WeiXing is not null");
            return (Criteria) this;
        }

        public Criteria andWeixingEqualTo(String value) {
            addCriterion("WeiXing =", value, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingNotEqualTo(String value) {
            addCriterion("WeiXing <>", value, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingGreaterThan(String value) {
            addCriterion("WeiXing >", value, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingGreaterThanOrEqualTo(String value) {
            addCriterion("WeiXing >=", value, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingLessThan(String value) {
            addCriterion("WeiXing <", value, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingLessThanOrEqualTo(String value) {
            addCriterion("WeiXing <=", value, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingLike(String value) {
            addCriterion("WeiXing like", value, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingNotLike(String value) {
            addCriterion("WeiXing not like", value, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingIn(List<String> values) {
            addCriterion("WeiXing in", values, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingNotIn(List<String> values) {
            addCriterion("WeiXing not in", values, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingBetween(String value1, String value2) {
            addCriterion("WeiXing between", value1, value2, "weixing");
            return (Criteria) this;
        }

        public Criteria andWeixingNotBetween(String value1, String value2) {
            addCriterion("WeiXing not between", value1, value2, "weixing");
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