package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionDeStockTest {

    @Test
    void si_le_contenu_de_la_fonction_traite_est_Tomate_alors_doit_renvoyer_G_DES_STOCKS_TOMATE() {
        // GIVEN
        final String contenu = "Tomate";

        // WHEN
        final String resultat = new GestionDeStock("").traite(contenu);

        // THEN
        assertEquals("G.DES.STOCKS:TOMATE", resultat, "Erreur: traite() ne renvoie pas la bonne valeur");
    }
}