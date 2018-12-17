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
public abstract class AbstractKPS {

    IO io;
    Tuomari tuomari;
    AI tekoaly;
    Boolean vsAi;

    public abstract void pelaa();

    public void alusta() {
        tuomari = new Tuomari();

        io = new TapahtumaKuuntelija();

    }

    public void peliLoop() {

        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = io.readLine();
        System.out.print("Toisen pelaajan siirto: ");
        String tokanSiirto = tokaSiirto(ekanSiirto);

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = io.readLine();

            tokanSiirto = tokaSiirto(ekanSiirto);

        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    public String tokaSiirto(String ekanSiirto) {
        System.out.print("Toisen pelaajan siirto: ");
        if (vsAi) {
            tekoaly.asetaSiirto(ekanSiirto);
            return tekoaly.annaSiirto();
        }
        return io.readLine();
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }

}
