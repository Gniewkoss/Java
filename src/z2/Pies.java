package z2;

public class Pies extends ImienneZwierze {

    private int wiek;

    public Pies(int wiek, String imie) {
        super(imie);
        this.wiek = wiek;
    }

    @Override
    public int getIleNog() {
        return 4;
    }

    @Override
    public int getWiek() {
        return wiek;
    }

    @Override
    public String dajGlos() {
        return "Hau hau";
    }
}
