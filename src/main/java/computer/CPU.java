package computer;

public class CPU {
    private String make;
    private String model;
    private double frequency;

    public CPU(String make, String model, double frequency) {
        this.make = make;
        this.model = model;
        this.frequency = frequency;
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

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}

