package DAY_20.com.demo.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;



public class FileServiceImpl implements FileService{

	@Override
	public void writedata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");		
		int id=sc.nextInt();
		System.out.println("enetr name");		
		String name=sc.next();
		System.out.println("enetr sal");
		double sal=sc.nextDouble();
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("employee.txt"));){
			dos.writeInt(id);
			dos.writeUTF(name);
			dos.writeDouble(sal);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public void readData() {
		try(DataInputStream dis=new DataInputStream(new FileInputStream("employee.txt"))){
			int id=dis.readInt();
			String nm=dis.readUTF();
			double sal=dis.readDouble();
			System.out.println("Id : "+id +" Name: "+nm+" Salary : "+sal);
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
    

}
