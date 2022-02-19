
package Modelo.Listas;

import Modelo.Afiliado;
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

public class ListaAfiliados implements Serializable{
    private ArrayList<Afiliado> afiliados;
    private static ListaAfiliados instancia;
    private ListaAfiliados(){
        afiliados=new ArrayList<>();
    }
    public static ListaAfiliados getInstance(){
        if(instancia==null){
            instancia=new ListaAfiliados();
        }           
        return instancia;
    }
     public static void setInstancia(ListaAfiliados o){
        instancia=o;
    }
    public boolean addAfiliado(Afiliado o){
        if (this.findAfiliado(o.getID())==null){//si el id de propietario no esta registrado
            afiliados.add(o);//se añade al propietario 
            Collections.sort(afiliados);
            JOptionPane.showMessageDialog(null, "Afiliación Éxitosa");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "La persona ya se encuentra registrada como afiliado");
            return false;
        }
    }
    public Afiliado findAfiliado(String cedula){
        Iterator<Afiliado> iterador=afiliados.iterator();
        Afiliado aux;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getID().equals(cedula)){
                return aux;
            }
        }
        return null;//no se econtro el propietario
    }
    public Afiliado deleteAfiliado(String id){
        Afiliado p=this.findAfiliado(id);
        if(p!=null){
            afiliados.remove(p);
            JOptionPane.showMessageDialog(null, "Eliminación Éxitosa");
            return p;
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encontró el ID");
            return null;
        }
    }
    public void grabarAfiliados(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Grabar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
            try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();
                ObjectOutputStream archivo=new ObjectOutputStream(new FileOutputStream(nombreArchivo));
                archivo.writeObject(afiliados);
                archivo.flush();
                archivo.close();
                JOptionPane.showMessageDialog(null, "Lista grabada con éxito");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error al momento de grabar los datos");
            }
        }
    }
    public void recuperarAfiliados(){
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
                    afiliados = (ArrayList<Afiliado>) archivo.readObject();
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
        String[][] lista=new String[afiliados.size()][4];
        for(int i=0;i<afiliados.size();i++){
            lista[i][0]=afiliados.get(i).getID();
            lista[i][1]=afiliados.get(i).getNombre();
            lista[i][2]=afiliados.get(i).getApellido();
            lista[i][3]=afiliados.get(i).getTelefonoCelular();
        }
        return lista;
    }
    public void eliminarLista(){
        afiliados.clear();
    } 
}
