package Polimorfisme.Exercise2;

public class TestElektronik {
    public static void main(String[] args) {
        Manusia indo = new Manusia();

        TelevisiJadul tvjadul = new TelevisiJadul();
        TelevisiModern tvmodern = new TelevisiModern();

        indo.nyalakanPerangkat(tvjadul);
        indo.nyalakanPerangkat(tvmodern);
    }
}