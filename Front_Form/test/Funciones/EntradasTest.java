/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AnX
 */
public class EntradasTest {
    
    public EntradasTest() {
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
     * Test of isRut method, of class Entradas.
     */
    @Test
    public void testIsRut() {
        System.out.println("isRut");
        String rut = "19.208.616-7";
        boolean expResult = false;
        boolean result = Entradas.isRut(rut);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isNombre method, of class Entradas.
     */
    @Test
    public void testIsNombre() {
        System.out.println("isNombre");
        String Nom = "Alfred";
        Entradas instance = new Entradas();
        boolean expResult = false;
        boolean result = instance.isNombre(Nom);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isApellido_Paterno method, of class Entradas.
     */
    @Test
    public void testIsApellido_Paterno() {
        System.out.println("isApellido_Paterno");
        String AP = "ulfric";
        Entradas instance = new Entradas();
        boolean expResult = false;
        boolean result = instance.isApellido_Paterno(AP);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isApellido_Materno method, of class Entradas.
     */
    @Test
    public void testIsApellido_Materno() {
        System.out.println("isApellido_Materno");
        String AM = "Proud";
        Entradas instance = new Entradas();
        boolean expResult = false;
        boolean result = instance.isApellido_Materno(AM);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        

    }
    /**
     * Test of isEmail method, of class Entradas.
     */
    @Test
    public void testIsEmail() {
        System.out.println("isEmail");
        String em = "alguien@algo.com";
        Entradas instance = new Entradas();
        boolean expResult = false;
        boolean result = instance.isEmail(em);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isTelefono method, of class Entradas.
     */
    @Test
    public void testIsTelefono() {
        System.out.println("isTelefono");
        int tel = 123456789;
        Entradas instance = new Entradas();
        boolean expResult = false;
        boolean result = instance.isTelefono(tel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isMonto method, of class Entradas.
     */
    @Test
    public void testIsMonto() {
        System.out.println("isMonto");
        int money = 1000000;
        Entradas instance = new Entradas();
        boolean expResult = false;
        boolean result = instance.isMonto(money);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isValidarFecha method, of class Entradas.
     */
    @Test
    public void testIsValidarFecha() {
        System.out.println("isValidarFecha");
        String fecha = "06/09/2018";
        boolean expResult = true;
        boolean result = Entradas.isValidarFecha(fecha);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
