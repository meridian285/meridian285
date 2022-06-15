package homeWork88;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna","Winston", 2005);
        Person jake = new Person("Jake", "Brendon");
        Person bob = new Person();


        System.out.println("Hi! I'm "+jake.getName()+" "+jake.getLastName()+"\nHow are you?");
        System.out.println("\nHello!\nMy name is "+anna.getName()+" "+anna.getLastName()+"\nMe "+anna.getYear()+" years old");

        anna.sayHello(jake.getName());
        jake.sayHello(anna.getName());
        jake.sayHello("Bob");

    }
}
