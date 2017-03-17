/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.ejemploclase;
import java.util.Scanner;

/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHEJEMPLOCLASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Cual es el color de tu coche?");
        String color = kb.nextLine();
        
        Automovil miCoche = new Automovil(color,2, "Mazda", 2017);
        miCoche.avanzar();
        System.out.println(miCoche.marca);
        miCoche.color = "Rojo";
        System.out.println(miCoche.color);
        
        
    }
    
}
