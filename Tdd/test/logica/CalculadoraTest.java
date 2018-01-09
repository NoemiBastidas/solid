/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gabriel
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int primerNumero = 10;
        int segundoNumero = 20;
        Calculadora instance = new Calculadora();
        int expResult = 30;
        int result = instance.sumar(primerNumero, segundoNumero);
        assertEquals(expResult, result);

    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int primerNumero = 50;
        int segundoNumero = 40;
        Calculadora instance = new Calculadora();
        int expResult = 10;
        int result = instance.restar(primerNumero, segundoNumero);
        assertEquals(expResult, result);
   
    }
    
}
