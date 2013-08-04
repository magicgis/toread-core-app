package com.toread.core.security;

import java.util.Collection;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@Scope(value="prototype")
public class MyAccessDecisionManager implements AccessDecisionManager{

	@Override
	public void decide(Authentication authentication, Object object,
			Collection<ConfigAttribute> configAttributes)
			throws AccessDeniedException, InsufficientAuthenticationException {
		if(CollectionUtils.isEmpty(configAttributes)){
			return;
		}
		for (ConfigAttribute configAttribute : configAttributes) {
			String needRoles = configAttribute.getAttribute();
			Collection<? extends GrantedAuthority> grantedAuthoritys = authentication.getAuthorities();
			for (GrantedAuthority grantedAuthority : grantedAuthoritys) {
				if(needRoles.equals(grantedAuthority)){
					return;
				}
			}
		}
		throw new AccessDeniedException("没有权限访问");
	}

	@Override
	public boolean supports(ConfigAttribute attribute) {
		return true;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

}
