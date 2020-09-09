package com.bit.framework.service;

public class Module03 {
	int sabun;
	double su2;
	String name;
	boolean tf;
	char ch;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public double getSu2() {
		return su2;
	}
	public void setSu2(double su2) {
		this.su2 = su2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isTf() {
		return tf;
	}
	public void setTf(boolean tf) {
		this.tf = tf;
	}
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	@Override
	public String toString() {
		return "Module03 [sabun=" + sabun + ", su2=" + su2 + ", name=" + name + ", tf=" + tf + ", ch=" + ch + "]";
	}
	
	
}
