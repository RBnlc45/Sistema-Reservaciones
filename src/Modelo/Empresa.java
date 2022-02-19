
package Modelo;

import Modelo.Listas.ListaAfiliados;
import Modelo.Listas.ListaAreas;
import Modelo.Listas.ListaHuespedes;
import Modelo.Listas.ListaServicios;
import Modelo.Listas.ListaPropietarios;
import Modelo.Listas.ListaReservaCabanias;
import Modelo.Listas.ListaReservaRestaurante;
import Modelo.Listas.ListaReservaServicios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Empresa {
    private String nombre,direccion;
    private ListaPropietarios listaPropietarios;
    private ListaAreas listaAreas;
    private ListaServicios listaServicios;
    private ListaHuespedes listaHuespedes;
    private ListaAfiliados listaAfiliados;
    private ListaReservaCabanias listaReservaCabanias;
    private ListaReservaServicios listaReservaServicios;
    private ListaReservaRestaurante listaReservaRestaurante;

    public Empresa() {
        nombre="RECREACIONES CIA. LTDA";
        direccion="Manta, en la calle 11 entre avenida 2 y avenida 1";
        listaPropietarios=ListaPropietarios.getInstance();
        listaAfiliados=ListaAfiliados.getInstance();
        listaAreas=ListaAreas.getInstance();
        listaHuespedes=ListaHuespedes.getInstance();
        listaReservaCabanias=ListaReservaCabanias.getInstance();
        listaReservaRestaurante=ListaReservaRestaurante.getInstance();
        listaReservaServicios=ListaReservaServicios.getInstance();
        listaServicios=ListaServicios.getInstance();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void cargarConfiguraciones(){
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
                    ListaPropietarios.setInstancia((ListaPropietarios)o.get(0));
                    ListaAfiliados.setInstancia((ListaAfiliados)o.get(1));
                    ListaAreas.setInstancia((ListaAreas)o.get(2));
                    ListaHuespedes.setInstancia((ListaHuespedes)o.get(3));
                    ListaReservaCabanias.setInstancia((ListaReservaCabanias)o.get(4));
                    ListaReservaRestaurante.setInstancia((ListaReservaRestaurante)o.get(5));
                    ListaServicios.setInstancia((ListaServicios)o.get(6));
                    ListaReservaServicios.setInstancia((ListaReservaServicios)o.get(7));
                    archivo.close();
                    JOptionPane.showMessageDialog(null, "Configuraciones cargadas con éxito");
                }
            }
            catch(IOException | ClassNotFoundException | ClassCastException |UnknownError e){
                JOptionPane.showMessageDialog(null, "El archivo es incompatible");
            }
        } 
    }
    public void guardarConfiguraciones(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Grabar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
            try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();
                ObjectOutputStream archivo=new ObjectOutputStream(new FileOutputStream(nombreArchivo));
                ArrayList<Object> o=new ArrayList<>();
                o.add(ListaPropietarios.getInstance());
                o.add(ListaAfiliados.getInstance());o.add(ListaAreas.getInstance());o.add(ListaHuespedes.getInstance());
                o.add(ListaReservaCabanias.getInstance());o.add(ListaReservaRestaurante.getInstance());
                o.add(ListaServicios.getInstance());o.add(ListaReservaServicios.getInstance());
                archivo.writeObject(o);
                archivo.flush();
                archivo.close();
                JOptionPane.showMessageDialog(null, "Configuraciones guardadas con éxito");
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, "Error al momento de grabar los datos");
            }
        }
    }
    
    
    
    
}
