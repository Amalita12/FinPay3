package com.finpay3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.*;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FactureDAOTest {
    @Test
    void testPaiementTotal() {
        Facture f = new Facture((double) 1000.0F);
        f.updateStatut((double) 1000.0F);
        Assertions.assertEquals(Statut.PAID, f.getStatut());
    }

    @Test
    @DisplayName("paiement partiel")
    void testPaiementPartiel() {
        Facture f = new Facture((double) 1000.0F);
        f.updateStatut((double) 500.0F);
        Assertions.assertEquals(Statut.PENDING, f.getStatut());
    }

    @Test
    void testAucunPaiement() {
        Facture f = new Facture((double) 1000.0F);
        f.updateStatut((double) 0.0F);
        Assertions.assertEquals(Statut.PENDING, f.getStatut());
    }

    @Test
    void genererFacture() {
        int id = 2;
        FactureDAO.facturePDF(id);

        File file = new File("Facture_" + id + ".pdf");
        assertTrue(file.exists());

    }

    @AfterEach
    void cleanUp() {
        new File("Facture_2.pdf").delete();
        System.out.println("file deleted");
    }
}

