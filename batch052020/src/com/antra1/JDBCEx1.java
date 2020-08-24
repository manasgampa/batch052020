package com.antra1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Logger;



public class JDBCEx1{

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("please enter emp id");
		int id=sc.nextInt();
		System.out.println("please enter the name");
		String name=sc.next();
		System.out.println("please enter sal");
		int sal=sc.nextInt();*/
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		Statement stmt=con.createStatement();
		//stmt.executeUpdate("insert into emp values("+id+","+"'"+name+"'"+","+sal+")");
		ResultSet rs=stmt.executeQuery("select * from emp");
		
		/*ResultSetMetaData rsmd=rs.getMetaData();
		int columCount=rsmd.getColumnCount();
		System.out.println(columCount);
		
		System.out.println(rsmd.getColumnName(1));
		
		System.out.println(rsmd.getColumnTypeName(2));
		*/
		/*while(rs.next()) {
			
			System.out.println(rs.getInt("ID"));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}*/
		
		con.close();
		
		
		
		
		//Driver d=new oracle.jdbc.driver.OracleDriver();
		//Driver d=new com.mysql.jdbc.Driver();
		//DriverManager.registerDriver(d);
		//new oracle.jdbc.driver.OracleDriver();
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		//DriverManager.registerDriver(d);
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		//System.out.println(con);
	}

	
}
