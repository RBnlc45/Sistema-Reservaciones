
package Vista;


public class vistaAreas extends javax.swing.JFrame {

    public vistaAreas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelEliminarArea = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreBusqueda = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBusqueda = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxBusqueda = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxTipoB = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPanelIngresoArea = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreR = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboTipoArea = new javax.swing.JComboBox<>();
        jLayeredOpcionesTipoArea = new javax.swing.JLayeredPane();
        jPanelPropiedadesCabania = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jComboTipoCabania = new javax.swing.JComboBox<>();
        jPanelPropiedadesPiscina = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jComboTipoPiscina = new javax.swing.JComboBox<>();
        jPanelPropiedadesRestaurante = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIDMesa = new javax.swing.JTextField();
        ComboCapacidad = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMesas = new javax.swing.JTable();
        btnAgregarMesa = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAreas = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnRetroceder = new javax.swing.JMenu();
        btnMIngresar = new javax.swing.JMenu();
        btnMenuBE = new javax.swing.JMenu();
        jMenuACargar = new javax.swing.JMenu();
        btnCargar = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Áreas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 230, -1));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelEliminarArea.setForeground(new java.awt.Color(255, 255, 255));
        jPanelEliminarArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Nombre:");
        jPanelEliminarArea.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 60, 20));
        jPanelEliminarArea.add(txtNombreBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 120, 20));

        tablaBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Tipo Área", "Capacidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaBusqueda.setEnabled(false);
        tablaBusqueda.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tablaBusqueda);

        jPanelEliminarArea.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 450, 100));

        btnBuscar.setText("Buscar");
        jPanelEliminarArea.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, 20));

        btnEliminar.setText("Eliminar");
        jPanelEliminarArea.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 80, 20));

        jLabel10.setText("Tipo de Área:");
        jPanelEliminarArea.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 90, 30));

        jComboBoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cabaña", "Restaurante", "Piscina" }));
        jPanelEliminarArea.add(jComboBoxBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 100, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Tipo:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));

        jComboBoxTipoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));
        jPanel1.add(jComboBoxTipoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jPanelEliminarArea.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 200, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Buscar y Eliminar Área");
        jPanelEliminarArea.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 10, 500, -1));

        jLayeredPane1.add(jPanelEliminarArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -2, 520, 420));

        jPanelIngresoArea.setForeground(new java.awt.Color(255, 255, 255));
        jPanelIngresoArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre:");
        jPanelIngresoArea.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 57, -1, -1));

        jLabel3.setText("Capacidad:");
        jPanelIngresoArea.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 97, -1, -1));
        jPanelIngresoArea.add(txtNombreR, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 54, 149, -1));
        jPanelIngresoArea.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 94, 149, -1));

        btnIngresar.setText("Ingresar");
        jPanelIngresoArea.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 396, -1, -1));

        jLabel7.setText("Tipo:");
        jPanelIngresoArea.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 144, -1, -1));

        jComboTipoArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cabaña", "Piscina", "Restaurante" }));
        jPanelIngresoArea.add(jComboTipoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 141, -1, -1));

        jLabel9.setText("Categoria:");

        jComboTipoCabania.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));

        javax.swing.GroupLayout jPanelPropiedadesCabaniaLayout = new javax.swing.GroupLayout(jPanelPropiedadesCabania);
        jPanelPropiedadesCabania.setLayout(jPanelPropiedadesCabaniaLayout);
        jPanelPropiedadesCabaniaLayout.setHorizontalGroup(
            jPanelPropiedadesCabaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPropiedadesCabaniaLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(51, 51, 51)
                .addComponent(jComboTipoCabania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanelPropiedadesCabaniaLayout.setVerticalGroup(
            jPanelPropiedadesCabaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropiedadesCabaniaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelPropiedadesCabaniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboTipoCabania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel8.setText("Tipo de Piscina:");

        jComboTipoPiscina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B" }));

        javax.swing.GroupLayout jPanelPropiedadesPiscinaLayout = new javax.swing.GroupLayout(jPanelPropiedadesPiscina);
        jPanelPropiedadesPiscina.setLayout(jPanelPropiedadesPiscinaLayout);
        jPanelPropiedadesPiscinaLayout.setHorizontalGroup(
            jPanelPropiedadesPiscinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropiedadesPiscinaLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel8)
                .addGap(75, 75, 75)
                .addComponent(jComboTipoPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanelPropiedadesPiscinaLayout.setVerticalGroup(
            jPanelPropiedadesPiscinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropiedadesPiscinaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelPropiedadesPiscinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboTipoPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel4.setText("ID:");

        jLabel5.setText("Añadir mesas");

        jLabel12.setText("Capacidad:");

        ComboCapacidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        tablaMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Capacidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablaMesas.setEnabled(false);
        tablaMesas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaMesas);

        btnAgregarMesa.setText("Agregar");

        javax.swing.GroupLayout jPanelPropiedadesRestauranteLayout = new javax.swing.GroupLayout(jPanelPropiedadesRestaurante);
        jPanelPropiedadesRestaurante.setLayout(jPanelPropiedadesRestauranteLayout);
        jPanelPropiedadesRestauranteLayout.setHorizontalGroup(
            jPanelPropiedadesRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPropiedadesRestauranteLayout.createSequentialGroup()
                .addGroup(jPanelPropiedadesRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPropiedadesRestauranteLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanelPropiedadesRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12))
                        .addGroup(jPanelPropiedadesRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPropiedadesRestauranteLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(ComboCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPropiedadesRestauranteLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtIDMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelPropiedadesRestauranteLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5))
                    .addGroup(jPanelPropiedadesRestauranteLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnAgregarMesa)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanelPropiedadesRestauranteLayout.setVerticalGroup(
            jPanelPropiedadesRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPropiedadesRestauranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPropiedadesRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPropiedadesRestauranteLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPropiedadesRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtIDMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPropiedadesRestauranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ComboCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnAgregarMesa)))
                .addGap(38, 38, 38))
        );

        jLayeredOpcionesTipoArea.setLayer(jPanelPropiedadesCabania, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredOpcionesTipoArea.setLayer(jPanelPropiedadesPiscina, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredOpcionesTipoArea.setLayer(jPanelPropiedadesRestaurante, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredOpcionesTipoAreaLayout = new javax.swing.GroupLayout(jLayeredOpcionesTipoArea);
        jLayeredOpcionesTipoArea.setLayout(jLayeredOpcionesTipoAreaLayout);
        jLayeredOpcionesTipoAreaLayout.setHorizontalGroup(
            jLayeredOpcionesTipoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(jLayeredOpcionesTipoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelPropiedadesPiscina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredOpcionesTipoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelPropiedadesCabania, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredOpcionesTipoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelPropiedadesRestaurante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredOpcionesTipoAreaLayout.setVerticalGroup(
            jLayeredOpcionesTipoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
            .addGroup(jLayeredOpcionesTipoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredOpcionesTipoAreaLayout.createSequentialGroup()
                    .addComponent(jPanelPropiedadesPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 135, Short.MAX_VALUE)))
            .addGroup(jLayeredOpcionesTipoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredOpcionesTipoAreaLayout.createSequentialGroup()
                    .addComponent(jPanelPropiedadesCabania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 133, Short.MAX_VALUE)))
            .addGroup(jLayeredOpcionesTipoAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelPropiedadesRestaurante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelIngresoArea.add(jLayeredOpcionesTipoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 179, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Registrar Área");
        jPanelIngresoArea.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 520, -1));

        jLayeredPane1.add(jPanelIngresoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 516, -1));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        tablaAreas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAreas.setRowSelectionAllowed(false);
        tablaAreas.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaAreas);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 27, 230, 410));

        btnRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icos/flechaAtras.png"))); // NOI18N
        jMenuBar1.add(btnRetroceder);

        btnMIngresar.setText("Ingresar");
        jMenuBar1.add(btnMIngresar);

        btnMenuBE.setText("Buscar/Eliminar");
        jMenuBar1.add(btnMenuBE);

        jMenuACargar.setText("Cargar/Guardar");

        btnCargar.setText("Cargar Datos");
        jMenuACargar.add(btnCargar);

        btnGuardar.setText("Guardar Datos");
        jMenuACargar.add(btnGuardar);

        jMenuBar1.add(jMenuACargar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ComboCapacidad;
    public javax.swing.JButton btnAgregarMesa;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JMenuItem btnCargar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JMenuItem btnGuardar;
    public javax.swing.JButton btnIngresar;
    public javax.swing.JMenu btnMIngresar;
    public javax.swing.JMenu btnMenuBE;
    public javax.swing.JMenu btnRetroceder;
    public javax.swing.JComboBox<String> jComboBoxBusqueda;
    public javax.swing.JComboBox<String> jComboBoxTipoB;
    public javax.swing.JComboBox<String> jComboTipoArea;
    public javax.swing.JComboBox<String> jComboTipoCabania;
    public javax.swing.JComboBox<String> jComboTipoPiscina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredOpcionesTipoArea;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenuACargar;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanelEliminarArea;
    public javax.swing.JPanel jPanelIngresoArea;
    public javax.swing.JPanel jPanelPropiedadesCabania;
    public javax.swing.JPanel jPanelPropiedadesPiscina;
    public javax.swing.JPanel jPanelPropiedadesRestaurante;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTable tablaAreas;
    public javax.swing.JTable tablaBusqueda;
    public javax.swing.JTable tablaMesas;
    public javax.swing.JTextField txtCapacidad;
    public javax.swing.JTextField txtIDMesa;
    public javax.swing.JTextField txtNombreBusqueda;
    public javax.swing.JTextField txtNombreR;
    // End of variables declaration//GEN-END:variables
}
