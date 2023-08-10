package BT_Query;

import BT_ConnectData.Product_manager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {
    public static void main(String[] args) throws SQLException {
        Product_manager product_manager = new Product_manager();
        Connection connection = product_manager.connection();
        String query = "SELECT * FROM products ";
        Statement statement = null;
        statement = connection.createStatement();
        int row = statement.executeUpdate(query);

        if(row != 0){
            System.out.println("Truy Vấn thành công" + row);
        }
        connection.close();
    }
}
