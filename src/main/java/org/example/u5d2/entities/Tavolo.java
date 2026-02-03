package org.example.u5d2.entities;

public class Tavolo {

    private int numero;
    private int maxCoperti;
    private statoTavolo stato;

    public Tavolo(int maxCoperti, int numero, statoTavolo stato) {
        this.maxCoperti = maxCoperti;
        this.numero = numero;
        this.stato = stato;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }

    public void setMaxCoperti(int maxCoperti) {
        this.maxCoperti = maxCoperti;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public statoTavolo getStato() {
        return stato;
    }

    public void setStato(statoTavolo stato) {
        this.stato = stato;
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "maxCoperti=" + maxCoperti +
                ", numero=" + numero +
                ", stato=" + stato +
                '}';
    }
}
