package com.toread.core.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.toread.core.domain.CoreAccount;
import com.toread.core.domain.CoreRoles;
import com.toread.core.falg.State;
import com.toread.core.persistence.CoreAccountDao;
@Service("loginService")
public class LoginServiceImp implements UserDetailsService{
	@Autowired
	private CoreAccountDao coreAccountDao;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		CoreAccount coreAccount = coreAccountDao.getByCode(username);
		String name = coreAccount.getAccountCode();
		String password = coreAccount.getAccountPassword();
		Boolean accountEnabledFlag = getAccountFlag(coreAccount);
		List<SimpleGrantedAuthority> authorities = getAccountAuthorites(coreAccount);
		User user = new User(name, password, accountEnabledFlag, true, true, true, authorities);
		return user;
	}
	
	//获取账户状态信息
	private Boolean getAccountFlag(CoreAccount coreAccount){
		Assert.notNull(coreAccount,"账户信息不可以为空");
		Boolean enabled = null;
		Integer enabledFlag = coreAccount.getAccountEnable();
		if(State.ENABLED.getFalg().equals(enabled)){
			enabled = true;
		}else if(State.DISABLE.getFalg().equals(enabledFlag)){
			enabled = false;
		}
		return enabled;
	}
	
	//获取账户角色
	private List<SimpleGrantedAuthority> getAccountAuthorites(CoreAccount account){
		String code  = account.getAccountCode();
		Assert.hasLength(code,"账户代码不可以为空");
		List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		List<CoreRoles> coreRoles = coreAccountDao.getAccountRolesByCode(code).getCoreRoles();
		for (CoreRoles roles : coreRoles) {
			String rolseName = roles.getRolseName();
			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(rolseName);
			authorities.add(authority);
		}
		return authorities;
	}
}
