package com.bit.framework.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.bit.framework.service.Module02;
import com.bit.framework.service.Module03;
import com.bit.framework.service.Module04;

public class MainRun {

	public static void main(String[] args) {
//		// Ioc(제어의 역전, Inversion of Control)
//		
//		Module02 module=new Module02(new KorConsoleService());
//		//module.setConsole(new EngConsoleService());
//		module.func01();
//		module.func02();
		
		ApplicationContext ac=null;
//		ac=new FileSystemXmlApplicationContext("C:\\Jworkspace\\sts2020\\spring04\\src\\main\\resources\\applicationContext.xml");
//		ac=new FileSystemXmlApplicationContext(".\\src\\main\\resources\\applicationContext.xml");
//		ac=new GenericXmlApplicationContext(".\\applicationContext.xml");
		ac=new org.springframework.context.support.ClassPathXmlApplicationContext("/applicationContext.xml");
//		Module02 module=(Module02)ac.getBean("module02");
//		module.func01();
//		module.func02();
		
//		Module03 module=(Module03) ac.getBean("module03");
//		System.out.println(module);
		Module04 module=(Module04)ac.getBean("module");
		module.ArrayShow();
		module.listShow();
		module.setShow();
		module.mapShow();
	}

}
