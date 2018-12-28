package com.zerozrz.bean;

import java.util.Date;

public class Survey {
    private Integer surveyId;

    private String surveyType;

    private String surveyName;

    private String surveyExplain;

    private Integer userId;

    private Date createTime;

    private Integer surveyStatus;

    private Integer questionNums;

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public void setSurveyType(String surveyType) {
        this.surveyType = surveyType == null ? null : surveyType.trim();
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName == null ? null : surveyName.trim();
    }

    public String getSurveyExplain() {
        return surveyExplain;
    }

    public void setSurveyExplain(String surveyExplain) {
        this.surveyExplain = surveyExplain == null ? null : surveyExplain.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSurveyStatus() {
        return surveyStatus;
    }

    public void setSurveyStatus(Integer surveyStatus) {
        this.surveyStatus = surveyStatus;
    }

    public Integer getQuestionNums() {
        return questionNums;
    }

    public void setQuestionNums(Integer questionNums) {
        this.questionNums = questionNums;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "surveyId=" + surveyId +
                ", surveyType='" + surveyType + '\'' +
                ", surveyName='" + surveyName + '\'' +
                ", surveyExplain='" + surveyExplain + '\'' +
                ", userId=" + userId +
                ", createTime=" + createTime +
                ", surveyStatus=" + surveyStatus +
                ", questionNums=" + questionNums +
                '}';
    }
}