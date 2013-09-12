package Toiminnallisuus;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esko
 */
import PelaajatJaPalkinnot.Palkinto;
import PelaajatJaPalkinnot.Kilpailija;
import java.util.ArrayList;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Arvonta {
    private int monesko;
    private ArrayList<Kilpailija> kilpailijat;
    private ArrayList<Palkinto> palkinnot;
    //private Date paivamaara;
    
    public Arvonta() {
        this.monesko = 1;
        this.kilpailijat = new ArrayList<Kilpailija>();
        this.palkinnot = new ArrayList<Palkinto>();
    }
    
    public void lisaaKilpailija(Kilpailija kilpailija) {
        this.kilpailijat.add(kilpailija);
    }
    
    public void lisaaPalkinto(Palkinto palkinto) {
        this.palkinnot.add(palkinto);
    }
    
    public void ArvontakierroksenKasvatus() {
        this.monesko = monesko + 1;
    }
   
        
       
    public String toString() {
        return "Arvontakierros " + monesko;
    }
    
    
}
