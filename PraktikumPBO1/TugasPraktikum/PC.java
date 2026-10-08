package TugasPraktikum;

public class PC extends komputer {
    private int ram;
    private int storage;

    public void setRam(int ramValue) {
        ram = ramValue;
    }

    public void setStorage(int storageValue) {
        storage = storageValue;
    }

    public void nyalakanPC() {
        System.out.println("PC dinyalakan.");
    }

    public void matikanPC() {
        System.out.println("PC dimatikan.");
    }

    public void printInfoPC() {
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
    }
}