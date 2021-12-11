package DAY_19.com.demo.service;

import java.util.Scanner;

import com.demo.exceptions.AgeException;
import com.demo.exceptions.BlockSystemException;

public class AgeAcceptService {
     public int acceptAge() throws  BlockSystemException{
    	 Scanner sc=new Scanner(System.in);
    	 int i=0;
    	 for( i=0;i<3;i++) {
	    	 try {
		    	 System.out.println("enter age");
		    	 int age=sc.nextInt();
		    	 if((age <18 ) || (age>60)) 
		    	 {
		    		 throw new AgeException("pls enter valid age between 18 and 60");
		    	 }
		    	 return age;
	    	 }catch(AgeException e) {
	    		 System.out.println(e.getMessage());
	    		 
	    	 }
    	 }
    	 
    	 if(i>=3) {
    		 throw new BlockSystemException("you have completed 3 attempts pls contact administrator");
    	 }
		return 0;
    	 
     }
}
