package BT_ConnectData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Product_manager {
    private String hostName = "localhost:3306";
    private String dbName = "product_manager_database";
    private String username = "root";
    private String password = "Password123#@!";
    private String connectionURL = "jdbc:mysql://" + hostName + "/" + dbName;

    public Connection connection (){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionURL, username,password);
            if (connection != null) {
                System.out.println("Kết nối thành công");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
