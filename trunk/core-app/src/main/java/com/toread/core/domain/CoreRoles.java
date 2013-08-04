package com.toread.core.domain;

import java.util.List;

public class CoreRoles {
    private Integer rolseId;

    private String rolseName;

    private Integer rolseEnable;
    
    private List<CoreResources> coreResources;
    

	public List<CoreResources> getCoreResources() {
		return coreResources;
	}

	public void setCoreResources(List<CoreResources> coreResources) {
		this.coreResources = coreResources;
	}

	public Integer getRolseId() {
        return rolseId;
    }

    public void setRolseId(Integer rolseId) {
        this.rolseId = rolseId;
    }

    public String getRolseName() {
        return rolseName;
    }

    public void setRolseName(String rolseName) {
        this.rolseName = rolseName == null ? null : rolseName.trim();
    }

    public Integer getRolseEnable() {
        return rolseEnable;
    }

    public void setRolseEnable(Integer rolseEnable) {
        this.rolseEnable = rolseEnable;
    }
}