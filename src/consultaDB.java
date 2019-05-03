
import java.sql.*;
public class consultaDB{
    public static void main(String[] args) {
        consultaDB consultaDB = new consultaDB();
        consultaDB.connectDatabase(); 
    } 
    public void connectDatabase() {
        try {
            // We register the MySQL (MariaDB) driver
            // Registramos el driver de MySQL (MariaDB)
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de MySQL: " + ex);
            }
            Connection connection = null;
            // Database connect
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/reservas","root", "");
            boolean valid = connection.isValid(50000);
            System.out.println(valid ? "TEST OK" : "TEST FAIL");
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
        }
    }  
}
   