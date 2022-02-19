
package Modelo.Listas;

import Modelo.Cabania;
import Modelo.Piscina;
import Modelo.ReservaCabania;
import Modelo.ReservaRestaurante;
import Modelo.Restaurante;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ListaAreas implements Serializable{
    private ArrayList<Cabania> cabanias;
    private ArrayList<Piscina> piscinas;
    private ArrayList<Restaurante> restaurantes;
    private static ListaAreas instancia;//aplicación patrón singelton, instancia unica de la lista
    private ListaAreas() {
        //inicialiazacion de listas
        cabanias=new ArrayList<>();
        piscinas=new ArrayList<>();
        restaurantes=new ArrayList<>();
    }
    public static ListaAreas getInstance(){
        if(instancia==null){
            instancia=new ListaAreas();
        }           
        return instancia;
    }
    public static void setInstancia(ListaAreas o){
        //se cambia la instancia de la lista
        instancia=o;
    }
    public boolean addCabania(String nombre,int capacidad,char tipo){//agregar una cabaña
        Cabania o=new Cabania(tipo,nombre,capacidad);//se crea la cabaña
        if (this.findCabania(o.getNombre(),o.getTipo())==null){//si la cabaña no esta registrado
                cabanias.add(o);//se ingresa la cabaña
                Collections.sort(cabanias);//se ordena la lista
                JOptionPane.showMessageDialog(null, "Cabaña registrada éxitosamente");
                return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "La cabaña con el nombre y tipo asignado ya está registrada");
            return false;
        }
    }
    public Cabania findCabania(String nombre,char tipo){// buscar una cabaña
        Iterator<Cabania> iterador=cabanias.iterator();
        Cabania aux;//variable auxiliar para respaldar la iteracion de cabañas
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getNombre().equals(nombre)&&aux.getTipo()==tipo){//si la cabaña se encuentra
                return aux;
            }
        }
        return null;//no se encontró la cabañia
    }
    public Cabania deleteCabania(String nombre,char tipo){
        Cabania p=this.findCabania(nombre,tipo);//se busca la cabaña a eliminar
        if(p!=null){
            cabanias.remove(p);//se elimina la cabaña
            JOptionPane.showMessageDialog(null, "Eliminación Éxitosa");
            return p;//se retorna la cabaña eliminada
        }
        return null;
    }
    public boolean addPiscina(char tipo, String nombre, int capacidad){//agregar una piscina
        Piscina o=new Piscina(tipo,nombre,capacidad);//se crea la piscina
        if (this.findPiscina(o.getNombre(),o.getTipo())==null){//si la piscina no se ha registrado
            piscinas.add(o);//se añade la piscina
            Collections.sort(piscinas);//se ordena la lista
            JOptionPane.showMessageDialog(null, "Piscina registrada éxitosamente");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "La piscina con el nombre y tipo asignado ya está registrada");
            return false;
        }
    }
    public Piscina findPiscina(String nombre,char tipo){// buscar piscina
        Iterator<Piscina> iterador=piscinas.iterator();
        Piscina aux;//variable auxiliar para respaldar la iteracion de piscinas
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getNombre().equals(nombre)&&aux.getTipo()==tipo){//si se encuentra la piscina
                return aux;//se devuelve la piscina
            }
        }
        return null;//no se encontró la piscina
    }
    public Piscina deletePiscina(String nombre,char tipo){//eliminar piscina
        Piscina p=this.findPiscina(nombre,tipo);//se busca la piscina a elimar
        if(p!=null){//si se encontró la piscina
            piscinas.remove(p);//se elimina la piscina
            JOptionPane.showMessageDialog(null, "Eliminación Éxitosa");
            return p;//se devuelve la piscina eliminada
        }
        else{
            return null;
        }
    }
    public boolean addRestaurante(Restaurante o){//agregar Restaurante
        if (this.findRestaurante(o.getNombre())==null){//si el restaurante no se ha registrado
                restaurantes.add(o);//se añade el restaurante
                Collections.sort(restaurantes);//se ordena la lista
                JOptionPane.showMessageDialog(null, "Restaurante registrada éxitosamente");
                return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "El Restaurante con el nombre asignado ya está registrado");
            return false;
        }
    }
    public Restaurante findRestaurante(String nombre){// buscar Restaurante
        Iterator<Restaurante> iterador=restaurantes.iterator();
        Restaurante aux;//variable auxiliar para respaldar la iteracion de restaurantes
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getNombre().equals(nombre)){//si se encuentra el restaurante
                return aux;//se devuelve el restaurante buscado
            }
        }
        return null;//no se encontró el restaurante
    }
    public Restaurante deleteRestaurante(String nombre){//eliminar un restaurante
        Restaurante p=this.findRestaurante(nombre);//se busca el restaurante a eliminar
        if(p!=null){//si se encuentra el restaurante
            restaurantes.remove(p);//se elimina de la lista el restaurante buscado
            JOptionPane.showMessageDialog(null, "Eliminación Éxitosa");
            return p;//se devuelve el restaurante eliminado
        }
        else{
            return null;
        }
    }   
    public void grabarAreas(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Grabar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
            try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();//path del archivo
                ObjectOutputStream archivo=new ObjectOutputStream(new FileOutputStream(nombreArchivo));
                archivo.writeObject(new ArrayList[]{cabanias,piscinas,restaurantes});//se guardan las 3 listas de areas
                archivo.flush();
                archivo.close();
                JOptionPane.showMessageDialog(null, "Áreas grabadas con éxito");    
            }
            catch(IOException e){
            }
        }  
    }
    public void recuperarAreas(){
        JFileChooser archi=new JFileChooser("./");//para seleccionar el nombre del archivo que se busca
        archi.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnVal=archi.showDialog(null, "Seleccionar");
        if(returnVal==JFileChooser.APPROVE_OPTION){
           try{
                String nombreArchivo=archi.getSelectedFile().getAbsoluteFile().getPath();//path del archivo
                ObjectInputStream archivo;
                File path=new File(nombreArchivo);
                if (path.exists()){
                    archivo=new ObjectInputStream(new FileInputStream(nombreArchivo));
                    ArrayList[] o=(ArrayList[]) archivo.readObject();//se recupera la estructura que guarda las listas
                    //Se asignan las listas correspondientes recuperadas
                    cabanias=(ArrayList<Cabania>)o[0];
                    piscinas=(ArrayList<Piscina>)o[1];
                    restaurantes=(ArrayList<Restaurante>)o[2];
                    archivo.close();
                    JOptionPane.showMessageDialog(null, "Áreas cargadas con éxito");
                }
            }
            catch(IOException | ClassNotFoundException | ClassCastException e){
                JOptionPane.showMessageDialog(null, "El archivo cargado no es compatible");
                System.out.println(e.toString());
            } 
        }    
    }
    public String[][] toDataVector(){//Devuelve una matriz con los datos a ingresar en la tabla de Areas
        int numFilas=cabanias.size()+piscinas.size()+restaurantes.size();
        String [][] data=new String[numFilas][2];
        for(int i=0;i<cabanias.size();i++){//se guardan los parametros de cabañas
            data[i][0]=cabanias.get(i).ToString()[0];
            data[i][1]=cabanias.get(i).ToString()[1];
        }
        for(int i=0;i<piscinas.size();i++){//se guardan los parámetros de piscinas
            data[i+cabanias.size()][0]=piscinas.get(i).ToString()[0];
            data[i+cabanias.size()][1]=piscinas.get(i).ToString()[1];
        }
        for(int i=0;i<restaurantes.size();i++){//se guardan los parametros de restaurantes
            data[i+cabanias.size()+piscinas.size()][0]=restaurantes.get(i).ToString()[0];
            data[i+cabanias.size()+piscinas.size()][1]=restaurantes.get(i).ToString()[1];
        }
        return data;
    }
    public String[] getListaRestaurantes(){//Devuelve la lista de restaurantes para asignarlos en un ComboBox
        String[] data=new String[restaurantes.size()];
        for(int i=0;i<restaurantes.size();i++){
            data[i]=restaurantes.get(i).getNombre();
        }
        return data;
    }
    public void CabaniasDisponibles(DefaultTableModel c,Date f3,Date f4){//Permite filtrar las cabañas que esten disponibles para una fecha inicial f3 y final f4
        ListaReservaCabanias ls=ListaReservaCabanias.getInstance();//se llama a la lista de reservas de cabanias
        boolean flag=true;//bandera para asignar o no una cabania como disponible
        for(int i=0;i<cabanias.size();i++){//se recorren todas las cabañas de la lista de cabañas
            ArrayList<ReservaCabania> o=ls.getReservas(cabanias.get(i));//se obtiene la lista de reservas con la cabania especifica
            for(int j=0;j<o.size();j++){//se recorre la lisa de reservas
                Date f1=o.get(j).getFechaInicio();//se obtiene la fecha de inicio de la reserva obtenida
                Date f2=o.get(j).getFechaFinal();//se obtiene la fecha final de la reserva obtenida
                //Se verifica que la fecha buscada no esté contenida en las fechas ya ingresadas
                if((((f3.before(f1)||f3.equals(f1))&&(f4.after(f2)||f4.equals(f2)))||((f3.before(f1)||f3.equals(f1))&&f4.after(f1)&&(f4.before(f2)||f4.equals(f2)))||((f3.after(f1)||f3.equals(f1))&&(f4.before(f2)||f4.equals(f2)))||(f3.after(f1)&&(f3.before(f2)||f3.equals(f2))&&f4.after(f2)))){
                    flag=false;//La fecha buscada esta ocupada
                    break;
                }
            }
            if(flag){//si la fecha buscada no esta ocupada
                //se coloca en el modelo de la tabla de cabañas disponibles la fila con la informacion de la cabaña disponible
                c.addRow(new String[]{cabanias.get(i).getNombre(),cabanias.get(i).getCapacidad()+"",cabanias.get(i).getTipo()+""});
            } 
            flag=true;//reinicia la bandera
        }
    }
    public void MesasRestauranteDisponibles(DefaultTableModel c,String nombre,Date fecha,Date f3,Date f4){//devuelve la lista de mesas disponibles en un horario especifico para un restaurante especifico
        Restaurante o=this.findRestaurante(nombre);//se busca el restaurante solicitado
        if(o!=null){//si se encuentra el restaurante
            boolean flag=true;//bandera para saber si colocar o no una mesa como disponible
            ListaReservaRestaurante ls=ListaReservaRestaurante.getInstance();//se llama a lista de reservaciones de restaurante
            for(int i=0;i<o.getNumMesas();i++){//se recorre la lista de mesas del restaurante solicitado
                ArrayList<ReservaRestaurante> r=ls.getReservas(o,o.getMesa(i),fecha);//se obtiene la lista de reservas para una mesa especifica
                for(int j=0;j<r.size();j++){//se recorre la lista de reservas para la mesa especifica
                    Date f1=r.get(j).getHoraInicio();//se obtiene la hora de inicio de cada reserva obtenida
                    Date f2=r.get(j).getHoraFinal();//se obtiene la hora de fin de cada reserva obtenida
                    //Si las hora ingresadas ya estan ocupadas
                    if(((f3.before(f1)||f3.equals(f1))&&(f4.after(f2)||f4.equals(f2)))||((f3.before(f1)||f3.equals(f1))&&f4.after(f1)&&(f4.before(f2)||f4.equals(f2)))||((f3.after(f1)||f3.equals(f1))&&(f4.before(f2)||f4.equals(f2)))||(f3.after(f1)&&(f3.before(f2)||f3.equals(f2))&&f4.after(f2))){
                        flag=false;//la mesa ya esta ocupada en las horas solicitadas
                        break;
                    }
                }
                if(flag){//si la mesa esta disponible
                    //se agrega la fila con la informacion de la mesa disponible en el modelo de la tabla enviado
                    c.addRow(new String[]{o.getMesa(i).getIdMesa()+"",o.getMesa(i).getCapacidad()+""});
                } 
                flag=true;
            } 
        }
    }
    
    
    
    
}
