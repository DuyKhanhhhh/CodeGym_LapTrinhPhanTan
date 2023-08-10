package TH_DeleteData;

import TH_KetNoiDatabase.ConnectJDBC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) throws SQLException {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();

        String query = "DELETE FROM users WHERE id = ?";

        PreparedStatement pstm = null;
        pstm = connection.prepareStatement(query);
        pstm.setInt(1,5);
        int row = pstm.executeUpdate();
        if (row != 0){
            System.out.println("Xóa thành công " + row);
        }
        connection.close();
    }
}
