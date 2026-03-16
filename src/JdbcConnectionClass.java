
import java.sql.*;

public class JdbcConnectionClass {
        private String url = "jdbc:mysql://localhost:3306/studentdb";
        private String user = "root";
         private String password = "Admin0987654321";
        
         Statement statement;
         Connection connection ;
        

  JdbcConnectionClass(){  

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement=connection.createStatement();
         // System.out.println("Connected Successfully");

        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }

  }

}



