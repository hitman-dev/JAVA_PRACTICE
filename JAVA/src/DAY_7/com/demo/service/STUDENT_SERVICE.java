package DAY_7.com.demo.service;
import DAY_7.com.demo.bean.STUDENT;
import java.util.Scanner;



public class STUDENT_SERVICE {
	static STUDENT[] sarr;
	static int cnt;
	static {
		sarr=new STUDENT[10]; //create 10 references
		cnt=0;
	}
	
	public static void addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter address");
		String addr=sc.next();
		if(cnt < sarr.length) {
			sarr[cnt]=new STUDENT(name,addr); //10 objects
			cnt++;
		}
		else {
			System.out.println("array is full");
		}
	}
	
	public static void displayAll() {
		/*for(int i=0;i<cnt;i++) {
			System.out.println(sarr[i]);
		}*/
		
		for(STUDENT ob:sarr) {
			if(ob!=null)
			  System.out.println(ob);
			else {
				break;
			}
		}
		
	}

	public static STUDENT searchById(int id) {
		for(STUDENT ob:sarr) {
			if(ob!=null) {
				if(ob.getSid()==id) {
					return ob;
				}
			}
			else {
				break;
			}
		}
		return null;
	}

	public static boolean updateAddress(int id, String addr) {
		STUDENT ob=searchById(id);
		if(ob!=null) {
			ob.setaddress(addr);
			return true;
		}
		else {
			return false;
		}
	}

	public static STUDENT[] searchByName(String nm) {
		STUDENT[] studarr=new STUDENT[cnt];
		int i=0;
		for(STUDENT s:sarr) {
			if(s!=null) {
				if(s.getSname().equals(nm)) {
					studarr[i]=s;
					i++;
				}
			}
			else {
				break;
			}
		}
		if(i!=0) {
		   return studarr;
		}
		else {
			return null;
		}
		
		
	}

}
