package com.DemoApp2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
public class JDBC_StoreImages {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imagetable?useSSL=false","root","root");
			
			PreparedStatement stmt = con.prepareStatement("insert into imgtable value(?,?)");
			stmt.setString(1, "Hobooo");
			
			FileInputStream fin = new FileInputStream("D://Pictures/wallpaper1.jpg");
			
			stmt.setBinaryStream(2, fin, fin.available() );
			
			int i = stmt.executeUpdate();
			
			System.out.println(i + "recorded affected");
			
			con.close();
			
		}catch(ClassNotFoundException ex) {
			System.out.println(ex);
		}catch(SQLException es) {
			System.out.println(es);
		}catch(FileNotFoundException ef) {
			System.out.println(ef);
		}catch(IOException io) {
			System.out.println(io);
		}

//NOTE
//		When trying to insert data which is larger than the specified column logo.
//
//		Then use following data types as per requirements
//
//		TINYBLOB   :     maximum length of 255 bytes  
//		BLOB       :     maximum length of 65,535 bytes  
//		MEDIUMBLOB :     maximum length of 16,777,215 bytes  
//		LONGBLOB   :     maximum length of 4,294,967,295 bytes  
//		
// 		**For this java file dataType of longblob in mySQL has been used
		
	}

}
