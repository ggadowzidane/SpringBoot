package com.aop;

import org.springframework.stereotype.Component;

@Component
public class PerformanceImpl implements Performance {

	public void perform() {
		System.out.println("공연을 시작합니다");
	}

}
