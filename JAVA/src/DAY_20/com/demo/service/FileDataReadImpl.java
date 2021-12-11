package DAY_20.com.demo.service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDataReadImpl implements FileDataRead {

	@Override
	public void writeData() {
		Scanner sc=new Scanner(System.in);
		//for(int i=0;i<3;i++) {
			System.out.println("enetr id");		
			int id=sc.nextInt();
			System.out.println("enetr name");		
			String name=sc.next();
			System.out.println("enetr sal");
			double sal=sc.nextDouble();
			try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("employee.txt"));){
				dos.writeUTF(id+","+name+","+sal+"\n");
				
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		//}
		
	}

	@Override
	public void readData() {
		try(DataInputStream dis=new DataInputStream(new FileInputStream("employee.txt"))){
			
			String s=dis.readUTF();
			
			System.out.println(s);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	
		
	}

}
