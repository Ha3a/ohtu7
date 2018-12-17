package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends AbstractKPS {

    public void pelaa() {

        tekoaly = new TekoalyParannettu(20);
        vsAi = true;
        alusta();
        peliLoop();
    }

}
