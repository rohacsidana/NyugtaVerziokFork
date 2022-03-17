package nyugtaprojektek;

/* Probléma:
a 3. tétel árát 650-ről átírtuk 1320-ra.
Így szinte minden változott, mindenhez hozzá kell nyúlni
Refaktorizálás:
anmit egynél többször használunk, 
azt kiszervezzük változóba és erre hivatkozunk
 */
public class Nyugta2 {

    static char karakter;
    static int darabHosszu = 18;
    static int darabRovid = 7;
    static String huf = "Ft";

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

    public static void main00(String[] args) {
        karakter = '*';
        kiirHosszuSor();
        System.out.println("     Nyugta 2");
        kiirHosszuSor();

        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);
        System.out.printf("Tétel 1:      %d %s\n", tetel2, huf);
        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);

        karakter = '=';
        kiirHosszuSor();
        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf("Összesen:   %d %s\n", osszesen, huf);

        karakter = '-';
        kiirHosszuSor();

        int kedvMertek = 10;
        int kedvezmeny = osszesen / kedvMertek;
        System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);

        System.out.printf("(%d%%)\n", kedvMertek);
        karakter = '=';
        kiirHosszuSor();

        int fizetendo = osszesen - kedvezmeny;

        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        double euro = fizetendo / 350.0;
        huf = "\u20ac";//EZ NEM JÓ!!!!
        System.out.printf("            %f %s\n", euro, huf);
        karakter = '-';
        kiirHosszuSor();
        System.out.println("");
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "     ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);

        System.out.print(" Dátum");
        System.out.print(rovidVonalValaszto);

        System.out.println("   Név");
        karakter = '*';
        kiirHosszuSor();

        System.out.println("        CÉG");
        kiirHosszuSor();
    }

}
