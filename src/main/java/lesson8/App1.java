package lesson8;

public class App1 {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Wilson";
        anna.year = 1998;


        Person devid = new Person();
        devid.name = "Devid";
        devid.lastName = "Jekson";
        devid.year = 1990;

        Person stiv = new Person();
        stiv.year = 1980;
        stiv.name = "Stiv";
        stiv.lastName = "Banny";

        anna.sayHello("Donald");
        stiv.sayHello("Ben");
        devid.sayHello(anna.name);

        Fruit apple = new Fruit();
        apple.breed = "Apple";



    }
}
