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
public abstract class Espacio {
    String nombre;
    String direccion; 
    int id;
    public static int contEs = 0;
    ArrayList<Proyecto> proyectos;
    ArrayList<Empleado> empleados;
    
    public Espacio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.id = contEs++;
        proyectos=new ArrayList();
        empleados= new ArrayList();
    }
    
    public void addEmpleado(Empleado e){
        empleados.add(e);
    }
    
    public void addProyecto (Proyecto proyecto){
        proyectos.add(proyecto);
    }
    
    
    
    
}
