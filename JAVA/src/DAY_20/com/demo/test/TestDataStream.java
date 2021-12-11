package DAY_20.com.demo.test;
import DAY_20.com.demo.service.FileService;
import DAY_20.com.demo.service.FileServiceImpl;


public class TestDataStream {

	public static void main(String[] args) {
		FileService ob=new FileServiceImpl();
		ob.writedata();
		ob.readData();

	}

}
