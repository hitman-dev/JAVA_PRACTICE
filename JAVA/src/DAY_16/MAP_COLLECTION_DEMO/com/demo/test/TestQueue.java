package DAY_16.MAP_COLLECTION_DEMO.com.demo.test;
import java.util.PriorityQueue;


public class TestQueue {
	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		pq.add("zzzzz");
		pq.add("xxxxx");
		pq.add("zzzz");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		
	}

}
