package Pertemuan6;

public class Televisi {

    public String merek;
    public int jumlahChannel;
    private int channelAktif;

    public Televisi(String merek, int jumlahChannel) {
        this.merek = merek;
        this.jumlahChannel = jumlahChannel;
        this.channelAktif = 1;
    }

    public void pindahChannel(int newChannel) {
        channelAktif = newChannel;
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}