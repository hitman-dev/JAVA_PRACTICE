package DAY_22.FileReaderDemo.com.demo.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestreadKeybord {
	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			///reading from keyboard using BufferedReader
			System.out.println("enetr id");
			String s=br.readLine();
			int id=Integer.parseInt(s);
			System.out.println("you enterd :"+id);
			
			//Reading from file using Scanner
			Scanner sc=new Scanner(new FileInputStream("mydata.txt"));
			StringBuffer sb=new StringBuffer();
			while(sc.hasNextLine()) {
				sb.append("   "+sc.nextLine());
			}
			System.out.println(sb);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		}

}
