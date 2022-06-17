package computer;

public class GPU {
    private GPUmake gpUmake;
    private int memorySize;

    public GPU(GPUmake gpUmake, int memorySize) {
        this.gpUmake = gpUmake;
        this.memorySize = memorySize;
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

    @Override
    public String toString() {
        return "GPU{" +
                "gpUmake=" + gpUmake +
                ", memorySize=" + memorySize +
                '}';
    }
}
