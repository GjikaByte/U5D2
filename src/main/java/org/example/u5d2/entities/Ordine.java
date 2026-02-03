package org.example.u5d2.entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    public Ordine(int numCoperti, Tavolo tavolo) {
        Random rndm = new Random();
        if (tavolo.getMaxCoperti() <= numCoperti)
            throw new RuntimeException("Numero coperti maggiore di numero massimo posti sul tavolo!");
        this.numOrdine = rndm.nextInt(1000, 100000);
        this.stato = StatoOrdine.IN_CORSO;
        this.numCoperti = numCoperti;
        this.orario = LocalTime.now();
        this.elementi = new ArrayList<>();
        this.tavolo = tavolo;
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
