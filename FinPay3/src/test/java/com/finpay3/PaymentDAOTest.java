package com.finpay3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import java.io.File;
import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class PaymentDAOTest {
    @Test
    void testMontantNormal() {
        double montant = (double)1000.0F;
        double commission = montant * 0.02;
        Assertions.assertEquals((double)20.0F, commission);
    }

    @Test
    void testMontantZero() {
        double montant = (double)0.0F;
        double commission = montant * 0.02;
        Assertions.assertEquals((double)0.0F, commission);
    }

    @Test
    void testMontantElevé() {
        double montant = (double)1000000.0F;
        double commission = montant * 0.02;
        Assertions.assertEquals((double)20000.0F, commission);
    }


    @Test
    void genererRecu(){
        int id = 1;
        PaymentDAO.GenerationDunRecuDePaiement(id,0,new Date(2026),0,0);
        File file = new File("recu_"+id+".pdf");
        assertTrue(file.exists());
    }

    @AfterEach
    void cleanUp(){
        new File("recu_1.pdf").delete();
        System.out.println("file deleted");
    }


}
