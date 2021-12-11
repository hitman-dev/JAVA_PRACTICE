package DAY_20.com.demo.test;
import DAY_20.com.demo.service.FileDataRead;
import DAY_20.com.demo.service.FileDataReadImpl;

public class TestReadCSV {
	public static void main(String[] args) {
		FileDataRead ob=new FileDataReadImpl();
		ob.writeData();
		ob.readData();
		
	}

}
