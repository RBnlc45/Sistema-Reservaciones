
package Vista;


public class vistaHuespedes extends javax.swing.JFrame {

    
    public vistaHuespedes() {
        initComponents();
               
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaHuespedes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelRegistro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCiudadO = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtTelefonoF = new javax.swing.JTextField();
        txtProfesion = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBancoEmisor = new javax.swing.JTextField();
        txtFechaTarjeta = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        rBtnSi = new javax.swing.JRadioButton();
        rBtnNo = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();
        txtID = new javax.swing.JFormattedTextField();
        txtNumTarjeta = new javax.swing.JFormattedTextField();
        jPanelRegistroAfiliado = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtIDRAfiliado = new javax.swing.JTextField();
        btnRegistrarAfiliado = new javax.swing.JButton();
        jPanelBE = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txtIDBE = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaBEHuesped = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnRetroceder = new javax.swing.JMenu();
        jMenuRegistrar = new javax.swing.JMenu();
        jMenuItemNHues = new javax.swing.JMenuItem();
        jMenuItemAfiliado = new javax.swing.JMenuItem();
        jMenuBE = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCargar = new javax.swing.JMenuItem();
        jMenuItemGuardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablaHuespedes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablaHuespedes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 205, -1));

        jLabel1.setText("Lista de Huespedes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Cédula/Pasaporte:");
        jPanelRegistro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setText("Nombres:");
        jPanelRegistro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel4.setText("Apellidos:");
        jPanelRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setText("Dirección:");
        jPanelRegistro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel6.setText("Teléfono Celular:");
        jPanelRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 20));

        jLabel7.setText("Teléfono fijo:");
        jPanelRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 20));

        jLabel8.setText("Profesión:");
        jPanelRegistro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel9.setText("Ciudad de Origen:");
        jPanelRegistro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel10.setText("Nacionalidad:");
        jPanelRegistro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Formulario de Registro");
        jPanelRegistro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));
        jPanelRegistro.add(txtCiudadO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 120, -1));
        jPanelRegistro.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, -1));
        jPanelRegistro.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, -1));
        jPanelRegistro.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 120, -1));
        jPanelRegistro.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 120, -1));
        jPanelRegistro.add(txtTelefonoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 120, -1));
        jPanelRegistro.add(txtProfesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 120, -1));
        jPanelRegistro.add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 120, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("¿Desea Afiliarse?");
        jPanelRegistro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));

        jLabel13.setText("Banco Emisor:");
        jPanelRegistro.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel14.setText("N° Tarjeta:");
        jPanelRegistro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel15.setText("Fecha Caducidad:");
        jPanelRegistro.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));
        jPanelRegistro.add(txtBancoEmisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 110, -1));

        try {
            txtFechaTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFechaTarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelRegistro.add(txtFechaTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 110, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Método de Pago");
        jPanelRegistro.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        buttonGroup1.add(rBtnSi);
        rBtnSi.setText("Si");
        jPanelRegistro.add(rBtnSi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        buttonGroup1.add(rBtnNo);
        rBtnNo.setSelected(true);
        rBtnNo.setText("No");
        jPanelRegistro.add(rBtnNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        btnRegistrar.setText("Registrar");
        jPanelRegistro.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, -1));

        jLabel17.setText("Fecha Nacimiento:");
        jPanelRegistro.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        try {
            txtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelRegistro.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 120, -1));

        try {
            txtID.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelRegistro.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 120, -1));

        try {
            txtNumTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("################")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelRegistro.add(txtNumTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 110, -1));

        jLayeredPane1.add(jPanelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 480));

        jPanelRegistroAfiliado.setPreferredSize(new java.awt.Dimension(540, 443));
        jPanelRegistroAfiliado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Buscar al Afiliado");
        jPanelRegistroAfiliado.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel19.setText("Cédula/Pasaporte:");
        jPanelRegistroAfiliado.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 20));
        jPanelRegistroAfiliado.add(txtIDRAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 140, -1));

        btnRegistrarAfiliado.setText("Registrar");
        jPanelRegistroAfiliado.add(btnRegistrarAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 140, -1));

        jLayeredPane1.add(jPanelRegistroAfiliado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 480));

        jPanelBE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Cédula/Pasaporte:");
        jPanelBE.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        try {
            txtIDBE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelBE.add(txtIDBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 154, -1));

        btnBuscar.setText("Buscar");
        jPanelBE.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 110, -1));

        btnEliminar.setText("Retirar");
        jPanelBE.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 170, 110, -1));

        jTablaBEHuesped.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTablaBEHuesped);

        jPanelBE.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 570, 120));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Buscar y Retirar Huesped");
        jPanelBE.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLayeredPane1.add(jPanelBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 480));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 570, 480));

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icos/flechaAtras.png"))); // NOI18N
        jMenuBar1.add(btnRetroceder);

        jMenuRegistrar.setText("Registrar");

        jMenuItemNHues.setText("Nuevo Huésped");
        jMenuRegistrar.add(jMenuItemNHues);

        jMenuItemAfiliado.setText("Afiliado");
        jMenuRegistrar.add(jMenuItemAfiliado);

        jMenuBar1.add(jMenuRegistrar);

        jMenuBE.setText("Buscar/Retirar");
        jMenuBar1.add(jMenuBE);

        jMenu1.setText("Cargar/Guardar");

        jMenuItemCargar.setText("Cargar Datos");
        jMenu1.add(jMenuItemCargar);

        jMenuItemGuardar.setText("Guardar Datos");
        jMenu1.add(jMenuItemGuardar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnRegistrar;
    public javax.swing.JButton btnRegistrarAfiliado;
    public javax.swing.JMenu btnRetroceder;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenuBE;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItemAfiliado;
    public javax.swing.JMenuItem jMenuItemCargar;
    public javax.swing.JMenuItem jMenuItemGuardar;
    public javax.swing.JMenuItem jMenuItemNHues;
    private javax.swing.JMenu jMenuRegistrar;
    public javax.swing.JPanel jPanelBE;
    public javax.swing.JPanel jPanelRegistro;
    public javax.swing.JPanel jPanelRegistroAfiliado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTablaBEHuesped;
    public javax.swing.JTable jTablaHuespedes;
    public javax.swing.JRadioButton rBtnNo;
    public javax.swing.JRadioButton rBtnSi;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtBancoEmisor;
    public javax.swing.JTextField txtCelular;
    public javax.swing.JTextField txtCiudadO;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JFormattedTextField txtFechaNacimiento;
    public javax.swing.JFormattedTextField txtFechaTarjeta;
    public javax.swing.JFormattedTextField txtID;
    public javax.swing.JFormattedTextField txtIDBE;
    public javax.swing.JTextField txtIDRAfiliado;
    public javax.swing.JTextField txtNacionalidad;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JFormattedTextField txtNumTarjeta;
    public javax.swing.JTextField txtProfesion;
    public javax.swing.JTextField txtTelefonoF;
    // End of variables declaration//GEN-END:variables
}
