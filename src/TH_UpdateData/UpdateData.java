package TH_UpdateData;

import TH_KetNoiDatabase.ConnectJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
    public static void main(String[] args) {
        //Truy vấn dữ liệu ra
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();
        //Câu lệnh truy vấn mysql
        String query = "UPDATE users SET password = ? WHERE id = ?";
        //Khởi tạo PreparedStatement do truy vấn tham sô động
        PreparedStatement pstm = null;
        try {
            //Gán giá trị cho các tham số của đối tượng PreparedStatement với id là 5
            pstm = connection.prepareStatement(query);

            pstm.setString(1,"bichthuan123");
            pstm.setInt(2,5);
            int row = pstm.executeUpdate();

            if(row != 0){
                System.out.println("Cập nhật thành công " + row);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
