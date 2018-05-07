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
public class Proyecto {
    ArrayList<Equipo>equipos;
    ArrayList<Espacio> espacios;
    ArrayList<Investigador> investigadores;
    String nombre;

    public Proyecto(String nombre, Espacio espacio){
        this.nombre=nombre;
        espacios=new ArrayList();
        this.espacios.add(espacio);
        equipos=new ArrayList();
        investigadores=new ArrayList();
        
    }
    
    public void addInvestigador(Investigador i){
        investigadores.add(i);
    }
    
    public void addEquipo(Equipo e){
        equipos.add(e);
        e.setproyecto(this);
    }
    
    
}
