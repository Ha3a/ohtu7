/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.kivipaperisakset;

import java.util.Scanner;

/**
 *
 * @author Harri
 */
public class TapahtumaKuuntelija implements IO{
    
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String readLine() {
        return scanner.nextLine();
    }

    @Override
    public String writeLine(String toPrint) {
        return scanner.nextLine();
    }
    
}
