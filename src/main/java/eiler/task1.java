package eiler;

public class task1 {
    public static void main(String[] args) {
//        Если выписать все натуральные числа меньше 10, кратные 3 или 5, то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.
//
//        Найдите сумму всех чисел меньше 1000, кратных 3 или 5.
        int number =1000;
        int sum = 0;
        for (int i =1; i<=number; i++){
            if (i % 3 == 0){
                System.out.println(i);
                sum = sum + i;
            }
            if(i % 5 == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
