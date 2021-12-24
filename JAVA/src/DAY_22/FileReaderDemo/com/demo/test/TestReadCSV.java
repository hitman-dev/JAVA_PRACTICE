package DAY_22.FileReaderDemo.com.demo.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import DAY_22.FileReaderDemo.com.demo.beans.Friend;


public class TestReadCSV {

	public static void main(String[] args) {
		List<Friend> flist=new ArrayList<>();
		
		try(Scanner sc=new Scanner(new FileReader("friend.csv"));) {
			while(sc.hasNextLine()) {
				String s=sc.nextLine();
				System.out.println(s);
				String[] sarr=s.split(",");
				Friend f=new Friend(Integer.parseInt(sarr[0]),sarr[1],sarr[2]);
				flist.add(f);
			}
			System.out.println(flist);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
