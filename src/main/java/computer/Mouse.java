package computer;

public class Mouse {
    private String make;
    private String model;
    private Color color;

    public Mouse(String make, String model, Color color) {
        this.make = make;
        this.model = model;
        this.color = color;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}



