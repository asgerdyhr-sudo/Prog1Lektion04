package Opgave07;

import java.util.Scanner;

public class opgave07B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast et tal: ");
        int tal = scanner.nextInt();

        int originaltTal = tal;
        int omvendtTal = 0;

        // Vend tallet om
        while (tal > 0) {
            int ciffer = tal % 10;                  // Hent sidste ciffer
            omvendtTal = omvendtTal * 10 + ciffer;  // Tilføj det til omvendtTal
            tal = tal / 10;                         // Fjern sidste ciffer
        }
        System.out.println(originaltTal + " reversed er " + omvendtTal);
    }
}
