package DAY_20.com.demo.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileServiceImpl4 implements FileService{
	@Override
	public void writedata() {

	}

	@Override
	public void readData() {

	}

	//byte[] barr=new byte[1024];
	@Override
	public void copyfile(String src, String dest) {
		BufferedOutputStream bos=null;
		
		File f=new File(dest);
		try {
				if(f.exists()) {
					System.out.println("file exists so openin gin append mode");
					//open file in append mode
					 bos=new BufferedOutputStream(new FileOutputStream(dest,true));
				}else {
					System.out.println("file does not exists  so opening in new file write mode");
					//open file in write mode
					 bos=new BufferedOutputStream(new FileOutputStream(dest));
				}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src));
		    BufferedOutputStream bos1=bos;	){
			int x=bis.read();
			while(x!=-1) {
				bos1.write(x);
				x=bis.read();
			}
			
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			 System.out.println(e.getMessage());
		     e.printStackTrace();
		}
		
	}

}
