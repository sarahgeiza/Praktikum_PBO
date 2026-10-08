package Pertemuan6;

public class TelevisiModern extends Televisi {

    private String displayMode;
    private String dvd;

    public TelevisiModern(String mrk, int channelCount) {
        super(mrk, channelCount);
        displayMode = "Kosong";
        dvd = "Kosong";
    }

    public void gantiModusTampilan(String mode) {
        displayMode = mode;
    }

    public void mainkanDVD() {
        System.out.println("Sedang memainkan DVD: " + dvd);
    }

    public void masukkanDVD(String dvdTitle) {
        dvd = dvdTitle;
    }
}