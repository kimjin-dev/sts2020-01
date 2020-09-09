package com.bit.framework.service;

import java.util.List;

public class Module04 {
	String[] arr1;
	List<String> list;
	public void setArr1(String[] arr1) {
		this.arr1=arr1;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void ArrayShow() {
		for(String msg:arr1)System.out.println(msg);
	}
	
	public void listShow() {
		for(String msg:list)System.out.println(msg);
	}
}
