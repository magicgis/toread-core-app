package com.toread.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.toread.core.domain.CoreAccount;
import com.toread.core.domain.CoreAccountExample;

@Service
public interface CoreAccountService {
	List<CoreAccount>	queryValidAccount(CoreAccountExample queryModel);
	List<CoreAccount>	queryDisableAccount(CoreAccountExample queryModel);
}
