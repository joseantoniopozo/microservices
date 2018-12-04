package com.joseantoniopozo.microservices.client.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping(value = "/rest")
public class ClientController {

	@Value("${user.name}")
	private String userName;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getById() {
		return "Hello " + userName;
	}

}
