package lesson11;

public class App {
    public static void main(String[] args) {
        Address annaAddress = new Address("12 Elm st", "Gotham cite", "33547", State.FL );
        Person anna = new Person("Anna","Wilson",2005, annaAddress);

        String street = anna.getAddress().getAddress1();

        Address davidAddress = new Address("36 sun street","Sun city","A91965",State.CF);
        Person david = new Person("David", "Lastname", 1987,davidAddress);

        Team south = new Team(anna,david);

        String city = south.getPlayer().getAddress().getCity();

//        System.out.println(city);

        System.out.println(south);
    }
}
