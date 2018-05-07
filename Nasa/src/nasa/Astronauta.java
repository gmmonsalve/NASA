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
public class Astronauta extends Empleado{
    
   private ArrayList<Mision> misiones;
    
    public Astronauta(String nombre, Estacion estacion) {
        super(nombre, estacion);
        misiones = new ArrayList();
    }

    public void setMisiones(Mision mis) {
        misiones.add(mis);
    }
    
    public int getnumMisiones(){
    return misiones.size();
    }

    
}
