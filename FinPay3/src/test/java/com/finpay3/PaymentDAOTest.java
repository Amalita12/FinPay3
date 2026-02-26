package com.finpay3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.sql.Date;

import static org.junit.jupiter.api.Assertions.*;

class PaymentDAOTest {
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