
package Modelo.Listas;
import Modelo.Huesped;
import Modelo.ReservaServicios;
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

public class ListaReservaServicios implements Serializable{
    private ArrayList<ReservaServicios> reservas;
    private static ListaReservaServicios instancia;
    private ListaReservaServicios(){
        reservas=new ArrayList<>();
    }
    public static ListaReservaServicios getInstance(){
        if(instancia==null){
            instancia=new ListaReservaServicios();
        }           
        return instancia;
    }
    public static void setInstancia(ListaReservaServicios o){
        instancia=o;
    }
    public boolean addReserva(ReservaServicios o){
        if (this.findReserva(o.getHuesped(),o.getServicio())==null){//si el id de propietario no esta registrado
            reservas.add(o);//se añade al propietario 
            Collections.sort(reservas);
            JOptionPane.showMessageDialog(null, "Reservación Éxitosa");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "La persona ya posee esa reservación");
            return false;
        }
    }
    public ReservaServicios findReserva(Huesped o,Servicio s){
        Iterator<ReservaServicios> iterador=reservas.iterator();
        ReservaServicios aux=null;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getHuesped().equals(o)&&aux.getServicio().equals(s)&&aux.isEstado()){
                return aux;
            }
        }
        return null;//no se econtro el propietario
    }
    public ReservaServicios deleteReserva(Huesped o,Servicio s){
        ReservaServicios p=this.findReserva(o,s);
        if(p!=null){
            p.setEstado(false);//se coloca la reserva como finalzada
            JOptionPane.showMessageDialog(null, "Reservación anulada con éxito");
            return p;
        }
        else{
            JOptionPane.showMessageDialog(null, "No se encontró la reserva");
            return null;
        }
    }
    public void grabarReservas(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Grabar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
            try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();
                ObjectOutputStream archivo=new ObjectOutputStream(new FileOutputStream(nombreArchivo));
                archivo.writeObject(reservas);
                archivo.flush();
                archivo.close();
                JOptionPane.showMessageDialog(null, "Lista grabada con éxito");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error al momento de grabar los datos");
            }
        }
    }
    public void recuperarReservas(){
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
                    reservas = (ArrayList<ReservaServicios>) archivo.readObject();
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
        String[][] lista=new String[reservas.size()][5];
        for(int i=0;i<reservas.size();i++){
            lista[i][0]=reservas.get(i).getFechaRegistro().getDate()+"/"+(reservas.get(i).getFechaRegistro().getMonth()+1)+"/"+(reservas.get(i).getFechaRegistro().getYear()+1900);
            lista[i][1]=reservas.get(i).getServicio().getNombre();
            lista[i][2]=reservas.get(i).getCantidadSolicitada()+"";
            lista[i][3]=reservas.get(i).getHuesped().getNombre()+" "+reservas.get(i).getHuesped().getApellido();
            lista[i][4]=reservas.get(i).isEstado()+"";
        }
        return lista;
    }
    public void eliminarLista(){
        reservas.clear();
    } 
}
