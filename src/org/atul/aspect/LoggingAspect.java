package org.atul.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Before("execution(* get*())")
	public void beforeLoggingAdvice() {
		System.out.println("Before Logging Advice..!!");
	}
	
	@After("execution(* get*())")
	public void AfterLoggingAdvice() {
		System.out.println("After Logging Advice..!!");
	}
	
	@Around("execution(* get*())")
	public void aroundLoggingAdvice() {
		System.out.println("Around Logging Advice..!!");
	}
	
	@Pointcut("execution(* get*())")
	public void allGettersProxyMethod() {	
	}
}
