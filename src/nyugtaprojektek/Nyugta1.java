package nyugtaprojektek;

public class Nyugta1 {

    static char karakter;
    static int darabHosszu = 18;
    static int darabRovid = 7;
    static String forint = "Ft";

    private static void kiirHosszuSor() {
        for (int i = 0; i < darabHosszu; i++) {
            System.out.print(karakter);
        }
        System.out.println("");
    }

    private static void kiirRovidSor() {
        for (int i = 0; i < darabRovid; i++) {
            System.out.print(karakter);
        }        
    }

    private static void szokozIras(int dbSzokoz) {
        for (int i = 0; i < dbSzokoz; i++) {
            System.out.print(" ");
        }
    }

    public static void main11(String[] args) {
        karakter = '*';
        kiirHosszuSor();
        szokozIras(5);
        System.out.println("Nyugta 1");
        kiirHosszuSor();
        System.out.println("Tétel 1:    350 Ft");
        System.out.println("Tétel 2:     90 Ft");
        System.out.println("Tétel 3:    650 Ft");
        karakter = '=';
        kiirHosszuSor();
        System.out.println("Összesen:  1090 "+forint);
        karakter = '-';
        kiirHosszuSor();
        System.out.println("Kedvezmény: 109 "+forint);
        System.out.println("(10%)");
        karakter = '=';
        kiirHosszuSor();
        System.out.println("Fizetendő:  981 "+forint);
        karakter = '-';
        kiirHosszuSor();
        System.out.println("");
        karakter = '_';
        kiirRovidSor();
        szokozIras(3);
        kiirRovidSor();
        System.out.println("");
        System.out.print(" Dátum");
        szokozIras(3);
        szokozIras(3);
        System.out.println("Név");
        karakter = '*';
        kiirHosszuSor();
        szokozIras(8);
        System.out.println("CÉG");
        karakter = '*';
        kiirHosszuSor();
    }

}
