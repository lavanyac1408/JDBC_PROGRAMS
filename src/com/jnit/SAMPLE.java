package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SAMPLE {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/hospital";
			String username="root";
			String password="root";
			Connection connection=DriverManager.getConnection(url,username,password);
			if(connection!=null)
				System.out.println("Connection established");
			
			Statement st=connection.createStatement();
			 	ResultSet rs=st.executeQuery("select * from doctor");
			 	while(rs.next()) {
			 		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));
			 	}
	}

}
