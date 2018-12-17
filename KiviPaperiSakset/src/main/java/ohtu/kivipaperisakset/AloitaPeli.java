/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;



/**
 *
 * @author Harri
 */
public class AloitaPeli {
    
    IO Io;
    PeliTehdas PT;
    private static AbstractKPS peli;
    
    public AloitaPeli(){
        Io = new TapahtumaKuuntelija();
        
    }

    public void aloita(){
        tulostaOhje();
        peli = PeliTehdas.aloitaPeli(Io.readLine());
        peli.pelaa();
        
    }
    
    
    public void tulostaOhje(){
        System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");
    }
}
