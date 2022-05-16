package torpedo;

import java.util.Scanner;

public class Torpedo {
    
    public static int palyaMezok=7;
    public static int[] palya = new int[palyaMezok];
    
    public static void palyaGeneralas(){
    
    }
    
    public static void tamadas(){
        Scanner tipp = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Kérem adja meg melyik mezőre szeretne támadni: ");

        String tamadasiMezo = tipp.nextLine();  // Read user input
        System.out.println("A mező ahova támadott: " + tamadasiMezo);  // Output user input
    }
}
