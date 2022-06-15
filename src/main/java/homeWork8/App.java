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
        dress.setColor(Colors.Green);
        dress.size = "XL";
        dress.setSeasonClothes(Season.Summer);

        Clothes costume = new Clothes();
        costume.setColor(Colors.Black);
        costume.size = "XXL";
        costume.setSeasonClothes(Season.Winter);

        Clothes shirt = new Clothes();
        shirt.setColor(Colors.White);
        shirt.size = "LL";
        shirt.setSeasonClothes(Season.Summer);

//        System.out.println(alex+" like "+shirt+" ");


//        System.out.println(dress.getSeasonClothes());

        


    }
}
