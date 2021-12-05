package DAY_14.com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import DAY_14.com.demo.beans.Student;


public class StudentServiceImpl implements StudentService{
    static Map<Integer, Student> smap;
    static {
    	smap=new HashMap<>();
    	smap.put(100,new Student(100,"Rajan","Baner",LocalDate.of(2000,11,11)));
    	smap.put(101,new Student(101,"Ashu","Kothrud",LocalDate.of(2003,11,11)));
    	smap.put(102,new Student(102,"Revati","Swargate",LocalDate.of(2002,11,11)));
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
		Set<Integer> ks=smap.keySet();
		for(Integer ob:ks) {
			System.out.println(ob+"------>"+smap.get(ob));
		}
		
	}

	/*@Override
	public Student searchById(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeSet<Student> sortById() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
