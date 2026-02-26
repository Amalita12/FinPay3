package com.finpay3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class PrestataireTest {
    Prestataire p;


    @BeforeEach
    void setUp(){
        p = new Prestataire(7, "Orange");

    }

    @Test
    void testTotalFactures(){

        Facture facture1 = new Facture(101, null, p, 200, null,null,null );
        Facture facture2 = new Facture(102, null, p, 100, null,null,null );

        p.getFactures().add(facture1);
        p.getFactures().add(facture2);

        assertEquals(300, p.calculerTotalFacture());
    }


}