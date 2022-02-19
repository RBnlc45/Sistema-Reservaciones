
package Modelo.Listas;

import Modelo.Huesped;
import Modelo.Mesa;
import Modelo.ReservaRestaurante;
import Modelo.Restaurante;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class ListaReservaRestaurante implements Serializable{
    private ArrayList<ReservaRestaurante> reservas;
    private static ListaReservaRestaurante instancia;
    private ListaReservaRestaurante(){
        reservas=new ArrayList<>();
    }
    public static ListaReservaRestaurante getInstance(){
        if(instancia==null){
            instancia=new ListaReservaRestaurante();
        }           
        return instancia;
    }
     public static void setInstancia(ListaReservaRestaurante o){
        instancia=o;
    }
    public boolean addReserva(ReservaRestaurante o){
        if (this.findReserva(o.getHuesped())==null){//si el id de propietario no esta registrado
            reservas.add(o);//se añade al propietario 
            Collections.sort(reservas);
            JOptionPane.showMessageDialog(null, "Mesa reservada con Éxito");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "La persona ya posee esa reservación");
            return false;
        }
    }
    public ReservaRestaurante findReserva(Huesped o){
        Iterator<ReservaRestaurante> iterador=reservas.iterator();
        ReservaRestaurante aux;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getHuesped().equals(o)&&aux.isEstado()){
                return aux;
            }
        }
        return null;//no se econtro el propietario
    }
    public ReservaRestaurante deleteReserva(Huesped o){
        ReservaRestaurante p=this.findReserva(o);
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
    public ArrayList<ReservaRestaurante> getReservas(Restaurante c,Mesa m,Date fecha){
        ArrayList<ReservaRestaurante> o=new ArrayList<>();
        for(int i=0;i<reservas.size();i++){
            if(reservas.get(i).getRestaurante().equals(c)&&reservas.get(i).getMesa().equals(m)&&reservas.get(i).isEstado()==true){
                o.add(reservas.get(i));
            }
        }
        return o;
    }
    public String[][] getLista(){
        String[][] lista=new String[reservas.size()][8];
        for(int i=0;i<reservas.size();i++){
            lista[i][0]=reservas.get(i).getFechaRegistro().getDate()+"/"+(reservas.get(i).getFechaRegistro().getMonth()+1)+"/"+(reservas.get(i).getFechaRegistro().getYear()+1900);
            lista[i][1]=reservas.get(i).getRestaurante().getNombre();
            lista[i][2]=reservas.get(i).getMesa().getIdMesa()+"";
            lista[i][3]=reservas.get(i).getFechaInicio().getDate()+"/"+(reservas.get(i).getFechaInicio().getMonth()+1)+"/"+(reservas.get(i).getFechaInicio().getYear()+1900);
            lista[i][4]=reservas.get(i).getHoraInicio().getHours()+":"+reservas.get(i).getHoraInicio().getMinutes();
            lista[i][5]=reservas.get(i).getHoraFinal().getHours()+":"+reservas.get(i).getHoraFinal().getMinutes();
            lista[i][6]=reservas.get(i).getHuesped().getNombre()+" "+reservas.get(i).getHuesped().getApellido();
            lista[i][7]=reservas.get(i).isEstado()+"";
        }
        return lista;
    }
}
