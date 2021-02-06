package com.DemoApp2;

import java.sql.*;
import java.io.*;

public class JDBC_RetrieveImage{
	
	public static void main(String[] args){

		try{	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/imagetable?useSSL=false","root","root");
						
			
			PreparedStatement stmt = con.prepareStatement("select * from imgtable");
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()){
				
				Blob b = rs.getBlob(2);// Image is in cloumn 2 of the database, hence 2
				byte barr[] = b.getBytes(1, (int) b.length()); // 1->represents the first image; b.length()->represents the array bytes of the images
									// Images in database are stored in bytes format.
									// here the image is being called using getBytes() method which in turn will call the array of information of the 									// image file

				
				
				FileOutputStream fout = new FileOutputStream("E://Hobooo.jpeg");
				fout.write(barr);
				fout.close();
				con.close();
				System.out.println("Image Written, OK!!");
			}

		}catch(ClassNotFoundException ex){
			System.out.println(ex);
		}catch(SQLException es){
			System.out.println(es);
		}catch(FileNotFoundException fno){
			System.out.println(fno);
		}catch(IOException io){
			System.out.println(io);
		}
			

	}



}
