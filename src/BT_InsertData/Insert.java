package BT_InsertData;

import BT_ConnectData.Product_manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        Product_manager product_manager = new Product_manager();
        Connection connection = product_manager.connection();
        String query = "INSERT INTO products (name , price, detail, manufacturer , number , status)" + "VALUE (?,?,?,?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = connection.prepareStatement(query);
            pstm.setString(1, "Bung");
            pstm.setDouble(2, 2004);
            pstm.setString(3, "BungNg");
            pstm.setString(4, "VN");
            pstm.setInt(5, 4 );
            pstm.setString(6, "ConHang");
            int row = pstm.executeUpdate();
            if (row != 0){
                System.out.println("Thêm thành công!");
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
