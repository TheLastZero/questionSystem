package com.zerozrz.bean;

import java.util.Date;

public class Answer {
    private Integer answerId;

    private Integer surveyId;

    private Integer userId;

    private Date answerStart;

    private Date answerEnd;

    private Date answerTime;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getAnswerStart() {
        return answerStart;
    }

    public void setAnswerStart(Date answerStart) {
        this.answerStart = answerStart;
    }

    public Date getAnswerEnd() {
        return answerEnd;
    }

    public void setAnswerEnd(Date answerEnd) {
        this.answerEnd = answerEnd;
    }

    public Date getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Date answerTime) {
        this.answerTime = answerTime;
    }
}