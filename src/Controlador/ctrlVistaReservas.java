
package Controlador;

import Modelo.Cabania;
import Modelo.Huesped;
import Modelo.Listas.ListaAfiliados;
import Modelo.Listas.ListaAreas;
import Modelo.Listas.ListaHuespedes;
import Modelo.Listas.ListaReservaCabanias;
import Modelo.Listas.ListaReservaRestaurante;
import Modelo.Listas.ListaReservaServicios;
import Modelo.Listas.ListaServicios;
import Modelo.Mesa;
import Modelo.Reserva;
import Modelo.ReservaCabania;
import Modelo.ReservaRestaurante;
import Modelo.ReservaServicios;
import Modelo.Restaurante;
import Modelo.Servicio;
import Vista.vistaEmpresa;
import Vista.vistaReservas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class ctrlVistaReservas extends MouseAdapter implements ActionListener{
    private vistaReservas view;
    private JPanel panelActual,panelActualParametros;
    private DefaultTableModel model1,model2,model3;
    private Huesped huesped;
    private Date f1,f2,f3;
    private MaskFormatter mask,mask2;
    private ReservaCabania rCabania;
    private ReservaRestaurante rRestaurante;
    private ReservaServicios rServicio;
    public ctrlVistaReservas() {
        inicio();
        hidePaneles();
        iniciarBotones();
    }
    private void inicio(){
        view=new vistaReservas();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setTitle("Reservaciones");
        //Se da formato a las casillas de fecha y hora de los fórmularios de registro
        try {
            mask = new MaskFormatter("##/##/####");
            mask.setPlaceholder("dd/mm/aaaa");
            view.txtFechaReservaFC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####"),mask));
            view.txtFechaReservaIR.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####"),mask));
            view.txtFechaReservaIC.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####"),mask));
            mask2 = new MaskFormatter("##:##");
            mask2.setPlaceholder("hh:mm");
            view.txtHoraInicioR.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##:##"),mask2));
            view.txtHoraFinalR.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##:##"),mask2));
        } catch (ParseException parseException) {
        }
        /********************************************************************************/
        /*Se asignan los modelos a las tablas que se utilizaran*/
        model1=new DefaultTableModel();
        view.jTablaDisponibles.setModel(model1);
        model2=new DefaultTableModel();
        view.jTablaReservaciones.setModel(model2);
        model3=new DefaultTableModel(new String[]{}, 0);
        view.jTablaBuscarE.setModel(model3);
        /*Se cargan los restaurantes disponibles en el combo box de restaurantes del apartado de reserva de tipo mesa de restaurante*/
        view.jComboRestaurantes.setModel(new DefaultComboBoxModel<String>(ListaAreas.getInstance().getListaRestaurantes()));
   }
    private void hidePaneles(){
        /*Se ocultan todos los paneles cuando se ingresa a la ventana por primera vez*/
        view.jPanelServicios.setVisible(false);
        view.jPanelRegistrarReserva.setVisible(false);
        view.jPanelCabaniaRestaurante.setVisible(false);
        view.jPanelBuscarEliminar.setVisible(false);
        view.jPanelReservas.setVisible(false);
        view.jPanelServicios.setVisible(false);
        view.jPanelParametrosCabania.setVisible(false);
        view.jPanelParametrosRestaurante.setVisible(false);
    }
    private void iniciarBotones(){
        /*Se agregan las acciones a todos los botones de este apartado*/
        view.btnFindAfi.addActionListener(this);
        view.btnFindHues.addActionListener(this);
        view.jMenuCancelarR.addMouseListener(this);
        view.btnBusRe.addActionListener(this);
        view.jComboTipoRe.addActionListener(this);
        view.MenuRetroceder.addMouseListener(this);
        view.jMenuMesasRestaurante.addActionListener(this);
        view.jMenuReservaCabania.addActionListener(this);
        view.jMenuReservasServicios.addActionListener(this);
        view.btnReservar.addActionListener(this);
        view.jMenuRegistrarR.addMouseListener(this);
        view.btnBuscar.addActionListener(this);
        view.btnEliminar.addActionListener(this);
        view.jMenuCargar.addActionListener(this);
        view.jMenuGrabar.addActionListener(this);
    }
    private void EnablePaneles(boolean state){
        /*Permite intercambiar entre los paneles que muestran las disponibilidades de la reserva que se busca realizar*/
        view.jPanelCabaniaRestaurante.setVisible(state);
        view.jPanelServicios.setVisible(!state);
    }
    private void ShowCabanias(){
        /*Se filtran y validan los datos de ingreso para realizar una reserva de cabaña*/
        int anio,mes,dia; 
        /*Creación de las fechas de inicio y fin*/
        f1=new Date();//Fecha de inicio de reserva
        f2=new Date();//Fecha de fin de reserva
        try { 
            /*Se obtiene la fecha desglosada en año mes y dia de la caja de texto de la fecha de inicio para la reserva*/
            anio=Integer.parseInt(view.txtFechaReservaIC.getText().substring(6, 10));
            mes=Integer.parseInt(view.txtFechaReservaIC.getText().substring(3, 5));
            dia=Integer.parseInt(view.txtFechaReservaIC.getText().substring(0, 2));
            /*********************************************************************************************/
            if(anio<1921||mes>12||mes<=0||dia>31||dia<=0) throw new NumberFormatException();//validacion de dias años y meses
            /*Se ingresan los parametros validados de año,mes y dia*/
            f1.setYear(anio-1900);
            f1.setMonth(mes-1);
            f1.setDate(dia);
            /*********************************************************************************************/
            if(f1.before(new Date()))throw new NumberFormatException();//validacion de que la fecha de inicio sea mayor o igual a la del registro
            /*Se obtiene la fecha desglosada en año mes y dia de la caja de texto de la fecha de fin para la reserva*/
            anio=Integer.parseInt(view.txtFechaReservaFC.getText().substring(6, 10));
            mes=Integer.parseInt(view.txtFechaReservaFC.getText().substring(3, 5));
            dia=Integer.parseInt(view.txtFechaReservaFC.getText().substring(0, 2));
            /*********************************************************************************************/
            if(anio<1921||mes>12||mes<=0||dia>31||dia<=0) throw new NumberFormatException();//validacion de dias años y meses
             /*Se ingresan los parametros validados de año,mes y dia*/
            f2.setYear(anio-1900);
            f2.setMonth(mes-1);
            f2.setDate(dia);
            /*********************************************************************************************/
            if(f2.before(f1)||f2.equals(f1))throw new Exception();//validacion de que la fecha de inicio sea mayor a la de fin y que no sean iguales
            /*Se obtiene la lista de cabañas disponibles*/
            model1.setColumnIdentifiers(new String[]{"Nombre","Capacidad","Tipo"});
            ListaAreas.getInstance().CabaniasDisponibles(model1,f1, f2);
            /*Se habilita el boton para ingresar la reserva*/
            view.btnReservar.setEnabled(true);
        } catch (NumberFormatException e) {
            //Los valores ingresados para las fechas no estan en los rangos válidos
            JOptionPane.showMessageDialog(null,"Asegurese de colocar fechas válidas");
            model1.setDataVector(new String[][]{}, new String[]{});
            view.btnReservar.setEnabled(false);
        }catch(Exception e){
            //LAs fechas dadas no estan separadas correctamente
            JOptionPane.showMessageDialog(null,"Las fechas de reservación deben tener como minimo un día de diferencia");
            model1.setDataVector(new String[][]{}, new String[]{});
            view.btnReservar.setEnabled(false);
        }
    }
    private void ShowMesas(){
        /*Se filtran y validan los datos de ingreso para realizar una reserva de cabaña*/
        int anio,mes,dia,hora,minuto; 
        /*Creación de las fecha de inicio*/
        f1=new Date();
        try {
            /*Se obtiene la fecha desglosada en año mes y dia de la caja de texto de la fecha de inicio para la reserva*/
            anio=Integer.parseInt(view.txtFechaReservaIR.getText().substring(6, 10));
            mes=Integer.parseInt(view.txtFechaReservaIR.getText().substring(3, 5));
            dia=Integer.parseInt(view.txtFechaReservaIR.getText().substring(0, 2));
            /*********************************************************************************************/
            if(anio<1921||mes>12||mes<=0||dia>31||dia<=0) throw new NumberFormatException();//validacion de dias años y meses
            /*Se ingresan los parametros validados de año,mes y dia*/
            f1.setYear(anio-1900);
            f1.setMonth(mes-1);
            f1.setDate(dia);
            /*********************************************************************************************/
            if(f1.before(new Date()))throw new NumberFormatException();//validacion de que la fecha de inicio sea mayor o igual a la del registro
            /*Se obtiene la hora desglosada en horas y minutos de la caja de texto de la hora de inicio para la reserva*/
            hora=Integer.parseInt(view.txtHoraInicioR.getText().substring(0, 2));
            minuto=Integer.parseInt(view.txtHoraInicioR.getText().substring(3, 5));
            /*********************************************************************************************/
            if(hora>23||hora<0||minuto>59||minuto<0) throw new NumberFormatException();//validacion de horas y minutos
            /*Se crea la hora de inicio como fecha con todos los parametros iguales excepto la hora y minuto para que las comparaciones sean correctas*/
            f2=new Date(0,0,1,hora,minuto,0);//hora inicial
            /*Se obtiene la hora desglosada en horas y minutos de la caja de texto de la hora de fin para la reserva*/
            hora=Integer.parseInt(view.txtHoraFinalR.getText().substring(0, 2));
            minuto=Integer.parseInt(view.txtHoraFinalR.getText().substring(3, 5));
            /*********************************************************************************************/
            if(hora>23||hora<0||minuto>59||minuto<0) throw new NumberFormatException();//validacion de horas y minutos
            /*Se crea la hora de final como fecha con todos los parametros iguales excepto la hora y minuto para que las comparaciones sean correctas*/
            f3=new Date(0,0,1,hora,minuto,0);//hora final
            /*********************************************************************************************/
            if(f3.before(f2)||f3.equals(f2))throw new Exception();//validacion de las horas de inicio y final sean distintas y separadas
            /*Se obtiene la lista de restaurantes disponibles*/
            model1.setColumnIdentifiers(new String[]{"ID","Capacidad"});
            ListaAreas.getInstance().MesasRestauranteDisponibles(model1,view.jComboRestaurantes.getSelectedItem().toString(),f1,f2,f3);
            /*Se habilita el boton para ingresar la reserva*/
            view.btnReservar.setEnabled(true);
        } catch (NumberFormatException e) {
            //Los valores ingresados para las fechas no estan en los rangos válidos
            JOptionPane.showMessageDialog(null,"Asegurese de colocar fechas u horas válidas");
            model1.setDataVector(new String[][]{}, new String[]{"ID","Capacidad"});
            view.btnReservar.setEnabled(false);
        }catch(Exception e){
            //LAs fechas dadas no estan separadas correctamente
            JOptionPane.showMessageDialog(null,"Asegurese de colocar horas válidas");
            model1.setDataVector(new String[][]{}, new String[]{"ID","Capacidad"});
            view.btnReservar.setEnabled(false);
        }
    }
    private void AccionBotonBuscarReserva(){
        /*Se limpia la tabla mesas o cabañas disponibles*/
        model1.setDataVector(new String[][]{}, new String[]{});
        /*****************************************************/
        /*Se obtiene el tipo de reserva del combo box correspondiente*/
        String itemSeleccionado=view.jComboTipoRe.getSelectedItem().toString();
        /*********************************************************/
        if(itemSeleccionado.equals("Cabaña")){//Reserva de cabaña
            EnablePaneles(true);//Se muestra el panel que contiene la tabla de disponibles
            view.jLabelIndicacionR.setText("Escoja una cabaña disponible de la lista");
            ShowCabanias();//SE manda a mostrar la tabla de cabañas disponibles
        }else if(itemSeleccionado.equals("Mesa en Restaurante")){//Reserva de mesa de restaurante
            EnablePaneles(true);//Se muestra el panel que contiene la tabla de disponibles
            view.jLabelIndicacionR.setText("Escoja una mesa disponible de la lista");
            ShowMesas();//Se manda a mostrar las mesas disponibles
        }else{//Reserva de servicio
            /*Se busca el servicio escogido del combo box de tipo de reservas*/
            Servicio s=ListaServicios.getInstance().findServicio(itemSeleccionado);
            view.btnReservar.setEnabled(true);//Se habilita el boton de reservar
            if(s==null){JOptionPane.showMessageDialog(null, "No se ha encontrado el servicio"); return;}//No se ha encontrado el servicio
            /*Se colocan los parámetros correspondientes a cada servicio*/
            view.jLabelDisponiblesCantidad.setText(s.getDisponibles()+"");
            view.txtCantidadDeseada.setText("");
            /****************************************/
            EnablePaneles(false);
            /*Se colocan las etiquetas correspondientes de cada servicio*/
            if(itemSeleccionado.equals("Spa")){
                view.jLabelDisponibles.setText("Plazas Disponibles:");
                view.jLabelDeseados.setText("Plazas a solicitar:");   
            }
            else if(itemSeleccionado.equals("Parasoles")){
                view.jLabelDisponibles.setText("Parasoles Disponibles:");
                view.jLabelDeseados.setText("Parasoles a solicitar:");
            }
            else if(itemSeleccionado.equals("Toallas")){
                view.jLabelDisponibles.setText("Toallas Disponibles:");
                view.jLabelDeseados.setText("Toallas a solicitar:");
            }
            else if(itemSeleccionado.equals("Traslado")){
                view.jLabelDisponibles.setText("Traslados Disponibles:");
                view.jLabelDeseados.setText("Traslados a solicitar:");
            }
            /*****************************************************************/
        }    
    }
    private void AccionBotonBuscarReservaBusqueda(){//acciones al presionar el boton buscar en la seccion buscar/eliminar
        /*Se limpia la tabla de resultados*/
        model3.setDataVector(new String[][]{}, new String[]{});
        /*Se obtienen los parametros para la consulta*/
        String id=view.txtIDBuscar.getText();//id de huesped
        String tipo=view.jComboTipoB.getSelectedItem().toString();//tipo de reserva
        //Validación del ID
        if(id.isBlank()){JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos");return;}
        switch (tipo) {
            case "Cabaña":{//Si es una reserva de cabaña
                //Se busca la reserva del huesped
                rCabania=ListaReservaCabanias.getInstance().findReserva(ListaHuespedes.getInstance().findHuesped(id));
                //Comprobación de la reserva de cabaña
                if(rCabania==null) {JOptionPane.showMessageDialog(null,"No se ha encontrado una reserva vigente para ese usuario");return;}
                //Se da formato a la tabla de resultados
                model3.setColumnIdentifiers(new String[]{"Fecha Registro","Cabaña","Fecha Inicio","Fecha Final","Huesped","Vigente?"});
                String fecha1,fecha2,fecha3;
                fecha1=rCabania.getFechaRegistro().getDate()+"/"+(rCabania.getFechaRegistro().getMonth()+1)+"/"+(rCabania.getFechaRegistro().getYear()+1900);
                fecha2=rCabania.getFechaInicio().getDate()+"/"+(rCabania.getFechaInicio().getMonth()+1)+"/"+(rCabania.getFechaInicio().getYear()+1900);
                fecha3=rCabania.getFechaFinal().getDate()+"/"+(rCabania.getFechaFinal().getMonth()+1)+"/"+(rCabania.getFechaFinal().getYear()+1900);
                model3.addRow(new String[]{fecha1,rCabania.getCabania().getNombre(),fecha2,fecha3,rCabania.getHuesped().getNombre()+" "+rCabania.getHuesped().getApellido(),
                    rCabania.isEstado()+""});
                break;
            }
            case "Mesa en Restaurante":{
                //Se busca la reserva del huesped
                rRestaurante=ListaReservaRestaurante.getInstance().findReserva(ListaHuespedes.getInstance().findHuesped(id));
                //Comprobación de la reserva de mesa
                if(rRestaurante==null) {JOptionPane.showMessageDialog(null,"No se ha encontrado una reserva vigente para ese usuario");return;}
                //Se da formato a la tabla de resultados
                model3.setColumnIdentifiers(new String[]{"Fecha Registro","Restaurante","ID Mesa","Fecha Inicio","Hora Inicio","Hora Final","Huesped","Vigente?"});
                String fecha1,fecha2,fecha3,fecha4;
                fecha1=rRestaurante.getFechaRegistro().getDate()+"/"+(rRestaurante.getFechaRegistro().getMonth()+1)+"/"+(rRestaurante.getFechaRegistro().getYear()+1900);
                fecha2=rRestaurante.getFechaInicio().getDate()+"/"+(rRestaurante.getFechaInicio().getMonth()+1)+"/"+(rRestaurante.getFechaInicio().getYear()+1900);
                fecha3=rRestaurante.getHoraInicio().getHours()+":"+rRestaurante.getHoraInicio().getMinutes();
                fecha4=rRestaurante.getHoraFinal().getHours()+":"+rRestaurante.getHoraFinal().getMinutes();
                model3.addRow(new String[]{fecha1,rRestaurante.getRestaurante().getNombre(),rRestaurante.getMesa().getIdMesa()+"",fecha2,fecha3,fecha4,rRestaurante.getHuesped().getNombre()+" "+rRestaurante.getHuesped().getApellido(),rRestaurante.isEstado()+""});
                break;
            }
            default:{
                //Se busca la reserva del huesped
                rServicio=ListaReservaServicios.getInstance().findReserva(ListaHuespedes.getInstance().findHuesped(id),ListaServicios.getInstance().findServicio(tipo));
                //Comprobación de la reserva de servicio
                if(rServicio==null) {JOptionPane.showMessageDialog(null,"No se ha encontrado ninguna reserva para ese usuario");return;}
                 //Se da formato a la tabla de resultados
                model3.setColumnIdentifiers(new String[]{"Fecha Registro","Servicio","Cantidad Solicitada","Huesped","Reserva Vigente?"});
                String fecha1=rServicio.getFechaRegistro().getDate()+"/"+(rServicio.getFechaRegistro().getMonth()+1)+"/"+(rServicio.getFechaRegistro().getYear()+1900);
                model3.addRow(new String[]{fecha1,rServicio.getServicio().getNombre(),rServicio.getCantidadSolicitada()+"",rServicio.getHuesped().getNombre()+" "+rServicio.getHuesped().getApellido(),rServicio.isEstado()+""});
                break;
            }
        }
        //SE habilita el boton de eliminar o cancelar reserva
        view.btnEliminar.setEnabled(true);
    }
    private void AccionBotonEliminarReserva(){
        if(view.jComboTipoB.getSelectedItem().toString().equals("Cabaña")){//reserva de cabaña
            if(rCabania!=null) rCabania.setEstado(false);//se coloca la vigencia de la reserva en false
        }
        else if(view.jComboTipoB.getSelectedItem().toString().equals("Mesa en Restaurante")){
            if(rRestaurante!=null) rRestaurante.setEstado(false);//se coloca la vigencia de la reserva en false
        }
        else{//reserva de servicio
            if(rServicio!=null) {
                rServicio.setEstado(false);//se coloca la vigencia de la reserva en false
                //Se restaura las existencias de los servicios
                rServicio.getServicio().setDisponibles(rServicio.getServicio().getDisponibles()+rServicio.getCantidadSolicitada());
            }
        }
        //Limpieza de tabla y inhabilitacion de boton de cancelacion
        view.btnEliminar.setEnabled(false);
        model3.setDataVector(new String[][]{}, new String[]{});
    }
    private void AccionBotonReservar(){
        String tipo=view.jComboTipoRe.getSelectedItem().toString();//Tipo de reserva a realizar
        if(tipo.equals("Cabaña")||tipo.equals("Mesa en Restaurante")){//Cuando las reservas son de restaurante o cabaña
            int fila=view.jTablaDisponibles.getSelectedRow();//Se obtiene la fila de la tabla seleccionada
            if(fila<0){//Se comprueba que se escoja una fila
                JOptionPane.showMessageDialog(null, "Seleccione una de las áreas disponibles");
                return;//acaba este proceso
            }
            if(tipo.equals("Cabaña")){//si la reserva es de cabaña
                /*Se busca la cabaña seleccionada en la lista de cabañas*/
                Cabania c=ListaAreas.getInstance().findCabania(model1.getValueAt(fila, 0).toString(), model1.getValueAt(fila, 2).toString().charAt(0));
                /*Se ingresa la reserva en la lista de reservas de cabaña*/
                ListaReservaCabanias.getInstance().addReserva(new ReservaCabania(new Date(), f1, f2, huesped, c));
                //Limpieza de cuadros
                view.txtFechaReservaFC.setFormatterFactory(new DefaultFormatterFactory(mask, mask));
                view.txtFechaReservaIC.setFormatterFactory(new DefaultFormatterFactory(mask, mask));
            }
            else if(tipo.equals("Mesa en Restaurante")){//si la reserva es de mesa de restaurante
                /*Se busca el restaurante seleccionado de la lista*/
                Restaurante r=ListaAreas.getInstance().findRestaurante(view.jComboRestaurantes.getSelectedItem().toString());
                /*Se busca la mesa seleccionada de la lista*/
                Mesa m=r.buscarMesa(Integer.parseInt(model1.getValueAt(fila, 0).toString()));
                /*Se ingresa la reserva en la lista de reservas de cabaña*/
                ListaReservaRestaurante.getInstance().addReserva(new ReservaRestaurante(new Date(), f1, f2, f3, huesped, m, r));
                //Limpieza de cuadros
                view.txtFechaReservaIR.setFormatterFactory(new DefaultFormatterFactory(mask, mask));
                view.txtHoraInicioR.setFormatterFactory(new DefaultFormatterFactory(mask2, mask2));
                view.txtHoraFinalR.setFormatterFactory(new DefaultFormatterFactory(mask2, mask2));
            }
            //Se limpia la tabla de servicios o areas disponibles
            model1.setDataVector(new String[][]{},new String[]{});
        }
        else{//Se reservará un servicio
            int cantidad;
            /*Se comprueba la validez del numero de la cantidad solicitada*/
            try{
                cantidad=Integer.parseInt(view.txtCantidadDeseada.getText());
            }
            catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "Debe ingresar una cantidad válida del servicio a solicitar");return;}
            Servicio s=ListaServicios.getInstance().findServicio(view.jComboTipoRe.getSelectedItem().toString());
            if(s==null){System.out.println("No se encontro el servicio");return;}
            /*Comprobacion de numero de toallas en caso de que la reserva sea de toallas*/
            if(s.getNombre().equals("Toallas")&&cantidad>4) {JOptionPane.showMessageDialog(null, "Por disposición de la empresa no se pueden entragar más de 4 toallas");return;}
            /*Se comprueba que la cantidad no exeda la capacidad del servicio*/
            if(cantidad>s.getDisponibles()) {JOptionPane.showMessageDialog(null, "La cantidad solicitada sobrepasa las existencias del servicio");return;}
            /*Se asigna la reservación*/
            boolean flag=ListaReservaServicios.getInstance().addReserva(new ReservaServicios(huesped, new Date(), s, cantidad));
            if(flag)s.setDisponibles(s.getDisponibles()-cantidad);//si el registro fue exitoso
        } 
        /*Limpiza de paneles*/
        view.jPanelParametrosCabania.setVisible(false);
        view.jPanelParametrosRestaurante.setVisible(false);
        view.jPanelCabaniaRestaurante.setVisible(false);
        view.jPanelServicios.setVisible(false);
        view.btnBusRe.setEnabled(false);
        view.btnReservar.setEnabled(false); 
    }
    private void AccionComboBoxTipoReserva(){
        /*Se deshabilitan los paneles donde estan las areas o servicios disponibles*/
        view.jPanelCabaniaRestaurante.setVisible(false);
        view.jPanelServicios.setVisible(false);
        view.btnBusRe.setEnabled(true);//se habilita el boton de busqueda de la parte de registro de reservacion
        //Se obtiene el tipo de reserva seleccionado
        String itemSeleccionado=view.jComboTipoRe.getSelectedItem().toString();
        /*Se realiza el cambio y salto entre paneles de parametros de cada tipo de reserva*/
        switch (itemSeleccionado) {
            case "Cabaña"://reseva de cabaña
                if (panelActualParametros!=null){panelActualParametros.setVisible(false);panelActualParametros.setEnabled(false);}
                panelActualParametros=view.jPanelParametrosCabania;
                panelActualParametros.setVisible(true);
                break;
            case "Mesa en Restaurante"://reserva de mesa
                if (panelActualParametros!=null){panelActualParametros.setVisible(false);panelActualParametros.setEnabled(false);}
                panelActualParametros=view.jPanelParametrosRestaurante;
                panelActualParametros.setVisible(true);
                break;
            default://reserva de servicios
                if (panelActualParametros!=null){panelActualParametros.setVisible(false);panelActualParametros.setEnabled(false);}
                panelActualParametros=null;
                break;
        }
    }
    private void CambioPanelMostrarReservas(String[][] datos,String[] cabeceras){
        /*SE hace el ingreso de datos en la tabla de reservaciones para cada tipo de reserva*/
        if (panelActual!=null){panelActual.setVisible(false);panelActual.setEnabled(false);}
        panelActual=view.jPanelReservas;
        panelActual.setVisible(true);
        model2.setDataVector(datos, cabeceras);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.btnFindAfi)){
            huesped=ListaAfiliados.getInstance().findAfiliado(view.txtIDHuesped.getText());
            if(huesped!=null){
                view.txtSetNombre.setText(huesped.getNombre());
                view.txtSetApellido.setText(huesped.getApellido());
                view.jComboTipoRe.setEnabled(true);
                view.btnBusRe.setEnabled(true);
                view.btnReservar.setEnabled(false);
            }
            else {JOptionPane.showMessageDialog(null, "No se encontró el afiliado solicitado");view.btnBusRe.setEnabled(false);view.jComboTipoRe.setEnabled(false);}
        }
        else if(e.getSource().equals(view.btnFindHues)){
            huesped=ListaHuespedes.getInstance().findHuesped(view.txtIDHuesped.getText());
            if(huesped!=null){
                view.txtSetNombre.setText(huesped.getNombre());
                view.txtSetApellido.setText(huesped.getApellido());
                view.jComboTipoRe.setEnabled(true);
                view.btnBusRe.setEnabled(true);
                view.btnReservar.setEnabled(false);
            }
            else {JOptionPane.showMessageDialog(null, "No se encontró el huesped solicitado");view.btnBusRe.setEnabled(false);view.jComboTipoRe.setEnabled(false);}
        }
        else if(e.getSource().equals(view.btnBusRe)){//Se presiona el boton buscar en la seccion ingresar reserva
            AccionBotonBuscarReserva();
        }
        else if(e.getSource().equals(view.jComboTipoRe)){//Se cambia de tipo de reserva en la seccion ingresar reserva
            AccionComboBoxTipoReserva();
        }
        else if(e.getSource().equals(view.btnReservar)){//se presiona el boton reservar en la seccion ingresar reserva
            AccionBotonReservar();
        }
        else if(e.getSource().equals(view.btnBuscar)){//Se presiona el boton buscar en la seccion buscar/eliminar
           AccionBotonBuscarReservaBusqueda();
        }
        else if(e.getSource().equals(view.btnEliminar)){//Se presiona el boton eliminar en la seccion buscar/eliminar
           AccionBotonEliminarReserva();
        }
        else if(e.getSource().equals(view.jMenuReservaCabania)){//Se presiona mostrar reservaciones de cabania
            CambioPanelMostrarReservas(ListaReservaCabanias.getInstance().getLista(), new String[]{"Fecha Registro","Cabaña","Fecha Inicio","Fecha Final","Huesped","Reserva Vigente?"});
        }
        else if(e.getSource().equals(view.jMenuMesasRestaurante)){//Se presiona mostrar reservaciones de restaurante
           CambioPanelMostrarReservas(ListaReservaRestaurante.getInstance().getLista(), new String[]{"Fecha Registro","Restaurante","Mesa","Fecha Inicio","Hora Inicio","Hora Final","Huesped","Reserva Vigente?"});
        }
        else if(e.getSource().equals(view.jMenuReservasServicios)){//Se presiona mostrar reservaciones de restaurante
           CambioPanelMostrarReservas(ListaReservaServicios.getInstance().getLista(), new String[]{"Fecha Registro","Servicio","Cantidad Solicitada","Huesped","Reserva Vigente?"});
        }
        else if(e.getSource().equals(view.jMenuCargar)){
            Reserva.cargarReservas();
        }
        else if(e.getSource().equals(view.jMenuGrabar)){
            Reserva.guardarReservas();
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Cambio de paneles de los menus de la barra superior
        if(e.getSource().equals(view.MenuRetroceder)){//regresar a la ventana principal
            view.setVisible(false);
            new ctrlVistaEmpresa(new vistaEmpresa());
        }
        else if(e.getSource().equals(view.jMenuRegistrarR)){
            if (panelActual!=null){panelActual.setVisible(false);panelActual.setEnabled(false);}
            panelActual=view.jPanelRegistrarReserva;
            panelActual.setVisible(true);
            panelActual.setEnabled(true);
        }
        else if(e.getSource().equals(view.jMenuCancelarR)){
            if (panelActual!=null){panelActual.setVisible(false);panelActual.setEnabled(false);}
            panelActual=view.jPanelBuscarEliminar;
            panelActual.setVisible(true);
            panelActual.setEnabled(true);
            view.btnEliminar.setEnabled(false);
        }
    }
    
    
}
