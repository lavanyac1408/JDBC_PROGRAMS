package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospital";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("Connection established");
		
		PreparedStatement ps=connection.prepareStatement("insert into doctor values(?,?,?,?,?)");
		ps.setInt(1,1032);
		ps.setString(2, "Siri");
		ps.setString(3, "ENT");
		ps.setInt(4, 4537352);
		ps.setString(5, "Delhi");
		int x=ps.executeUpdate();
		if (x!=0)
			System.out.println("Record inserted");

	}
}

