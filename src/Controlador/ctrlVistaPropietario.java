
package Controlador;

import Modelo.Listas.ListaPropietarios;
import Modelo.Propietario;
import Vista.vistaEmpresa;
import Vista.vistaPropietarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ctrlVistaPropietario implements ActionListener{
  private vistaPropietarios view;
  private ListaPropietarios listaPropietarios;
  private DefaultTableModel modeloTabla,model1;
  private JPanel panelActual;//Panel que se esta mostrando
  

    public ctrlVistaPropietario() {
        this.view = new vistaPropietarios();
        this.listaPropietarios = ListaPropietarios.getInstance();
        inicio();
        iniciarBotones();
        fillLista();
    }
    private void inicio(){
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setTitle("Propietarios");
        cleanPanelIngresar();
        cleanPanelBE();
        //Se ocultan los paneles
        view.jPanelBuscarCedula.setVisible(false);
        view.jPanelBuscarNombres.setVisible(false);
        view.jPanelIngresar.setVisible(false);
        model1=new DefaultTableModel(new String []{"ID","Nombre","Apellido"},0);
        view.jListaPropietarios.setModel(model1);
    }
    private void iniciarBotones(){
        view.btnRegistrar.addActionListener(this);
        view.btnDeleteID.addActionListener(this);
        view.btnDeleteNA.addActionListener(this);
        view.btnFindID.addActionListener(this);
        view.btnFindNA.addActionListener(this);
        view.jMenuCargar.addActionListener(this);
        view.jMenuIGrabar.addActionListener(this);
        view.jMenuBApellidos.addActionListener(this);
        view.jMenuBCedula.addActionListener(this);
        view.jMenuIngresar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
               showPanel(view.jPanelIngresar);
               cleanPanelIngresar();
            }
        });
        view.MenuRetroceder.addMouseListener(new MouseAdapter() {
          public void mouseClicked(MouseEvent e) {
            view.setVisible(false);
            new ctrlVistaEmpresa(new vistaEmpresa());
         }

        });
    }
    private void fillLista(){
        model1.setDataVector(new String[][]{}, new String []{"ID","Nombre","Apellido"});
        listaPropietarios.getLista(model1);
    }
    private void cleanPanelIngresar(){//limpiar los elementos del panel de ingreso de propietario
        view.txtID.setText("");
        view.txtName.setText("");
        view.txtLastName.setText("");
        view.txtPais.setText("");
        view.txtPercent.setText("");
    }
    private void cleanPanelBE(){//limpiar los elementos del panel de busqueda y eliminacion de propietario
        view.txtIDB.setText("");
        view.txtLastNameB.setText("");
        view.txtNameB.setText("");
        modeloTabla=new DefaultTableModel(new String[]{"Cédula/Pasaporte","Nombres","Apellidos","Nacionalidad","Porcentaje"},0);
        view.tableResult1.setModel(modeloTabla);
        view.tableResult2.setModel(modeloTabla);
        view.btnDeleteID.setEnabled(false);
        view.btnDeleteNA.setEnabled(false);
    }
    private void registarPropietario(){
        String nombre,apellido,id,nacionalidad,porcentaje;
        nombre=view.txtName.getText();
        apellido=view.txtLastName.getText();
        id=view.txtID.getText();
        nacionalidad=view.txtPais.getText();
        porcentaje=view.txtPercent.getText();
        if(!nombre.isBlank()&&!apellido.isBlank()&&!id.isBlank()&&!nacionalidad.isBlank()&&!porcentaje.isBlank()){
            try{
                int percent=Integer.parseInt(view.txtPercent.getText());
                    Propietario propietario=new Propietario(apellido, nombre, id, nacionalidad, percent);
                    listaPropietarios.addPropietario(propietario);
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El valor de porcentaje debe ser numerico");
            }    
        }
        else{
           JOptionPane.showMessageDialog(null, "Compruebe que todos los campos esten llenos"); 
        }
        
    }
    private void buscarPropietario(int opc){
        if(opc==1){
            String nombre,apellido;
            nombre=view.txtNameB.getText();
            apellido=view.txtLastNameB.getText();
            if(!nombre.isBlank()&&!apellido.isBlank()){
                Propietario propietario=listaPropietarios.findPropietario(nombre, apellido);
                if(propietario!=null){
                    modeloTabla.insertRow(0,new String[]{propietario.getID(),propietario.getNombre(),propietario.getApellido()
                            ,propietario.getNacionalidad(),propietario.getPorcentaje()+""});
                    view.btnDeleteNA.setEnabled(true);
                }  
                else{
                    JOptionPane.showMessageDialog(null, "No se encontro el propietario"); 
                }
            }
            else{
               JOptionPane.showMessageDialog(null, "Compruebe que todos los campos esten llenos"); 
            }
            
        }
        else{
            String id;
            id=view.txtIDB.getText();
            if(!id.isBlank()){
                Propietario propietario=listaPropietarios.findPropietario(id);
                if(propietario!=null){
                    modeloTabla.insertRow(0,new String[]{propietario.getID(),propietario.getNombre(),propietario.getApellido()
                            ,propietario.getNacionalidad(),propietario.getPorcentaje()+""});
                    view.btnDeleteID.setEnabled(true);
                }  
                else{
                    JOptionPane.showMessageDialog(null, "No se encontro el propietario"); 
                }
            }
            else{
               JOptionPane.showMessageDialog(null, "Compruebe que todos los campos esten llenos"); 
            }
        }  
    }
    private void eliminarPropietario(int opc){
        if(opc==1){
            Propietario obj=listaPropietarios.deletePropietario((String) modeloTabla.getValueAt(0,1),(String) modeloTabla.getValueAt(0, 2));
            if (obj!=null){
                view.txtLastNameB.setText("");
                view.txtNameB.setText("");
            }
        }
        else{
           Propietario obj=listaPropietarios.deletePropietario((String) modeloTabla.getValueAt(0, 0));
            if (obj!=null){
                view.txtIDB.setText("");
            } 
        }
    }
    private void  showPanel(JPanel panel){
        if (panelActual!=null){panelActual.setVisible(false);panelActual.setEnabled(false);}
        panelActual=panel;
        panel.setVisible(true);
        panel.setEnabled(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(view.btnRegistrar)){
            registarPropietario();
            fillLista();
        }
        else if(e.getSource().equals(view.btnFindID)){
            buscarPropietario(2);
        }
        else if(e.getSource().equals(view.btnFindNA)){
            buscarPropietario(1);
        }
        else if(e.getSource().equals(view.btnDeleteID)){
            eliminarPropietario(2);
            view.btnDeleteID.setEnabled(false);
            modeloTabla.removeRow(0);
            fillLista();
        }
        else if(e.getSource().equals(view.btnDeleteNA)){
            eliminarPropietario(1);
            view.btnDeleteNA.setEnabled(false);
            modeloTabla.removeRow(0);
            fillLista();
        }
        else if(e.getSource().equals(view.jMenuCargar)){//Proceso de carga de archivos
                listaPropietarios.recuperarPropietarios();
                fillLista();
        }
        else if(e.getSource().equals(view.jMenuIGrabar)){//Proceso de grabación de archivo
            listaPropietarios.grabarPropietarios();
        }
        else if(e.getSource().equals(view.jMenuBApellidos)){
            showPanel(view.jPanelBuscarNombres);
            cleanPanelBE();
        }
        else if(e.getSource().equals(view.jMenuBCedula)){
            showPanel(view.jPanelBuscarCedula);
            cleanPanelBE();
        }        
    }
    
    
  
}
