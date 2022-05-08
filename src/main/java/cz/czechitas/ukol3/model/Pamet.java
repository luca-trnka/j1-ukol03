package cz.czechitas.ukol3.model;

public class Pamet {

    //vlastnosti
    private long kapacita;

    //metoda toString
    @Override
    public String toString() {
        return "Pamet (" + "kapacita=" + kapacita + ')';
    }

    //gettery a settery
    public long getKapacita() {
        return kapacita;
    }
    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }
}
