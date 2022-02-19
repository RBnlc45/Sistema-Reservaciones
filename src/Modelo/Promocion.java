
package Modelo;

import java.io.Serializable;
import java.util.Date;


public class Promocion implements Serializable{
    private Date fecha;
    private String tipo;
    private String descripcion;
    public Promocion(Date fecha, String tipo,String descripcion) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
