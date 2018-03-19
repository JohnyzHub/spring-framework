package com.myspring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MathAspect {

	/**
	 * @Default Constructor
	 */
	public MathAspect() {
		super();
	}

	@Before("execution(int com.myspring.aop.*.square*(int))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before performing square of : " + joinPoint.getTarget());
	}

	@AfterReturning("execution(int com.myspring.aop.test.*.*addition*(int))")
	public void afterReturningAdvice(JoinPoint joinPoint) {
		System.out.println("After returning from additionOf : " + joinPoint.getTarget());
	}

	@After("execution(int com.myspring..*Calculator.multiply(..))")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("After performing multiply : " + joinPoint.getTarget());
	}
}
