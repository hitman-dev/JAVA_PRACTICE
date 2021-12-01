package DAY_3;

public class ADDITION {
    //when you write more than one function with same name
    //but different type of parameter or different
    //number of parameters is called as function overloading
    //it is also called as static polymorphism(early binding)
    public static int addition(int i,int j) {  //function 1
        i=i+10;
        return i+j;
    }
    public static byte addition(byte i1,byte j1) { //function 2
        return (byte) (i1+j1);
    }
    public static byte addition(byte i1,byte j1,int j) {///function 3
        return (byte) (i1+j1+j);
    }
    public static void main(String[] args) {
        int i=12;
        int j=13;
        //Addition ob=new Addition();
        //ob.addition(i,j);
        int ans=addition(i,j); //call by value  //function 1
        System.out.println(ans);
        byte b1=23;
        byte b2=19;
        //ob.addition(b1,b2);
        byte result=addition(b1,b2); //call by value //function2
        System.out.println(result);
        result=addition(b1,b2,14);
        System.out.println(result);  /// function 3
    }

}
