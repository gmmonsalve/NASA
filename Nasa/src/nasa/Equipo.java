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
public class Equipo {

    public static int contID = 0;
    private final int id;
    private final String nombre;
    private final Laboratorio laboratorio;
    private final ArrayList<Proyecto> proyectos;

    public Equipo(String nombre, Laboratorio laboratorio) {
        id = contID++;
        this.nombre = nombre;
        this.laboratorio = laboratorio;
        laboratorio.addEquipo(this);
        proyectos = new ArrayList();
    }

    public void setproyecto(Proyecto p) {
        proyectos.add(p);
    }

    public String getNombre() {
        return nombre;
    }

    public int getnumProyectos() {
        return proyectos.size();
    }

}
