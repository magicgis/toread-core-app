package com.toread.core.domain;

import java.util.List;

public class CoreResources {
    private Integer resourcesId;

    private String resourcesName;

    private String resourcesUrl;

    private Integer resourcesType;

    private Integer resourcesPriority;

    private String resourcesMemo;

    private List<CoreRoles>  coreRoles;
    
    
    public List<CoreRoles> getCoreRoles() {
		return coreRoles;
	}

	public void setCoreRoles(List<CoreRoles> coreRoles) {
		this.coreRoles = coreRoles;
	}

	public Integer getResourcesId() {
        return resourcesId;
    }

    public void setResourcesId(Integer resourcesId) {
        this.resourcesId = resourcesId;
    }

    public String getResourcesName() {
        return resourcesName;
    }

    public void setResourcesName(String resourcesName) {
        this.resourcesName = resourcesName == null ? null : resourcesName.trim();
    }

    public String getResourcesUrl() {
        return resourcesUrl;
    }

    public void setResourcesUrl(String resourcesUrl) {
        this.resourcesUrl = resourcesUrl == null ? null : resourcesUrl.trim();
    }

    public Integer getResourcesType() {
        return resourcesType;
    }

    public void setResourcesType(Integer resourcesType) {
        this.resourcesType = resourcesType;
    }

    public Integer getResourcesPriority() {
        return resourcesPriority;
    }

    public void setResourcesPriority(Integer resourcesPriority) {
        this.resourcesPriority = resourcesPriority;
    }

    public String getResourcesMemo() {
        return resourcesMemo;
    }

    public void setResourcesMemo(String resourcesMemo) {
        this.resourcesMemo = resourcesMemo == null ? null : resourcesMemo.trim();
    }
}