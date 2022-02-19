
package Vista;
import javax.swing.JPanel;

public class vistaServicios extends javax.swing.JFrame {
    public vistaServicios() {
        initComponents();
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelIngresoServicio = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreI = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanelEliminarServicio = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreB = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablaBusquedaServicio = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaServicios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuRetrocederS = new javax.swing.JMenu();
        jMenuSIngresar = new javax.swing.JMenu();
        jMenuSBE = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuCargar = new javax.swing.JMenuItem();
        jMenuGrabar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Servicios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 230, 20));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelIngresoServicio.setForeground(new java.awt.Color(255, 255, 255));
        jPanelIngresoServicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanelIngresoServicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 54, 50, 50));

        jLabel3.setText("Capacidad:");
        jPanelIngresoServicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 120, 70, 60));
        jPanelIngresoServicio.add(txtNombreI, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 149, -1));
        jPanelIngresoServicio.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 149, -1));

        btnIngresar.setText("Ingresar");
        jPanelIngresoServicio.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ingresar Servicio");
        jPanelIngresoServicio.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, -1));

        jLayeredPane1.add(jPanelIngresoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelEliminarServicio.setForeground(new java.awt.Color(255, 255, 255));
        jPanelEliminarServicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Nombre:");
        jPanelEliminarServicio.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 70, 40));
        jPanelEliminarServicio.add(txtNombreB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 149, -1));

        jTablaBusquedaServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo", "Capacidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaBusquedaServicio.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTablaBusquedaServicio);

        jPanelEliminarServicio.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 166, 470, 88));

        btnBuscar.setText("Buscar");
        jPanelEliminarServicio.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 100, -1));

        btnEliminar.setText("Eliminar");
        jPanelEliminarServicio.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Buscar o Eliminar Servicio");
        jPanelEliminarServicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, -1));

        jLayeredPane1.add(jPanelEliminarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, -1, -1));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 502, -1));

        jTablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablaServicios.setEnabled(false);
        jTablaServicios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablaServicios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 240, 440));

        MenuRetrocederS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icos/flechaAtras.png"))); // NOI18N
        jMenuBar1.add(MenuRetrocederS);

        jMenuSIngresar.setText("Ingresar");
        jMenuBar1.add(jMenuSIngresar);

        jMenuSBE.setText("Buscar/Eliminar");
        jMenuBar1.add(jMenuSBE);

        jMenu4.setText("Cargar/Grabar Datos");

        jMenuCargar.setText("Cargar Datos");
        jMenu4.add(jMenuCargar);

        jMenuGrabar.setText("Grabar Datos");
        jMenu4.add(jMenuGrabar);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu MenuRetrocederS;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuCargar;
    public javax.swing.JMenuItem jMenuGrabar;
    public javax.swing.JMenu jMenuSBE;
    public javax.swing.JMenu jMenuSIngresar;
    public javax.swing.JPanel jPanelEliminarServicio;
    public javax.swing.JPanel jPanelIngresoServicio;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTable jTablaBusquedaServicio;
    public javax.swing.JTable jTablaServicios;
    public javax.swing.JTextField txtCapacidad;
    public javax.swing.JTextField txtNombreB;
    public javax.swing.JTextField txtNombreI;
    // End of variables declaration//GEN-END:variables
}
