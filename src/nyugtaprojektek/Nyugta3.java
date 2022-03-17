package nyugtaprojektek;


/* Probléma:
tüntessük el a kézzel beírt szóközöket,
a huf ne tartalmazzon eurót
a kedvezmény helyett legyen szervízdíj, amit hozzá kell adni a végössdzeghez
 */
public class Nyugta3 {

    static char karakter;
    static int darabKiirandoKarakter = 18;
    static String forint = "Ft";
    static String penznem = "Ft";
    static int osszesen;
    static int arak[] = new int[3];

    private static void karaktereketKiir() {
        for (int i = 0; i < darabKiirandoKarakter; i++) {
            System.out.print(karakter);
        }
        if (darabKiirandoKarakter > 10) {
            System.out.println("");
        }
        
    }


    private static void szokozIras(int dbSzokoz) {
        for (int i = 0; i < dbSzokoz; i++) {
            System.out.print(" ");
        }
    }

    static void alairasok() {
        karakter = '_';
        darabKiirandoKarakter = 7;
        karaktereketKiir();
        szokozIras(4);
        karaktereketKiir();
        System.out.println("");
        szokozIras(1);
        System.out.print("Dátum");
        szokozIras(7);
        System.out.println("Név");
        darabKiirandoKarakter = 18;
        karakter = '*';
        karaktereketKiir();
        szokozIras(7);
        System.out.println("CÉG");
        karaktereketKiir();
    }

    private static int szervizDijKiiras() {
        int szervizDijMertek = 10;
        int szervizDij = osszesen / szervizDijMertek;
        System.out.printf("%10s: %5d %s\n", "Szervízdíj", szervizDij, penznem);
        System.out.printf("(%d%%)\n", szervizDijMertek);
        int fizetendo = osszesen + szervizDij;
        return fizetendo;
    }

    static void fizetendoKiiras() {
        System.out.printf("%10s:  %d %s\n", "Fizetendő", szervizDijKiiras(), penznem);
        double euro = szervizDijKiiras() / 350.0;
        penznem = "\u20ac";
        System.out.printf("%10s%7.2f %s\n", "", euro, penznem);
    }

    static void tetelKiiras() {
        for (int i = 0; i < arak.length; i++) {
            System.out.printf("%s%d: %5d %s\n", "Tétel ", i + 1, arak[i], penznem);
            if (i < arak.length - 1) {
                szokozIras(3);
            }
            osszesen += arak[i];
        }
    }

    public static void main(String[] args) {
        karakter = '*';
        karaktereketKiir();
        System.out.printf("%14s\n", "Nyugta 3");
        karaktereketKiir();

        arak[0] = 350;
        arak[1] = 90;
        arak[2] = 1320;

        szokozIras(3);
        tetelKiiras();

        karakter = '=';
        karaktereketKiir();

        System.out.printf("%10s: %5d %s\n", "Összesen", osszesen, penznem);

        karakter = '-';
        karaktereketKiir();

        karakter = '=';
        karaktereketKiir();

        fizetendoKiiras();

        karakter = '-';
        karaktereketKiir();

        System.out.println("");
        alairasok();
    }

}
