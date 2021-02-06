package com.DemoApp2;

import java.sql.*;
import java.io.*;
public class JDBC_RetireveFiles {
	
	public static void main(String[] args) {
		
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imagetable?useSSL=false","root","root");
				
				
				PreparedStatement stmt = con.prepareStatement("select * from filetable");
				ResultSet rs = stmt.executeQuery();
				rs.next();
				
				
				Clob c = rs.getClob(1);
				
				Reader read = c.getCharacterStream();
				
				FileWriter fw = new FileWriter("E://file1.txt");
				
				int i;
				
				while((i=read.read())!= -1) {
					
					fw.write((char)i);
				}
				
				con.close();
				System.out.println("Operation successfully");
				
				
				
		}catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}catch(SQLException es) {
			System.out.println(es);
		}catch(IOException io) {
			System.out.println(io);
		}
		
	}

}
