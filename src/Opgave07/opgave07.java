package Opgave07;

import java.util.Scanner;

public class opgave07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast et tal: ");
        int tal = scanner.nextInt();
        int orginalTal = tal;
        int omvendtTal = 0;

        while (tal > 0) {
            omvendtTal = tal % 10;
            tal = tal / 10;
            System.out.print(omvendtTal);
        }
        System.out.println(" er reversed fra " + orginalTal);
    }
}


