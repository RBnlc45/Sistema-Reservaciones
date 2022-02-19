
package Modelo;

import java.io.Serializable;
import java.util.Date;

public class ReservaServicios implements Comparable<ReservaServicios>,Serializable{
    private Huesped huesped;
    private Date fechaRegistro;
    private Servicio servicio;//tipo de reservación
    private int cantidadSolicitada;
    private boolean estado;//estado de la reserva: true vigente false terminada

    public ReservaServicios(Huesped huesped, Date fechaRegistro, Servicio servicio, int cantidadSolicitada) {
        this.huesped = huesped;
        this.fechaRegistro = fechaRegistro;
        this.servicio = servicio;
        this.cantidadSolicitada = cantidadSolicitada;
        this.estado = true;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    
    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    @Override
    public int compareTo(ReservaServicios o) {
       if(estado==true){
           return 1;
       }
       else return -1;
    }
    
}
