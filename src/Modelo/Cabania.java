
package Modelo;

import java.io.Serializable;


public class Cabania extends Area implements Comparable<Cabania>,Serializable{
    private char tipo;
    public Cabania(char tipo, String nombre, int capacidad) {
        super(nombre, capacidad);
        this.tipo = tipo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    @Override
    public int compareTo(Cabania o) {
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
        return new String[]{"Cabaña",this.getNombre()};
    }
    

    
    
    
}
