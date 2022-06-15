package lesson9;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.setName("Anna");

        System.out.println(anna.getName());

        anna.setLastName("Winston");
        anna.setYear(1950);
        anna.printAge();

        Person david = new Person();
        david.setName("David");
        david.setLastName("Peterson");
        david.setYear(2000);

        Person jane = new Person("Jane", "Dow");
        jane.setYear(2005);
    }
}
