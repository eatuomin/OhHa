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
import java.util.HashMap;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Arvonta {
    private int monesko;
    private ArrayList<Kilpailija> kilpailijat;
    private Palkinto palkinto;
    //private Date paivamaara;
    
    public Arvonta() {
        this.monesko = 1;
        this.kilpailijat = new ArrayList<Kilpailija>();
        this.palkinto = palkinto;
    }
    
    public void lisaaKilpailija(Kilpailija kilpailija) {
        this.kilpailijat.add(kilpailija);
    }
    
    public void poistaKilpailija(Kilpailija kilpailija) {
        this.kilpailijat.remove(kilpailija);
    }
    
    public void poistaKilpailijaIndeksi(int indeksi) {
        this.kilpailijat.remove(indeksi);
    }
    
    public void maaritaPalkinto(String nimi, double panos) {
        this.palkinto = new Palkinto(nimi, panos);
    }
    
    
    /**
     *
     */
    public void arvontakierroksenKasvatus() {
        this.monesko = monesko + 1;
    }
    
    /**
     *
     */
    public void  tulostaKilpailijat() {
        int i = 1;
        for (Kilpailija k : kilpailijat) { 
            System.out.print("["+i+"]");
            System.out.println(k);
            i++;
        }
    }
    
   
   
        
       
    @Override
    public String toString() {
        return "Arvontakierros #" + monesko + "\n"
                + "Osallistujat:\n";
                
    }
    
    
}
