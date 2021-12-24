package DAY_23.SocketPrgrammingDemo.com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ClientClass {

	public static void main(String[] args) {
		try {
			Socket cs1=new Socket("localhost",6262);
			
			DataInputStream dis=new DataInputStream(cs1.getInputStream());
			DataOutputStream dos=new DataOutputStream(cs1.getOutputStream());
			System.out.println("Client Listend :"+dis.readUTF());
			Scanner sc=new Scanner(System.in);
			//send data to server
			System.out.println("Client : ");
			String s=sc.next();
			dos.writeUTF(s);
			//reading data from server
			System.out.println("server : "+dis.readUTF());
			cs1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
