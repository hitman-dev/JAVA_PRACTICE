package DAY_6_JAVA_ASSIGNMENT_3.Q1;

public class Q1_SOLUTION {

    public static void main(String[] args) {
        for (String val : args) {
            int num = Integer.parseInt(val);
            if (isPrimeNum(num)) {
                System.out.println("Table of number: " + num);
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %d : %d\n", num, i, num * i);
                }
            } else {
                System.out.println(num + "/10" + ": " + (float) (num / 10.0));
            }
        }
    }
    public static boolean isPrimeNum(int num) {
        for (int i =2;i<=num/2;i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
// run the program by inputting the values by clicking on run button -> Modiefy run configuration
//enter the values seperated by spaces separated in the second dialogue box and than run the program by clicking on run button