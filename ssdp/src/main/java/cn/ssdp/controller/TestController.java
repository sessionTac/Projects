package cn.ssdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.ssdp.entity.TestEntity;

@RestController
public class TestController {
	
	@Autowired
	private ApplicationContext appCnt;
	
	@GetMapping("/Hello/{userId}")
	@ResponseBody
	public TestEntity test(@PathVariable String userId) {
		TestEntity testEntity = new TestEntity();
		testEntity.setUserId(userId);
		testEntity.setName("testName");
		
		return testEntity;
	}
	
	@GetMapping("/app")
	@ResponseBody
	public String getAppName() {
		return appCnt.getEnvironment().getProperty("test.name");
	}

}
