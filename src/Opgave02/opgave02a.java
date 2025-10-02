package Opgave02;

public class opgave02a {
    public static void main(String[] args) {

        //Kalder mine 2 metoder
        evenNumbers();
        qubicNumbers();
    }

    public static void evenNumbers() {
        int sum = 0;
        int i = 1;

        while (i <= 100) { // Fortæller at så længe "i" er mindre eller "=" 100 skla while loopet køre
            if (i % 2 == 0) { // "i" skal kunne gå op i 2
                sum += i;
            }
            i++; // Øger i med 1 for at gå til næste tal
        }
        System.out.println("Summen af lige tal mellem 2 og 100 er: " + sum);
    }

    public static void qubicNumbers() {
        int sum = 0;
        int n = 1;

        while (n * n < 100) {
            sum += n * n;
            n++; // Øger n med 1 for at gå til næste tal
        }
        System.out.println("Summen af alle kvadrattal mindre end 100 er: " + sum);
    }
}


