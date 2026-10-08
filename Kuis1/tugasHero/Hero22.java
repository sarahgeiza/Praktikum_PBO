package tugasHero;

import java.util.Random;

public class Hero22 {

    private String nama;
    private int nyawa;
    private int energi;
    private Skil22[] skil;

    public Hero22(String nama, int nyawa, int energi, Skil22[] skil) {

        this.nama = nama;
        this.nyawa = nyawa;
        this.energi = energi;
        this.skil = skil;
    }

    public String getNama() {

        return nama;
    }

    public int getNyawa() {

        return nyawa;
    }

    public int getEnergi() {

        return energi;
    }

    public Skil22 pilihSkil() {

        Random random = new Random();
        Skil22 skilDipilih;

        do {
            int index = random.nextInt(skil.length);
            skilDipilih = skil[index];
        } while (skilDipilih.getEnergi() > energi);
        return skilDipilih;
    }

    public void menyerang(Hero22 lawan) {

        Skil22 skilDipilih = pilihSkil();

        energi = energi - skilDipilih.getEnergi();
        lawan.nyawa = lawan.nyawa - skilDipilih.getDamage();

        if (lawan.nyawa < 0) {

            lawan.nyawa = 0;
        }

        System.out.println(nama + " menggunakan skill [" + skilDipilih.getNama() + "] ke " + lawan.getNama());
        System.out.println(
                "-> Energi " + nama + " berkurang " + skilDipilih.getEnergi() + " (Sisa Energi: " + energi + ")");
        System.out.println("-> Nyawa " + lawan.getNama() + " berkurang " + skilDipilih.getDamage() + " (Sisa Nyawa: "
                + lawan.getNyawa() + ")");
        System.out.println();
    }

    public boolean masihBisaMenyerang() {
        return energi > 0;
    }
}