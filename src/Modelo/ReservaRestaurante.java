
package Modelo;

import java.io.Serializable;
import java.util.Date;


public class ReservaRestaurante implements Serializable, Comparable<ReservaRestaurante>{
    private Date FechaRegistro,FechaInicio,HoraInicio,HoraFinal;
    private Huesped huesped;
    private Restaurante restaurante;
    private Mesa mesa;
    private boolean estado;

    public ReservaRestaurante(Date FechaRegistro, Date FechaInicio, Date HoraInicio, Date HoraFinal, Huesped huesped, Mesa mesa,Restaurante restaurante) {
        this.FechaRegistro = FechaRegistro;
        this.FechaInicio = FechaInicio;
        this.HoraInicio = HoraInicio;
        this.HoraFinal=HoraFinal;
        this.huesped = huesped;
        this.restaurante = restaurante;
        this.mesa=mesa;
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

    public Date getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(Date HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public Date getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(Date HoraFinal) {
        this.HoraFinal = HoraFinal;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    @Override
    public int compareTo(ReservaRestaurante o) {
        return this.FechaRegistro.compareTo(o.getFechaRegistro());
    }
}
