package at.kaindorf.pojos;

public class Freundin {
    //Mögliche Launen der Freudin
    private static final int NEUTRAL = 0;
    private static final int BOCKIG = 1;
    private static final int FROEHLICH = 2;

    //Zahl repräsentiert aktuellen Zustand
    private Zustand aktuellerZustand;

    public Freundin() {
        setAktuellerZustand(new Neutral(this));
    }

    public void setAktuellerZustand(Zustand aktuellerZustand) {
        this.aktuellerZustand = aktuellerZustand;
    }


    public void unterhalten() {
        aktuellerZustand.unterhalten();
    }

    public void kussGeben() {
        aktuellerZustand.kussGeben();
    }

    public void verärgern() {
        aktuellerZustand.veraergern();
    }
}
