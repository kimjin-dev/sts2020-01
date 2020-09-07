package com.bit.framework.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.framework.emp.model.entity.EmpVo;

public class EmpDao {
		private String url="jdbc:mysql://localhost:3306/xe";
		private String user="scott";
		private String password="tiger";
		
		public EmpDao() {
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		public List<EmpVo> selectAll(){
			String sql="select * from emp";
			List<EmpVo> list= new ArrayList<>();

			try {
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt= conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					list.add(new EmpVo(
					rs.getInt("sabun"),rs.getString("name"),rs.getString("sub")
					,rs.getTimestamp("nalja"),rs.getInt("pay")
					));
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}
		public void insertOne(String name, String sub, int pay) throws SQLException {
			String sql = "insert into emp (name, sub, nalja, pay) values (?,?,now(),?)";
			try (
					Connection conn=DriverManager.getConnection(url, user, password);
					PreparedStatement pstmt = conn.prepareStatement(sql);
					){
					pstmt.setString(1, name);
					pstmt.setString(2, sub);
					pstmt.setInt(3, pay);
					pstmt.executeUpdate();
			}
		}
}
