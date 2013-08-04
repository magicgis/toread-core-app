package com.toread.core.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.toread.core.domain.CoreResources;


public  class CoreResourcesDao extends  SqlSessionDaoSupport {
	public static final String RESOURCESNS="com.toread.core.domain.mapper.CoreResourcesMapper.";
	public List<CoreResources> getAll(){
		return getSqlSession().selectList(RESOURCESNS+"getAll");
	}
	public List<CoreResources> getAllSourcesandRoles(){
		return getSqlSession().selectList(RESOURCESNS+"getAllSourcesandRoles");
	}
	
	public CoreResources getSourcesandRolesByResourcesUrl(String resourcesUrl){
		return getSqlSession().selectOne(RESOURCESNS+"getSourcesandRolesByResourcesUrl",resourcesUrl);
	}
	
}

