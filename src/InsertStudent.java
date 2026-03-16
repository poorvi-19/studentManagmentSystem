

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertStudent {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb?useSSL=false&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "Admin0987654321";

        String sql = "INSERT INTO student(name, course, marks) VALUES (?, ?, ?)";

        try {
            // Create connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Prepare statement
            PreparedStatement ps = con.prepareStatement(sql);

            // Set values
            ps.setString(1, "Rohit");
            ps.setString(2, "BSc CS");
            ps.setInt(3, 88);

            // Execute
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record inserted successfully");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
