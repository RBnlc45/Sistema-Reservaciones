
package Controlador;

import Modelo.Listas.ListaServicios;
import Modelo.Servicio;
import Vista.vistaEmpresa;
import Vista.vistaServicios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ctrlVistaServicios extends MouseAdapter implements ActionListener{
    private ListaServicios servicios;
    private vistaServicios view;
    private DefaultTableModel model,modelB;
    private Servicio aux;
    private JPanel panelActual;
    
    public ctrlVistaServicios() {
        inicio();
        HidePaneles();
        inicioBotones();
        fillTabla();
    }
    private void inicio(){
        view=new vistaServicios();
        view.setVisible(true);
        view.setTitle("Servicios");
        view.setLocationRelativeTo(null);
        servicios=ListaServicios.getInstance();
        model=new DefaultTableModel(new String[]{"Nombre","Cantidad"}, 0);
        modelB=new DefaultTableModel(new String[]{"Nombre","Capacidad","Disponibles"}, 0);
        view.jTablaBusquedaServicio.setModel(modelB);
        view.jTablaServicios.setModel(model);
    }
    private void HidePaneles(){
        view.jPanelEliminarServicio.setVisible(false);
        view.jPanelIngresoServicio.setVisible(false);
    }
    private void inicioBotones(){
        view.btnBuscar.addActionListener(this);
        view.btnEliminar.addActionListener(this);
        view.btnIngresar.addActionListener(this);
        view.jMenuCargar.addActionListener(this);
        view.jMenuGrabar.addActionListener(this);
        view.MenuRetrocederS.addMouseListener(this);
        view.jMenuSIngresar.addMouseListener(this);
        view.jMenuSBE.addMouseListener(this);
    }
    private void IngresarS(){
        String nombre=view.txtNombreI.getText();
        String capacidad=view.txtCapacidad.getText();
        if(!nombre.isBlank()&&!capacidad.isBlank()){
            try{
                int cap=Integer.parseInt(capacidad);
                servicios.addServicio(new Servicio(nombre, cap, cap));
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Asegurese de que la capacidad sea un valor entero");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Asegurese de ingresar todos los campos");
        }
    }
    private void fillTabla(){
        model.setDataVector(servicios.getLista(), new String[]{"Nombre","Cantidad"});
    }
    private void Buscar(){
        String nombre=view.txtNombreB.getText();
        if(!nombre.isBlank()){
            aux=servicios.findServicio(nombre);
            if(aux==null) {
                JOptionPane.showMessageDialog(null, "No se encontró el servicio solicitado");
                modelB=new DefaultTableModel(new String[]{"Nombre","Capacidad","Disponibles"}, 0);
                view.btnEliminar.setEnabled(false);
            }
            else{
                modelB.setDataVector(new String[][]{{aux.getNombre(),aux.getCapacidad()+"",aux.getDisponibles()+""}}, new String[]{"Nombre","Capacidad","Disponibles"});
                view.jTablaBusquedaServicio.setModel(modelB);
                view.btnEliminar.setEnabled(true);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Asegurese de ingresar todos los campos");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.btnBuscar)){
            Buscar();
        }
        else if(e.getSource().equals(view.btnEliminar)){
            if(aux!=null) servicios.deleteServicio(aux.getNombre());
            modelB=new DefaultTableModel(new String[]{"Nombre","Capacidad","Disponibles"}, 0);
            view.jTablaBusquedaServicio.setModel(modelB);
            view.btnEliminar.setEnabled(false);
            fillTabla();
        }
        else if(e.getSource().equals(view.btnIngresar)){
            IngresarS();
            fillTabla();
        }
        else if(e.getSource().equals(view.jMenuCargar)){
            servicios.recuperarServicios();
            fillTabla();
        }
        else if(e.getSource().equals(view.jMenuGrabar)){
            servicios.grabarServicios();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(view.jMenuSIngresar)){
            if (panelActual!=null){panelActual.setVisible(false);panelActual.setEnabled(false);}
            panelActual=view.jPanelIngresoServicio;
            view.jPanelIngresoServicio.setVisible(true);
            view.jPanelIngresoServicio.setEnabled(true);
        }
        else if(e.getSource().equals(view.jMenuSBE)){
            if (panelActual!=null){panelActual.setVisible(false);panelActual.setEnabled(false);}
            panelActual=view.jPanelEliminarServicio;
            view.jPanelEliminarServicio.setVisible(true);
            view.jPanelEliminarServicio.setEnabled(true);
            view.btnEliminar.setEnabled(false);
        }
        else if(e.getSource().equals(view.MenuRetrocederS)){
            view.setVisible(false);
            ctrlVistaEmpresa ctrl=new ctrlVistaEmpresa(new vistaEmpresa());
        }
    }
    
    
}
