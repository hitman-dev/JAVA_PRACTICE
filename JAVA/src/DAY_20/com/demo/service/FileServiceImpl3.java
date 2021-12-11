package DAY_20.com.demo.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileServiceImpl3 implements FileService{

	@Override
	public void copyfile(String src, String dest) {
		FileOutputStream fos=null;
		File f=new File(dest);
		try {
				if(f.exists()) {
					System.out.println("file exists so openin gin append mode");
					//open file in append mode
					 fos=new FileOutputStream(dest,true);
				}else {
					System.out.println("file does not exists  so opening in new file write mode");
					//open file in write mode
					 fos=new FileOutputStream(dest);
				}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try(FileInputStream fis=new FileInputStream(src);
		    FileOutputStream fos1=fos;	){
			int x=fis.read();
			while(x!=-1) {
				fos1.write(x);
				x=fis.read();
			}
			
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			 System.out.println(e.getMessage());
		     e.printStackTrace();
		}finally {
			
		} 
		
	}

	@Override
	public void writedata() {

	}

	@Override
	public void readData() {

	}
}
