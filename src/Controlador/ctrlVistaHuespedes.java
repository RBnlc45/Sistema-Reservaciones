
package Controlador;

import Modelo.Afiliado;
import Modelo.Huesped;
import Modelo.Listas.ListaAfiliados;
import Modelo.Listas.ListaHuespedes;
import Modelo.TarjetaCredito;
import Vista.vistaEmpresa;
import Vista.vistaHuespedes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;


public class ctrlVistaHuespedes extends MouseAdapter implements ActionListener{
    private vistaHuespedes view;
    private ListaHuespedes huespedes;
    private ListaAfiliados afiliados;
    private Huesped h;//variable auxiliar para el proceso de busqueda y eliminacion de huesped
    private DefaultTableModel modelA,modelB;
    private JPanel panelActual;
    private MaskFormatter mask,mask2;

    public ctrlVistaHuespedes() {
        inicio();
        HidePaneles();
        inicioBotones();
        fillTabla();
    }
    private void inicio(){
        view=new vistaHuespedes();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setTitle("Huespedes");
        afiliados=ListaAfiliados.getInstance();
        huespedes=ListaHuespedes.getInstance();
        //Dando formato a las fechas
        try {
            mask = new MaskFormatter("##/##/####");
            mask.setPlaceholder("dd/mm/aaaa");
            view.txtFechaNacimiento.setFormatterFactory(new DefaultFormatterFactory(mask,mask));
            mask2 = new MaskFormatter("##/####");
            mask2.setPlaceholder("mm/aaaa");
            view.txtFechaTarjeta.setFormatterFactory(new DefaultFormatterFactory(mask2,mask2));
        } catch (ParseException parseException) { }
        //Modelo de la tabla de huespedes
        modelA=new DefaultTableModel(new String[]{"Cédula/Pasaporte","Nombre/Apellido","Afiliado?"}, 0);
        view.jTablaHuespedes.setModel(modelA);   
        //Modelo de la tabla de busquedas
        modelB=new DefaultTableModel(new String[]{"Cédula/Pasaporte","Nombre","Apellido","Telefono Celular","Afiliado?"}, 0);
        view.jTablaBEHuesped.setModel(modelB);
    }
    private void HidePaneles(){
        //ocultar los paneles iniciales
        view.jPanelRegistro.setVisible(false);
        view.jPanelRegistroAfiliado.setVisible(false);
        view.jPanelBE.setVisible(false);
    }
    private void inicioBotones(){
        view.btnRetroceder.addMouseListener(this);
        view.jMenuBE.addMouseListener(this);
        view.jMenuItemNHues.addActionListener(this);
        view.jMenuItemAfiliado.addActionListener(this);
        view.btnRegistrar.addActionListener(this);
        view.jMenuItemCargar.addActionListener(this);
        view.jMenuItemGuardar.addActionListener(this);
        view.btnBuscar.addActionListener(this);
        view.btnEliminar.addActionListener(this);
        view.btnRegistrarAfiliado.addActionListener(this);
    }
    private void fillTabla(){
        //se llena la tabla de huespedes
        modelA.setDataVector(huespedes.getLista(), new String[]{"Cédula","Nombre/Apellido","Afiliado?"});
    
    }
    private void registrarHuesped(){
        /*Recuperacion de parametros del formulario*/
        String nombre,apellido,cedula,direccion,telefonoC,banco,tCredito,telefonoF,profesion,nacionalidad,ciudadO;
        Date fechaNacimiento,fechaTarjeta;
        nombre=view.txtNombre.getText();
        apellido=view.txtApellido.getText();
        cedula=view.txtID.getText();
        direccion=view.txtDireccion.getText();
        telefonoC=view.txtCelular.getText();
        telefonoF=view.txtTelefonoF.getText();
        banco=view.txtBancoEmisor.getText();
        tCredito=view.txtNumTarjeta.getText();
        profesion=view.txtProfesion.getText();
        nacionalidad=view.txtNacionalidad.getText();
        ciudadO=view.txtCiudadO.getText();
        /***********************************************************/
        fechaNacimiento=new Date();
        fechaTarjeta=new Date();
        int anio,mes,dia;
        //Si todos los parametros se han ingresado
        if(!nombre.isBlank()&&!apellido.isBlank()&&(!cedula.isBlank()&&cedula.length()==10)&&!direccion.isBlank()&&!telefonoC.isBlank()&&!telefonoF.isBlank()&&!banco.isBlank()
                &&!nacionalidad.isBlank()&&!ciudadO.isBlank()&&!profesion.isBlank()&&!tCredito.isBlank()){
            try {
                //desgloce de fecha de nacimiento ingresada
                anio=Integer.parseInt(view.txtFechaNacimiento.getText().substring(6, 10));
                mes=Integer.parseInt(view.txtFechaNacimiento.getText().substring(3, 5));
                dia=Integer.parseInt(view.txtFechaNacimiento.getText().substring(0, 2));
                //validación de los valores ingresados
                if(anio<1921||mes>12||mes==0||dia>31||dia==0) throw new NumberFormatException();
                //Asignación de la fecha
                fechaNacimiento.setYear(anio-1900);
                fechaNacimiento.setMonth(mes-1);
                fechaNacimiento.setDate(dia);
                //desgloce de fecha de tarjeta ingresada
                anio=Integer.parseInt(view.txtFechaTarjeta.getText().substring(3, 7));
                mes=Integer.parseInt(view.txtFechaTarjeta.getText().substring(0, 2));
                //Asignacion de los valores a la fecha
                fechaTarjeta.setYear(anio-1900);
                fechaTarjeta.setMonth(mes-1);
                //validacion de la fecha
                if(anio<new Date().getYear()+1900||(anio==new Date().getYear()+1900&&mes<new Date().getMonth()+1)||mes>12||mes==0) throw new Exception();

                if(view.rBtnSi.isSelected()) {//Si se escoje ser afiliado
                    Afiliado o=new Afiliado(fechaNacimiento, null, 15, direccion, profesion, ciudadO, telefonoF, telefonoC, fechaNacimiento, apellido, nombre, cedula, nacionalidad,new TarjetaCredito(banco, tCredito, fechaTarjeta));
                    if(afiliados.addAfiliado(o)) huespedes.addHuesped(o);
                }
                //se añade como huesped
                else huespedes.addHuesped(new Huesped(direccion, profesion, ciudadO, telefonoF, telefonoC, fechaNacimiento, apellido, nombre, cedula, nacionalidad, view.rBtnSi.isSelected(),new TarjetaCredito(banco, tCredito, fechaTarjeta)));
            } catch (NumberFormatException e) {
                
                JOptionPane.showMessageDialog(null,"Asegurese de colocar una fecha de nacimiento correcta");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Revise la fecha de caducidad de la tarjeta de credito");
            }
            
        }
        else JOptionPane.showMessageDialog(null, "Compruebe que todos los campos esten llenos"); 
    }
    private void cambiarPanel(JPanel panel){
        if (panelActual!=null){panelActual.setVisible(false);panelActual.setEnabled(false);}
        panelActual=panel;
        panelActual.setVisible(true);
        panelActual.setEnabled(true);
    }
    private void buscarHuesped(){
        //Se limpia la tabla
        modelB.setDataVector(new String[][]{}, new String[]{"Cédula/Pasaporte","Nombre","Apellido","Telefono Celular","Afiliado?"});
        String id=view.txtIDBE.getText();//se obtiene la cedula a buscar
        //validacion de id
        if(id.isBlank()){JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos");return;}
        h=huespedes.findHuesped(id);//se busca el huesped
        //validación de huesped
        if(h==null){JOptionPane.showMessageDialog(null, "No se encontró el huesped solicitado");return;}
        modelB.addRow(new String[]{h.getID(),h.getNombre(),h.getApellido(),h.getTelefonoCelular(),h.isAfiliado()+""});
        view.btnEliminar.setEnabled(true);//se habilita el boton de eliminar
    }
    private void eliminarHuesped(){
        if(h!=null){
            //Se elimina el huesped
            huespedes.deleteHuesped(h.getID());
            fillTabla();
            //Se limpia la tabla
            modelB.setDataVector(new String[][]{}, new String[]{"Cédula/Pasaporte","Nombre","Apellido","Telefono Celular","Afiliado?"});
        }
        view.btnEliminar.setEnabled(false);
    }
    private void registrarAfiliado(){
        String id;
        id=view.txtIDRAfiliado.getText();
        //validacion de parametros
        if(id.isBlank()){JOptionPane.showMessageDialog(null, "Asegurese de ingresar todos los campos");return;}
        //Se busca el afiliado
        Afiliado a=afiliados.findAfiliado(id);
        //Se verifica el afiliado
        if(a==null) {JOptionPane.showMessageDialog(null, "No se ha encontrado al afiliado solicitado");return;}
        huespedes.addHuesped(a);
        a.aplicarPromociones();//se aplican las promociones al momento de registrarse como huesped
        fillTabla();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.btnRegistrar)){
            registrarHuesped();//se manda al proceso de registro
            fillTabla();//se llena la tabla de huespedes
        }
        else if(e.getSource().equals(view.jMenuItemCargar)){
            huespedes.recuperarHuespedes();//se manda a recuperar la lista de huespedes
            fillTabla();//se llena la tabla de huespedes
        }
        else if(e.getSource().equals(view.jMenuItemGuardar)){
            huespedes.grabarHuespedes();//se manda a grabar la lista de huespedes
        }
        else if(e.getSource().equals(view.jMenuItemNHues)){
            cambiarPanel(view.jPanelRegistro);//se manda a cambiar de panel
        }
        else if(e.getSource().equals(view.jMenuItemAfiliado)){
            cambiarPanel(view.jPanelRegistroAfiliado);//se manda a cambiar de panel
        }
        else if(e.getSource().equals(view.btnBuscar)){
            buscarHuesped();//se manda a buscar el huesped
        }
        else if(e.getSource().equals(view.btnEliminar)){
            eliminarHuesped();//se manda a eliminar el huesped de la lista de huespedes
        }
        else if(e.getSource().equals(view.btnRegistrarAfiliado)){
            registrarAfiliado();//se manda a registrar a un afiliado
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(view.btnRetroceder)){//si se preciona el boton de retroceso
            view.setVisible(false);
            new ctrlVistaEmpresa(new vistaEmpresa());
        }
        else if(e.getSource().equals(view.jMenuBE)){//se presiona buscar y eliminar
            cambiarPanel(view.jPanelBE);
            view.btnEliminar.setEnabled(false);//se deshabilita el boton de elimar
        }
    }
    
    
}
