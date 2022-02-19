
package Modelo.Listas;

import Modelo.Propietario;
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
import javax.swing.table.DefaultTableModel;

public class ListaPropietarios implements Serializable{
    private ArrayList<Propietario> listaPropietarios;
    private static ListaPropietarios instancia;
    private ListaPropietarios(){
        listaPropietarios=new ArrayList<>();
    }
    public static ListaPropietarios getInstance(){
        if(instancia==null){
            instancia=new ListaPropietarios();
        }           
        return instancia;
    }
     public static void setInstancia(ListaPropietarios o){
        instancia=o;
    }
    public boolean addPropietario(Propietario o){
        if (this.findPropietario(o.getID())==null){//si el id de propietario no esta registrado
            if (o.getPorcentaje()>0){//si el porcentaje asignado es mayor a 0
                listaPropietarios.add(o);//se añade al propietario 
                Collections.sort(listaPropietarios);
                JOptionPane.showMessageDialog(null, "Registro Éxitoso");
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "El porcentaje de propiedad debe ser mayor a 0");
                return false;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La cedula/Pasaporte ingresados ya estan registrados");
            return false;
        }
    }
    public Propietario findPropietario(String nombre,String apellido){
        Iterator<Propietario> iterador=listaPropietarios.iterator();
        Propietario aux=null;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getNombre().equals(nombre)&&aux.getApellido().equals(apellido)){
                return aux;
            }
        }
        return null;//no se econtro el propietario
    }
    public Propietario findPropietario(String id){
        Iterator<Propietario> iterador=listaPropietarios.iterator();
        Propietario aux=null;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getID().equals(id)){
                return aux;
            }
        }
        return null;//no se encontro el propietario
    }
    public Propietario deletePropietario(String id){
        Propietario p=this.findPropietario(id);
        if(p!=null){
            listaPropietarios.remove(p);
            JOptionPane.showMessageDialog(null, "Eliminación Éxitosa");
            return p;
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encontró el ID");
            return null;
        }
    }
    public Propietario deletePropietario(String nombre,String apellido){
        Propietario p=this.findPropietario(nombre,apellido);
        if(p!=null){
            listaPropietarios.remove(p);
            JOptionPane.showMessageDialog(null, "Eliminación Éxitosa");
            return p;
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encontró el ID");
            return null;
        }
    }
    public void grabarPropietarios(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Grabar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
            try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();
                ObjectOutputStream archivo=new ObjectOutputStream(new FileOutputStream(nombreArchivo));
                archivo.writeObject(listaPropietarios);
                archivo.flush();
                archivo.close();
                JOptionPane.showMessageDialog(null, "Lista grabada con éxito");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error al momento de grabar los datos");
            }
        }
    }
    public void recuperarPropietarios(){
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
                    listaPropietarios = (ArrayList<Propietario>) archivo.readObject();
                    archivo.close();
                    JOptionPane.showMessageDialog(null, "Lista recuperada con éxito");
                }
            }
            catch(IOException | ClassNotFoundException | ClassCastException |UnknownError e){
                JOptionPane.showMessageDialog(null, "El archivo es incompatible");
            }
        } 
        
    }
    public void getLista(DefaultTableModel model){
        for(int i=0;i<listaPropietarios.size();i++){
            model.addRow(new String[]{listaPropietarios.get(i).getID(),listaPropietarios.get(i).getNombre(),listaPropietarios.get(i).getApellido()});
        }
    }
    public void eliminarLista(){
        listaPropietarios.clear();
    }
    
    
}
