package DAY_6.com.demo.test;

import DAY_6.com.demo.bean.STUDENT;

import java.util.Scanner;

public class TEST_STUDENT {
    public static void main(String[] args) {
        STUDENT ob=new STUDENT();
        //ob.display();
        System.out.println(ob);


        Scanner sc=new Scanner(System.in);
        System.out.println("enetr id");
        int id=sc.nextInt();
        System.out.println("enetr name");
        String name=sc.next();
        System.out.println("enter address");
        String addr=sc.next();
        STUDENT ob2=new STUDENT(id,name,addr);
        System.out.println(ob2);

        STUDENT ob1=new STUDENT(12,"Hitesh","Kalyan");
        //ob1.display();
        System.out.println(ob1);
        System.out.println("name : "+ob1.getSname());

        ob1.setSname("Hitman");
        System.out.println("after setter method");
        System.out.println(ob1);
    }


}
