
package Controlador;

import Modelo.Afiliado;
import Modelo.Listas.ListaAfiliados;
import Vista.vistaAfiliados;
import Vista.vistaEmpresa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ctrlVistaAfiliados extends MouseAdapter implements ActionListener{
    private vistaAfiliados view; 
    private ListaAfiliados afiliados;
    private DefaultTableModel model1,model2;
    public ctrlVistaAfiliados(){
        inicio();
        hidePaneles();
        inicioBotones();
        fillTabla(model1,afiliados.getLista(),new String[]{"Cédula/Pasaporte","Nombre","Apellido","Telefono Celular"});
    }
    private void inicio(){
        view=new vistaAfiliados();
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setTitle("Afiliados");
        //se obtiene la lista de afiliados
        afiliados=ListaAfiliados.getInstance();
        //Formateo de las tablas
        model1=new DefaultTableModel(new String[]{"Cédula/Pasaporte","Nombre","Apellido","Telefono Celular"}, 0);
        model2=new DefaultTableModel(new String[]{"Fecha","Descripción"}, 0);
        view.jTablaAfiliados.setModel(model1);
        view.jTablePromociones.setModel(model2);
    }
    private void hidePaneles(){
        view.jPanelPromociones.setVisible(false);
    }
    private void inicioBotones(){
        view.btnCancelarAfiliacion.addActionListener(this);
        view.btnPromociones.addActionListener(this);
        view.jMenuItemCargar.addActionListener(this);
        view.jMenuItemGuardar.addActionListener(this);
        view.btnRetroceder.addMouseListener(this);  
    }
    private void cancelarAfiliacion(){
        int fila=view.jTablaAfiliados.getSelectedRow();//Se obtiene la fila de la tabla seleccionada
        if(fila<0){//Se comprueba que se escoja una fila
            JOptionPane.showMessageDialog(null, "Seleccione uno de los afiliados para continuar");
            return;//acaba este proceso
        }
        afiliados.deleteAfiliado(model1.getValueAt(fila, 0).toString());
        fillTabla(model1,afiliados.getLista(),new String[]{"Cédula/Pasaporte","Nombre","Apellido","Telefono Celular"});
    }
    private void fillTabla(DefaultTableModel model,String data[][],String identifier[]){
        model.setDataVector(data,identifier);
    }
    private void mostrarPromociones(){
        int fila=view.jTablaAfiliados.getSelectedRow();//Se obtiene la fila de la tabla seleccionada
        if(fila<0){//Se comprueba que se escoja una fila
            JOptionPane.showMessageDialog(null, "Seleccione uno de los afiliados para continuar");
            return;//acaba este proceso
        }
        Afiliado a=afiliados.findAfiliado(model1.getValueAt(fila, 0).toString());
        fillTabla(model2,a.getPromociones(),new String[]{"Fecha","Descripción"});
        view.jPanelAfiliados.setVisible(false);
        view.jPanelPromociones.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.btnCancelarAfiliacion)){
            cancelarAfiliacion();//se manda a cancelar la afiliacion
        }
        else if(e.getSource().equals(view.btnPromociones)){
            mostrarPromociones();//se manda a cancelar la afiliacion
        }
        else if(e.getSource().equals(view.jMenuItemCargar)){
            afiliados.recuperarAfiliados();
            fillTabla(model1,afiliados.getLista(),new String[]{"Cédula/Pasaporte","Nombre","Apellido","Telefono Celular"});
        }
        else if(e.getSource().equals(view.jMenuItemGuardar)){
            afiliados.grabarAfiliados();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(view.jPanelAfiliados.isVisible()){
            view.setVisible(false);
            new ctrlVistaEmpresa(new vistaEmpresa());
        }
        else{
            view.jPanelAfiliados.setVisible(true);
            view.jPanelPromociones.setVisible(false);
        }
        
    }
    
}
