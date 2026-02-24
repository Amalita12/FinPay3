package com.finpay3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FactureDAOTest {

private int num1;
private int num2;

@BeforeAll
static void setupBeforeAll(){
    System.out.println("Before All tests");

}

@AfterAll
    static void cleanupAfterAll(){
    System.out.println("Afetr all tests");
}

@BeforeEach
    void setpBeforeEach(){
    System.out.println("Before each test");
    num1 = 2;
    num2 = 3;
}

 @AfterEach
     void cleanupAfterEach(){
     System.out.println("After each test");

 }

 @Test
    void testAddTwoNumbers(){
     System.out.println("Adding two numbers");
     int result = num1+num2;
     assertEquals(7,result, "The sum should be 5");
 }
 @Test
    void testAnotherMethod(){
     System.out.println("Another test method");
 }
}