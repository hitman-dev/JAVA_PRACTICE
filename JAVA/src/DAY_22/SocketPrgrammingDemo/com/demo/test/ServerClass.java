package DAY_22.SocketPrgrammingDemo.com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerClass {
	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(6262);
			System.out.println("Server is waiting for client");
			Socket cs=ss.accept();
			DataInputStream dis=new DataInputStream(cs.getInputStream());
			DataOutputStream dos=new DataOutputStream(cs.getOutputStream());
			dos.writeUTF("Server says : Hello");
			Scanner sc=new Scanner(System.in);
			//read from client
			System.out.println("client: "+dis.readUTF());
			//write to client
			System.out.println("server: ");
			String str=sc.next();
			dos.writeUTF(str);
			cs.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
