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
public class Mision {
   private String nombre;
   private Estacion estacion;
   private ArrayList<Astronauta> astronautas;

    public Mision(String nombre, Estacion estacion) {
        this.nombre = nombre;
        this.estacion = estacion;
        astronautas = new ArrayList();
        
    }

    public ArrayList<Astronauta> getAstronautas() {
        return astronautas;
    }
    
    
    public void addAstronauta(Astronauta a){
        astronautas.add(a);
        a.setMisiones(this);
    }
}
