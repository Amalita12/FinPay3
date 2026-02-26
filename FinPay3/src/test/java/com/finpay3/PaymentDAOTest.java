package com.finpay3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
