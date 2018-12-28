package com.zerozrz.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SurveyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SurveyExample() {
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

        public Criteria andSurveyIdIsNull() {
            addCriterion("survey_id is null");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIsNotNull() {
            addCriterion("survey_id is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyIdEqualTo(Integer value) {
            addCriterion("survey_id =", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotEqualTo(Integer value) {
            addCriterion("survey_id <>", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdGreaterThan(Integer value) {
            addCriterion("survey_id >", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("survey_id >=", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLessThan(Integer value) {
            addCriterion("survey_id <", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdLessThanOrEqualTo(Integer value) {
            addCriterion("survey_id <=", value, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdIn(List<Integer> values) {
            addCriterion("survey_id in", values, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotIn(List<Integer> values) {
            addCriterion("survey_id not in", values, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdBetween(Integer value1, Integer value2) {
            addCriterion("survey_id between", value1, value2, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("survey_id not between", value1, value2, "surveyId");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeIsNull() {
            addCriterion("survey_type is null");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeIsNotNull() {
            addCriterion("survey_type is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeEqualTo(String value) {
            addCriterion("survey_type =", value, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeNotEqualTo(String value) {
            addCriterion("survey_type <>", value, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeGreaterThan(String value) {
            addCriterion("survey_type >", value, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("survey_type >=", value, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeLessThan(String value) {
            addCriterion("survey_type <", value, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeLessThanOrEqualTo(String value) {
            addCriterion("survey_type <=", value, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeLike(String value) {
            addCriterion("survey_type like", value, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeNotLike(String value) {
            addCriterion("survey_type not like", value, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeIn(List<String> values) {
            addCriterion("survey_type in", values, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeNotIn(List<String> values) {
            addCriterion("survey_type not in", values, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeBetween(String value1, String value2) {
            addCriterion("survey_type between", value1, value2, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyTypeNotBetween(String value1, String value2) {
            addCriterion("survey_type not between", value1, value2, "surveyType");
            return (Criteria) this;
        }

        public Criteria andSurveyNameIsNull() {
            addCriterion("survey_name is null");
            return (Criteria) this;
        }

        public Criteria andSurveyNameIsNotNull() {
            addCriterion("survey_name is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyNameEqualTo(String value) {
            addCriterion("survey_name =", value, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameNotEqualTo(String value) {
            addCriterion("survey_name <>", value, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameGreaterThan(String value) {
            addCriterion("survey_name >", value, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameGreaterThanOrEqualTo(String value) {
            addCriterion("survey_name >=", value, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameLessThan(String value) {
            addCriterion("survey_name <", value, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameLessThanOrEqualTo(String value) {
            addCriterion("survey_name <=", value, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameLike(String value) {
            addCriterion("survey_name like", value, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameNotLike(String value) {
            addCriterion("survey_name not like", value, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameIn(List<String> values) {
            addCriterion("survey_name in", values, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameNotIn(List<String> values) {
            addCriterion("survey_name not in", values, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameBetween(String value1, String value2) {
            addCriterion("survey_name between", value1, value2, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyNameNotBetween(String value1, String value2) {
            addCriterion("survey_name not between", value1, value2, "surveyName");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainIsNull() {
            addCriterion("survey_explain is null");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainIsNotNull() {
            addCriterion("survey_explain is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainEqualTo(String value) {
            addCriterion("survey_explain =", value, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainNotEqualTo(String value) {
            addCriterion("survey_explain <>", value, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainGreaterThan(String value) {
            addCriterion("survey_explain >", value, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainGreaterThanOrEqualTo(String value) {
            addCriterion("survey_explain >=", value, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainLessThan(String value) {
            addCriterion("survey_explain <", value, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainLessThanOrEqualTo(String value) {
            addCriterion("survey_explain <=", value, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainLike(String value) {
            addCriterion("survey_explain like", value, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainNotLike(String value) {
            addCriterion("survey_explain not like", value, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainIn(List<String> values) {
            addCriterion("survey_explain in", values, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainNotIn(List<String> values) {
            addCriterion("survey_explain not in", values, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainBetween(String value1, String value2) {
            addCriterion("survey_explain between", value1, value2, "surveyExplain");
            return (Criteria) this;
        }

        public Criteria andSurveyExplainNotBetween(String value1, String value2) {
            addCriterion("survey_explain not between", value1, value2, "surveyExplain");
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

        public Criteria andSurveyStatusIsNull() {
            addCriterion("survey_status is null");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusIsNotNull() {
            addCriterion("survey_status is not null");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusEqualTo(Integer value) {
            addCriterion("survey_status =", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusNotEqualTo(Integer value) {
            addCriterion("survey_status <>", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusGreaterThan(Integer value) {
            addCriterion("survey_status >", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("survey_status >=", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusLessThan(Integer value) {
            addCriterion("survey_status <", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("survey_status <=", value, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusIn(List<Integer> values) {
            addCriterion("survey_status in", values, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusNotIn(List<Integer> values) {
            addCriterion("survey_status not in", values, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusBetween(Integer value1, Integer value2) {
            addCriterion("survey_status between", value1, value2, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andSurveyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("survey_status not between", value1, value2, "surveyStatus");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsIsNull() {
            addCriterion("question_nums is null");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsIsNotNull() {
            addCriterion("question_nums is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsEqualTo(Integer value) {
            addCriterion("question_nums =", value, "questionNums");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsNotEqualTo(Integer value) {
            addCriterion("question_nums <>", value, "questionNums");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsGreaterThan(Integer value) {
            addCriterion("question_nums >", value, "questionNums");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_nums >=", value, "questionNums");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsLessThan(Integer value) {
            addCriterion("question_nums <", value, "questionNums");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsLessThanOrEqualTo(Integer value) {
            addCriterion("question_nums <=", value, "questionNums");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsIn(List<Integer> values) {
            addCriterion("question_nums in", values, "questionNums");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsNotIn(List<Integer> values) {
            addCriterion("question_nums not in", values, "questionNums");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsBetween(Integer value1, Integer value2) {
            addCriterion("question_nums between", value1, value2, "questionNums");
            return (Criteria) this;
        }

        public Criteria andQuestionNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("question_nums not between", value1, value2, "questionNums");
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