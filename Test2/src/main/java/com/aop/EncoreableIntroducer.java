package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class EncoreableIntroducer {
	
	@DeclareParents(value="com.aop.PerformanceImpl+",defaultImpl=DefaultEncoreable.class)
	public static Encoreable encoreable;
}
