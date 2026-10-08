public class TestParkirKendaraan {
    public static void main(String[] args) {

        ParkirKendaraan parkir = new ParkirKendaraan();

        parkir.setNomorKendaraan("N 1234 AB");
        parkir.setLamaParkir(3);

        System.out.println("Nomor kendaraan: " + parkir.getNomorKendaraan());
        System.out.println("Lama parkir: " + parkir.getLamaParkir());
    }
}