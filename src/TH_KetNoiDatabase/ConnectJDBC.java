package TH_KetNoiDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    // Khởi tạo báo host
    private String hostName = "localhost:3306";
    // Khởi tạo tên database
    private String dbName = "demo_jdbc";
    // Khởi tạo tên đang nhập mysql
    private String username = "root";
    // Khởi tạo mật khẩu
    private String password = "Password123#@!";
    // Kết nói đến mysql
    private String connectionURL = "jdbc:mysql://"+hostName+"/"+dbName;

    public Connection connect(){
        //Tạo đối tượng Connection
        Connection conn = null;

        try {
            //kết nối đêns database
            conn = DriverManager.getConnection(connectionURL, username, password);
            if (conn != null) {
                System.out.println("Kết nối thành công");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

}
