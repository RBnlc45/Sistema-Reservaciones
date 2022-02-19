
package Controlador;

import Modelo.Empresa;
import Vista.vistaEmpresa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



public class ctrlVistaEmpresa extends MouseAdapter implements ActionListener{
    private vistaEmpresa view;
    private Empresa empresa;

    public ctrlVistaEmpresa(vistaEmpresa view) {
        this.view = view;
        empresa=new Empresa();
        inicio();
    }
    private void inicio(){
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        view.setTitle(empresa.getNombre());
        view.MenuAreas.addMouseListener(this);
        view.MenuPropietarios.addMouseListener(this);
        view.MenuServicios.addMouseListener(this);
        view.MenuReservas.addMouseListener(this);
        view.jMenuHuespedes.addMouseListener(this);
        view.jMenuAfiliados.addMouseListener(this);
        view.btnCargarConfiguraciones.addActionListener(this);
        view.btnGuardarConfiguraciones.addActionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(view.MenuAreas)){//se preciona el menu areas
            new ctrlVistaAreas();
            view.setVisible(false);
        }
        else if(e.getSource().equals(view.MenuPropietarios)){
            view.setVisible(false);
            new ctrlVistaPropietario();    
        }
        else if(e.getSource().equals(view.MenuReservas)){
            new ctrlVistaReservas();
            view.setVisible(false);
        }
        else if(e.getSource().equals(view.MenuServicios)){
            view.setVisible(false);
            new ctrlVistaServicios();
        }
        else if(e.getSource().equals(view.jMenuHuespedes)){
            view.setVisible(false);
            new ctrlVistaHuespedes();
        }
        else if(e.getSource().equals(view.jMenuAfiliados)){
            view.setVisible(false);
            new ctrlVistaAfiliados();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(view.btnCargarConfiguraciones)){
            empresa.cargarConfiguraciones();
        }
        else if(e.getSource().equals(view.btnGuardarConfiguraciones)){
            empresa.guardarConfiguraciones();
        }
    }
    
    
}
