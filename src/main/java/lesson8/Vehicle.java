package lesson8;

public class Vehicle {
    public int year;
    public String make;
    public String color;
    public String model;

    public void start(){
        System.out.println(this.color+" "+this.make+" started;");
    }
    public void beep(){
        System.out.println(make+" "+color+" make"+ " beeeep"+"\n");
    }

    public void printVehicleInfo(){
        System.out.println("Make: "+make+"\nModel: "+this.model+"\nYear: "+this.year+"\nColor: "+this.color+"\n");
    }
}

