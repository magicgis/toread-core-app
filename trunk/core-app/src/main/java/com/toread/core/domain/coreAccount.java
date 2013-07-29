package com.toread.core.domain;

import java.math.BigDecimal;

public class coreAccount {
    private BigDecimal accountUnid;

    private String accountUuid;

    private String code;

    private String password;

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
}