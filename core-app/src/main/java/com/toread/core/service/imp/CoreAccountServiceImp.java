package com.toread.core.service.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toread.core.domain.CoreAccount;
import com.toread.core.persistence.CoreAccountDao;
import com.toread.core.service.CoreAccountService;

@Service
public class CoreAccountServiceImp implements CoreAccountService{
	
	@Autowired
	private CoreAccountDao coreAccountDao;

	public List<CoreAccount> getListAccounts(){
		return coreAccountDao.getAll();
	}
}
