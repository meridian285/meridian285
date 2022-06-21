package tickets;

public class Tickets {
    private int age;
    private int basePrice;

    public Tickets(int age, int basePrice) {
        this.age = age;
        this.basePrice = basePrice;
    }
    public double calculate(){
        if(this.age<=2){
            return 0;
        }
        if (this.age <=12) {
            return this.basePrice*0.5;
        }
        if (this.age>65){
            return basePrice*0.8;
        }
        return basePrice;
    }
}
