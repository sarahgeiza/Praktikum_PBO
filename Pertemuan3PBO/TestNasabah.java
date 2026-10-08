public class TestNasabah
{
    public static void main(String[] args)
    {
        Nasabah nas = new Nasabah("11556677", "Nikloe Tesla", 900000);

        System.out.println("Nomor rekening: " + nas.getNomorRekening());
        System.out.println("Nama: " + nas.getNama());
        System.out.println("Saldo: " + nas.getSaldo());
    }
}