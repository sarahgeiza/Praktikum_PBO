package TugasPraktikum;

public class komputer {
    private String merk;
    private String processor;

    public void setMerk(String merkName) {
        merk = merkName;
    }

    public void setProcessor(String processorName) {
        processor = processorName;
    }

    public void nyalakan() {
        System.out.println("Komputer dinyalakan.");
    }

    public void matikan() {
        System.out.println("Komputer dimatikan.");
    }

    public void printInfo() {
        System.out.println("Merk : " + merk);
        System.out.println("Processor : " + processor);
    }
}


