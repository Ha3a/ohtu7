package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends AbstractKPS{


    
    public void pelaa() {
        vsAi = false;
        alusta();
        peliLoop();
    }

}