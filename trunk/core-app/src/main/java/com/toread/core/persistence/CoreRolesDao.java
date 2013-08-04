package com.toread.core.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toread.core.domain.CoreRoles;

public class CoreRolesDao extends SqlSessionDaoSupport {
	public static  final String ROLESNS = "com.toread.core.domain.CoreRoles.";
	public List<CoreRoles>  getAll(){
		return getSqlSession().selectList(ROLESNS+"getAll");
	}
	
	public List<CoreRoles> getAllRolesandSources(){
		return getSqlSession().selectList(ROLESNS+"getAllRolesandSources");
	}
}
