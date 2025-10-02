package Opgave02;

public class opgaveEkstra {
    public static void main(String[] args) {

        //Kalder mine 2 metoder
        System.out.println("Summen af alle lige tal mellem 2 og 100 er: " + evenNumbers());
        System.out.println("Summen af alle kvadattal mindre end 100 er: " + qubicNumbers());
    }

    public static int evenNumbers() {
        int sum = 0;
        int i = 1;

        while (i <= 200) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }

    public static int qubicNumbers() {
        int sum = 0;
        int n = 1;

        while (n * n < 100) {
            sum += n * n;
            n++;
        }
        return sum;
    }
}


