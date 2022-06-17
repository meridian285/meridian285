package computer;

public class SystemBlock {
    private PowerSupply powerSopply;
    private Disk disk;
    private Case desktopCase;
    private GPU cpu;
    private Motherboard motherboard;
    private String make;
    private String model;

    public SystemBlock(PowerSupply powerSopply, Disk disk, Case desktopCase, GPU cpu, Motherboard motherboard, String make, String model) {
        this.powerSopply = powerSopply;
        this.disk = disk;
        this.desktopCase = desktopCase;
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.make = make;
        this.model = model;
    }

    public PowerSupply getPowerSopply() {
        return powerSopply;
    }

    public void setPowerSopply(PowerSupply powerSopply) {
        this.powerSopply = powerSopply;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Case getDesktopCase() {
        return desktopCase;
    }

    public void setDesktopCase(Case desktopCase) {
        this.desktopCase = desktopCase;
    }

    public GPU getCpu() {
        return cpu;
    }

    public void setCpu(GPU cpu) {
        this.cpu = cpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
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
        return "SystemBlock{" +
                "powerSopply=" + powerSopply +
                ", disk=" + disk +
                ", desktopCase=" + desktopCase +
                ", cpu=" + cpu +
                ", motherboard=" + motherboard +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
