package com.bit.framework.util;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeModule02 implements MethodBeforeAdvice {
/*
module 동작 전 작동....
func01
[]매개변수를 배열로 전달
com.bit.framework.service.Module02@12cdcf4 어떤 객체에서 수행됨?
//		System.out.println(method.getName());
//		System.out.println(args.toString());
//		System.out.println(target);
	if(method.getName().equals("func01")) {
		특정 매서드에서만 실행하고자 할 떄
	}
~~~~서비스~~~~~~
 */
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("module 동작 전 작동....");
		
	}

}
