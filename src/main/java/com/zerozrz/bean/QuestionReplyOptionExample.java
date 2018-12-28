package com.zerozrz.bean;

import java.util.ArrayList;
import java.util.List;

public class QuestionReplyOptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionReplyOptionExample() {
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

        public Criteria andQroIdIsNull() {
            addCriterion("qro_id is null");
            return (Criteria) this;
        }

        public Criteria andQroIdIsNotNull() {
            addCriterion("qro_id is not null");
            return (Criteria) this;
        }

        public Criteria andQroIdEqualTo(Integer value) {
            addCriterion("qro_id =", value, "qroId");
            return (Criteria) this;
        }

        public Criteria andQroIdNotEqualTo(Integer value) {
            addCriterion("qro_id <>", value, "qroId");
            return (Criteria) this;
        }

        public Criteria andQroIdGreaterThan(Integer value) {
            addCriterion("qro_id >", value, "qroId");
            return (Criteria) this;
        }

        public Criteria andQroIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qro_id >=", value, "qroId");
            return (Criteria) this;
        }

        public Criteria andQroIdLessThan(Integer value) {
            addCriterion("qro_id <", value, "qroId");
            return (Criteria) this;
        }

        public Criteria andQroIdLessThanOrEqualTo(Integer value) {
            addCriterion("qro_id <=", value, "qroId");
            return (Criteria) this;
        }

        public Criteria andQroIdIn(List<Integer> values) {
            addCriterion("qro_id in", values, "qroId");
            return (Criteria) this;
        }

        public Criteria andQroIdNotIn(List<Integer> values) {
            addCriterion("qro_id not in", values, "qroId");
            return (Criteria) this;
        }

        public Criteria andQroIdBetween(Integer value1, Integer value2) {
            addCriterion("qro_id between", value1, value2, "qroId");
            return (Criteria) this;
        }

        public Criteria andQroIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qro_id not between", value1, value2, "qroId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNull() {
            addCriterion("question_id is null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIsNotNull() {
            addCriterion("question_id is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionIdEqualTo(Integer value) {
            addCriterion("question_id =", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotEqualTo(Integer value) {
            addCriterion("question_id <>", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThan(Integer value) {
            addCriterion("question_id >", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_id >=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThan(Integer value) {
            addCriterion("question_id <", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdLessThanOrEqualTo(Integer value) {
            addCriterion("question_id <=", value, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdIn(List<Integer> values) {
            addCriterion("question_id in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotIn(List<Integer> values) {
            addCriterion("question_id not in", values, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdBetween(Integer value1, Integer value2) {
            addCriterion("question_id between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQuestionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("question_id not between", value1, value2, "questionId");
            return (Criteria) this;
        }

        public Criteria andQroContentIsNull() {
            addCriterion("qro_content is null");
            return (Criteria) this;
        }

        public Criteria andQroContentIsNotNull() {
            addCriterion("qro_content is not null");
            return (Criteria) this;
        }

        public Criteria andQroContentEqualTo(String value) {
            addCriterion("qro_content =", value, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentNotEqualTo(String value) {
            addCriterion("qro_content <>", value, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentGreaterThan(String value) {
            addCriterion("qro_content >", value, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentGreaterThanOrEqualTo(String value) {
            addCriterion("qro_content >=", value, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentLessThan(String value) {
            addCriterion("qro_content <", value, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentLessThanOrEqualTo(String value) {
            addCriterion("qro_content <=", value, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentLike(String value) {
            addCriterion("qro_content like", value, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentNotLike(String value) {
            addCriterion("qro_content not like", value, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentIn(List<String> values) {
            addCriterion("qro_content in", values, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentNotIn(List<String> values) {
            addCriterion("qro_content not in", values, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentBetween(String value1, String value2) {
            addCriterion("qro_content between", value1, value2, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroContentNotBetween(String value1, String value2) {
            addCriterion("qro_content not between", value1, value2, "qroContent");
            return (Criteria) this;
        }

        public Criteria andQroVotesIsNull() {
            addCriterion("qro_votes is null");
            return (Criteria) this;
        }

        public Criteria andQroVotesIsNotNull() {
            addCriterion("qro_votes is not null");
            return (Criteria) this;
        }

        public Criteria andQroVotesEqualTo(Integer value) {
            addCriterion("qro_votes =", value, "qroVotes");
            return (Criteria) this;
        }

        public Criteria andQroVotesNotEqualTo(Integer value) {
            addCriterion("qro_votes <>", value, "qroVotes");
            return (Criteria) this;
        }

        public Criteria andQroVotesGreaterThan(Integer value) {
            addCriterion("qro_votes >", value, "qroVotes");
            return (Criteria) this;
        }

        public Criteria andQroVotesGreaterThanOrEqualTo(Integer value) {
            addCriterion("qro_votes >=", value, "qroVotes");
            return (Criteria) this;
        }

        public Criteria andQroVotesLessThan(Integer value) {
            addCriterion("qro_votes <", value, "qroVotes");
            return (Criteria) this;
        }

        public Criteria andQroVotesLessThanOrEqualTo(Integer value) {
            addCriterion("qro_votes <=", value, "qroVotes");
            return (Criteria) this;
        }

        public Criteria andQroVotesIn(List<Integer> values) {
            addCriterion("qro_votes in", values, "qroVotes");
            return (Criteria) this;
        }

        public Criteria andQroVotesNotIn(List<Integer> values) {
            addCriterion("qro_votes not in", values, "qroVotes");
            return (Criteria) this;
        }

        public Criteria andQroVotesBetween(Integer value1, Integer value2) {
            addCriterion("qro_votes between", value1, value2, "qroVotes");
            return (Criteria) this;
        }

        public Criteria andQroVotesNotBetween(Integer value1, Integer value2) {
            addCriterion("qro_votes not between", value1, value2, "qroVotes");
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