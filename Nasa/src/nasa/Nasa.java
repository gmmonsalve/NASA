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
public class Nasa {

    static ArrayList<Empleado> empleados;
    ArrayList<Proyecto> proyectos;
    ArrayList<Mision> misiones;
    ArrayList<Espacio> espacios;
    static ArrayList<Equipo> equipos;

    public Nasa() {
        empleados = new ArrayList();
        proyectos = new ArrayList();
        misiones = new ArrayList();
        espacios = new ArrayList();
        equipos = new ArrayList();
    }

    public void addEspacio(Espacio e) {
        espacios.add(e);
    }

    public void addEquipo(Equipo e) {
        equipos.add(e);
    }

    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void addMision(Mision m) {
        misiones.add(m);
    }

    public void addProyecto(Proyecto p) {
        proyectos.add(p);
    }

    public Laboratorio getLab(int i) {
        int cont = 0;
        for (Espacio e : espacios) {
            if (e instanceof Laboratorio) {
                if (cont++ == i) {
                    return (Laboratorio) e;
                }
            }
        }

        return null;
    }

    public Estacion getEstacion(int i) {
        int cont = 0;
        for (Espacio e : espacios) {
            if (e instanceof Estacion) {
                if (cont++ == i) {
                    return (Estacion) e;
                }
            }
        }

        return null;
    }

    public Mision getMision(int i) {
        return misiones.get(i);
    }

    public Proyecto getProyecto(int i) {
        return proyectos.get(i);
    }

    public Astronauta getAstronauta(int i) {
        int cont = 0;
        for (Empleado e : empleados) {
            if (e instanceof Astronauta) {
                if (cont++ == i) {
                    return (Astronauta) e;
                }
            }
        }

        return null;
    }

    public Investigador getInvestigador(int i) {
        int cont = 0;
        for (Empleado e : empleados) {
            if (e instanceof Investigador) {
                if (cont++ == i) {
                    return (Investigador) e;
                }
            }
        }

        return null;
    }

    public Equipo getEquipo(int i) {
        return equipos.get(i);
    }

    static public Astronauta getmayorAstro() {
        int may = 0;
        Astronauta astromay = null;
        for (Empleado e : empleados) {
            if (e instanceof Astronauta) {
                int num = ((Astronauta) e).getnumMisiones();
                if (num > may) {
                    may = num;
                    astromay = (Astronauta) e;
                }
            }
        }
        return astromay;
    }

    static public Equipo getmayEquipo() {
        int may = 0;
        Equipo Emay = null;
        for (Equipo e : equipos) {
            int n = e.getnumProyectos();
            if (n > may) {
                may = n;
                Emay = e;
            }
        }
    return Emay;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Nasa nasa = new Nasa();

        Laboratorio tempLab;

        for (int i = 0; i < 10; i++) {
            tempLab = new Laboratorio("Lab" + i, "Calle " + i);
            nasa.addEspacio(tempLab);
        }

        nasa.addEspacio(new Estacion("ISS", "Orbita 1"));
        nasa.addEspacio(new Estacion("ISS2", "Orbita 2"));

        nasa.addEquipo(new Equipo("Microscopio", nasa.getLab(0)));
        nasa.addEquipo(new Equipo("Laptop", nasa.getLab(0)));
        nasa.addEquipo(new Equipo("PC", nasa.getLab(1)));
        nasa.addEquipo(new Equipo("Telescopio", nasa.getLab(1)));
        nasa.addEquipo(new Equipo("Laptop", nasa.getLab(1)));

        nasa.addEmpleado(new Astronauta("Pedro Wightman", nasa.getEstacion(0)));
        nasa.addEmpleado(new Astronauta("Sophia Wightman", nasa.getEstacion(0)));
        nasa.addEmpleado(new Astronauta("Claire Wightman", nasa.getEstacion(1)));

        nasa.addEmpleado(new Investigador("Marvin The Martian", nasa.getEstacion(0)));
        nasa.addEmpleado(new Investigador("Alf", nasa.getLab(1)));
        nasa.addEmpleado(new Investigador("ET", nasa.getLab(0)));
        nasa.addEmpleado(new Investigador("Thanos", nasa.getEstacion(1)));

        nasa.addMision(new Mision("Futurama", nasa.getEstacion(0)));
        nasa.addMision(new Mision("Conquista del universo", nasa.getEstacion(1)));

        nasa.addProyecto(new Proyecto("Human ware", nasa.getLab(0)));
        nasa.addProyecto(new Proyecto("Proyecto para que Ruben salga en algo", nasa.getLab(1)));
        nasa.addProyecto(new Proyecto("Adri es la mejor", nasa.getEstacion(0)));
        nasa.addProyecto(new Proyecto("Profe pongame 5 plis", nasa.getEstacion(1)));

        nasa.getMision(0).addAstronauta(nasa.getAstronauta(0));
        nasa.getMision(0).addAstronauta(nasa.getAstronauta(1));
        nasa.getMision(1).addAstronauta(nasa.getAstronauta(2));
        nasa.getMision(1).addAstronauta(nasa.getAstronauta(2));

        nasa.getProyecto(0).addInvestigador(nasa.getInvestigador(0));
        nasa.getProyecto(0).addInvestigador(nasa.getInvestigador(1));
        nasa.getProyecto(0).addEquipo(nasa.getEquipo(0));
        nasa.getProyecto(0).addEquipo(nasa.getEquipo(1));

        nasa.getProyecto(1).addInvestigador(nasa.getInvestigador(2));
        nasa.getProyecto(1).addEquipo(nasa.getEquipo(2));
        nasa.getProyecto(1).addEquipo(nasa.getEquipo(3));

        System.out.println("El Astronauta con más misiones es: " + getmayorAstro().getNombre());
        System.out.println("El equipo con más misiones es: "+getmayEquipo().getNombre());
    }

}
