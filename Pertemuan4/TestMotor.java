public class TestMotor {
    public static void main(String[] args) {

        Mesin mesin = new Mesin(150, "Pertalite");

        Motor motor = new Motor(
                "Honda",
                "Merah",
                mesin,
                120
        );

        motor.tampilkanInfo();

        System.out.println("\nSetelah menambah kecepatan:");
        motor.tambahKecepatan(50);
        System.out.println("Kecepatan: " + motor.getKecepatan() + " km/jam");

        System.out.println("\nSetelah menambah kecepatan lagi:");
        motor.tambahKecepatan(100);
        System.out.println("Kecepatan: " + motor.getKecepatan() + " km/jam");

        System.out.println("\nSetelah mengurangi kecepatan:");
        motor.kurangiKecepatan(30);
        System.out.println("Kecepatan: " + motor.getKecepatan() + " km/jam");
    }
}