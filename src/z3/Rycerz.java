package z3;

public class Rycerz implements Postac, Walczaca {
    private int punktyZycia;
    private int sila;

    public Rycerz(int punktyZycia, int sila) {
        this.punktyZycia = punktyZycia;
        this.sila = sila;
    }

    public int getPunktyZycia() {
        return punktyZycia;
    }

    public int getSila() {
        return sila;
    }

    public void atakuj(Postac postac) {

    }
}
