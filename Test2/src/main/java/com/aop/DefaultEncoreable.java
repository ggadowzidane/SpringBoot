package com.aop;

import org.springframework.stereotype.Component;

@Component
public class DefaultEncoreable implements Encoreable {

	@Override
	public void performEncore() {
		System.out.println("기존 객체에 메서드를 추가하였다");
	}

}
