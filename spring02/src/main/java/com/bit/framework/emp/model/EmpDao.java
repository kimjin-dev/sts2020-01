package com.bit.framework.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.framework.emp.model.entity.EmpVo;

public class EmpDao extends JdbcDaoSupport {

	public EmpDao() {
	}
	
	public List<EmpVo> selectAll() throws SQLException{
		String sql="select * from emp";
		
		return getJdbcTemplate().query(sql, new RowMapper<EmpVo>() {

			@Override
			public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new EmpVo(
						rs.getInt("sabun"),rs.getString("name"),rs.getString("sub")
						,rs.getTimestamp("nalja"),rs.getInt("pay")
						);
			}
			
		});
	}

	public void insertOne(String name, String sub, int pay) throws SQLException {
		String sql = "insert into emp (name, sub, nalja, pay) values (?,?,now(),?)";
		Object[] params=new Object[] {name,sub,pay};
		getJdbcTemplate().update(sql, params);
	}

	public EmpVo selectOne(int sabun) throws SQLException {
		String sql="select * from emp where sabun=?";
		return getJdbcTemplate().queryForObject(sql, new Object[] {sabun}, new RowMapper<EmpVo>() {

			@Override
			public EmpVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new EmpVo(
						rs.getInt("sabun"),rs.getString("name"),rs.getString("sub")
						,rs.getTimestamp("nalja"),rs.getInt("pay")
						);
			}
			
		});
	}

	public int updateOne(int sabun, String name, String sub, int pay) throws SQLException {
		String sql="update emp set name=?,sub=?,pay=? where sabun=?";
		return getJdbcTemplate().update(sql, new Object[] {name, sub, pay, sabun});
	}
	
	public int deleteOne(int sabun) {
		String sql = "delete from emp where sabun=?";
		return getJdbcTemplate().update(sql, new Object[] {sabun});
	}
}
