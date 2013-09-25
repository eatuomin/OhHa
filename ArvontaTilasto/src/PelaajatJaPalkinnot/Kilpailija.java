package PelaajatJaPalkinnot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Esko Tuominen
 */
public class Kilpailija {
    private String nimi;
    private int voittojenLukumaara;
    private int osallistumiskerrat;
    
    //Luodaan konstruktori
    public Kilpailija (String nimi) {
        this.nimi = nimi;
        this.voittojenLukumaara = 0;
        this.osallistumiskerrat = 0;
    }
    
    public void voitonLisays() {
        this.voittojenLukumaara = voittojenLukumaara +1;
    }
    
    public void osallistumisenLisays() {
        this.osallistumiskerrat = osallistumiskerrat + 1;
    }
    
     public String getNimi() {
        return this.nimi;
    }
     
    public int getVoittojenLukumaara() {
        return this.voittojenLukumaara;
    }
    
    public int getOsallistumiskerrat() {
        return this.osallistumiskerrat;
    }   
    
    
    @Override
    public String  toString() {
        return this.nimi + "\t\t " + this.osallistumiskerrat + " osallistumiskertaa\t " + this.voittojenLukumaara + " voittoa";
    }
    
}
