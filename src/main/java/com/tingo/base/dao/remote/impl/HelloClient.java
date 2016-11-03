package com.tingo.base.dao.remote.impl;

import com.tingo.base.dao.remote.IHelloClient;

import infra.common.base.ResponseResult;
import infra.jersey.client.WSClient;
import infra.jersey.client.WSClientFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloClient implements IHelloClient{
	
	@Override
	public String hello(String username) {
		WSClient client = WSClientFactory.getFactory().getClient("localhost");
		ResponseResult<String> result = client.queryParams("username", "wilson").invokeGet("say", String.class);
		return result.getData();
	}
}
