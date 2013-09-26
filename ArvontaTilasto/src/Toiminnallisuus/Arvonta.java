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
    
    public void poistaKilpailija(Kilpailija kilpailija) {
        this.kilpailijat.remove(kilpailija);
    }
    
    public void poistaKilpailijaIndeksi(int indeksi) {
        this.kilpailijat.remove(indeksi);
    }
    

    /*
    public void maaritaPalkinto(String nimi) {
        this.palkinnot = new Palkinto(nimi);

    public void luoJaArvoPalkinto(Palkinto palkinto) {
        this.palkinnot.add(palkinto);

    }
    */
    
    /**
     *
     */
    public void arvontakierroksenKasvatus() {
        this.monesko = monesko + 1;
    }
    
    public int getArvontakierros() {
        return this.monesko;
    }
    
    
    
    /**
     *
     */
    //Tulostetaan kilpailijat numeroituna
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
        return  "Arvontakierros "+monesko+" Kilpailija indeksistä 0: " + kilpailijat.get(0);
                
    }
    
    
}
