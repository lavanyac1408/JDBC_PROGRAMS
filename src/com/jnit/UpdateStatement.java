package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospital";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("Connection established");
		Statement st=connection.createStatement();
		int x= st.executeUpdate("update doctor set doctor_name='John', doctor_specialisation='Cardiac' where doctor_id in(1026,1030)");
		if(x!=0)
			System.out.println("Record update");

	}
}
