package szamalk.hu;

import szamalk.hu.modell.Mosoda;
import szamalk.hu.modell.Ruha;

public class Program {
    public static void main(String[] args) {
        Mosoda mosoda = new Mosoda(5);

        Ruha ruha1 = new Ruha("János");
        Ruha ruha2 = new Ruha("Pista");
        Ruha ruha3 = new Ruha("Géza");
        Ruha ruha4 = new Ruha("Béla");
        Ruha ruha5 = new Ruha("Béci");

        // hozzáadjuk a meglévő tömbhöz a ruhákat

        Ruha[] ruhak = {ruha1, ruha2, ruha3, ruha4, ruha5};
        mosoda.bevesz(ruhak);

        // mosodában lévő ruhák print

        System.out.println("Mosodában lévő ruhák:");
        for (int i = 0; i < mosoda.ruhak.length; i++) {
            if (mosoda.ruhak[i] != null) {
                System.out.println(mosoda.ruhak[i]);
            }
        }

        // mosás
        mosoda.mos();


        // mosás után a mosodában lévő ruháknak a kiírása
        System.out.println("Mosodában lévő ruhák:");
        for (int i = 0; i < mosoda.ruhak.length; i++) {
            if (mosoda.ruhak[i] != null) {
                System.out.println(mosoda.ruhak[i]);
            }
        }

        // mosás utáni állapot | Tiszta-e vagy sem
        System.out.println("\nMosás után (tiszta=true):");
        ruha1.setTisztaE(true);
        ruha2.setTisztaE(true);

        System.out.println("\nMosodában lévő ruhák mosás után:");
        for (int i = 0; i < mosoda.ruhak.length; i++) {
            if (mosoda.ruhak[i] != null) {
                System.out.println(mosoda.ruhak[i]);
            }

        }
    }


}