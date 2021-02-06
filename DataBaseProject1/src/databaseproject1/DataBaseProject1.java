
package databaseproject1;


import java.sql.*;

public class DataBaseProject1 {

  
    public static void main(String[] args)  {
     
        DataBaseProject1 db = new DataBaseProject1();
        db.createConnection();
                
    }
    
    void createConnection() {
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/students?useSSL=false", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from students_details where Address = 'Kerala' ");
           
            while(rs.next()){
                
            String stu_id = "";
            String stu_name = "";
            String Address = "";
            String age = "";
            String contact = "";
            
            stu_id = Integer.toString(rs.getInt("stu_id"));
                   System.out.print(stu_id ); 
            stu_name = rs.getString( "stu_name");
                   System.out.print( " " + stu_name);
            Address = rs.getString("Address");
                  System.out.print( " " + Address);
            age = Integer.toString(rs.getInt("age")) ;
                  System.out.print( " " + age);
            contact = Integer.toString(rs.getInt("contact"));
                  System.out.print( " " + contact); 
            
                  System.out.println();
            }
            
            
                  
                  
            stmt.close();
            con.close();
            
        }catch(ClassNotFoundException es){
            System.out.println(es);
        }catch(SQLException ex){
            System.out.println(ex);
        }
          
       
    }
    
   
   
}
