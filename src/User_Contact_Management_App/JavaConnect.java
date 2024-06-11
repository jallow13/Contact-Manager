package User_Contact_Management_App;
import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {
     Connection connection;

    public static Connection connecrDb() {
        try {
            
            String url = "jdbc:mysql://localhost:3306/phonebook?serverTimezone=UTC"; 
            String user = "root"; 
            String pass = "Open2000jallow";
          
           // Class.forName("com.mysql.cj.jdbc.Driver");
           
            Connection connection = DriverManager.getConnection(url, user, pass);
            return connection;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
