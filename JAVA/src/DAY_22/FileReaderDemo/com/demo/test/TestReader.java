package DAY_22.FileReaderDemo.com.demo.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReader {

	public static void main(String[] args) {
		File f=new File("mydata.txt");
		char[] ch=new char[(int)f.length()];
		
		try (FileReader fr=new FileReader("mydata.txt");
				FileWriter fw=new FileWriter("mydatacopy.txt")){
			/*int ch1=fr.read();
			while(ch1!=-1) {
				fw.write(ch1);
			}*/
			fr.read(ch);
			fw.write(ch);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
