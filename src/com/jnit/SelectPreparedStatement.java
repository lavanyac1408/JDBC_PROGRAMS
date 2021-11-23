package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospital";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("Connection established");
		
		PreparedStatement ps=connection.prepareStatement("select from doctor where doctor_id=?");
			ps.setInt(1, 1023);
			System.out.println("Record selected");
		ResultSet rs=ps.executeQuery();
		System.out.println(ps.execute());
			}
	
		}
	}