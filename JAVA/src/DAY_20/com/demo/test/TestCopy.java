package DAY_20.com.demo.test;
import DAY_20.com.demo.service.FileService;
import DAY_20.com.demo.service.FileServiceImpl;

public class TestCopy {

	public static void main(String[] args) {
		///accept file names from commandline argument
		FileService fs=new FileServiceImpl();
		//String src=args[0];
		String src="mydata.txt";
		//String dest=args[1];
		String dest="mydatacopy.txt";
		fs.copyfile(src,dest);
		System.out.println("file copied");

	}

}
