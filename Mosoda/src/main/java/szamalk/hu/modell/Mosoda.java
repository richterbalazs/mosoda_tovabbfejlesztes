package szamalk.hu.modell;

import java.util.ArrayList;
import java.util.List;

public class Mosoda {
    private int db;
    public Ruha[] ruhak;


    public Mosoda(Ruha[] ruhak) {
        new Mosoda(5);
    }

    public Mosoda(int db) {
        this.ruhak = new Ruha[db];

    }

    public void bevesz(Ruha[] ruhak) {
        for (int i = 0; i < this.ruhak.length; i++) {
            if (this.ruhak[i] == null) {
                this.ruhak[i] = ruhak[i];
                System.out.println("Sikeresen bevetted a ruhát a mosodába: " + ruhak[i]);
                return;
            }
        }
        System.out.println("A mosoda tele van, nem tudtunk több ruhát felvenni.");
    }

    public void kiad(String tulajdonos){
        for (int i = 0; i < ruhak.length; i++){
            if(ruhak[i] != null && ruhak[i].getTulaj().equals(tulajdonos)){
                System.out.println("A következő ruha sikeresen kiadásra került: " + ruhak[i]);
                ruhak[i] = null;
                return;
            }
        }
    }

    public void mos() {

        for (int i = 0; i < ruhak.length; i++) {
            if (ruhak[i] != null) {
                ruhak[i].setTisztaE(true);
                System.out.println("A következő ruha tisztára mosva: " + ruhak[i]);
            }
        }
    }
}
