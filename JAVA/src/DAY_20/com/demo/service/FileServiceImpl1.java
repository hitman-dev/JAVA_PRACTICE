package DAY_20.com.demo.service;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileServiceImpl1 implements FileService{

	@Override
	public void copyfile(String src, String dest) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//open file for reading, file should exists
			fis=new FileInputStream(src);
			//if file exists it will overwrite else it will generate new file
			 fos=new FileOutputStream(dest);
			int x=fis.read();
			while(x!=-1) {  // x!=-1 check EOF
				fos.write(x);
				x=fis.read();
			}
			
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			 System.out.println(e.getMessage());
		     e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} 
		
	}

	@Override
	public void writedata() {

	}

	@Override
	public void readData() {

	}
}

