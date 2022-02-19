
package Modelo;

import java.io.Serializable;
import java.util.Date;


public class TarjetaCredito implements Serializable{
    private String bancoEmisor;
    private String numeroTarjeta;
    private Date fechaCaducidad;

    public TarjetaCredito(String bancoEmisor, String numeroTarjeta, Date fechaCaducidad) {
        this.bancoEmisor = bancoEmisor;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
    }

    
    public String getBancoEmisor() {
        return bancoEmisor;
    }

    public void setBancoEmisor(String bancoEmisor) {
        this.bancoEmisor = bancoEmisor;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
}
