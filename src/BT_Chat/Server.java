package BT_Chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket dataSocket = new DatagramSocket(8080);
        System.out.println("Server is running...");
        byte[] receiveData = new byte[1024];
        byte[] sendData;
        while (true) {
            //Tạo đối tương datagramPacket để nhận gói từ client
            DatagramPacket datagramPacket = new DatagramPacket(receiveData, receiveData.length);
            //lấy dữ liệu của client
            dataSocket.receive(datagramPacket);
            //Chuyển sang dangj chuỗi
            String message = new String(datagramPacket.getData(), 0,  datagramPacket.getLength());
            System.out.println("Client: " + message);

            //Lấy IP của client
            InetAddress clientIpAddress = datagramPacket.getAddress();
            //Lấy port của client
            int clientPort = datagramPacket.getPort();

            //Lấy chuỗi dữ liệu nhập vào
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập Tin Nhắn: ");
            String inputMessage = sc.nextLine();
            if(message.equalsIgnoreCase("out")){
                dataSocket.close();
                break;
            }
            //Đổi chuỗi dữ liệu sang dạng byte
            sendData = inputMessage.getBytes();
            //Tạp datagramPacket để gửi dữ liệu sang client
            DatagramPacket sendDataPacket = new DatagramPacket(sendData, sendData.length, clientIpAddress, clientPort);
            //Gửi dữ liệu sang client
            dataSocket.send(sendDataPacket);
        }
    }
}
