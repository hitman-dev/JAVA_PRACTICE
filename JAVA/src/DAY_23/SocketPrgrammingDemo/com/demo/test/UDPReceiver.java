package DAY_23.SocketPrgrammingDemo.com.demo.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPReceiver {

	public static void main(String[] args) {
		try {
			DatagramSocket ds=new DatagramSocket(3000);
			byte[] buf=new byte[1024];
			//InetAddress ip=InetAddress.getByName("127.0.0.1");
			DatagramPacket dp=new DatagramPacket(buf,1024);
			ds.receive(dp);
			String s=new String(dp.getData(),0,dp.getLength());
			System.out.println("Message: "+s);
			System.out.println("ending bye");
			ds.close();
		}catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
