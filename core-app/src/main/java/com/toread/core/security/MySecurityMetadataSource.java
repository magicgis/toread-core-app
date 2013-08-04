package com.toread.core.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;

import com.toread.core.domain.CoreResources;
import com.toread.core.domain.CoreRoles;
import com.toread.core.persistence.CoreResourcesDao;
import com.toread.core.persistence.CoreRolesDao;

/**
 * @author 黎志兵
 * <h4>获取到所有的资源及角色定义</h4>
 */
@Service
@Scope(value="prototype")
public class MySecurityMetadataSource  implements FilterInvocationSecurityMetadataSource{
	@Autowired
	private CoreResourcesDao coreResourcesDao;
	public MySecurityMetadataSource() {
		super();
	}

	//获取角色对应的信息
	@Override
	public Collection<ConfigAttribute> getAttributes(Object object)
			throws IllegalArgumentException {
		 String requestUrl = ((FilterInvocation) object).getRequestUrl();
		 CoreResources  coreResources = coreResourcesDao.getSourcesandRolesByResourcesUrl(requestUrl);
		 Collection<ConfigAttribute> attributes = new ArrayList<ConfigAttribute>();
		 if(coreResources != null){
			 List<CoreRoles> coreRoles = coreResources.getCoreRoles();
			 for (CoreRoles roles : coreRoles) {
				 ConfigAttribute configAttribute = new SecurityConfig(roles.getRolseName());
				 attributes.add(configAttribute);
			 }
		 }
		return attributes;
	}

	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

}
