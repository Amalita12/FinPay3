package com.finpay3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentDAOTest {
    @Test
    @DisplayName("LE MONTANT ET NORMAL")
    void testMontantNormal() {
        double montant = 1000;
        double commission = montant * 0.02;
        assertEquals(20, commission);
    }

    @Test
    @DisplayName("LE MONTANT ET ZERO")
    void testMontantZero() {
        double montant = 0;
        double commission = montant * 0.02;
        assertEquals(0, commission);
    }
    @Test
    @DisplayName("LE MONTANT ET LEVE")
    void testMontantElevé(){
        double montant = 1000000;
        double commission = montant * 0.02;
        assertEquals(20000, commission);
    }


}