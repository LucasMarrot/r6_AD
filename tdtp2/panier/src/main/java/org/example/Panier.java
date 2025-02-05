package org.example;

import java.util.Observable;

public class Panier {
    public final EventOrder eventOrder = new EventOrder(this);
    private GestionDeStock stock;
    private Comptabilite compta;
    private String contenu;
    private Observable sujet;

    public Panier (GestionDeStock pStock, Comptabilite pCompta) {
        this.stock = pStock;
        this.compta = pCompta;
        this.contenu = new String ("Contenu du panier");
        this.sujet = new Observable();
    }

    public String getContenu() {
        return this.contenu;
    };

    public void declencherCommande() {
        this.sujet.notifyObservers(contenu);
    }

    public class EventOrder extends Observable {
        private final Panier panier;

        public EventOrder(Panier panier) {
            this.panier = panier;
        }

        public void notifyObserver(){
            super.addObserver(compta);
            super.addObserver(stock);
            this.setChanged();
            super.notifyObservers();
        }

        public void declencherCommande() {
            stock.traite(panier.getContenu());
            compta.traite(panier.getContenu());
        }
    }
}
