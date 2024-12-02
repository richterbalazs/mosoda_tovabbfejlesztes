package szamalk.hu.modell;

public class Ing extends Ruha {
    private double szinIntenzitas;

    public Ing(String tulaj) {
        super(tulaj);
        this.szinIntenzitas = 100;
    }

    public double getSzinIntenzitas() {
        return szinIntenzitas;
    }

    public void setMos(boolean tiszta){
        super.setTisztaE(tiszta);
        szinIntenzitas *= 0.97;
    }

    @Override
    public String toString() {
        return "Ing{" +
                "szinIntenzitas=" + szinIntenzitas +
                '}';
    }
}
