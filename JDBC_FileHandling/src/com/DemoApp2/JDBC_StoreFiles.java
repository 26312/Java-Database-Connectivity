package com.DemoApp2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_StoreFiles {
public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imagetable?useSSL=false","root","root");
			
			PreparedStatement stmt = con.prepareStatement("insert into filetable value(?,?)");
			
			File f = new File("D:\\invent.txt"); 
			
			FileReader fr= new FileReader(f);
			
			stmt.setInt(1, 102);
			stmt.setCharacterStream(2,fr,(int) f.length());// setCharacterStream() method of PreparedStatement is used to set character information into the parameterIndex
														// 	
			int i = stmt.executeUpdate();
			
			System.out.println(i + " Record Affected");
			
		}catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}catch(SQLException es) {
			System.out.println(es);
		}catch(FileNotFoundException ef) {
			System.out.println(ef);
		}catch(IOException io) {
			System.out.println(io);
		}
}
}
