package torpedo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Torpedo {

    public static void palyaGeneralas() {
        String[] palya1 = {"X", "X", "X", "_", "_", "_", "_"};
        String[] palya2 = {"_", "_", "X", "X", "X", "_", "_"};
        String[] palya3 = {"_", "_", "_", "_", "X", "X", "X"};
        String[] palya4 = {"_", "X", "X", "X", "_", "_", "_"};
        String[] palya5 = {"_", "_", "_", "X", "X", "X", "_"};
        Random rnd = new Random();
        int ranpalya = rnd.nextInt(5);

        if (ranpalya == 0) {
            System.out.println(Arrays.toString(palya1));
        } else if (ranpalya == 1) {
            System.out.println(Arrays.toString(palya2));
        } else if (ranpalya == 2) {
            System.out.println(Arrays.toString(palya3));
        } else if (ranpalya == 3) {
            System.out.println(Arrays.toString(palya4));
        } else if (ranpalya == 4) {
            System.out.println(Arrays.toString(palya5));
        }
    }

    public static void tamadas() {
        Scanner tipp = new Scanner(System.in);
        System.out.println("Kérem adja meg melyik mezőre szeretne támadni: ");
        int tamadasiMezo = tipp.nextInt();
        System.out.println("A mező ahova támadott: " + tamadasiMezo);

    }
}
