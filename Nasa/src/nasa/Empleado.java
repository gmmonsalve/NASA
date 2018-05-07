/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nasa;

/**
 *
 * @author GabrielaM
 */
public abstract class Empleado {
    
    public static int contID=0;
    int id;
   private String nombre;
   private Espacio espacio;

    public Empleado(String nombre, Espacio espacio) {
        id = contID++;
        this.nombre = nombre;
        this.espacio = espacio;
        espacio.addEmpleado(this);
    }

    public String getNombre() {
        return nombre;
    }
    
}
