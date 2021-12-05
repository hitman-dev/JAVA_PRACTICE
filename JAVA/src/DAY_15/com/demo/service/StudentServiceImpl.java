package DAY_15.com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import DAY_15.com.demo.beans.Student;

public class StudentServiceImpl implements StudentService{
    static Map<Integer,Student> smap;
    static {
    	smap=new HashMap<>();
    	smap.put(100,new Student(100,"Hitman","Kalyan",LocalDate.of(2000,11,11)));
    	smap.put(101,new Student(101,"Bruce","NYC",LocalDate.of(2003,11,11)));
    	smap.put(102,new Student(102,"Tony","London",LocalDate.of(2002,11,11)));
    } 
	@Override
	public boolean addnewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int sid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("enter date(dd/MM/yyyy)");
		String dt=sc.next();
		//hm.computeIfPresent(sid,(key,value)->ob); //replace ob with student object
		if(smap.containsKey(sid))
		{
			System.out.println("Do you want to overwrite");
			String ans=sc.next();
			if(ans.equals("y")) { ///Object exists, overwrite
				Student s=smap.put(sid,new Student(sid,nm,address,LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
				if(s!=null) {
					return true;
				}
				else {
					return false;
				}
			}
			else {  /// object is there but don't overwrite
				return false;
			}
		}else { /// object doesnot exists add it
			 Student s=smap.put(sid,new Student(sid,nm,address,LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
			 if(s!=null) {
				 return false;
			 }else {
				 return true;
			 }
			 
		}
	
		
	}

	@Override
	public void displayAll() {
		/*Set<Integer> ks=smap.keySet();
		for(Integer ob:ks) {
			System.out.println(ob+"------>"+smap.get(ob));
		}*/
		
		Set<Map.Entry<Integer,Student>> sentry=smap.entrySet();
		/*for(Map.Entry<Integer,Student> ob:sentry) {
			System.out.println(ob.getKey()+"------>"+ob.getValue());
		}*/
		sentry.stream().forEach(x->System.out.println(x.getKey()+"------>"+x.getValue()));
		
		
	}

	@Override
	public boolean deleteById(int id) {
		Scanner sc=new Scanner(System.in);
		Student s=smap.get(id);
		if(s!=null) {
			System.out.println(s);
			System.out.println("do you want to dlete(y/n)");
			String ans=sc.next();
			if(ans.equals("y")) {
				 smap.remove(id);
				 return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean modifyStudent(int id, String addr) {
		Scanner sc=new Scanner(System.in);
		Student s=smap.get(id);
		if(s!=null) {
			System.out.println(s);
			System.out.println("Do you want to modify");
			String ans=sc.next();
			if(ans.equals("y")) {
				s.setAddress(addr);
				return true;
			}
		}
		return false;
	}

	@Override
	public Student searchById(int num) {
		
			return smap.get(num);
		
	}

	@Override
	public TreeSet<Student> sortById() {
		List<Student> lst1=new ArrayList<Student>(smap.values());
		TreeSet<Student> ts=new TreeSet<>(lst1);
		return ts;
	}

	@Override
	public List<Student> searchByName(String nm) {
		List<Student> lst=new ArrayList<>();
		List<Student> lst1=new ArrayList<Student>(smap.values());
		for(Student s:lst1) {
			if(s.getSname().equals(nm)) {
				lst.add(s);
			}
		}
		if(lst.size()>0) {
			return lst;
		}
		return null;
	}

}
