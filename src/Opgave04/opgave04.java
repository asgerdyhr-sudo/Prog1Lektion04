package Opgave04;

import java.util.Scanner;

public class opgave04 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        // Promter brugeren for 2 værdier
        System.out.print("Intast din første parameter: ");
        int førsteParameter = Scanner.nextInt();

        System.out.print("Intast din anden parameter : ");
        int andenParameter = Scanner.nextInt();
        System.out.println("");

        // Logik
        /*
        Så længe at "i" altså 0 er mindre end andenParameter (En værdi brugeren intaster)
        Skal while loopet køre */
        int i = 0;
        int resultat = 1;
        while (i < andenParameter) {
            // Resultat = Resultat "1" * førsteParameter "skal brugeren skirve"
            // Altså vores while køre indtil at i rammer promten andenParameter
            resultat *= førsteParameter; // Resultat *= == resultat * førsteParameter
            i++;
        }
        System.out.println(førsteParameter + "^" + andenParameter + " er " + resultat);
    }
}
