
package Vista;

public class vistaPropietarios extends javax.swing.JFrame {
    
    public vistaPropietarios() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelIngresar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtPercent = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanelBuscarNombres = new javax.swing.JPanel();
        txtLastNameB = new javax.swing.JTextField();
        txtNameB = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnFindNA = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableResult1 = new javax.swing.JTable();
        btnDeleteNA = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanelBuscarCedula = new javax.swing.JPanel();
        txtIDB = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnFindID = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableResult2 = new javax.swing.JTable();
        btnDeleteID = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListaPropietarios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuRetroceder = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuIngresar = new javax.swing.JMenu();
        jMenuBE = new javax.swing.JMenu();
        jMenuBApellidos = new javax.swing.JMenuItem();
        jMenuBCedula = new javax.swing.JMenuItem();
        jMenuGC = new javax.swing.JMenu();
        jMenuCargar = new javax.swing.JMenuItem();
        jMenuIGrabar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista Propietarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 110, 20));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelIngresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Cédula/Pasaporte:");
        jPanelIngresar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel3.setText("Nombres:");
        jPanelIngresar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel4.setText("Apellidos:");
        jPanelIngresar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel5.setText("Nacionalidad:");
        jPanelIngresar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel6.setText("Porcentaje:");
        jPanelIngresar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));
        jPanelIngresar.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 167, -1));
        jPanelIngresar.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 167, -1));
        jPanelIngresar.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 167, -1));
        jPanelIngresar.add(txtPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 167, -1));
        jPanelIngresar.add(txtPercent, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 167, -1));

        btnRegistrar.setText("Registrar");
        jPanelIngresar.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Ingresar Propietario");
        jPanelIngresar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        jLayeredPane1.add(jPanelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 368));

        jPanelBuscarNombres.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelBuscarNombres.add(txtLastNameB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 141, -1));
        jPanelBuscarNombres.add(txtNameB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 141, -1));

        jLabel9.setText("Apellidos:");
        jPanelBuscarNombres.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 40));

        jLabel10.setText("Nombres:");
        jPanelBuscarNombres.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, 40));

        btnFindNA.setText("Buscar");
        jPanelBuscarNombres.add(btnFindNA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 100, -1));

        tableResult1.setModel(new javax.swing.table.DefaultTableModel(
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
        tableResult1.setEnabled(false);
        jScrollPane2.setViewportView(tableResult1);

        jPanelBuscarNombres.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 188, 430, 89));

        btnDeleteNA.setText("Eliminar");
        jPanelBuscarNombres.add(btnDeleteNA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Buscar Propietario");
        jPanelBuscarNombres.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 10, 420, -1));

        jLayeredPane1.add(jPanelBuscarNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 370));

        jPanelBuscarCedula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelBuscarCedula.add(txtIDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 141, -1));

        jLabel11.setText("Cédula/Pasaporte");
        jPanelBuscarCedula.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 73, -1, -1));

        btnFindID.setText("Buscar");
        jPanelBuscarCedula.add(btnFindID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 90, -1));

        tableResult2.setModel(new javax.swing.table.DefaultTableModel(
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
        tableResult2.setRowSelectionAllowed(false);
        tableResult2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tableResult2);

        jPanelBuscarCedula.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, 408, 89));

        btnDeleteID.setText("Eliminar");
        jPanelBuscarCedula.add(btnDeleteID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Buscar Propietario");
        jPanelBuscarCedula.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 10, 420, -1));

        jLayeredPane1.add(jPanelBuscarCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 430, 370));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 11, -1, -1));

        jListaPropietarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jListaPropietarios.setEnabled(false);
        jListaPropietarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jListaPropietarios);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 210, 360));

        MenuRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icos/flechaAtras.png"))); // NOI18N
        MenuRetroceder.add(jSeparator1);

        jMenuBar1.add(MenuRetroceder);

        jMenuIngresar.setText("Ingresar");
        jMenuBar1.add(jMenuIngresar);

        jMenuBE.setText("Buscar/Eliminar");

        jMenuBApellidos.setText("Nombre/Apellido");
        jMenuBE.add(jMenuBApellidos);

        jMenuBCedula.setText("Cédula/Pasaporte");
        jMenuBE.add(jMenuBCedula);

        jMenuBar1.add(jMenuBE);

        jMenuGC.setText("Grabar/Cargar");

        jMenuCargar.setText("Cargar Datos");
        jMenuGC.add(jMenuCargar);

        jMenuIGrabar.setText("Grabar Datos");
        jMenuGC.add(jMenuIGrabar);

        jMenuBar1.add(jMenuGC);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu MenuRetroceder;
    public javax.swing.JButton btnDeleteID;
    public javax.swing.JButton btnDeleteNA;
    public javax.swing.JButton btnFindID;
    public javax.swing.JButton btnFindNA;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JTable jListaPropietarios;
    public javax.swing.JMenuItem jMenuBApellidos;
    public javax.swing.JMenuItem jMenuBCedula;
    private javax.swing.JMenu jMenuBE;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuCargar;
    private javax.swing.JMenu jMenuGC;
    public javax.swing.JMenuItem jMenuIGrabar;
    public javax.swing.JMenu jMenuIngresar;
    public javax.swing.JPanel jPanelBuscarCedula;
    public javax.swing.JPanel jPanelBuscarNombres;
    public javax.swing.JPanel jPanelIngresar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    public javax.swing.JTable tableResult1;
    public javax.swing.JTable tableResult2;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtIDB;
    public javax.swing.JTextField txtLastName;
    public javax.swing.JTextField txtLastNameB;
    public javax.swing.JTextField txtName;
    public javax.swing.JTextField txtNameB;
    public javax.swing.JTextField txtPais;
    public javax.swing.JTextField txtPercent;
    // End of variables declaration//GEN-END:variables
}
