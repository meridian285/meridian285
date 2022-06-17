package computer;

public class App {
    public static void main(String[] args) {
        //Create 2 computers
        //Get CPU Frequency from computer1
        //Get RAM size from computer2

        Case case1 = new Case("Zalman", "Midi-Tower");
        Case case2 = new Case("AeroCool", "Mini-Tower");
        CPU cpu1 = new CPU("Intel", "Intel Core i9-12900KS", 3.6);
        CPU cpu2 = new CPU("AMD", "AMD Ryzen 7 5800X3D", 3.8);
        Disk disk1 = new Disk("WD","WD40EZRZ", 1000, DiskType.HDD);
        Disk disk2 = new Disk("Toshiba","HDWD110UZSVA", 1000, DiskType.SSD );
        GPU gpu1 = new GPU(GPUmake.Intel, 2);
        GPU gpu2 = new GPU(GPUmake.NVIDIA, 4);
        Keyboard keyboard1 = new Keyboard("A4Tech","KV-300H", Color.BLACK);
        Keyboard keyboard2 = new Keyboard("Logitech", "Corded Keyboard K280e", Color.WHITE);
        Mouse mouse1 = new Mouse("Razer", "DeathAdder Essential", Color.GREEN);
        Mouse mouse2 = new Mouse("Logitech", "G102 LIGHTSYNC", Color.BLACK);
        Monitor monitor1 = new Monitor("BENQ", "PD3200Q Black", "24", MatrixType.IPS);
        Monitor monitor2 = new Monitor("PHILIPS", "328P6VJEB/00", "32", MatrixType.OLED);
        PowerSupply powerSupply1 = new PowerSupply(1000, "Zalman", "ZM1000-EBT 1000W");
        PowerSupply powerSupply2 = new PowerSupply(1000, "FSP", "Group ATX-550PNR 550W");
        Motherboard motherboard1 = new Motherboard(cpu1, 32,"MSI", "MAG B550 TOMAHAWK AM4");
        Motherboard motherboard2 = new Motherboard(cpu2, 64, "Gigabyte", "B550 AORUS ELITE V2 AM4");
        SystemBlock systemBlock1 = new SystemBlock(powerSupply1, disk1,case1,gpu1,motherboard1,"LENOVO", "Gaming X35");
        SystemBlock systemBlock2 = new SystemBlock(powerSupply2,disk2,case2,gpu2,motherboard2,"DELL","Business B11");

        Computer1 computer1 = new Computer1(keyboard1,mouse1,monitor1,systemBlock1);
        Compuret2 compuret2 = new Compuret2(keyboard2,mouse2,monitor2,systemBlock2);

//        System.out.println(computer1);
//        System.out.println(compuret2);
//        Double cpuFrequency = computer1.getSystemBlock().getMotherboard().getCpu().getFrequency();

        System.out.println(computer1.getSystemBlock().getMotherboard().getCpu().getFrequency());

        System.out.println(compuret2.getSystemBlock().getMotherboard().getRamSize());


    }
}
