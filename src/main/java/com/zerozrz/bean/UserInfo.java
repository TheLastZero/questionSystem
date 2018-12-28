package com.zerozrz.bean;

import java.util.Date;

public class UserInfo {
    private Integer userId;

    private String userNickname;

    private Integer userSex;

    private Integer userLevel;

    private Date timeCreate;

    private String imgAvatar;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Date getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Date timeCreate) {
        this.timeCreate = timeCreate;
    }

    public String getImgAvatar() {
        return imgAvatar;
    }

    public void setImgAvatar(String imgAvatar) {
        this.imgAvatar = imgAvatar == null ? null : imgAvatar.trim();
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userNickname='" + userNickname + '\'' +
                ", userSex=" + userSex +
                ", userLevel=" + userLevel +
                ", timeCreate=" + timeCreate +
                ", imgAvatar='" + imgAvatar + '\'' +
                '}';
    }
}