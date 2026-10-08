package tugasHero;

public class DemoPerang22 {

    public static void main(String[] args) {

        // Membuat skill PlayerUtama
        Skil22 pukulPlayer = new Skil22("Pukul", 1, 2);
        Skil22 cubitPlayer = new Skil22("Cubit", 2, 1);
        Skil22 tamparPlayer = new Skil22("Tampar", 2, 1);

        // Membuat skill Musuh
        Skil22 pukulMusuh = new Skil22("Pukul", 1, 2);
        Skil22 cubitMusuh = new Skil22("Cubit", 2, 1);
        Skil22 tamparMusuh = new Skil22("Tampar", 2, 1);

        // Masing-masing Hero memiliki 3 skill
        Skil22[] skilPlayer = {
                pukulPlayer,
                cubitPlayer,
                tamparPlayer
        };

        Skil22[] skilMusuh = {
                pukulMusuh,
                cubitMusuh,
                tamparMusuh
        };

        // Membuat object PlayerUtama dan Musuh
        Hero22 playerUtama = new Hero22("PlayerUtama", 10, 10, skilPlayer);
        Hero22 musuh = new Hero22("Musuh", 10, 10, skilMusuh);

        int jumlahSeranganPlayer = 0;
        int jumlahSeranganMusuh = 0;
        int ronde = 1;

        System.out.println("====================================");
        System.out.println("       PERTANDINGAN DIMULAI!!!");
        System.out.println("====================================");
        System.out.println();

        // Pertarungan berjalan sampai salah satu Hero memiliki nyawa 0
        while (playerUtama.getNyawa() > 0
                && musuh.getNyawa() > 0) {

            System.out.println("--- Ronde " + ronde + " ---");

            // PlayerUtama menyerang
            if (playerUtama.masihBisaMenyerang()
                    && musuh.getNyawa() > 0) {
                
                playerUtama.menyerang(musuh);
                jumlahSeranganPlayer++;
            }

            // Musuh menyerang
            if (musuh.masihBisaMenyerang()
                    && playerUtama.getNyawa() > 0) {

                musuh.menyerang(playerUtama);
                jumlahSeranganMusuh++;
            }

            ronde++;
        }

        System.out.println("================================");
        System.out.println("      PERTANDINGAN SELESAI");
        System.out.println("================================");

        System.out.println("Jumlah serangan PlayerUtama : " + jumlahSeranganPlayer);

        System.out.println("Jumlah serangan Musuh       : " + jumlahSeranganMusuh);

        System.out.println();

        System.out.println("Nyawa PlayerUtama : " + playerUtama.getNyawa());

        System.out.println("Nyawa Musuh       : " + musuh.getNyawa());

        System.out.println();

        if (playerUtama.getNyawa() == 0) {
            System.out.println("Pemenang: Musuh!");

        } else {
            System.out.println("Pemenang: PlayerUtama!");
        }
    }
}