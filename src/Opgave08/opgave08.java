package Opgave08;

import java.util.Scanner;

public class opgave08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast et heltal: ");
        int tal = input.nextInt();
        int orginaltTal = tal;
        int omvendtTal = 0;

        while (tal > 0) {
            int ciffer = tal % 10;                  // Hent sidste ciffer
            omvendtTal = omvendtTal * 10 + ciffer;  // Tilføj det til omvendtTal
            tal = tal / 10;                         // Fjern sidste ciffer

        }
        // Tjek om det oprindelige tal er lig med det omvendte
        if (omvendtTal == orginaltTal) {
            System.out.println(orginaltTal + " er et palindrom!");
        } else {
            System.out.println(orginaltTal + " er IKKE et palindrom.");
        }
    }
}