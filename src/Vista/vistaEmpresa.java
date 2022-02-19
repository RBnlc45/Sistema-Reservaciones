
package Vista;

public class vistaEmpresa extends javax.swing.JFrame {

    public vistaEmpresa() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHuespedes = new javax.swing.JMenu();
        jMenuAfiliados = new javax.swing.JMenu();
        MenuReservas = new javax.swing.JMenu();
        MenuAreas = new javax.swing.JMenu();
        MenuServicios = new javax.swing.JMenu();
        MenuPropietarios = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        btnCargarConfiguraciones = new javax.swing.JMenuItem();
        btnGuardarConfiguraciones = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuHuespedes.setText("Huespedes");
        jMenuBar1.add(jMenuHuespedes);

        jMenuAfiliados.setText("Afiliados");
        jMenuBar1.add(jMenuAfiliados);

        MenuReservas.setText("Reservas");
        jMenuBar1.add(MenuReservas);

        MenuAreas.setText("Areas");
        jMenuBar1.add(MenuAreas);

        MenuServicios.setText("Servicios");
        jMenuBar1.add(MenuServicios);

        MenuPropietarios.setText("Propietarios");
        jMenuBar1.add(MenuPropietarios);

        jMenu1.setText("Configuraciones");

        btnCargarConfiguraciones.setText("Cargar Configuraciones");
        jMenu1.add(btnCargarConfiguraciones);

        btnGuardarConfiguraciones.setText("Guardar Configuraciones");
        jMenu1.add(btnGuardarConfiguraciones);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu MenuAreas;
    public javax.swing.JMenu MenuPropietarios;
    public javax.swing.JMenu MenuReservas;
    public javax.swing.JMenu MenuServicios;
    public javax.swing.JMenuItem btnCargarConfiguraciones;
    public javax.swing.JMenuItem btnGuardarConfiguraciones;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenuAfiliados;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu jMenuHuespedes;
    // End of variables declaration//GEN-END:variables
}
