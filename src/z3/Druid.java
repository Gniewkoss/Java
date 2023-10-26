package z3;

public class Druid implements Postac, Leczaca {
    private int punktyZycia;
    private int mana;

    public Druid(int punktyZycia, int mana) {
        this.punktyZycia = punktyZycia;
        this.mana = mana;
    }

    public int getPunktyZycia() {
        return punktyZycia;
    }

    public int getMana() {
        return mana;
    }

    public void wylecz(Postac postac) {
    }
    public void atakuj(Postac postac) {

    }
}

