package Pertemuan6;

public class Supervisor extends Manajer {

    public String shift;
    public int durasi;

    public void tampilkanGajiTotal() {
        System.out.println("Gaji Total: " + (long)(gaji * durasi));
    }
}