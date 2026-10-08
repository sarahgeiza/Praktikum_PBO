package aplikasi;

import com.polinema.Library.Kelas;

public class App {
    public static void main(String[] args) {
        Kelas f = new Kelas();
        System.out.println(f.publicVar);
        System.out.println(f.privateVar);
        System.out.println(f.protectedVar);
        System.out.println(f.defaultVar);
    }
}
