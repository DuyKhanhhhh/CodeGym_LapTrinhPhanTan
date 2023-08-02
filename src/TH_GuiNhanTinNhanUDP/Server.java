package TH_GuiNhanTinNhanUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        //Tạo đối tượng DatagramSocket để liên kết với port 8888
        DatagramSocket severSocket = new DatagramSocket(8888);
        //Tạo mảng byte để nhận dữ liệu từ gói tin nhận được
        byte[] receiveData = new byte[1024];
        byte[] sendData;
        while (true) {
            //Tạo đối tượng datagramPacket để nhận gói tin từ client
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            //Nhận gói tin từ client
            severSocket.receive(receivePacket);
            //CHuyển đổi sang dạng chuỗi
            String message = new String(receivePacket.getData(),0,receivePacket.getLength());
            System.out.println(message);


            //Lay Ip từ cilent
            InetAddress clientIP = receivePacket.getAddress();
            //Lay Ip từ cồng
            int clientPort = receivePacket.getPort();

            //Chuẩn bị gửi dữ liệu đi
            String responseMessage = "Hello Center!!";
            sendData = responseMessage.getBytes();
            //Tao datapacket để gửi gói tin đến client
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIP, clientPort);
            //Gửi tin đến client
            severSocket.send(sendPacket);
        }
    }
}
