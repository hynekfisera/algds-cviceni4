import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cislo = input.nextInt();
        for (int i = 2; i <= cislo; i += 2) {
            System.out.println(i);
        }

        /*while (true) {
            System.out.println("Jdeš na párty?");
            String odpoved = input.nextLine();
            if (odpoved.equalsIgnoreCase("ano")) break;
        }
        System.out.println("Super těším se");*/

        /*String jmeno = input.nextLine();
        for (int i = 0; i < jmeno.length(); i++) {
            System.out.println("Ahoj, " + jmeno + "!");
        }*/

        /*int suma = 0;
        int pocitac = 1;
        while (pocitac <= 10) {
            suma += pocitac;
            pocitac++;
        }
        System.out.println(suma);*/

        /*int vysledek = 0;
        int i = 1;
        while (true) {
            vysledek += i;
            if (i == 10) break;
            i++;
        }
        System.out.println(vysledek);*/

        /*boolean konec = false;
        while (!konec) {
            System.out.println("idk");
            konec = true;
        }*/

        /*int pocetCyklu = 0;
        while (pocetCyklu < 2) {
            System.out.println(pocetCyklu);
            pocetCyklu++;
        }*/

        /*int suma = 0;
        for (int i = 10; i >= 1; i--) {
            suma += i;
            System.out.println(i);
        }
        System.out.println(suma);*/
    }
}