package com.toread.core.service;

import org.springframework.stereotype.Service;

/**
 * 需要使用安全登录框架
 * 及权限过滤框架
 */
@Service
public interface LoginService {
	public boolean login();
	public boolean logout();
}
