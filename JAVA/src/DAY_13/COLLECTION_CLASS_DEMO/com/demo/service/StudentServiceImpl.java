package DAY_13.COLLECTION_CLASS_DEMO.com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import DAY_13.COLLECTION_CLASS_DEMO.com.demo.bean.Student;




public class StudentServiceImpl implements StudentService {
    static List<Student> slist;
    static {
    	slist=new ArrayList<>();
        slist.add(new Student(10,"Rajan","Aundh",LocalDate.of(2000,11,10)));
    	slist.add(new Student(1,"Revati","baner",LocalDate.of(1997,05,10)));
    	slist.add(new Student(13,"Anil","baner",LocalDate.of(1978,05,10)));
    }
	@Override
	public void addStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int sid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("enter date(dd/MM/yyyy)");
		String dt=sc.next();
		slist.add(new Student(sid,nm,address,LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
		
	}
	@Override
	public void displayAll() {
		//java 1.8
		//slist.stream().forEach(s->System.out.println(s));
		//java 1.7
		/*for(Student s:slist) {
			System.out.println(s);
		}*/
		//java 1.5 
		//ListIterator<Student> lst=slist.listIterator();
		
		Iterator<Student> it=slist.iterator();
		while(it.hasNext()) {
		   Student s=it.next();
		   System.out.println(s);
		}
	}
	@Override
	public Student searchById(int id) {
		int pos=slist.indexOf(new Student(id));
		if(pos!=-1) {
			return slist.get(pos);
		}
		return null;
	}
	@Override
	public boolean removeStudent(int id) {
		Scanner sc=new Scanner(System.in);
		Student s=searchById(id);
		if(s!=null) {
			System.out.println(s);
			System.out.println("do you want to delete it");
			String ans=sc.next();
			if(ans.equals("y")) {
			   return slist.remove(new Student(id));
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	@Override
	public List<Student> searchByName(String nm) {
		List<Student> lst=new ArrayList<>();
		for(Student s:slist) {
			if(s.getSname().equals(nm)){
				lst.add(s);
			}
		}
		if(lst.size()==0) {
			return null;
		}
		else {
			return lst;
		}
		
	}
	@Override
	public Boolean modifyAddress(int id, String addr) {
		Scanner sc=new Scanner(System.in);
		Student s=searchById(id);
		if(s!=null) {
			System.out.println(s);
			System.out.println("do you want to modify(y/n)");
			String ans=sc.next();
			if(ans.equals("y")) {
				s.setAddress(addr);
				return true;
			}
			
		}
		
		return null;
	}
	@Override
	public List<Student> sortById(int ch) {
		List<Student> lst=new ArrayList<>();
		lst.addAll(slist);  ///copy of slist
		Collections.sort(lst);
		/*System.out.println("in sortBy");
		for(Student s:lst) {
			System.out.println(s);
		}*/
		//Collections.sort(lst,new MyNameComparator());
		return lst;
	}

}
