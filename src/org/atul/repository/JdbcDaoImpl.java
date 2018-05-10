package org.atul.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.atul.model.Circle;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcDaoImpl {
	public Circle getCircle(int circleId) {
		Connection conn=null;
		Circle circle =null;
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/learningspring?useSSL=false";
			Class.forName(driver).newInstance();
			conn=DriverManager.getConnection(url, "root", "password");
			String sql="SELECT * FROM CIRCLE WHERE ID = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, circleId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				 circle = new Circle(circleId, rs.getString("name"));
			}
			rs.close();
			ps.close();			
		}catch(Exception ex) {
			throw new RuntimeException("There was an error");
		}
		finally {
			try {
				conn.close();
			}catch(SQLException ex) {
				System.out.println("There was an sql exception..!!");
			}
		}
		return circle;
	}
}
