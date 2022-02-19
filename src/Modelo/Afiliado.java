
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class Afiliado extends Huesped{
    private Date fechaAfiliacion,fechaEntradaSpa;
    private float descuentoPorTiempo;
    private ArrayList<Promocion> promociones;

    public Afiliado(Date fechaAfiliacion, Date fechaEntradaSpa, float descuentoPorTiempo, String direccion, String profesion, String ciudadOrigen, String telefonoFijo, String telefonoCelular, Date fechaNacimiento, String apellido, String nombre, String id, String nacionalidad,TarjetaCredito tC) {
        super(direccion, profesion, ciudadOrigen, telefonoFijo, telefonoCelular, fechaNacimiento, apellido, nombre, id, nacionalidad,true,tC);
        this.fechaAfiliacion = fechaAfiliacion;
        this.fechaEntradaSpa = fechaEntradaSpa;
        this.descuentoPorTiempo = descuentoPorTiempo;
        promociones=new ArrayList<>();
    }

    public Date getFechaAfiliacion() {
        return fechaAfiliacion;
    }

    public void setFechaAfiliacion(Date fechaAfiliacion) {
        this.fechaAfiliacion = fechaAfiliacion;
    }

    public Date getFechaEntradaSpa() {
        return fechaEntradaSpa;
    }

    public void setFechaEntradaSpa(Date fechaEntradaSpa) {
        this.fechaEntradaSpa = fechaEntradaSpa;
    }

    public float getDescuentoPorTiempo() {
        return descuentoPorTiempo;
    }

    public void setDescuentoPorTiempo(float descuentoPorTiempo) {
        this.descuentoPorTiempo = descuentoPorTiempo;
    }
    public void aplicarPromociones(){
        //Promoción de tiempo de afilición
        int aniosAsociado=((new Date().getYear()+1900)-(this.fechaAfiliacion.getYear()+1900));
        if(aniosAsociado%3==0){//Estancia a mitad de precio por 3 dias
            JOptionPane.showMessageDialog(null, "Se ha aplicado la promoción por años de afiliación","Promoción agregada",JOptionPane.INFORMATION_MESSAGE);
            promociones.add(new Promocion(new Date(), "Promoción por años de afiliación","Tiene derecho a 3 días de estancia a mitad de precio"));
        }
        //Promocion de cumpleaños
        int mes,dia;//mes y dia actuales a comparar con el de nacimiento
        mes=new Date().getMonth();
        dia=new Date().getDate();
        if(this.getFechaNacimiento().getMonth()==mes&&this.getFechaNacimiento().getDate()==dia){
            JOptionPane.showMessageDialog(null, "Se ha aplicado la promoción por día de cumpleaños","Promoción agregada",JOptionPane.INFORMATION_MESSAGE);
            promociones.add(new Promocion(new Date(), "Promoción por día de cumpleaños","Se le ha regalado una entrada gratuita al spa"));
        }  
    } 
    public void addPromocion(Date fecha,String tipo,String descripcion){
        promociones.add(new Promocion(fecha, tipo,descripcion));
    }
    public void deletePromocion(Date fecha,String tipo){
        Promocion aux=findPromocion(fecha,tipo);
        if(aux!=null) promociones.remove(aux);
    }
    public Promocion findPromocion(Date fecha,String tipo){
        Iterator<Promocion> iterador=promociones.iterator();
        Promocion aux;//variable auxiliar para respaldar la iteracion de propietarios
        while(iterador.hasNext()){
            aux=iterador.next();
            if(aux.getFecha().compareTo(fecha)==1){
                return aux;
            }
        }
        return null;//no se econtro el propietario
    }
    public String[][] getPromociones(){
        String[][] lista=new String[promociones.size()][2];
        for(int i=0;i<promociones.size();i++){
            lista[i][0]=lista[i][0]=promociones.get(i).getFecha().getDate()+"/"+(promociones.get(i).getFecha().getMonth()+1)+"/"+(promociones.get(i).getFecha().getYear()+1900);
            lista[i][1]=promociones.get(i).getTipo();
        }
        return lista;
    }
    
}
