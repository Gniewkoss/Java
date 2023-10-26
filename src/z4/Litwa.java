package z4;

import java.util.ArrayList;
import java.util.List;

public class Litwa implements PanstwoEuropejskie {
    private List<Panstwo> sasiedzi = new ArrayList<>();
    private Kontynent kontynent = Kontynent.EUROPA;
    private int liczbaLudnosci = 5000000;
    private String stolica = "Wilno";

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
