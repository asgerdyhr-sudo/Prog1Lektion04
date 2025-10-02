package Opgave02;

public class opgave02b {
    public static void main(String[] args) {

        //Kalder mine 2 metoder
        System.out.println("Summen af alle lige tal mellem 2 og 100 er: " + evenNumbers());
        System.out.println("Summen af alle kvadattal mindre end 100 er: " + qubicNumbers());
    }

    public static int evenNumbers() {
        int sum = 0; // Definere sum til "0"
        int i = 1; // Definere i til "1"

        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++; // Øger i med 1 for at gå til næste tal
        }
        return sum;
    }

    public static int qubicNumbers() {
        int sum = 0;
        int n = 1;

        while (n * n <= 100) { // formel får kvadrattal "n^2" - while køre så længe "n" er mindre end 100
            sum += n * n;
            n++; // Øger n med 1 for at gå til næste tal
        }
        return sum;
    }
}


