package presentation;

import logic.Logika;
import java.util.Scanner;

public class Main {

    static Logika logika = new Logika();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
        System.out.println("________________________");
        System.out.println("! VÍTEJ V EPICKÉ KALKULAČCE !");
        System.out.println("________________________");
        System.out.println("1) Sčítani");
        System.out.println("2) Odečítání");
        System.out.println("3) Násobení");
        System.out.println("4) Dělení");
        System.out.println("5) Mocniny");
        System.out.println("6) Faktoriál");
        System.out.println("________________________");
        System.out.println("7) Ukončit aplikaci");
        System.out.println("________________________");


        int moznost = sc.nextInt();
        while (moznost >= 8){
            System.out.println("Vybral sis nespravnou moznost");
            moznost=sc.nextInt();
        }
        if (moznost == 1){
            System.out.println("Zadej prosím první číslo");
            int prvnicislo = sc.nextInt();
            System.out.println("Díky, teď zadej druhý číslo");
            int druhycislo = sc.nextInt();
            System.out.println("Výsledek je: " + logika.scitani(prvnicislo, druhycislo));
        }
        if (moznost == 2){
            System.out.println("Zadej prosím první číslo");
            int prvnicislo = sc.nextInt();
            System.out.println("Díky, teď zadej druhý číslo");
            int druhycislo = sc.nextInt();
            System.out.println("Výsledek je: " + logika.odecitani(prvnicislo, druhycislo));
        }
        if (moznost == 3){
            System.out.println("Zadej prosím první číslo");
            int prvnicislo = sc.nextInt();
            System.out.println("Díky, teď zadej druhý číslo");
            int druhycislo = sc.nextInt();
            System.out.println("Výsledek je: " + logika.nasobeni(prvnicislo, druhycislo));
        }
        if (moznost == 4){
            System.out.println("Zadej prosím první číslo");
            int prvnicislo = sc.nextInt();
            System.out.println("Díky, teď zadej druhý číslo");
            int druhycislo = sc.nextInt();
            System.out.println("Výsledek je: " + logika.deleni(prvnicislo, druhycislo));
        }
        if (moznost == 5){
            System.out.println("Zadej prosím první číslo");
            int prvnicislo = sc.nextInt();
            System.out.println("Díky, teď zadej číslo kterým to chceš umocnit.");
            int druhycislo = sc.nextInt();
            System.out.println("Výsledek je: " + logika.mocnina(prvnicislo, druhycislo));
        }
        if (moznost == 6){
            System.out.println("Zadej prosím číslo");
            int prvnicislo = sc.nextInt();
            System.out.println("Výsledek je: " + logika.faktorial(prvnicislo));
        }

        if (moznost == 7) System.exit(0);
        }


    }

}