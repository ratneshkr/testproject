package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectURL {

    public static void main(String[] args) {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://10.10.10.236:1433;databaseName=testing1;user=sa;password=Neosphere@123";

        try (
                Connection con = DriverManager.getConnection(connectionUrl);
                Statement stmt = con.createStatement();
            ) {
            
            String SQL = "SELECT TOP 10 * FROM dbo.customer";

            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.print(rs.getString(1) + "|");
                System.out.print(rs.getString(2) + "|");
                System.out.print(rs.getString(3) + "|");
                System.out.println(rs.getString(4));
            }
        } // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
