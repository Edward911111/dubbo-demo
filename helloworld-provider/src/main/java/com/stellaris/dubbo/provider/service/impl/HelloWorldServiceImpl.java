package com.stellaris.dubbo.provider.service.impl;

import java.util.Map;
import org.springframework.stereotype.Service;
import com.google.common.collect.Maps;
import com.stellaris.dubbo.provider.service.AbstractService;
import com.stellaris.helloworld.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl extends AbstractService implements HelloWorldService {
	
	@Override
	public Map<String, Object> sayHello(String name) {
		logger.info("sayHello 服务被调用，传入参数：name={}", name);
		Map<String, Object> resultMap = Maps.newHashMap();
		resultMap.put("result", "Hello" + name);
		resultMap.put("code", "0000");
		resultMap.put("msg", "成功");
		return resultMap;
	}

}
