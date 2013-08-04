package com.toread.core.domain;

import java.util.List;

public class CoreAccount {
    private Integer accountId;

    private String accountCode;

    private String accountPassword;

    private Integer accountEnable;

    private List<CoreRoles> coreRoles;
    
    public List<CoreRoles> getCoreRoles() {
		return coreRoles;
	}

	public void setCoreRoles(List<CoreRoles> coreRoles) {
		this.coreRoles = coreRoles;
	}

	public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode == null ? null : accountCode.trim();
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    public Integer getAccountEnable() {
        return accountEnable;
    }

    public void setAccountEnable(Integer accountEnable) {
        this.accountEnable = accountEnable;
    }
}