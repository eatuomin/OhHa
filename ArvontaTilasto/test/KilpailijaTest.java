/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import PelaajatJaPalkinnot.Kilpailija;

/**
 *
 * @author Esko
 */
public class KilpailijaTest {
    
    public KilpailijaTest() {
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

    
     
     @Test
     public void konstruktoriAsettaaOikeatArvot() {
         Kilpailija kilpailija = new Kilpailija("Pertsa");
         
         String vastaus = kilpailija.toString();
         
         assertEquals("Pertsa\t\t 0 osallistumiskertaa\t 0 voittoa", kilpailija.toString());         
         
     }
     
     @Test
     public void voitonLisaysToimiiOikein() {
         Kilpailija kilpailija = new Kilpailija("Uomo");
         
         kilpailija.voitonLisays();
         
         assertEquals("Uomo\t\t 0 osallistumiskertaa\t 1 voittoa", kilpailija.toString());
         
         for (int i = 100; i > 0; i--) {
             kilpailija.voitonLisays();         }
         
         
         assertEquals("Uomo\t\t 0 osallistumiskertaa\t 101 voittoa", kilpailija.toString());        
         
         
     }
     
     @Test
     public void palkinnonLisaysToimiiOikein() {
         Kilpailija kilpailija = new Kilpailija("Siiri");
         
         kilpailija.osallistumisenLisays();
         
         assertEquals("Siiri\t\t 1 osallistumiskertaa\t 0 voittoa", kilpailija.toString());
         
         for (int i = 53; i > 0; i--) {
             kilpailija.osallistumisenLisays();         }
         
         
         assertEquals("Siiri\t\t 54 osallistumiskertaa\t 0 voittoa", kilpailija.toString());
     }
}