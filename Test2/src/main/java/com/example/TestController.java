package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aop.Performance;

@Controller
public class TestController {
	
	//aspect 클래스 주입
	private @Autowired Performance performance;
	
	@RequestMapping("/")
	public String test(){
		this.performance.perform();
		return "hello";
	}
}
