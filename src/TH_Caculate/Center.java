package TH_Caculate;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Center {
    public static void main(String[] args) throws IOException {
        // Tạo đối tượng DatagramSocket để gửi và nhận dữ liệu qua giao thức UDP
        DatagramSocket ds = new DatagramSocket();
        // Lấy địa chỉ IP localhost
        InetAddress ip = InetAddress.getLocalHost();
        //Khởi tạo một đối tượng Scanner để đọc đầu vào từ người dùng
        Scanner sc = new Scanner(System.in);
        byte [] buf= null;
        while (true){
            System.out.print("Nhập phép tính theo định dạng: ");
            System.out.println("'số_hạng_1 toán_tử số_hạng_2'");
            String inp = sc.nextLine();
            //Đọc phép tính từ người dùng

            buf = inp.getBytes();
            //Chuyển đôi chuỗi phép tính thành dạng byte để gửi đi

            DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1234);
            //Tạo DatagramPacket để gửi dữ liệu đến server port(1234)

            ds.send(DpSend);
            //Gửi dữ liệu đến server

            if (inp.equals("out")){
                break;
            }
            //Nếu người dùng nhập out thì thoát khỏi vòng lặp

            buf = new byte[65535];
            DatagramPacket DpReceive = new DatagramPacket(buf, buf.length);
            //Tạo DatagramPacket mới để nhận dữ liêu từ server

            ds.receive(DpReceive);
            //Nhận gói dữ liệu từ server

            String result = new String(DpReceive.getData(), DpReceive.getOffset(), DpReceive.getLength());
            //Chuyển dữ liệu sang kiểu chuỗi

            System.out.println("Kết quả = " + result);
            //Hiện thi kết quả từ máy chủ
        }
        ds.close();
    }
}
