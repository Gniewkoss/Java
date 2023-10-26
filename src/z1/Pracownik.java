package z1;

public class Pracownik {
    private Pracownik przelozony;
    private int pensja;

    public Pracownik(Pracownik przelozony, int pensja) {
        this.przelozony = przelozony;
        this.pensja = pensja;
    }

    public Pracownik(Pracownik przelozony) {
        this.przelozony = przelozony;
        this.pensja = obliczPensje(przelozony.getPensja());
    }

    public int getPensja() {
        return pensja;
    }

    public Pracownik getPrzelozony() {
        return przelozony;
    }

    private int obliczPensje(int pensjaPrzeloznego) {
        return (int) (0.9 * pensjaPrzeloznego);
    }
}
