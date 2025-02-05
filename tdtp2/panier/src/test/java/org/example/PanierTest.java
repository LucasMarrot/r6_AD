package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PanierTest {

    @Test
    void si_un_panier_a_pour_contenu_Contenu_du_panier_alors_getContenu_doit_renvoyer_Contenu_du_panier() {
        // GIVEN
        final Comptabilite compta = new Comptabilite("");
        final GestionDeStock stock = new GestionDeStock("");
        final Panier panier = new Panier(stock, compta);

        // WHEN
        final String resultat = panier.getContenu();

        // THEN
        assertEquals("Contenu du panier", resultat, "Erreur: getContenu() ne renvoie pas correctement le contenu du panier");
    }

    @BeforeEach
    void setUp(){
        stock = mock(GestionDeStock);
    }

    @Test
    void declenchement_commande(){
        // GIVEN
        Panier.EventOrder sujet = panier.new EventOrder();

        // WHEN
        sujet.addObserver(compta);
        sujet.addObserver(stock);
    }
}