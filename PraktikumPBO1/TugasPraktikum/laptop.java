package TugasPraktikum;

public class laptop extends komputer {
    private int ram;
    private int storage;

    public void setRam(int ramValue) {
        ram = ramValue;
    }

    public void setStorage(int storageValue) {
        storage = storageValue;
    }

    public void bukaLayar() {
        System.out.println("Layar laptop dibuka.");
    }

    public void tutupLayar() {
        System.out.println("Layar laptop ditutup.");
    }

    public void printInfoLaptop() {
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
    }
}   
