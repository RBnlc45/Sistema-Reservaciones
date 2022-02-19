
package Modelo.Listas;

import Modelo.Huesped;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class ListaHuespedes implements Serializable{
   private ArrayList<Huesped> huespedes;
    private static ListaHuespedes instancia;
    private ListaHuespedes(){
        huespedes=new ArrayList<>();
    }
    public static ListaHuespedes getInstance(){
        if(instancia==null){
            instancia=new ListaHuespedes();
        }           
        return instancia;
    }
     public static void setInstancia(ListaHuespedes o){
        instancia=o;
    }
    public boolean addHuesped(Huesped o){
        if (this.findHuesped(o.getID())==null){//si el id de propietario no esta registrado
            huespedes.add(o);//se añade al propietario 
            Collections.sort(huespedes);
            JOptionPane.showMessageDialog(null, "Registro Éxitoso");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "La cedula/Pasaporte ingresados ya estan registrados");
            return false;
        }
    }
    public Huesped findHuesped(String cedula){
        Iterator<Huesped> iterador=huespedes.iterator();
        Huesped aux;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getID().equals(cedula)){
                return aux;
            }
        }
        return null;//no se econtro el propietario
    }
    public Huesped deleteHuesped(String id){
        Huesped p=this.findHuesped(id);
        if(p!=null){
            huespedes.remove(p);
            JOptionPane.showMessageDialog(null, "Eliminación Éxitosa");
            return p;
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encontró el ID");
            return null;
        }
    }
    public void grabarHuespedes(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Grabar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
            try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();
                ObjectOutputStream archivo=new ObjectOutputStream(new FileOutputStream(nombreArchivo));
                archivo.writeObject(huespedes);
                archivo.flush();
                archivo.close();
                JOptionPane.showMessageDialog(null, "Lista grabada con éxito");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error al momento de grabar los datos");
            }
        }
    }
    public void recuperarHuespedes(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Seleccionar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
            try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();
                ObjectInputStream archivo;
                File path=new File(nombreArchivo);
                if (path.exists()){
                    archivo=new ObjectInputStream(new FileInputStream(nombreArchivo));
                    huespedes = (ArrayList<Huesped>) archivo.readObject();
                    archivo.close();
                    JOptionPane.showMessageDialog(null, "Lista recuperada con éxito");
                }
            }
            catch(IOException | ClassNotFoundException | ClassCastException |UnknownError e){
                JOptionPane.showMessageDialog(null, "El archivo es incompatible");
            }
        } 
        
    }
    public String[][] getLista(){
        String[][] lista=new String[huespedes.size()][3];
        for(int i=0;i<huespedes.size();i++){
            lista[i][0]=huespedes.get(i).getID();
            lista[i][1]=huespedes.get(i).getNombre()+" "+huespedes.get(i).getApellido();
            lista[i][2]=huespedes.get(i).isAfiliado()+"";
        }
        return lista;
    }
    public void eliminarLista(){
        huespedes.clear();
    } 
}
