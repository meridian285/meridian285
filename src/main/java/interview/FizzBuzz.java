package interview;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzbuzz(100);
    }

public static void fizzbuzz(int border){

        for (int i = 1; i<=border;i++){

            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            if(i%3==0){
                System.out.println("Fizz");
            }
            if(i%5==0){
                System.out.println("Buzz");
            }
            System.out.println(i);
        }

    }
}
