package com.sequarius.titan.sample.domain;

import com.sequarius.titan.sample.common.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerFinanceDOExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public CustomerFinanceDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdIsNull() {
            addCriterion("fk_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdIsNotNull() {
            addCriterion("fk_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdEqualTo(Long value) {
            addCriterion("fk_customer_id =", value, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdNotEqualTo(Long value) {
            addCriterion("fk_customer_id <>", value, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdGreaterThan(Long value) {
            addCriterion("fk_customer_id >", value, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fk_customer_id >=", value, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdLessThan(Long value) {
            addCriterion("fk_customer_id <", value, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("fk_customer_id <=", value, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdIn(List<Long> values) {
            addCriterion("fk_customer_id in", values, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdNotIn(List<Long> values) {
            addCriterion("fk_customer_id not in", values, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdBetween(Long value1, Long value2) {
            addCriterion("fk_customer_id between", value1, value2, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andFkCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("fk_customer_id not between", value1, value2, "fkCustomerId");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNull() {
            addCriterion("bank_number is null");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNotNull() {
            addCriterion("bank_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankNumberEqualTo(String value) {
            addCriterion("bank_number =", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotEqualTo(String value) {
            addCriterion("bank_number <>", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThan(String value) {
            addCriterion("bank_number >", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_number >=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThan(String value) {
            addCriterion("bank_number <", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_number <=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLike(String value) {
            addCriterion("bank_number like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotLike(String value) {
            addCriterion("bank_number not like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberIn(List<String> values) {
            addCriterion("bank_number in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotIn(List<String> values) {
            addCriterion("bank_number not in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberBetween(String value1, String value2) {
            addCriterion("bank_number between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotBetween(String value1, String value2) {
            addCriterion("bank_number not between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNull() {
            addCriterion("bank_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNotNull() {
            addCriterion("bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("bank_address =", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("bank_address <>", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("bank_address >", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_address >=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThan(String value) {
            addCriterion("bank_address <", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_address <=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLike(String value) {
            addCriterion("bank_address like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotLike(String value) {
            addCriterion("bank_address not like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("bank_address in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("bank_address not in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("bank_address between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("bank_address not between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdIsNull() {
            addCriterion("fk_pay_type_id is null");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdIsNotNull() {
            addCriterion("fk_pay_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdEqualTo(Long value) {
            addCriterion("fk_pay_type_id =", value, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdNotEqualTo(Long value) {
            addCriterion("fk_pay_type_id <>", value, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdGreaterThan(Long value) {
            addCriterion("fk_pay_type_id >", value, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fk_pay_type_id >=", value, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdLessThan(Long value) {
            addCriterion("fk_pay_type_id <", value, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("fk_pay_type_id <=", value, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdIn(List<Long> values) {
            addCriterion("fk_pay_type_id in", values, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdNotIn(List<Long> values) {
            addCriterion("fk_pay_type_id not in", values, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdBetween(Long value1, Long value2) {
            addCriterion("fk_pay_type_id between", value1, value2, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andFkPayTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("fk_pay_type_id not between", value1, value2, "fkPayTypeId");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateIsNull() {
            addCriterion("monthly_balance_date is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateIsNotNull() {
            addCriterion("monthly_balance_date is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateEqualTo(Long value) {
            addCriterion("monthly_balance_date =", value, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateNotEqualTo(Long value) {
            addCriterion("monthly_balance_date <>", value, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateGreaterThan(Long value) {
            addCriterion("monthly_balance_date >", value, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateGreaterThanOrEqualTo(Long value) {
            addCriterion("monthly_balance_date >=", value, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateLessThan(Long value) {
            addCriterion("monthly_balance_date <", value, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateLessThanOrEqualTo(Long value) {
            addCriterion("monthly_balance_date <=", value, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateIn(List<Long> values) {
            addCriterion("monthly_balance_date in", values, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateNotIn(List<Long> values) {
            addCriterion("monthly_balance_date not in", values, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateBetween(Long value1, Long value2) {
            addCriterion("monthly_balance_date between", value1, value2, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andMonthlyBalanceDateNotBetween(Long value1, Long value2) {
            addCriterion("monthly_balance_date not between", value1, value2, "monthlyBalanceDate");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdIsNull() {
            addCriterion("fk_trading_currency_id is null");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdIsNotNull() {
            addCriterion("fk_trading_currency_id is not null");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdEqualTo(Long value) {
            addCriterion("fk_trading_currency_id =", value, "fkTradingCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdNotEqualTo(Long value) {
            addCriterion("fk_trading_currency_id <>", value, "fkTradingCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdGreaterThan(Long value) {
            addCriterion("fk_trading_currency_id >", value, "fkTradingCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fk_trading_currency_id >=", value, "fkTradingCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdLessThan(Long value) {
            addCriterion("fk_trading_currency_id <", value, "fkTradingCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdLessThanOrEqualTo(Long value) {
            addCriterion("fk_trading_currency_id <=", value, "fkTradingCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdIn(List<Long> values) {
            addCriterion("fk_trading_currency_id in", values, "fkTradingCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdNotIn(List<Long> values) {
            addCriterion("fk_trading_currency_id not in", values, "fkTradingCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdBetween(Long value1, Long value2) {
            addCriterion("fk_trading_currency_id between", value1, value2, "fkTradingCurrencyId");
            return (Criteria) this;
        }

        public Criteria andFkTradingCurrencyIdNotBetween(Long value1, Long value2) {
            addCriterion("fk_trading_currency_id not between", value1, value2, "fkTradingCurrencyId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_finance
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 17 15:26:31 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table customer_finance
     *
     * @mbg.generated Mon Feb 17 15:26:31 CST 2020
     */
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