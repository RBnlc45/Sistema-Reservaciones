
package Modelo;

import java.io.Serializable;
import java.util.Date;


public class ReservaCabania implements Serializable, Comparable<ReservaCabania>{
    private Date FechaRegistro,FechaInicio,FechaFinal;
    private Huesped huesped;
    private Cabania cabania;
    private boolean estado;

    public ReservaCabania(Date FechaRegistro, Date FechaInicio, Date FechaFinal, Huesped huesped, Cabania cabania) {
        this.FechaRegistro = FechaRegistro;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.huesped = huesped;
        this.cabania = cabania;
        this.estado=true;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Cabania getCabania() {
        return cabania;
    }

    public void setCabania(Cabania cabania) {
        this.cabania = cabania;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(ReservaCabania o) {
        return this.FechaRegistro.compareTo(o.getFechaRegistro());
    }
}
