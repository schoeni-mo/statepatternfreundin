package at.kaindorf.pojos;

public class Froehlich implements Zustand{

    private Freundin freundin;

    public Froehlich(Freundin freundin) {
        this.freundin = freundin;
    }

    @Override
    public void unterhalten() {
        System.out.println("Mir geht supi und dir?");
    }

    @Override
    public void kussGeben() {
        System.out.println("Mei du bist liab heute 😘");
    }

    @Override
    public void veraergern() {
        System.out.println("Gehts noch? :|");
        freundin.setAktuellerZustand(new Bockig(freundin));
    }
}
