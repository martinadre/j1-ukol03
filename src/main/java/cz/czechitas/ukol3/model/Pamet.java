package cz.czechitas.ukol3.model;

public class Pamet {
    private  long kapacita;

    private long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    @Override
    public String toString() {
        return "Pamet{" +
                "kapacita=" + kapacita + " Hz" +
                '}';
    }
}
