package Lesson15;

public class App1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;


        System.out.println("Before try/catch");
        try{
            System.out.println("Before Exception");
            int c = a/b;
            System.out.println("After potential problem in the try block");
        }catch (ArithmeticException err){
            System.out.println("Exception happens - let handle it");
        }
        System.out.println("After try/catch");

    }
}
