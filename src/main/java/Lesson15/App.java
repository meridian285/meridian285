package Lesson15;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna");
        Person david = new Person("David");
        Person steve = new Person("Steve");

        System.out.println(anna.getNonStaticCount());
        System.out.println(anna.getCount());
        Person.hello("David");
    }
}
