package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	
	@Pointcut("execution(** com.aop.Performance.perform(..))")
	public void performance(){}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try{
			System.out.println("Silencing cell phones");System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP !!!");
		}catch(Throwable e){
			System.out.println("Demanding a refund");
		}
		/* 밑에 작성한 Before와 afterrunning, throwing 을  @Around로 한번에 처리한다.
		 * ProceedingJoinPoint 파라미터를 받는다. 이 객체는 어드밥이스 내에서 어드바이스 대상 메소드를 호출할 수 있는 방법을 제공한다.
		 * @Around 어드바이스를 구현할 때는 반드시 proceed()를 호출해야 한다는 점을 기억하자.*/
	}
	/*
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("CLAP CLAP CLAP !!!");
	}
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
	*/
}
