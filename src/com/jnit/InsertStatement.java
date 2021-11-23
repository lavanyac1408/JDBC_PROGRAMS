package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospital";
		String username="root";
		String password="root";
		Connection connection=DriverManager.getConnection(url,username,password);
		if(connection!=null)
			System.out.println("Connection established");
		Statement st=connection.createStatement();
		int x= st.executeUpdate("insert into doctor values(1030,'Dinesh','Dentist',73635279,'Delhi')");
		if(x!=0)
			System.out.println("Record inserted");

	}
}
