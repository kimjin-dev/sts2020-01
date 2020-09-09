package com.bit.framework.core;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;

import com.bit.framework.model.entity.DeptVo;
import com.bit.framework.service.DeptService;

public class MainRun {

	public static void main(String[] args) throws SQLException {
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
//		Module04 module=(Module04)ac.getBean("module");
//		module.ArrayShow();
//		module.listShow();
//		module.setShow();
//		module.mapShow();
		
//		AOP(관점지향 프로그래밍,Aspect Oriented Programming)
//		Module02 module=(Module02)ac.getBean("proxyBean");
//		module.func01();
//		module.func02();
		
		DeptService deptService=(DeptService) ac.getBean("deptService");
//		for(DeptVo bean : deptService.list()) {
//			System.out.println(bean);
//		}
		deptService.insert(new DeptVo(0,"test1","test2"));
	}

}
