package Opgave06;

import java.util.Scanner;

public class opgave06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast et tal: ");
        int tværsum = scanner.nextInt();
        //Summen skal starte på 0 - da den skal indeholde tværsummen
        int sum = 0;
        //Gemmer orginal tallet til udskrivelse
        int originalTværsum = tværsum;
        //Loopet skal køre intil at "0" bliver ramt
        while (tværsum > 0) {
            //Læg det sidste ciffer til summen
            sum += tværsum %10;
            //Fjerner det sidste ciffer
            tværsum = tværsum / 10;
        }
        System.out.println("Tværsummen af " + originalTværsum + " er " + sum);
    }
}


