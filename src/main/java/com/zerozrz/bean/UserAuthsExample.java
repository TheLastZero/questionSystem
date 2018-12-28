package com.zerozrz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAuthsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAuthsExample() {
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

        public Criteria andAuthIdIsNull() {
            addCriterion("auth_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthIdIsNotNull() {
            addCriterion("auth_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthIdEqualTo(Integer value) {
            addCriterion("auth_id =", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotEqualTo(Integer value) {
            addCriterion("auth_id <>", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThan(Integer value) {
            addCriterion("auth_id >", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("auth_id >=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThan(Integer value) {
            addCriterion("auth_id <", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdLessThanOrEqualTo(Integer value) {
            addCriterion("auth_id <=", value, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdIn(List<Integer> values) {
            addCriterion("auth_id in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotIn(List<Integer> values) {
            addCriterion("auth_id not in", values, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdBetween(Integer value1, Integer value2) {
            addCriterion("auth_id between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andAuthIdNotBetween(Integer value1, Integer value2) {
            addCriterion("auth_id not between", value1, value2, "authId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNull() {
            addCriterion("login_type is null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIsNotNull() {
            addCriterion("login_type is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTypeEqualTo(String value) {
            addCriterion("login_type =", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotEqualTo(String value) {
            addCriterion("login_type <>", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThan(String value) {
            addCriterion("login_type >", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeGreaterThanOrEqualTo(String value) {
            addCriterion("login_type >=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThan(String value) {
            addCriterion("login_type <", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLessThanOrEqualTo(String value) {
            addCriterion("login_type <=", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeLike(String value) {
            addCriterion("login_type like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotLike(String value) {
            addCriterion("login_type not like", value, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeIn(List<String> values) {
            addCriterion("login_type in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotIn(List<String> values) {
            addCriterion("login_type not in", values, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeBetween(String value1, String value2) {
            addCriterion("login_type between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andLoginTypeNotBetween(String value1, String value2) {
            addCriterion("login_type not between", value1, value2, "loginType");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNull() {
            addCriterion("identifier is null");
            return (Criteria) this;
        }

        public Criteria andIdentifierIsNotNull() {
            addCriterion("identifier is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifierEqualTo(String value) {
            addCriterion("identifier =", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotEqualTo(String value) {
            addCriterion("identifier <>", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThan(String value) {
            addCriterion("identifier >", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierGreaterThanOrEqualTo(String value) {
            addCriterion("identifier >=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThan(String value) {
            addCriterion("identifier <", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLessThanOrEqualTo(String value) {
            addCriterion("identifier <=", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierLike(String value) {
            addCriterion("identifier like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotLike(String value) {
            addCriterion("identifier not like", value, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierIn(List<String> values) {
            addCriterion("identifier in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotIn(List<String> values) {
            addCriterion("identifier not in", values, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierBetween(String value1, String value2) {
            addCriterion("identifier between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andIdentifierNotBetween(String value1, String value2) {
            addCriterion("identifier not between", value1, value2, "identifier");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeIsNull() {
            addCriterion("login_first_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeIsNotNull() {
            addCriterion("login_first_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeEqualTo(Date value) {
            addCriterion("login_first_time =", value, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeNotEqualTo(Date value) {
            addCriterion("login_first_time <>", value, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeGreaterThan(Date value) {
            addCriterion("login_first_time >", value, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_first_time >=", value, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeLessThan(Date value) {
            addCriterion("login_first_time <", value, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_first_time <=", value, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeIn(List<Date> values) {
            addCriterion("login_first_time in", values, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeNotIn(List<Date> values) {
            addCriterion("login_first_time not in", values, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeBetween(Date value1, Date value2) {
            addCriterion("login_first_time between", value1, value2, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_first_time not between", value1, value2, "loginFirstTime");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndIsNull() {
            addCriterion("login_first_end is null");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndIsNotNull() {
            addCriterion("login_first_end is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndEqualTo(Date value) {
            addCriterion("login_first_end =", value, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndNotEqualTo(Date value) {
            addCriterion("login_first_end <>", value, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndGreaterThan(Date value) {
            addCriterion("login_first_end >", value, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndGreaterThanOrEqualTo(Date value) {
            addCriterion("login_first_end >=", value, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndLessThan(Date value) {
            addCriterion("login_first_end <", value, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndLessThanOrEqualTo(Date value) {
            addCriterion("login_first_end <=", value, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndIn(List<Date> values) {
            addCriterion("login_first_end in", values, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndNotIn(List<Date> values) {
            addCriterion("login_first_end not in", values, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndBetween(Date value1, Date value2) {
            addCriterion("login_first_end between", value1, value2, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstEndNotBetween(Date value1, Date value2) {
            addCriterion("login_first_end not between", value1, value2, "loginFirstEnd");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpIsNull() {
            addCriterion("login_first_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpIsNotNull() {
            addCriterion("login_first_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpEqualTo(String value) {
            addCriterion("login_first_ip =", value, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpNotEqualTo(String value) {
            addCriterion("login_first_ip <>", value, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpGreaterThan(String value) {
            addCriterion("login_first_ip >", value, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_first_ip >=", value, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpLessThan(String value) {
            addCriterion("login_first_ip <", value, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpLessThanOrEqualTo(String value) {
            addCriterion("login_first_ip <=", value, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpLike(String value) {
            addCriterion("login_first_ip like", value, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpNotLike(String value) {
            addCriterion("login_first_ip not like", value, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpIn(List<String> values) {
            addCriterion("login_first_ip in", values, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpNotIn(List<String> values) {
            addCriterion("login_first_ip not in", values, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpBetween(String value1, String value2) {
            addCriterion("login_first_ip between", value1, value2, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginFirstIpNotBetween(String value1, String value2) {
            addCriterion("login_first_ip not between", value1, value2, "loginFirstIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpIsNull() {
            addCriterion("login_end_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpIsNotNull() {
            addCriterion("login_end_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpEqualTo(String value) {
            addCriterion("login_end_ip =", value, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpNotEqualTo(String value) {
            addCriterion("login_end_ip <>", value, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpGreaterThan(String value) {
            addCriterion("login_end_ip >", value, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_end_ip >=", value, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpLessThan(String value) {
            addCriterion("login_end_ip <", value, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpLessThanOrEqualTo(String value) {
            addCriterion("login_end_ip <=", value, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpLike(String value) {
            addCriterion("login_end_ip like", value, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpNotLike(String value) {
            addCriterion("login_end_ip not like", value, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpIn(List<String> values) {
            addCriterion("login_end_ip in", values, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpNotIn(List<String> values) {
            addCriterion("login_end_ip not in", values, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpBetween(String value1, String value2) {
            addCriterion("login_end_ip between", value1, value2, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andLoginEndIpNotBetween(String value1, String value2) {
            addCriterion("login_end_ip not between", value1, value2, "loginEndIp");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
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