package DAY_22.FileReaderDemo.com.demo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferReader {
	public static void main(String[] args) {
		char[] ch=new char[100];	
		try (BufferedReader br=new BufferedReader(new FileReader("mydata.txt"));
				BufferedWriter bw=new BufferedWriter(new FileWriter("mydatacopy.txt"))){
			/*int ch1=fr.read();
			while(ch1!=-1) {
				fw.write(ch1);
			}*/
			br.read(ch);
			bw.write(ch);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
