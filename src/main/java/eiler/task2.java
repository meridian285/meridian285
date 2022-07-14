package eiler;

public class task2 {
    public static void main(String[] args) {
//        Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих. Начиная с 1 и 2, первые 10 элементов будут:
//
//        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//        Найдите сумму всех четных элементов ряда Фибоначчи, которые не превышают четыре миллиона.

        int n0 = 1;
        int n1 = 1;
        int n2 = 2;
        int max = 4000000;
//        System.out.println(n0);
//        System.out.println(n1);
//        for(int i = 3; i <=100; i++){
//            n2 = n0+n1;
//            System.out.println(n2);
//            n0 = n1;
//            n1 = n2;
//    }
        int x = 1;
        int sum = 0;
        while (n0 <=max){
            n2 = n0+n1;
//            System.out.println(n2);
            n0 = n1;
            n1 = n2;
            if(n2% 2 == 0 && n2 <=max){
                sum = sum +n2;
                System.out.println(sum);
            }

        }
        System.out.println(sum);

    }
}
