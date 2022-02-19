
package Modelo;

import java.io.Serializable;


public class Piscina extends Area implements Comparable<Piscina>,Serializable{
    private char tipo;

    public Piscina(char tipo, String nombre, int capacidad) {
        super(nombre, capacidad);
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int compareTo(Piscina o) {
        if(this.getNombre().compareTo(o.getNombre())>0){
            if(this.getTipo()==o.getTipo()){
                return 1;
            }
            else return -1;
        }
        else if(this.getNombre().compareTo(o.getNombre())<0){
            if(this.getTipo()==o.getTipo()){
                return -1;
            }
            else return 1;
        }
        else return 0;
    }
    public String[] ToString(){
        return new String[]{"Piscina",this.getNombre()};
    }
    

    
    
}
