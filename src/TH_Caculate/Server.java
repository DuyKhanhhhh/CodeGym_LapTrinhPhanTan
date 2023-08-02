package TH_Caculate;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.StringTokenizer;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(1234);
        //Tao đối tượng datagramSocket để nhận dữ liệu  qua giao thức UDP (Port 1234)
        byte[] buf;
        DatagramPacket DpReceive;
        DatagramPacket DpSend;

        while (true){
            buf = new byte[65535];
            //Tạo mảng byte để lưu dữ liệu nhận được

            DpReceive = new DatagramPacket(buf, buf.length);
            //Tạo DatagramPacket để nhận dữ liệu từ client

            ds.receive(DpReceive);
            //Nhận gói từ client

            String inp = new String(DpReceive.getData(), DpReceive.getOffset(), DpReceive.getLength());
            //Chuyển đôi mảng byte thành chuỗi

            System.out.println("Phép tính nhận được: " + inp);

            if (inp.equals("out")){
                System.out.println("Client gửi lệnh 'out'.....ĐANG THOÁT");
                break;
            }
            int result;
            StringTokenizer st = new StringTokenizer(inp);
            // Tách chuỗi phép tính thành số hạng 1, toán tử, và số hạng 2
            int oprnd1 = Integer.parseInt(st.nextToken());
            String operation = st.nextToken();
            int oprnd2 = Integer.parseInt(st.nextToken());

            if (operation.equals("+")){
                result = oprnd1 + oprnd2;
            }else if (operation.equals("-")){
                result = oprnd1 - oprnd2;
            }else if (operation.equals("*")){
                result = oprnd1 * oprnd2;
            }else
                result = oprnd1 / oprnd2;

            System.out.println("Đang gửi kết quả");
            String res = Integer.toString(result);
            buf = res.getBytes();
            //Chuyển đổi kết quả thannf mảng byte
            int port = DpReceive.getPort();
            //Lấy port của center
            DpSend = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), port);
            //DatagramPacket để gửi kết quả về Center
            ds.send(DpSend);
            //Gửi kết quả về center đã lấy
        }
        ds.close();
        //Đóng kết nói khi thoải khỏi vòng lặp
    }
}
