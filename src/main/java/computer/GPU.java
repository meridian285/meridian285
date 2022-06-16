package computer;

public class GPU {
    private GPUmake gpUmake;
    private int memorySize;
    private String make;
    private String model;

    public GPU(GPUmake gpUmake, int memorySize, String make, String model) {
        this.gpUmake = gpUmake;
        this.memorySize = memorySize;
        this.make = make;
        this.model = model;
    }

    public GPUmake getGpUmake() {
        return gpUmake;
    }

    public void setGpUmake(GPUmake gpUmake) {
        this.gpUmake = gpUmake;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
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
}
