package lesson12;

public class DesktopLight implements UsElectricalPlug {
    private String model;
    private int price;

    public DesktopLight(String model, int price) {
        this.model = model;
        this.price = price;
    }


    @Override
    public String toString() {
        return "DesktopLight{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void keepOutletSize() {
        System.out.println("Yeah - I keep proper plug size");
    }

    @Override
    public void keepProperMaterials() {
        System.out.println("I use golden conductors and china isolators");
    }

    @Override
    public void keepVoltage() {
        System.out.println("For 120V");

    }
}
