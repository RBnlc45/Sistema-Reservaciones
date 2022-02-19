
package Modelo;

import java.io.Serializable;

public class Persona implements Serializable{
    private String apellido,nombre,id,nacionalidad;

    public Persona(String apellido, String nombre, String id,String nacionalidad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.id = id;
        this.nacionalidad=nacionalidad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
}
