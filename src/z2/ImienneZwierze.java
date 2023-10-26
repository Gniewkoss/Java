package z2;

public abstract class ImienneZwierze extends Zwierze {
    private String imie;

    public ImienneZwierze(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
}
