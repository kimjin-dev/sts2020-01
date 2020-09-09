package com.bit.framework.model.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;

public class DeptDao02Impl implements DeptDao {
	JdbcTemplate jdbcTemplate;
	private RowMapper rowMapper=new RowMapper<DeptVo>() {

		public DeptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new DeptVo(rs.getInt(1),rs.getString(2),rs.getString(3));
		}

	};
			
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public List<DeptVo> selectAll() throws SQLException {
		final String sql="select * from dept order by deptno desc";
		PreparedStatementCreator psc =null;
		
		psc=new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				return conn.prepareStatement(sql);
			}
		};
		return jdbcTemplate.query(psc, rowMapper);
	}

	public DeptVo selectOne(int key) throws SQLException {
	
		return null;
	}

	public void insertOne(DeptVo bean) throws SQLException {

	}

	public int updateOne(DeptVo bean) throws SQLException {

		return 0;
	}

	public int deleteOne(int key) throws SQLException {
	
		return 0;
	}

}
