package com.toread.core.domain;

import java.math.BigDecimal;

public class CoreAccount {
    private BigDecimal accountUnid;

    private String accountUuid;

    private String code;

    private String password;

    private Integer accountState;

    public BigDecimal getAccountUnid() {
        return accountUnid;
    }

    public void setAccountUnid(BigDecimal accountUnid) {
        this.accountUnid = accountUnid;
    }

    public String getAccountUuid() {
        return accountUuid;
    }

    public void setAccountUuid(String accountUuid) {
        this.accountUuid = accountUuid == null ? null : accountUuid.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAccountState() {
        return accountState;
    }

    public void setAccountState(Integer accountState) {
        this.accountState = accountState;
    }
}