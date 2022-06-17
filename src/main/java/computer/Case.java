package computer;

public class Case {
    private String make;
    private String model;

    public Case(String make, String model) {
        this.make = make;
        this.model = model;
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
        return "Case{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
