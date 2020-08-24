package com.antra1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCEx2 {
	
	public static void main(String[] args) throws SQLException {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("please enter emp id");
		int id=sc.nextInt();
		System.out.println("please enter the name");
		String name=sc.next();
		System.out.println("please enter sal");
		int sal=sc.nextInt();*/
		
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/system","root","manas");
		con.setAutoCommit(false);
		try {
		
		PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?)");
		
		pstmt.setInt(1, 4);
		pstmt.setString(2, "Elif");
		pstmt.setInt(3, 934);
		pstmt.addBatch();
		
		pstmt.setInt(1, 2);
		pstmt.setString(2, "Chang");
		pstmt.setInt(3, 912);
		pstmt.addBatch();
		
		pstmt.setInt(1, 5);
		pstmt.setString(2, "Drake");
		pstmt.setInt(3, 433);
		pstmt.addBatch();
		
		pstmt.executeBatch();
		con.commit();
		}catch(Exception e) {
			con.rollback();
			System.out.println(e);
			
		}finally {
			con.close();
		}
	}

}
