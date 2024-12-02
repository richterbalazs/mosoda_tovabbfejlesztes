package szamalk.hu.modell;

public class Ruha {
    private String tulaj;
    private boolean tisztaE = false;

    public Ruha(String tulaj) {
        this.tulaj = tulaj;
    }

    public String getTulaj() {
        return tulaj;
    }

    public boolean isTisztaE(){
        return tisztaE;
    }

    public void setTisztaE(boolean tisztaE)
    {
        this.tisztaE = tisztaE;
    }

    @Override
    public String toString() {
        return "Ruha{" +
                "tulaj='" + tulaj + '\'' +
                ", tisztaE=" + tisztaE +
                '}';
    }
}
