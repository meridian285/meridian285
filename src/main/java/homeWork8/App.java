package homeWork8;

public class App {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name = "Alex";
        alex.lastName = "Jonson";
        alex.year = 1986;

        Person bob = new Person();
        bob.name = "Bob";
        bob.lastName = "Bobrovski";
        bob.year = 1980;

        Person greg = new Person();
        greg.name = "Greg";
        greg.lastName = "Wilson";
        greg.year = 2001;

        Clothes dress = new Clothes();
        dress.color = "Red";
        dress.size = "XL";
        dress.seasonClothes = Season.Summer;

        Clothes costume = new Clothes();
        costume.color = "Black";
        costume.size = "XXL";
        costume.seasonClothes = Season.Winter;

        Clothes shirt = new Clothes();
        shirt.color = "Blue";
        shirt.size = "LL";
        shirt.seasonClothes = Season.Summer;

        System.out.println(alex+" like "+shirt+" ");


        System.out.println(dress.seasonClothes);



    }
}
