package PelaajatJaPalkinnot;

import java.util.Calendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esko Tuominen
 */
public class Palkinto {
    private String nimi;
    private double panos;
    private Calendar paivamaara;
    
    //Luodaan konstruktori
    public Palkinto (String nimi) {
        this.nimi = nimi;
        this.paivamaara = Calendar.getInstance();
    }
    
    public String getNimi() {
        return this.nimi;       
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public void setPaivamaara(int vuosi, int kuukausi, int paiva) {
        paivamaara.set(vuosi, kuukausi, paiva);        
    }
    
    public Calendar getPaivamaara() {
        return this.paivamaara;
    }
    
    
    
}
