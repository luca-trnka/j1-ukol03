package cz.czechitas.ukol3.model;

public class Disk {

    //vlastnosti
    private long kapacita;
    private long vyuziteMisto;

    //metoda toString

    @Override
    public String toString() {
        return "Disk (" + "kapacita=" + kapacita + ", vyuziteMisto=" + vyuziteMisto + ')';
    }

    //gettery a settery
    public long getKapacita() {
        return kapacita;
    }
    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }


    public long getVyuziteMisto() {
        return vyuziteMisto;
    }
    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }
}
