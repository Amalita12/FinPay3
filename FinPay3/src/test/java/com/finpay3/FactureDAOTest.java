package com.finpay3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FactureDAOTest {
    @Test
    void testPaiementTotal() {
        Facture f = new Facture((double)1000.0F);
        f.updateStatut((double)1000.0F);
        Assertions.assertEquals(Statut.PAID, f.getStatut());
    }

    @Test
    @DisplayName("paiement partiel")
    void testPaiementPartiel() {
        Facture f = new Facture((double)1000.0F);
        f.updateStatut((double)500.0F);
        Assertions.assertEquals(Statut.PENDING, f.getStatut());
    }

    @Test
    void testAucunPaiement() {
        Facture f = new Facture((double)1000.0F);
        f.updateStatut((double)0.0F);
        Assertions.assertEquals(Statut.PENDING, f.getStatut());
    }
}