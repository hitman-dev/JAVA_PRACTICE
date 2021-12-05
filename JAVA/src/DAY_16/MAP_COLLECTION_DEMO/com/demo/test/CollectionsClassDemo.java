package DAY_16.MAP_COLLECTION_DEMO.com.demo.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassDemo {
	public static void main(String[] args) {
		List<String> lst=new ArrayList<>();
		lst.add("Mango");
		lst.add("Oranges");
		List<String> lst1=new ArrayList<>();
		lst1.add("Mango11");
		lst1.add("Oranges11");
		lst1.add("pear");
		lst.addAll(lst1);
		Collections.addAll(lst,"xxx","vvvv","nxcbvnxb");
		String[] sarr= {"aaaa","bbb"};
		Collections.addAll(lst,sarr);
		System.out.println(lst);
		Collections.rotate(lst,2);
		System.out.println("Rotate 2: "+lst);
		for(int i=0;i<4;i++) {
			
			Collections.shuffle(lst);
			System.out.println(lst);
		}
		System.out.println("Maximum string : "+Collections.max(lst));
		System.out.println("Minimum string : "+Collections.min(lst));
	}

}
