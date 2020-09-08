package com.bit.framework.dept.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.bit.framework.dept.model.entity.DeptVo;

public class DeptDaoImpl extends JdbcDaoSupport implements DeptDao{

	@Override
	public List<DeptVo> selectAll() throws SQLException {
		String sql="select * from dept";
		return getJdbcTemplate().query(sql, new RowMapper<DeptVo>() {

			@Override
			public DeptVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new DeptVo(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
			}
			
		});
	}

	@Override
	public void insertOne(DeptVo bean) throws SQLException {

	}

	@Override
	public DeptVo selectOne(int key) throws SQLException {
		
		return null;
	}

	@Override
	public int updateOne(DeptVo bean) throws SQLException {
		
		return 0;
	}

	@Override
	public int deleteOne(int key) throws SQLException {
		
		return 0;
	}

}
