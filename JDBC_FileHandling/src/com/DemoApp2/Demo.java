package com.DemoApp2;


import java.sql.*;

public class Demo {
	
	
	public static void main(String[] args) throws Exception
	{			
		Demo dm = new Demo();
		createConnection cc = new createConnection();
		cc.createConnection();
		cc.createDataBase();
		cc.createTable();

	}

}

class createConnection {
	Connection con;
	Connection con2;
	String dbname = "Library";
	
	
		void createConnection() {
		
			try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306?useSSL=false", "root", "root");
					}catch(ClassNotFoundException ex) {
						System.out.println(ex);
					}catch(SQLException sqles) {
						System.out.println(sqles);
					}
			System.out.println("Connection Made");
		
		
		}
		
		void createDataBase() {
			
			try {
					
					String createdb = "create database if not exists "+ dbname;
					PreparedStatement stmt = con.prepareStatement(createdb);
					stmt.execute();
			
				}catch(SQLException sqlex) {
					System.out.println(sqlex);
				}
			System.out.println("DataBase " + dbname + " Created Successfully ");
		}
		
		
		void createTable() {
			
			try{
					String tableName = "Library_details";
					con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dbname+"?useSSL=false", "root", "root");
					
					String createTable = "create table if not exists "+ tableName +"("
							+ "book_id int not null unique auto_increment,"
							+ "book_name varchar(30),"
							+ "book_title varchar(30),"
							+ "book_author varchar(30));";
					
					Statement stmt = con2.createStatement();
					stmt.execute(createTable);
					
					System.out.println("Table" + tableName + "Created Successully");
					stmt.close();
					
					
			}catch(SQLException es) {
				System.out.println(es);
			}
			
			
		}
		
		
}

		

			
			
			
			
	






















