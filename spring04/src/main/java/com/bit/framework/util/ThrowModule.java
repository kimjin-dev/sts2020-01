package com.bit.framework.util;

import org.springframework.aop.ThrowsAdvice;

public class ThrowModule implements ThrowsAdvice {
	 public void afterThrowing(Exception ex) { //인자값을 어떻게 주냐에 따라 내가 원하는 입세션에 실행되게 할 수도 있다.
		 System.out.println("module 수행시 exception 발생..."+ex.toString());
	 }

}
