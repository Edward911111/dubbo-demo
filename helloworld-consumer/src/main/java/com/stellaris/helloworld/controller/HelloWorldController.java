package com.stellaris.helloworld.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.stellaris.helloworld.service.HelloWorldService;

@Controller
public class HelloWorldController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	
	@Resource
	private HelloWorldService helloWorldService;
	
	@ResponseBody
	@RequestMapping(value = "/helloworld")
	public Map<String, Object> helloworld(HttpServletRequest request) {
		LOGGER.info("调用helloworld接口");
		String name = request.getParameter("name");
		return helloWorldService.sayHello(name);
	}
	
}
