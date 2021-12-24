package DAY_23.SocketPrgrammingDemo.com.demo.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSender {

	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket(4000);
			System.out.println("sending data");
			String str="Welcome to UDP communication";
			InetAddress ip=InetAddress.getByName("127.0.0.1");
			DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,3000);
			ds.send(dp);
			Thread.sleep(30000);
			System.out.println("ending bye");
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
