package Coding;
import java.sql.*;
public class DatabaseConnection {
    
    public String URL = "jdbc:sqlserver://localhost:1433; databaseName=Icecream_parlor; user = sa; password = 123 ";
   
   // Declaring JDBC objects
//   String user="sa"; 
//   String password= "123";
   public Connection con = null;
   public ResultSet rs = null;
   public PreparedStatement pstatement = null;
   public Statement statement = null;
   
   public void DbConnect() 
   {
       //  Connection
       try {
           
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection(URL);  
           
       } catch (ClassNotFoundException | SQLException e) {
           
           System.out.print(e.toString());
       }
       
   }
   
   public boolean getUsernamePass(String user, String password)
   {
        String User="Admin"; 
        String Password= "654321";
      
       
         if(user.equals(User) )
         {
             if ( password.equals(Password)){
                 return true;
             }
         }
        
             return false;
         
   }
    
}
