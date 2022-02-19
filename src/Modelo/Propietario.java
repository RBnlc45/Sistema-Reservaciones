
package Modelo;


public class Propietario extends Persona implements Comparable<Propietario>{
    private int porcentaje;

    public Propietario(String apellido, String nombre, String id,String nacionalidad,int porcentaje) {
        super(apellido, nombre, id,nacionalidad);
        this.porcentaje=porcentaje;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int compareTo(Propietario o) {
        if(this.getNombre().compareTo(o.getNombre())>0){
            return 1;            
        }
        else if (this.getNombre().compareTo(o.getNombre())<0){
            return -1;
        }
        else return 0;
    }
    public String toString(){
        return this.getNombre()+this.getApellido()+"/"+this.getID();
    }
    
}
