package DAY_2;

public class STRING {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        if(s1==s2) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if(s1==s3) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
        if(s1.equals(s3)) {
            System.out.println("String contents are equal");
        }
        else {
            System.out.println("String contents are not equal");
        }


    }


}
