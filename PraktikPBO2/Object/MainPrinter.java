package Object;

public class MainPrinter {

    public static void main(String[] args) {

        printerLaser printer = new printerLaser();

        printer.setMerk("Canon");

        printer.tampilkanMerk();
        printer.nyalakanPrinter();
        printer.tekanStart();
        printer.tekanStop();
        printer.matikanPrinter();
    }
}