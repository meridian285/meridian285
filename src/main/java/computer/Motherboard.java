package computer;

public class Motherboard {
    private CPU cpu;
    private int ramSize;
    private String make;
    private String model;

    public Motherboard(CPU cpu, int ramSize, String make, String model) {
        this.cpu = cpu;
        this.ramSize = ramSize;
        this.make = make;
        this.model = model;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
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
        return "Motherboard{" +
                "cpu=" + cpu +
                ", ramSize=" + ramSize +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
