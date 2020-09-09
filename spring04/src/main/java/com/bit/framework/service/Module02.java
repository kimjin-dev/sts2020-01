package com.bit.framework.service;

public class Module02 {
	//다형성
	ConsoleService console;
	
//	의존주입 (DI, Dependency Injection
	public Module02(ConsoleService console) {
		super();
		this.console =console;
	}
//	
//	public void setConsole(ConsoleService console) {
//		this.console = console;
//	}
	public void func01() {
		console.sayHello();
	}
	
	public void func02() {
		for(int i=0; i < 5; i++)console.sayHi();	
	}
}
