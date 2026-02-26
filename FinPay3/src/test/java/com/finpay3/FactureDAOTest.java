package com.finpay3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.*;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FactureDAOTest {
    @Test
    void genererFacture() {
        int id = 2;
        FactureDAO.facturePDF(id);

        File file = new File("Facture_" + id + ".pdf");
        assertTrue(file.exists());

    }
    @AfterEach
    void cleanUp(){
        new File("Facture_2.pdf").delete();
        System.out.println("file deleted");
    }
}
