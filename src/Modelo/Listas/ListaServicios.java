
package Modelo.Listas;

import Modelo.Servicio;
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



public class ListaServicios implements Serializable{
    private ArrayList<Servicio> servicios;
    private static ListaServicios instancia;
    private ListaServicios(){
        servicios=new ArrayList<>();
    }
    public static ListaServicios getInstance(){
        if(instancia==null){
            instancia=new ListaServicios();
        }           
        return instancia;
    }
    public static void setInstancia(ListaServicios o){
        instancia=o;
    }
    public boolean addServicio(Servicio o){
        if (this.findServicio(o.getNombre())==null){//si el id de propietario no esta registrado
            if (o.getCapacidad()>0){//si es mayor a 0
                servicios.add(o);//se añade al propietario 
                Collections.sort(servicios);
                JOptionPane.showMessageDialog(null, "Registro Éxitoso");
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "La capacidad debe ser mayor a 0");
                return false;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El servicio ya esta registrado");
            return false;
        }
    }
    public Servicio findServicio(String nombre){
        Iterator<Servicio> iterador=servicios.iterator();
        Servicio aux=null;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getNombre().equals(nombre)){
                return aux;
            }
        }
        return null;//no se econtro el propietario
    }
     public Servicio deleteServicio(String nombre){
        Servicio p=this.findServicio(nombre);
        if(p!=null){
            servicios.remove(p);
            JOptionPane.showMessageDialog(null, "Eliminación Éxitosa");
            return p;
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encontró el servicio");
            return null;
        }
    }
    public void grabarServicios(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Grabar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
            try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();
                ObjectOutputStream archivo=new ObjectOutputStream(new FileOutputStream(nombreArchivo));
                archivo.writeObject(servicios);
                archivo.flush();
                archivo.close();
                JOptionPane.showMessageDialog(null, "Lista grabada con éxito");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error al momento de grabar los datos");
            }
        }
    }
    public void recuperarServicios(){
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
                    servicios=(ArrayList<Servicio>) archivo.readObject();
                    archivo.close();
                    JOptionPane.showMessageDialog(null, "Lista recuperada con éxito");
                }
            }
            catch(IOException | ClassNotFoundException | ClassCastException e){
                JOptionPane.showMessageDialog(null, "El archivo es incompatible");
            }

        } 
        
    }
    public String[][] getLista(){
        String[][] lista=new String[servicios.size()][2];
        for(int i=0;i<servicios.size();i++){
            lista[i][0]=servicios.get(i).getNombre();
            lista[i][1]=servicios.get(i).getCapacidad()+"";
        }
        return lista;
    }
    public void cleanLista(){
        servicios.clear();
    }
    public void eliminarLista(){
        servicios.clear();
    }
}
