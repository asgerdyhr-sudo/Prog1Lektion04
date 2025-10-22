package opgave03;

import java.util.Scanner;

public class opgave03 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("Udskriver den ønskede tabel");
        System.out.print("Intast din ønskede tabel i heltal: ");
        int number = Scanner.nextInt();
        System.out.println("");

        tabel(number); // Referer til "int number" man kan vælge 4 og den udskriver 4 tabellen istedet

    }

    public static void tabel(int number) {
        int i = 1;  // Starttallet for multiplikation
        while (i <= 10) { // Da vi ganger meed 10 i næste linje fortæller det her at tabellen skal stoppe med at gavege efter 10 gange
            System.out.printf("%4d", number * i); // Udskriver tallet med 4 pladser
            i++; // Øger i med 1 for at gå til næste tal
        }
    }
}
