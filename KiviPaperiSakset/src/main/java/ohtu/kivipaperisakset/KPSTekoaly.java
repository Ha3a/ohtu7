package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends AbstractKPS {

    public void pelaa() {
        tekoaly = new Tekoaly();
        vsAi = true;
        alusta();
        peliLoop();
    }

}
