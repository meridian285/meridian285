package homeWork88;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public Person(){}

    public Person(String name, String lastName, int year){
        this.name = name;
        this.lastName = lastName;
        setYear(year);
    }
    public Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setYear(int year){
        if (year>2022 || year<1900){
            throw new IllegalArgumentException("Wrong year");
        }
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    public void sayHello(String hello){
        System.out.println("Hello "+ hello+", my name is "+this.name+"\nNice to meet you! \n");
    }

}
