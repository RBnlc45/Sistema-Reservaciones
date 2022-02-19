
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class Huesped extends Persona implements Comparable<Huesped>{
    private String direccion,profesion,ciudadOrigen,telefonoFijo,telefonoCelular;
    private Date fechaNacimiento;
    private ArrayList<TarjetaCredito> tarjetasCredito;
    private boolean afiliado;

    public Huesped(String direccion, String profesion, String ciudadOrigen, String telefonoFijo, String telefonoCelular, Date fechaNacimiento, String apellido, String nombre, String id, String nacionalidad,boolean afiliado,TarjetaCredito tC) {
        super(apellido, nombre, id, nacionalidad);
        this.direccion = direccion;
        this.profesion = profesion;
        this.ciudadOrigen = ciudadOrigen;
        this.telefonoFijo = telefonoFijo;
        this.telefonoCelular = telefonoCelular;
        this.fechaNacimiento = fechaNacimiento;
        tarjetasCredito=new ArrayList<>();
        tarjetasCredito.add(tC);
        this.afiliado=afiliado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void addTarjetaCredito(String bancoEmisor, String numeroTarjeta, Date fechaCaducidad){
        tarjetasCredito.add(new TarjetaCredito(bancoEmisor, numeroTarjeta, fechaCaducidad));
    }
    public void deleteTarjetaCredito(String numeroTarjeta){
        TarjetaCredito aux=findTarjetaCredito(numeroTarjeta);
        if(aux!=null) tarjetasCredito.remove(aux);
    }
    public TarjetaCredito findTarjetaCredito(String numeroTarjeta){
        Iterator<TarjetaCredito> iterador=tarjetasCredito.iterator();
        TarjetaCredito aux=null;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getNumeroTarjeta().equals(numeroTarjeta)){
                return aux;
            }
        }
        return null;//no se econtro el propietario
    }
    public boolean isAfiliado() {
        return afiliado;
    }

    public void setAfiliado(boolean afiliado) {
        this.afiliado = afiliado;
    }

    @Override
    public int compareTo(Huesped o) {
        if(this.getNombre().compareTo(o.getNombre())>0){
            if(this.isAfiliado()){
                return 1;
            }          
            else return -1;
        }
        else if (this.getNombre().compareTo(o.getNombre())<0){
            if(this.isAfiliado()){
                return 1;
            }          
            else return -1;
        }
        else return 0;
    }
    
    
}
