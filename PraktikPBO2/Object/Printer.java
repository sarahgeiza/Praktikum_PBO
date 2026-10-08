package Object;

public class Printer {
    protected String merk;
    private boolean status;
    private String warna;

    public void nyalakanPrinter() {
        status = true;
        System.out.println("Printer dinyalakan");
    }
    public void matikanPrinter() {
        status = false;
        System.out.println("Printer dimatikan");
    }

    public void tekanStart() {
        System.out.println("Tombol start ditekan");
    }

    public void tekanStop() {
        System.out.println("Tombol stop ditekan");
    }
}