package lesson13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();

        Person person1 = new Person("White");
        Person person2 = new Person("Rabbit");

        list.add(person1);
        list.add(person2);

        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println();

    }
}
