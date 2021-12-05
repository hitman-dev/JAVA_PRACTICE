package DAY_15.com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		hm.put("DBDA",1000);
		hm.put("DAC",30000);
		hm.put("DHPCSA",1000);
		hm.put("DTISS",3000);
		hm.put("DVLSI",4000);
		hm.put("DBDA",5000);
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr course name to search");
		String cn=sc.next();
		int num=hm.get(cn);
		System.out.println("total number :"+num);
		// to search---> based on value and get the key
		Set<String> ks=hm.keySet();  //ks={"DBDA","DAC","DHPCSA","DTISS","DVLSI"}
		for (String s:ks) {
			System.out.println(s+"------>"+hm.get(s));
			
		}
		ks=hm.keySet();  //ks={"DBDA","DAC","DHPCSA","DTISS","DVLSI"}
		for (String s:ks) {
			if(hm.get(s)>3000) {
				System.out.println(s);
			}
		}
		
		
		
		
		
		
		
	}

}
