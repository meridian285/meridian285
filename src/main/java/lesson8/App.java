package lesson8;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Wilson";
        anna.year = 1998;

        System.out.println("Name - "+anna.name+" "+anna.lastName+" - "+anna.year+" years.");

        Person devid = new Person();
        devid.name = "Devid";
        devid.name = "Jekson";
        devid.year = 1990;

        Person stiv = new Person();
        stiv.year = 1980;
        stiv.name = "Stiv";
        stiv.lastName = "Banny";

    }

}
