
package Modelo;

import java.io.Serializable;


public class Mesa implements Serializable{
    private int idMesa;
    private int capacidad;

    public Mesa(int idMesa, int capacidad) {
        this.idMesa = idMesa;
        this.capacidad = capacidad;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
  
    
}
