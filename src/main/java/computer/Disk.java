package computer;

public class Disk {
    private String make;
    private String model;
    private int size;
    private DiskType type;

    public Disk(String make, String model, int size, DiskType type) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.type = type;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DiskType getType() {
        return type;
    }

    public void setType(DiskType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "size=" + size +
                ", type=" + type +
                '}';
    }
}
