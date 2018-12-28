package com.zerozrz.bean;

public class QuestionReplyOption {
    private Integer qroId;

    private Integer questionId;

    private String qroContent;

    private Integer qroVotes;

    public Integer getQroId() {
        return qroId;
    }

    public void setQroId(Integer qroId) {
        this.qroId = qroId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQroContent() {
        return qroContent;
    }

    public void setQroContent(String qroContent) {
        this.qroContent = qroContent == null ? null : qroContent.trim();
    }

    public Integer getQroVotes() {
        return qroVotes;
    }

    public void setQroVotes(Integer qroVotes) {
        this.qroVotes = qroVotes;
    }
}