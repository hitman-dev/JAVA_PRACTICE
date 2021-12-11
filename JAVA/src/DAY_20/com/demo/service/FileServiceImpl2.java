package DAY_20.com.demo.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileServiceImpl2 implements FileService{

	@Override
	public void copyfile(String src, String dest) {
		
		try(FileInputStream fis=new FileInputStream(src);
		    FileOutputStream fos=new FileOutputStream(dest);	){
			int x=fis.read();
			while(x!=-1) { //eof is not reached
				fos.write(x);
				x=fis.read();
			}
			
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			 System.out.println(e.getMessage());
		     e.printStackTrace();
		} 
		
	}

	@Override
	public void writedata() {

	}

	@Override
	public void readData() {

	}
}
