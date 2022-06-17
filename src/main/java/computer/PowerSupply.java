package computer;

public class PowerSupply {
    private int power;
    private String make;
    private String model;

    public PowerSupply(int power, String make, String model) {
        this.power = power;
        this.make = make;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "power=" + power +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
