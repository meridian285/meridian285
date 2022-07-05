package interview;

public class PrimeNumbers {
    public static void main(String[] args) {
        primeNumbers(1000000000);

    }

    private static void primeNumbers(int border) {
        for (int i = 2; i <= border; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isPrime(int number) {
        double x = Math.sqrt(number);
        for (int i = 2; i <= x; i++) {

            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

}
