package TH_TruyVanJDBC;

import TH_KetNoiDatabase.ConnectJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        ConnectJDBC connectJDBC = new ConnectJDBC();
        Connection connection = connectJDBC.connect();
        String query = "SELECT * FROM users";

        //Để thực hiện truy vấn cần phải tạo Statement
        Statement stm = null;
        try {
            stm = connection.createStatement();

            ResultSet rs = stm.executeQuery(query);

            while (rs.next()){ //Di chuyển con trỏ xuống bản ghi kế tiếp
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                System.out.println(id + "-" + username + "-" + password + "-" + email);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
