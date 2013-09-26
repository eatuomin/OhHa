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
import Toiminnallisuus.Arvonta;
import PelaajatJaPalkinnot.Kilpailija;

/**
 *
 * @author Esko
 */
public class ArvontaTest {
    
    public ArvontaTest() {
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
        Arvonta arvonta = new Arvonta();
        
        assertEquals(1, arvonta.getArvontakierros());
    }
    
    @Test
    public void arvontakierroksenKasvatusTesti() {
        
        Arvonta arvonta = new Arvonta();
        
        arvonta.arvontakierroksenKasvatus();
        
        assertEquals(2, arvonta.getArvontakierros());
        
        arvonta.arvontakierroksenKasvatus();
        arvonta.arvontakierroksenKasvatus();
        
        assertEquals(4, arvonta.getArvontakierros());

        
        
        
    }
    
    @Test
    public void lisaaKilpailijaTesti() {
        Arvonta arvonta = new Arvonta();
        Kilpailija pekka = new Kilpailija("Pekka");
        
        arvonta.lisaaKilpailija(pekka);
        
        assertEquals("Pekka", pekka.getNimi());        
        
    }
    
        @Test
    public void poistaKilpailijaTesti() {
        Arvonta arvonta = new Arvonta();
        Kilpailija pekka = new Kilpailija("Pekka");
        Kilpailija pokka = new Kilpailija("Pokka");
        Kilpailija pakka = new Kilpailija("Pakka");
        
        arvonta.lisaaKilpailija(pekka);
        arvonta.lisaaKilpailija(pokka);
        arvonta.lisaaKilpailija(pakka);

        
       
        arvonta.poistaKilpailijaIndeksi(0);
        
            
        assertEquals("Arvontakierros 1 Kilpailija indeksistä 0: Pokka\t\t 0 osallistumiskertaa\t 0 voittoa", arvonta.toString());
        
        
    }

}