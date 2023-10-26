package z4;

import java.util.ArrayList;
import java.util.List;

public class Rosja implements PanstwoAzjatyckie {
    private List<Panstwo> sasiedzi = new ArrayList<>();
    private Kontynent kontynent = Kontynent.AZJA;
    private int liczbaLudnosci = 144526636;
    private String stolica = "Moskwa";

    @Override
    public Kontynent getKontynent() {
        return kontynent;
    }

    @Override
    public int getLiczbaLudnosci() {
        return liczbaLudnosci;
    }

    @Override
    public String getStolica() {
        return stolica;
    }

    @Override
    public List<Panstwo> getSasiedzi() {
        return sasiedzi;
    }

    @Override
    public void dodajSasiada(Panstwo sasiad) {
        sasiedzi.add(sasiad);
    }

    @Override
    public void migruj(Panstwo cel, int liczbaLudzi) {
        this.liczbaLudnosci -= liczbaLudzi;

    }
}
