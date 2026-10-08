package Jobsheet7;

public class DemoSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut jika sudut A = 60: "
                + segitiga.totalSudut(60));

        System.out.println("Total sudut jika sudut A = 60 dan B = 70: "
                + segitiga.totalSudut(60, 70));

        System.out.println("Keliling segitiga: "
                + segitiga.keliling(3, 4, 5));

        System.out.println("Sisi C segitiga siku-siku: "
                + segitiga.keliling(3, 4));
    }
}