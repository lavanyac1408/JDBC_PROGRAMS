package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdatePreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospital";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("Connection established");
		PreparedStatement ps=connection.prepareStatement("update doctor set doctor_location=? where doctor_id=?");
		ps.setString(1,"Pune");
		ps.setInt(2, 1026);
		
		int x=ps.executeUpdate();
		if (x!=0)
			System.out.println("Record updated");

	}

}
