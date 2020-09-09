package com.bit.framework.service;

import java.sql.SQLException;
import java.util.List;

import com.bit.framework.model.entity.DeptDao;
import com.bit.framework.model.entity.DeptVo;

public class DeptService01Impl implements DeptService {
	DeptDao deptDao;
	
	public void setDeptDao(DeptDao deptDao) {
		this.deptDao = deptDao;
	}
	public List<DeptVo> list() throws SQLException {
		
		return deptDao.selectAll();
	}

	public DeptVo detail(int deptno) throws SQLException {

		return null;
	}
	
	public void insert(DeptVo bean) throws SQLException{
		deptDao.insertOne(bean);
		for(DeptVo bean2 : list()) {
		System.out.println(bean2);
		}
	}
}
