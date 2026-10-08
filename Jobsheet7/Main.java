package Jobsheet7;

public class Main {
    public static void main(String[] args) {

        Manusia manusia;

        manusia = new Dosen();
        manusia.makan();
        manusia.bernafas();

        manusia = new Mahasiswa();
        manusia.makan();
        manusia.bernafas();
    }
}
