package Opgave01;

public class opgave01 {
    public static void main(String[] args) {

        //Fortæller bare at int currentNumber er = 5
        int courrentNumber = 5;

        //Fortæller at imens currentNumber er mindre eller "=" skal denne while køre
        while (courrentNumber <= 20){

            //printer currentNumber
            System.out.println(courrentNumber);

            /*Fortæller at der skal ligges "1" til currentNumber og denne vil køre intil
              currentNumber er = 20 - Fordi det har vi kaldt den skal gøre i vores "while"
             */
            courrentNumber++; // Øger i med 1 for at gå til næste tal
        }
    }
}
