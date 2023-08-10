package BT_UpdateData;

import BT_ConnectData.Product_manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) throws SQLException {
        Product_manager product_manager = new Product_manager();
        Connection connection = product_manager.connection();
        String query = "UPDATE products SET number = 20 , status = 'Conn Hang' WHERE id = 6";
        Statement statement = null;
        statement = connection.createStatement();
        int row = statement.executeUpdate(query);

        if(row != 0){
            System.out.println("Cập nhật thành công " + row);
        }
        connection.close();
    }
}
