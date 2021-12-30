package DAY_6_JAVA_ASSIGNMENT_3.Q3.com.demo.test;

import DAY_6_JAVA_ASSIGNMENT_3.Q3.com.demo.bean.FRIENDS;

public class TEST_FRIENDS {
    public static void main(String[] args) {
        FRIENDS f1 = new FRIENDS( "Hitesh", "Choudhary", new String[]{"Coding","Games","Running"},
                877820489, "hitman@gmail.com", "26-01-1997", "Asgard");
        FRIENDS f2 = new FRIENDS("Mayur","Sugandhi",new String[]{"Joking","Coding","Anime"},934949494,"mayur@gmail.com",
                "23-02-1997","Wakanda");
        FRIENDS f3 = new FRIENDS("Prakhar","Verma",new String[]{"Eating","Coding","TvSeries"},923575747,"prakhar@gmail.com",
                "18-11-1996","Earth");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
    }
}
