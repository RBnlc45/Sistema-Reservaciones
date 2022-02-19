
package Modelo;

import java.io.Serializable;


public class Area implements Serializable{
   private String nombre;
   private int capacidad;

    public Area() {
    }
   
    public Area(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
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
}
