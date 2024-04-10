package at.kaindorf;

import at.kaindorf.pojos.Freundin;
import at.kaindorf.pojos.Neutral;

public class Main {
    public static void main(String[] args) {
        Freundin freundin = new Freundin();
        freundin.unterhalten();
        freundin.verärgern();
        freundin.unterhalten();
        freundin.kussGeben();
        freundin.kussGeben();
        freundin.unterhalten();
        freundin.verärgern();
    }
}
