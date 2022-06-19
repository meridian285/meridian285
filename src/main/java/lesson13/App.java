package lesson13;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        list.add(person1);
        list.add(person2);

        Person person1FromCollection = list.get(0);
        Person person2FromCollection = list.get(1);

//        boolean remove = list.remove(person1);
//        Person person = list.get(0);

//        System.out.println(remove);
//        System.out.println(person);
        System.out.println(list.indexOf(person2));
        System.out.println(list.size());
//        System.out.println("r1"+person1FromCollection);
//        System.out.println("r2"+person2FromCollection);

    }
}
