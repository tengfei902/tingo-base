package com.tingo.base.dao.remote.impl;

import com.tingo.base.dao.remote.IHelloClient;
import org.springframework.stereotype.Component;

@Component
public class HelloClient implements IHelloClient{
	@Override
	public String hello(String username) {
		return null;
	}
}
