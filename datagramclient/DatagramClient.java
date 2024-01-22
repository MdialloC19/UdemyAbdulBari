package datagramclient;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket(2001);

        String msg="Hello my dear si ";
        //Sending data to the server
        DatagramPacket dp=new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"),2000);
        ds.send(dp);

        //Receiving data from server
        byte b[]=new byte[1024];
        dp=new DatagramPacket(b, 1024);
        ds.receive(dp);
        String msg1=new String(dp.getData()).trim();

        System.out.println("From server "+msg1);
        ds.close();
    }

}
class Server{

    public static void main(String[] args) throws Exception {
        
        DatagramSocket ds=new DatagramSocket(2000);

        byte b[]=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,1024);
        ds.receive(dp);
        String msg=new String(dp.getData()).trim();
        System.out.println("From Client "+msg);
        StringBuilder sb=new StringBuilder(msg);
        sb.reverse();
        msg=new String(sb);

        dp=new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"),2001);
        ds.send(dp);

        ds.close();
    }
}