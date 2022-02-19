
package Controlador;

import Modelo.Area;
import Modelo.Cabania;
import Modelo.Listas.ListaAreas;
import Modelo.Piscina;
import Modelo.Restaurante;
import Vista.vistaAreas;
import Vista.vistaEmpresa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ctrlVistaAreas extends MouseAdapter implements ActionListener{
    private vistaAreas view;
    private ListaAreas listaAreas;
    private JPanel panelActualPropiedades,panelActual;
    private DefaultTableModel model,modelB,modelLs;
    private Restaurante R;
    private Area A;

    public ctrlVistaAreas() {
        inicio();
        inicioBotones();
        HidePaneles();
    }
    private void inicio(){
        view=new vistaAreas();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setTitle("Areas");
        listaAreas=ListaAreas.getInstance();
        model=new DefaultTableModel(new String[]{"ID","Capacidad"}, 0);
        modelB=new DefaultTableModel(new String[]{"Tipo Área","Nombre","Capacidad"}, 0);
        modelLs=new DefaultTableModel(new String[]{"Tipo","Nombre"}, 0);
        view.tablaAreas.setEnabled(false);
        view.tablaMesas.setModel(model);
        view.tablaBusqueda.setModel(modelB);
        view.tablaAreas.setModel(modelLs);
        
        R=new Restaurante();
        actualizarLista();
    }
    private void inicioBotones(){
        view.btnBuscar.addActionListener(this);
        view.btnCargar.addActionListener(this);
        view.btnGuardar.addActionListener(this);
        view.btnRetroceder.addMouseListener(this);
        view.btnMIngresar.addMouseListener(this);
        view.btnEliminar.addActionListener(this);
        view.btnMenuBE.addMouseListener(this);
        view.btnIngresar.addActionListener(this);
        view.jComboTipoArea.addActionListener(this);
        view.btnAgregarMesa.addActionListener(this);
        view.jComboBoxBusqueda.addActionListener(this);
    }
    private void HidePaneles(){
        view.jPanelEliminarArea.setVisible(false);
        view.jPanelIngresoArea.setVisible(false);
        view.jPanelPropiedadesCabania.setVisible(false);
        view.jPanelPropiedadesPiscina.setVisible(false);
        view.jPanelPropiedadesRestaurante.setVisible(false);
    }
    private void mostrarPropiedades(String tipoArea){
        if (tipoArea.equals("Piscina")){
            if(panelActualPropiedades!=null) panelActualPropiedades.setVisible(false);
            panelActualPropiedades=view.jPanelPropiedadesPiscina;
            panelActualPropiedades.setVisible(true);
        }
        else if(tipoArea.equals("Cabaña")){
            if(panelActualPropiedades!=null) panelActualPropiedades.setVisible(false);
            panelActualPropiedades=view.jPanelPropiedadesCabania;
            panelActualPropiedades.setVisible(true);
        }
        else if(tipoArea.equals("Restaurante")){
            if(panelActualPropiedades!=null) panelActualPropiedades.setVisible(false);
            panelActualPropiedades=view.jPanelPropiedadesRestaurante;
            panelActualPropiedades.setVisible(true);
        }   
    }
    private int verificarAtributosArea(String nombre,String capacidad){
        int cap=-1;
        if(!nombre.isBlank()&&!capacidad.isBlank()){
            try{
                cap=Integer.parseInt(capacidad);
                if(cap>0) return cap;
                else {JOptionPane.showMessageDialog(null, "Asegure de que la capacidad sea un entero positivo"); return -1;}
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Asegurese de que la capacidad del área sea un valor entero");
                return -1;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Asegurese de llenar todos los campos");
            return -1;
        }   
    }
    private void ingresarArea(String o){
        int capacidad=verificarAtributosArea(view.txtNombreR.getText(), view.txtCapacidad.getText());
        if(o.equals("Cabaña")){
            if(capacidad>0) listaAreas.addCabania(view.txtNombreR.getText(),capacidad,view.jComboTipoCabania.getSelectedItem().toString().charAt(0));
        }
        else if(o.equals("Piscina")){
            if(capacidad>0) listaAreas.addPiscina(view.jComboTipoPiscina.getSelectedItem().toString().charAt(0),view.txtNombreR.getText(),capacidad);
        }
        else if(o.equals("Restaurante")){
            if(capacidad>0){
                if(R.getNumMesas()>0){
                    R.setNombre(view.txtNombreR.getText());
                    R.setCapacidad(capacidad);
                    listaAreas.addRestaurante(R);
                    R=new Restaurante();
                    model=new DefaultTableModel(new String[]{"ID","Capacidad"}, 0);
                    view.tablaMesas.setModel(model);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Primero debe agregar mesas para el Restaurante");
                }
            }
        }
    }
    private void insertarMesa(){
        String id=view.txtIDMesa.getText();
        if(!id.isBlank()){
            try{
                boolean flag=R.insertarMesa(Integer.parseInt(id),Integer.parseInt(view.ComboCapacidad.getSelectedItem().toString()));
                if(flag) model.addRow(new String[]{id,view.ComboCapacidad.getSelectedItem().toString()});
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El ID de mesa debe ser un valor numerico entero");
            }
            
        }
        else JOptionPane.showMessageDialog(null, "Asegurese de ingresar un ID de mesa");
    }
    private void buscarArea(){
        String nombre=view.txtNombreBusqueda.getText();
        if(!nombre.isBlank()){
            String tipoArea=view.jComboBoxBusqueda.getSelectedItem().toString();
            if(tipoArea.equals("Cabaña")){
                A=listaAreas.findCabania(nombre, view.jComboBoxTipoB.getSelectedItem().toString().charAt(0));
                if(A!=null) modelB.addRow(new String[]{"Cabaña",A.getNombre(),A.getCapacidad()+""});
            }
            else if(tipoArea.equals("Piscina")){
                A=listaAreas.findPiscina(nombre, view.jComboBoxTipoB.getSelectedItem().toString().charAt(0));
                if(A!=null) modelB.addRow(new String[]{"Piscina",A.getNombre(),A.getCapacidad()+""});
            }
            else if(tipoArea.equals("Restaurante")){
                A=listaAreas.findRestaurante(nombre);
                if(A!=null) modelB.addRow(new String[]{"Restaurante",A.getNombre(),A.getCapacidad()+""});
            }
            if(A!=null) view.btnEliminar.setEnabled(true);
            else {
                JOptionPane.showMessageDialog(null, "No se encontró el área buscada");
                view.btnEliminar.setEnabled(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Asegurese de ingresar el nombre del area");
        }
    }
    private void actualizarLista(){
        modelLs.setDataVector(listaAreas.toDataVector(), new String[]{"Tipo","Nombre"});
    }
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(view.jComboTipoArea)){
            mostrarPropiedades(view.jComboTipoArea.getSelectedItem().toString());
        }
        else if(e.getSource().equals(view.jComboBoxBusqueda)){
            if(view.jComboBoxBusqueda.getSelectedItem().toString().equals("Cabaña")){
                view.jPanel1.setVisible(true);
            }
            else if(view.jComboBoxBusqueda.getSelectedItem().toString().equals("Piscina")){
                view.jPanel1.setVisible(true);
            }
            else if(view.jComboBoxBusqueda.getSelectedItem().toString().equals("Restaurante")){
                view.jPanel1.setVisible(false);
            }
        }
        else if(e.getSource().equals(view.btnIngresar)){
            ingresarArea(view.jComboTipoArea.getSelectedItem().toString());
            actualizarLista();
        }
        else if(e.getSource().equals(view.btnAgregarMesa)){
            insertarMesa();
        }
        else if(e.getSource().equals(view.btnBuscar)){
            buscarArea();
        }
        else if(e.getSource().equals(view.btnCargar)){
            listaAreas.recuperarAreas();
            actualizarLista();
        }
        else if(e.getSource().equals(view.btnGuardar)){
            listaAreas.grabarAreas();
        }
        else if(e.getSource().equals(view.btnEliminar)){
            if(modelB.getValueAt(0, 0).toString().equals("Cabaña")){
                Cabania c=(Cabania)A;
                listaAreas.deleteCabania(c.getNombre(),c.getTipo());
            }
            else if(modelB.getValueAt(0, 0).toString().equals("Piscina")){
                Piscina c=(Piscina)A;
                listaAreas.deletePiscina(c.getNombre(),c.getTipo());
            }
            else if(modelB.getValueAt(0,0).toString().equals("Restaurante")){
                listaAreas.deleteRestaurante(A.getNombre());
            }
            actualizarLista();
            modelB.removeRow(0);
            view.btnEliminar.setEnabled(false);
        }
    }

    public void mouseClicked(MouseEvent e) {
       if(e.getSource().equals(view.btnMIngresar)){
           if (panelActual!=null){panelActual.setVisible(false);panelActual.setEnabled(false);}
           panelActual=view.jPanelIngresoArea;
           view.jPanelIngresoArea.setVisible(true);
           panelActualPropiedades= view.jPanelPropiedadesCabania;
          panelActualPropiedades.setVisible(true);
       }
       else if(e.getSource().equals(view.btnMenuBE)){
           if (panelActual!=null){panelActual.setVisible(false);panelActual.setEnabled(false);}
            panelActual=view.jPanelEliminarArea;
            view.jPanelEliminarArea.setVisible(true);
            view.btnEliminar.setEnabled(false);
       }
       else if(e.getSource().equals(view.btnRetroceder)){
           ctrlVistaEmpresa empresa=new ctrlVistaEmpresa(new vistaEmpresa());
           view.setVisible(false);
       }
    }
    
    
}
