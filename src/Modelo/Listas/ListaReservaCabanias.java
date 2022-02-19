
package Modelo.Listas;

import Modelo.Cabania;
import Modelo.Huesped;
import Modelo.ReservaCabania;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class ListaReservaCabanias implements Serializable{
  private ArrayList<ReservaCabania> reservas;
    private static ListaReservaCabanias instancia;
    private ListaReservaCabanias(){
        reservas=new ArrayList<>();
    }
    public static ListaReservaCabanias getInstance(){
        if(instancia==null){
            instancia=new ListaReservaCabanias();
        }           
        return instancia;
    }
    public static  void setInstancia(ListaReservaCabanias o){
        instancia=o;
    }
    public boolean addReserva(ReservaCabania o){
        if (this.findReserva(o.getHuesped())==null){//si el id de propietario no esta registrado
            reservas.add(o);//se añade al propietario 
            Collections.sort(reservas);
            JOptionPane.showMessageDialog(null, "Reservación Éxitoso");
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "La persona ya posee esa reservación");
            return false;
        }
    }
    public ReservaCabania findReserva(Huesped o){
        Iterator<ReservaCabania> iterador=reservas.iterator();
        ReservaCabania aux;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getHuesped().equals(o)&&aux.isEstado()){
                return aux;
            }
        }
        return null;//no se econtro el propietario
    }
    public ReservaCabania deleteReserva(Huesped o){
        ReservaCabania p=this.findReserva(o);
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
    public ArrayList<ReservaCabania> getReservas(Cabania c){
        ArrayList<ReservaCabania> o=new ArrayList<>();
        for(int i=0;i<reservas.size();i++){
            if(reservas.get(i).getCabania().equals(c)&&reservas.get(i).isEstado()==true){
                o.add(reservas.get(i));
            }
        }
        return o;
    }
    public String[][] getLista(){
        String[][] lista=new String[reservas.size()][6];
        for(int i=0;i<reservas.size();i++){
            lista[i][0]=reservas.get(i).getFechaRegistro().getDate()+"/"+(reservas.get(i).getFechaRegistro().getMonth()+1)+"/"+(reservas.get(i).getFechaRegistro().getYear()+1900);
            lista[i][1]=reservas.get(i).getCabania().getNombre();
            lista[i][2]=reservas.get(i).getFechaInicio().getDate()+"/"+(reservas.get(i).getFechaInicio().getMonth()+1)+"/"+(reservas.get(i).getFechaInicio().getYear()+1900);
            lista[i][3]=reservas.get(i).getFechaFinal().getDate()+"/"+(reservas.get(i).getFechaFinal().getMonth()+1)+"/"+(reservas.get(i).getFechaFinal().getYear()+1900);
            lista[i][4]=reservas.get(i).getHuesped().getNombre()+" "+reservas.get(i).getHuesped().getApellido();
            lista[i][5]=reservas.get(i).isEstado()+"";
        }
        return lista;
    }
    
    
}
