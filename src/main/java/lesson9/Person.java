package lesson9;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public Person(String name, String lastName, int year){
            this.name = name;
            this.lastName = lastName;
            this.year = year;
    }
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public Person(){}

    public void setName(String name){
        this.name = name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setYear(int year){
        if (year>2022 || year<1900){
            throw new IllegalArgumentException("Wrong Year!");
        }
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void printAge(){
        System.out.println(2022-this.year);
    }

}
