package opgave05;

public class opgave05 {
    public static void main(String[] args) {

        //kalder alle metoder - samt printer noget tekst
        System.out.println("Mønaster A");
        mønsterA();
        System.out.println();
        System.out.println("Mønster B");
        mønsterB();
        System.out.println();
        System.out.println("Mønster C");
        mønsterC();
        System.out.println();
        System.out.println("Mønster D");
        mønsterD();

    }

    private static void mønsterA() {
        //Definere variabel
        int i = 1;
        //Fortæller at så længe "i" er mindre eller "=" 5 skal loopet køre
        while (i <= 5) {
            //lægger "1" til variablen "i"
            i++;
            //Definere variabel
            int n = 1;
            //Fortæller at så længe "i" er større end "n" skal dette loop køre
            while (i > n) {
                System.out.print("*");
                n++;
            }
            System.out.println();
        }
    }

    private static void mønsterB() {
        int i = 0;
        while (i < 5) {

            int n = 5;
            while (i < n) {
                System.out.print("*");
                n--;
            }
            System.out.println();
            i++;
        }
    }

    private static void mønsterC() {
        int i = 1;
        while (i <= 5) {
            int n = 5;
            while (n > 0) {
                if (i < n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                n--;
            }
            System.out.println();
            i++;
        }
    }

    private static void mønsterD() {
        int i = 0;
        while (i < 5) {
            int n = 0;
            while (n < 5) {
                if (n < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                n++;
            }
            System.out.println();
            i++;
        }
    }
}
