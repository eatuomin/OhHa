package PelaajatJaPalkinnot;

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
    
    //Luodaan konstruktori
    public Palkinto (String nimi, double panos) {
        this.nimi = nimi;
        this.panos = panos;
    }
    
    public String getNimi() {
        return this.nimi;       
    }
    
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    public double getPanos() {
        return this.panos;
    }
    
    public void setPanos(double panos) {
        this.panos = panos;
    }
    
    
    
}