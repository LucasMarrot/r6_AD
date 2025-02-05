package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComptabiliteTest {

    @Test
    void si_le_contenu_de_la_fonction_traite_est_Tomate_alors_doit_renvoyer_comptabilite_tomate() {
        // GIVEN
        final String contenu = "Tomate";

        // WHEN
        final String resultat = new Comptabilite("").traite(contenu);

        // THEN
        assertEquals("comptabilité:tomate", resultat, "Erreur: traite() ne renvoie pas la bonne valeur");
    }
}