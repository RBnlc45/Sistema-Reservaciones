
package Modelo;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;


public class Restaurante extends Area implements Comparable<Restaurante>,Serializable{
    private Map<Integer,Mesa> map;

    public Restaurante() {
        map=new TreeMap<>();
    }
    
    public Restaurante(String nombre, int capacidad) {
        super(nombre, capacidad);
        map=new TreeMap<>();
    }
    public boolean insertarMesa(int idMesa, int capacidad){
        if(this.buscarMesa(idMesa)==null){
            map.put(idMesa, new Mesa(idMesa, capacidad));
            JOptionPane.showMessageDialog(null, "Mesa ingresada con Éxito");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "El ID de la mesa ya está registrado");
            return false;
        }   
    }
    public Mesa buscarMesa(int clave){
        return map.get(clave);
    }
    public Mesa eliminarMesa(int clave){
        return map.remove(clave);
    }
    public int getNumMesas(){
        return map.size();
    }
    public Mesa getMesa(int i){ 
        int cont=0;
        for(Map.Entry<Integer,Mesa> entry:map.entrySet()){
            if(cont==i){
                return entry.getValue();
            }
            cont++;
        }
        return null;
    }
    public int compareTo(Restaurante o) {
        return this.getNombre().compareTo(o.getNombre());      
    }
    public String[] ToString(){
        return new String[]{"Restaurante",this.getNombre()};
    }

}
