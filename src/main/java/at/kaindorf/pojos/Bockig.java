package at.kaindorf.pojos;

public class Bockig implements Zustand{


    private Freundin freundin;

    public Bockig(Freundin freundin) {
        this.freundin = freundin;
    }

    @Override
    public void unterhalten() {
        System.out.println("Geh weg oida! Ich will net mit dir reden");

    }

    @Override
    public void kussGeben() {
        System.out.println("Host a glück ghobt 💋");
        freundin.setAktuellerZustand(new Neutral(freundin));
    }

    @Override
    public void veraergern() {
        System.out.println("Sag amal spinnst? Ich mach schluss!");
    }
}
