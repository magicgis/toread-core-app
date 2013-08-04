package com.toread.core.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.toread.core.domain.CoreAccount;



public interface CoreAccountService {
	public List<CoreAccount> getListAccounts();
}
