/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esko Tuominen
 */
import PelaajatJaPalkinnot.Palkinto;
import PelaajatJaPalkinnot.Kilpailija;
import Toiminnallisuus.Arvonta;

public class ArvontaTilasto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Arvonta arvonta = new Arvonta();
        
        Kilpailija pekka = new Kilpailija("Pekka");
        Kilpailija aino = new Kilpailija("Aino");
        Kilpailija juuso = new Kilpailija("Juuso");
        Kilpailija tenho = new Kilpailija("Tenho");
        
        arvonta.lisaaKilpailija(pekka);
        arvonta.lisaaKilpailija(aino);
        arvonta.lisaaKilpailija(juuso);
        arvonta.lisaaKilpailija(tenho);
        
        arvonta.maaritaPalkinto("Jakkara", 2.5);
        
        
        System.out.println(arvonta);
        arvonta.tulostaKilpailijat();
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*Kilpailija esko = new Kilpailija("Esko");
        
        System.out.println(esko);
        
        esko.voitonLisays();
        esko.osallistumisenLisays();
        
        System.out.println(esko);
        
        for (int i = 0; i < 15; i++) {
            esko.voitonLisays();
        }
        
        for (int i = 0; i < 15; i++) {
            esko.osallistumisenLisays();
        }
        
        
        
        System.out.println(esko);
        */
    }
}
