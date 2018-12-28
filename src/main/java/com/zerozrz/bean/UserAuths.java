package com.zerozrz.bean;

import java.util.Date;

public class UserAuths {
    private Integer authId;

    private Integer userId;

    private String loginType;

    private String identifier;

    private String password;

    private String openId;

    private Date loginFirstTime;

    private Date loginFirstEnd;

    private String loginFirstIp;

    private String loginEndIp;

    private Integer userStatus;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Date getLoginFirstTime() {
        return loginFirstTime;
    }

    public void setLoginFirstTime(Date loginFirstTime) {
        this.loginFirstTime = loginFirstTime;
    }

    public Date getLoginFirstEnd() {
        return loginFirstEnd;
    }

    public void setLoginFirstEnd(Date loginFirstEnd) {
        this.loginFirstEnd = loginFirstEnd;
    }

    public String getLoginFirstIp() {
        return loginFirstIp;
    }

    public void setLoginFirstIp(String loginFirstIp) {
        this.loginFirstIp = loginFirstIp == null ? null : loginFirstIp.trim();
    }

    public String getLoginEndIp() {
        return loginEndIp;
    }

    public void setLoginEndIp(String loginEndIp) {
        this.loginEndIp = loginEndIp == null ? null : loginEndIp.trim();
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }
}