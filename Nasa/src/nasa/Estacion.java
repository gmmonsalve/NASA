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
public class Estacion extends Espacio {
    ArrayList<Mision> misiones;
    
    
    public Estacion(String nombre, String direccion) {
        super(nombre, direccion);
        misiones = new ArrayList();
        
    }
    
    public void addMision (Mision mision){
        misiones.add(mision);
    }
    
}
