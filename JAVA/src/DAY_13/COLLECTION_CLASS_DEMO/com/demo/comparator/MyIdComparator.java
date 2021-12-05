package DAY_13.COLLECTION_CLASS_DEMO.com.demo.comparator;
import java.util.Comparator;
import DAY_13.COLLECTION_CLASS_DEMO.com.demo.bean.Student;


public class MyIdComparator implements Comparator<Student> {
	private int order;
	
    public MyIdComparator(int ch) {
	   order=ch;
    }
	// TODO Auto-generated constructor stub

	@Override
	public int compare(Student o1, Student o2) {
		System.out.println("in capare method "+o1.getSid()+"--->"+o2.getSid());
		/*if(o1.getSid()<o2.getSid()) {
			return -1;
		}else {
			if(o1.getSid()==o2.getSid()) {
				return 0;
			}
			else {
				return 1;
			}
			
		}*/
		if(order==1)
		     return o1.getSid()-o2.getSid();
		else
			return o2.getSid()-o1.getSid();
					
	}

}
