package com.toread.core.persistence;

import com.toread.core.domain.CoreAccount;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

public class CoreAccountDao extends SqlSessionDaoSupport {
	public static final String ACCOUNTNS = "com.toread.core.domain.mapper.CoreAccountMapper.";
	
	public List<CoreAccount> getAll(){
		return getSqlSession().selectList(ACCOUNTNS+"getAll");
	}
	
	public CoreAccount getByCode(String code){
		return getSqlSession().selectOne(ACCOUNTNS+"getByCode");
	}
	
	public CoreAccount getAccountRolesByCode(String code){
		return getSqlSession().selectOne(ACCOUNTNS+"selectRolesByCode");
	}
}