package TH_InsertData;

import TH_KetNoiDatabase.ConnectJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();
        String query = "INSERT INTO users(username, password, email)" + "VALUE (?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = connection.prepareStatement(query);
            //Gán giá trị cho đối tượng prepareStatement
            pstm.setString(1, "Do Bich Thuan");
            pstm.setString(2, "123456789");
            pstm.setString(3, "thuan.do@codegym.vn");
            //Thực thi truy vấn và hàng bị tác động
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
