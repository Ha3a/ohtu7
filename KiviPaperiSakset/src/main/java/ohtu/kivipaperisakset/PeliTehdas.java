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
public class PeliTehdas {
    
    
    
    public static AbstractKPS aloitaPeli(String muoto){
        if(muoto.endsWith("a")){
            
            return new KPSPelaajaVsPelaaja();
            
        }else if (muoto.endsWith("b")){
            return new KPSTekoaly();
        } else {
            return new KPSParempiTekoaly();
        }
    }
    
}
