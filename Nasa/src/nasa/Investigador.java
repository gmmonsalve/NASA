/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasa;

import java.util.ArrayList;

/**
 *
 * @author GabrielaM
 */
public class Investigador extends Empleado{
    
    ArrayList<Proyecto> proyectos;
    
    public Investigador(String nombre, Espacio espacio) {
        super(nombre, espacio);
        proyectos = new ArrayList();
    }
    
}
