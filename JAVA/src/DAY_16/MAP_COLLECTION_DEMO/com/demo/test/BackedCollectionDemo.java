package DAY_16.MAP_COLLECTION_DEMO.com.demo.test;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class BackedCollectionDemo {
	public static void main(String[] args) {
		TreeMap<String,String> map=new TreeMap<>();
		map.put("a","and");
		map.put("b","bat");
		map.put("d","dog");
		map.put("h","hat");
		SortedMap<String,String> sm=map.subMap("b","h");
		System.out.println(map+"----"+sm);
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(12);
		ts.add(1);
		ts.add(10);
		ts.add(15);
		ts.add(30);
		ts.add(7);
		ts.add(3);
		System.out.println(ts);
		Set<Integer> s=ts.headSet(18,true);
		System.out.println("headset "+ts.headSet(18,true));
		System.out.println("tailset "+ts.tailSet(7));
		System.out.println("tailset "+ts.subSet(3,true,15,true));
		System.out.println("-------------------");
		ts.add(6);
		ts.add(4);
		System.out.println(ts);
		System.out.println(s);
	}

}
