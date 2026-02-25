package com.finpay3;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactureDAOTest {
    @Test
    @DisplayName("PAIEMENT TOTAL")
    void testPaiementTotal() {
        Facture f = new Facture(1000);
        f.updateStatut(1000);
        assertEquals(Statut.PAID, f.getStatut());
    }

    @Test
    @DisplayName("paiement partiel")
    void testPaiementPartiel() {
        Facture f = new Facture(1000);
        f.updateStatut(500);
        assertEquals(Statut.PENDING, f.getStatut());
    }

    @Test
    @DisplayName("AUCUN PAIEMENT")
    void testAucunPaiement() {
        Facture f = new Facture(1000);
        f.updateStatut(0);
        assertEquals(Statut.PENDING, f.getStatut());
    }


}