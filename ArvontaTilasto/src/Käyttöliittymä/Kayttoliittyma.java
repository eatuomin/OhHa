/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Käyttöliittymä;

import PelaajatJaPalkinnot.Kilpailija;
import Toiminnallisuus.Arvonta;

import java.util.Scanner;

/**
 *
 * @author Esko Tuominen
 */
public class Kayttoliittyma {
    private Scanner lukija;
    private Arvonta arvonta;
    
    public Kayttoliittyma(Scanner lukija) {
        this.lukija = lukija; 
        this.arvonta = new Arvonta();
    }
    
    public void kaynnista() {
        while (true) {
          //  System.out.println("Lista komennoista:\n(1) Lisää käyttäjä.\n(2) Poista käyttäjä.\n(3) Listaa käyttäjät.\n(q) Lopeta.");
            
            String komento = lukija.nextLine();
            
            if (komento.equals("q")) {
                break;
            }
            
            hoidaKomento(komento);
        }
    }
    
    public void hoidaKomento(String komento) {
        switch (komento) {
            case "1":
                komentoLisaaKayttaja();
                break;
            case "2":        
                komentoPoistaKayttaja();
                break;
            case "3":
                komentoTulostaKayttajat();
        }
    }
    
    private boolean komentoLisaaKayttaja() {
        Kilpailija kilpailija = lueKayttaja();
        
        //Lisätään ArrayListiin uusi kilpailija, kunhan nimeksi on annettu jotain.
        if (kilpailija != null) {
            arvonta.lisaaKilpailija(kilpailija);
        }        
        return kilpailija != null;
    }
    
    private Kilpailija lueKayttaja() {
        System.out.println("Luodaan uusi kilpailija.");
        System.out.print("Anna nimi: ");
        String kayttaja = lukija.nextLine();
        return new Kilpailija(kayttaja);       
       
    }
    
    private void komentoTulostaKayttajat() {       
        
        arvonta.tulostaKilpailijat();
    }
    
    public void komentoLisaaKayttajia() {         
        System.out.println("Kuinka monta käyttäjää haluat lisätä? (max 10 kerrallaan)");
        int luku;
        
        //Varmistetaan, että käyttäjä antaa positiivisen kokonaisluvun väliltä 1-10.
        do {
            while (!lukija.hasNextInt()) {
                System.out.println("Anna positiivinen kokonaisluku (1-10).");
                lukija.next();
            }
            luku = lukija.nextInt();
        } while (luku > 0 && luku <= 10 );
        
        
    }
    
    public void komentoPoistaKayttaja() {        
        System.out.println("Kenet haluat poistaa?");
        komentoTulostaKayttajat();
        System.out.print("\nAnna indeksi: ");
        int poistettava = lukija.nextInt();
        
        arvonta.poistaKilpailijaIndeksi(poistettava-1);
            
        }
        
   
    
    public void komentoArvonta() {
        
    }
    
    public int annaPositiivinenKokonaisluku(int luku) {
        while(true) {
            
        }
        
    }
    

    
}
