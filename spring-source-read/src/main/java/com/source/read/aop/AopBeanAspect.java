package com.source.read.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * <p>
 *
 * </p>
 *
 * @author zhāngshìchāng
 * @date 2021/4/2 9:24 上午
 */
@Aspect
@Component
public class AopBeanAspect {

	@Pointcut("execution(* com.source.read.aop..*.*(..))")
	public void pointcut(){}


	@Before(value = "pointcut()")
	public void before() {
		System.out.println("before 方法执行.........");
	}

	@After(value = "pointcut()")
	public void after() {
		System.out.println("after 方法执行.........");
	}

	@AfterReturning(pointcut = "pointcut()", returning = "ret")
	public void afterReturning(Object ret) {
		System.out.println("afterReturning 方法执行.........");
	}


	public void xx() {

	}

}
