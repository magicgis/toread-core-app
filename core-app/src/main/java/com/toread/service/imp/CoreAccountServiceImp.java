package com.toread.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.toread.core.domain.CoreAccount;
import com.toread.core.domain.CoreAccountExample;
import com.toread.core.domain.CoreAccountExample.Criteria;
import com.toread.core.falg.State;
import com.toread.core.persistence.CoreAccountMapper;
import com.toread.core.service.CoreAccountService;

public class CoreAccountServiceImp implements CoreAccountService{
	
	@Autowired
	private CoreAccountMapper accountMapper;
	
	@Override
	public List<CoreAccount> queryValidAccount(CoreAccountExample queryModel) {
		CoreAccountExample accountExample = new CoreAccountExample();
		Criteria criteria =  accountExample.createCriteria();
		criteria.andAccountStateEqualTo(State.Enabled.getFalg());
		return accountMapper.selectByExample(accountExample);
	}

	@Override
	public List<CoreAccount> queryDisableAccount(CoreAccountExample queryModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
