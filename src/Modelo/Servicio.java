
package Modelo;

import java.io.Serializable;

public class Servicio implements Serializable,Comparable<Servicio>{
    private String nombre;
    private int capacidad;
    private int disponibles;

    public Servicio(String nombre, int capacidad, int disponibles) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponibles = disponibles;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getDisponibles() {
        return disponibles;
    }

    public void setDisponibles(int disponibles) {
        this.disponibles = disponibles;
    }

    @Override
    public int compareTo(Servicio o) {
        if(this.getNombre().compareTo(o.getNombre())>0){
            return 1;            
        }
        else if (this.getNombre().compareTo(o.getNombre())<0){
            return -1;
        }
        else return 0;
    }
    
}
