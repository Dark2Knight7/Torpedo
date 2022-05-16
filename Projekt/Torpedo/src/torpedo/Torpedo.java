package torpedo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Torpedo {

    public static void jatekMenet() {
        String[] palya1 = {"X", "X", "X", "_", "_", "_", "_"};
        String[] palya2 = {"_", "_", "X", "X", "X", "_", "_"};
        String[] palya3 = {"_", "_", "_", "_", "X", "X", "X"};
        String[] palya4 = {"_", "X", "X", "X", "_", "_", "_"};
        String[] palya5 = {"_", "_", "_", "X", "X", "X", "_"};
        Random rnd = new Random();
        int ranpalya = rnd.nextInt(5);

        if (ranpalya == 0) {
            System.out.println("A nullás pályán játszik.");
        } else if (ranpalya == 1) {
            System.out.println("A egyes pályán játszik.");
        } else if (ranpalya == 2) {
            System.out.println("A kettes pályán játszik.");
        } else if (ranpalya == 3) {
            System.out.println("A hármas pályán játszik.");
        } else if (ranpalya == 4) {
            System.out.println("A négyes pályán játszik.");
        }
        
        Scanner tipp = new Scanner(System.in);
        System.out.println("Kérem adja meg melyik mezőre szeretne támadni 5 támadási lehetősége van: ");
        int tamadasiMezo = tipp.nextInt();
        
        if (palya1[tamadasiMezo]=="X") {
            System.out.println("Találat");
        }

    }
}
