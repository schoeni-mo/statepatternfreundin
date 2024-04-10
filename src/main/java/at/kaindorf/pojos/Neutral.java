package at.kaindorf.pojos;

public class Neutral implements Zustand{


    private Freundin freundin;

    public Neutral(Freundin freundin){
        this.freundin = freundin;
    }

    @Override
    public void unterhalten() {
        System.out.println("Hallo");

    }

    @Override
    public void kussGeben() {
        System.out.println("Hihi :-)");
        freundin.setAktuellerZustand(new Froehlich(freundin));
    }

    @Override
    public void veraergern() {
        System.out.println("Du oarsch!");
        freundin.setAktuellerZustand(new Bockig(freundin));
    }
}
