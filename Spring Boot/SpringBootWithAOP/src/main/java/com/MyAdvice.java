package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
	@Pointcut("execution(public void com.Employee.*(..))")
	public void point() {
		
	}
	
	//@Before("execution(public void com.Employee.display(..))")
	//@Before("execution(public void com.Employee.*(..))")
	/*@Before("point()")
	public void beforeLogic(JoinPoint pp) {
		System.out.println(" "+pp.getSignature());
		System.out.println("Before Business Logic execute");
	}
	
	@After("point()")
	public void aferLogic() {
		System.out.println("After business logic execute");
	}*/
	/*@Around("point()")
	public void aroundAdviceLogic(ProceedingJoinPoint jp) {
		System.out.println("Before Actual Business Logic");
		try {
			jp.proceed();	
		} catch (Throwable e) {
			// TODO: handle exception
		}
		System.out.println("After Actual Business Logic");
		
	}*/
	/*@AfterThrowing("point()")
	public void executeCodeWhenException() {
		System.out.println("Code Execute When exeception generate");
	}*/
	
	@AfterReturning("point()")
	public void afterReturn() {
		System.out.println("After returning");
	}
}
