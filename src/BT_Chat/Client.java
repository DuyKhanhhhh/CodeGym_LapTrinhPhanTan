package BT_Chat;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket clientSocket = new DatagramSocket();
        String ipAddress = "localhost";
        int port = 8080;
        byte[] receiveData = new byte[1024];
        byte[] sendData;
        while (true){
           Scanner sc = new Scanner(System.in);
           System.out.print("Nhập Tin nhắn: ");
           String message = sc.nextLine();
           if(message.equalsIgnoreCase("out")){
               clientSocket.close();
               break;
           }

           sendData = message.getBytes();

           DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, InetAddress.getByName(ipAddress),port);
           clientSocket.send(sendPacket);

            //Tạo đối tương datagramPacket để nhận gói từ server
            DatagramPacket datagramPacket = new DatagramPacket(receiveData, receiveData.length);
            //lấy dữ liệu của server
            clientSocket.receive(datagramPacket);
            //Chuyển sang dangj chuỗi
            String messageSt = new String(datagramPacket.getData(), 0,  datagramPacket.getLength());
            System.out.print("Server: " + messageSt);

       }
    }
}
