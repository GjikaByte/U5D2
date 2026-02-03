package org.example.u5d2.entities;

import java.time.LocalTime;
import java.util.List;

public class Ordine {

    private int numOrdine;
    private StatoOrdine stato;
    private int numCoperti;
    private double costoCoperto;
    private LocalTime orario;
    private List<Item> elementi;
    private Tavolo tavolo;


    public double getImportoTotale() {
        double tot = elementi.stream()
                .mapToDouble(Item -> Item.getPrice())
                .sum();
        return tot + (numCoperti * costoCoperto);
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }

    public void setCostoCoperto(double costoCoperto) {
        this.costoCoperto = costoCoperto;
    }

    public List<Item> getElementi() {
        return elementi;
    }

    public void setElementi(List<Item> elementi) {
        this.elementi = elementi;
    }

    public int getNumCoperti() {
        return numCoperti;
    }

    public void setNumCoperti(int numCoperti) {
        this.numCoperti = numCoperti;
    }

    public int getNumOrdine() {
        return numOrdine;
    }

    public void setNumOrdine(int numOrdine) {
        this.numOrdine = numOrdine;
    }

    public LocalTime getOrario() {
        return orario;
    }

    public void setOrario(LocalTime orario) {
        this.orario = orario;
    }

    public StatoOrdine getStato() {
        return stato;
    }

    public void setStato(StatoOrdine stato) {
        this.stato = stato;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

    public Ordine(double costoCoperto, List<Item> elementi, int numCoperti, int numOrdine, LocalTime orario, StatoOrdine stato, Tavolo tavolo) {
        this.costoCoperto = costoCoperto;
        this.elementi = elementi;
        this.numCoperti = numCoperti;
        this.numOrdine = numOrdine;
        this.orario = orario;
        this.stato = stato;
        this.tavolo = tavolo;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "costoCoperto=" + costoCoperto +
                ", numOrdine=" + numOrdine +
                ", stato=" + stato +
                ", numCoperti=" + numCoperti +
                ", orario=" + orario +
                ", elementi=" + elementi +
                '}';
    }
}
