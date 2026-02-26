package com.finpay3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.finpay3.Main.rapportMois;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void genererRapport() {
        String currentMonth = "2026-02";
        rapportMois(currentMonth);
        File file = new File("rapport_" + currentMonth + ".xlsx");
        assertTrue(file.exists());
    }

    @AfterEach
    void cleanup(){
        new File("recu_2020-02.xlsx").delete();
        System.out.println("file deleted");
    }
}

