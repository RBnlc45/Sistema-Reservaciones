
package Modelo;

import Modelo.Listas.ListaReservaCabanias;
import Modelo.Listas.ListaReservaRestaurante;
import Modelo.Listas.ListaReservaServicios;
import Modelo.Listas.ListaServicios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public abstract class Reserva {
    public static void cargarReservas(){
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
                    ArrayList<Object> o = (ArrayList<Object>) archivo.readObject();
                    ListaReservaCabanias.setInstancia((ListaReservaCabanias)o.get(0));
                    ListaReservaRestaurante.setInstancia((ListaReservaRestaurante)o.get(1));
                    ListaReservaServicios.setInstancia((ListaReservaServicios)o.get(2));
                    ListaServicios.setInstancia((ListaServicios)o.get(3));
                    archivo.close();
                    JOptionPane.showMessageDialog(null, "Configuraciones cargadas con éxito");
                }
            }
            catch(IOException | ClassNotFoundException | ClassCastException |UnknownError e){
                JOptionPane.showMessageDialog(null, "El archivo es incompatible");
            }
        } 
    }
    public static void guardarReservas(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Grabar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
            try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();
                ObjectOutputStream archivo=new ObjectOutputStream(new FileOutputStream(nombreArchivo));
                ArrayList<Object> o=new ArrayList<>();
                o.add(ListaReservaCabanias.getInstance());
                o.add(ListaReservaRestaurante.getInstance());
                o.add(ListaReservaServicios.getInstance());
                o.add(ListaServicios.getInstance());
                archivo.writeObject(o);
                archivo.flush();
                archivo.close();
                JOptionPane.showMessageDialog(null, "Reservaciones guardadas con éxito");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error al momento de grabar los datos");
            }
        }
    }
}
