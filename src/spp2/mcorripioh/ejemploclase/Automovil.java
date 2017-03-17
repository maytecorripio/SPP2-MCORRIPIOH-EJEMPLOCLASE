/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.ejemploclase;

/**
 *
 * @author MayteCorripio
 */
public class Automovil {
    //Atributos
    String color;
    int numOcupantes;
    String marca;
    int modelo;
    
    //Funciones
    //Constructor
    public Automovil(){
        color = "rojo";
        numOcupantes = 5;
        marca = "Ford";
        modelo = 2006;
        
    }
    public Automovil (String color, int numOcupantes, String marca, int modelo){
        this.color= color;
        this.numOcupantes= numOcupantes;
        this.marca = marca;
        this.modelo = modelo;
        
    }
    
    public void avanzar(){
        System.out.println("El automovil avanza");
    }
    
    public void detenerse(){
        System.out.println("El automovil se detiene");
    }
    
    public void retroceder(){
        System.out.println("El automovil retrocede");
    }
}
