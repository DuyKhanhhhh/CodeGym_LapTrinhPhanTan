package TH_GuiNhanTinNhanUDP;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            //Tao lop Datagram để liên kết đến máy chủ
            DatagramSocket clientSocket = new DatagramSocket();
            //Tạo mảng chứa byte cần gửi
            byte[] senData;
            byte[] receiveData = new byte[1024];
            //Lấy địa chỉ ip cúa server
            InetAddress severIP = InetAddress.getByName("localhost");
            // CHuẩn bị gửi dữ liệu đi
            String message = "Heloo, server!";
            senData = message.getBytes();
            //Tạo đối tượng DatagramPacket để đẩy gói tin sang server
            DatagramPacket sendPacket = new DatagramPacket(senData, senData.length, severIP,8888);
            //Chuyển gói tin đến server
            clientSocket.send(sendPacket);
            //Tạo đối tượng DatagramSocket nhẫn dữ liệu từ server
            DatagramPacket receivePacket = new DatagramPacket(receiveData,receiveData.length);
            //Nhận gói tin từ server
            clientSocket.receive(receivePacket);
            //Chuyển đổi dữ liệu thành dạng chuỗi
            String responseMessage = new String(receivePacket.getData(),0,receivePacket.getLength());
            System.out.println("Received from server: " + responseMessage);
            clientSocket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
