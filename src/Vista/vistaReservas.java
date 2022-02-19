
package Vista;

public class vistaReservas extends javax.swing.JFrame {
    public vistaReservas() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredReservas = new javax.swing.JLayeredPane();
        jPanelRegistrarReserva = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnFindHues = new javax.swing.JButton();
        jComboTipoRe = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelCabaniaRestaurante = new javax.swing.JPanel();
        jLabelIndicacionR = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablaDisponibles = new javax.swing.JTable();
        jPanelServicios = new javax.swing.JPanel();
        jLabelDisponibles = new javax.swing.JLabel();
        jLabelDeseados = new javax.swing.JLabel();
        jLabelDisponiblesCantidad = new javax.swing.JLabel();
        txtCantidadDeseada = new javax.swing.JFormattedTextField();
        btnReservar = new javax.swing.JButton();
        txtIDHuesped = new javax.swing.JFormattedTextField();
        btnFindAfi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSetNombre = new javax.swing.JLabel();
        txtSetApellido = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBusRe = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanelParametrosCabania = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFechaReservaFC = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFechaReservaIC = new javax.swing.JFormattedTextField();
        jPanelParametrosRestaurante = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtFechaReservaIR = new javax.swing.JFormattedTextField();
        jComboRestaurantes = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHoraFinalR = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHoraInicioR = new javax.swing.JFormattedTextField();
        jPanelBuscarEliminar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jComboTipoB = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaBuscarE = new javax.swing.JTable();
        txtIDBuscar = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanelReservas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaReservaciones = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuRetroceder = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuRegistrarR = new javax.swing.JMenu();
        jMenuCancelarR = new javax.swing.JMenu();
        jMenuMReservaCabania = new javax.swing.JMenu();
        jMenuReservaCabania = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuMesasRestaurante = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuReservasServicios = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuCargar = new javax.swing.JMenuItem();
        jMenuGrabar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRegistrarReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cédula/Pasaporte:");
        jPanelRegistrarReserva.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 20));

        btnFindHues.setText("Buscar Huesped");
        jPanelRegistrarReserva.add(btnFindHues, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 130, -1));

        jComboTipoRe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cabaña", "Mesa en Restaurante", "Spa", "Parasoles", "Toallas", "Traslado" }));
        jComboTipoRe.setEnabled(false);
        jPanelRegistrarReserva.add(jComboTipoRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, 20));

        jLabel6.setText("Tipo de Reserva");
        jPanelRegistrarReserva.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, 20));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCabaniaRestaurante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelIndicacionR.setText("Escoja una cabaña disponible de la lista");
        jPanelCabaniaRestaurante.add(jLabelIndicacionR, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 11, -1, -1));

        jTablaDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaDisponibles.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTablaDisponibles);

        jPanelCabaniaRestaurante.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 110));

        jLayeredPane1.add(jPanelCabaniaRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelServicios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDisponibles.setText("Plazas Disponibles:");
        jPanelServicios.add(jLabelDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabelDeseados.setText("Plazas a solicitar:");
        jPanelServicios.add(jLabelDeseados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 54, -1, 30));

        jLabelDisponiblesCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelServicios.add(jLabelDisponiblesCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 80, 20));

        try {
            txtCantidadDeseada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCantidadDeseada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelServicios.add(txtCantidadDeseada, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 120, -1));

        jLayeredPane1.add(jPanelServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 140));

        jPanelRegistrarReserva.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 340, -1));

        btnReservar.setText("Reservar");
        btnReservar.setEnabled(false);
        jPanelRegistrarReserva.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        try {
            txtIDHuesped.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelRegistrarReserva.add(txtIDHuesped, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 120, 20));

        btnFindAfi.setText("Buscar Afiliado");
        jPanelRegistrarReserva.add(btnFindAfi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 130, -1));

        jLabel2.setText("Nombre:");
        jPanelRegistrarReserva.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        jLabel8.setText("Apellido:");
        jPanelRegistrarReserva.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, 20));
        jPanelRegistrarReserva.add(txtSetNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 100, 20));
        jPanelRegistrarReserva.add(txtSetApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Asignar Reservación");
        jPanelRegistrarReserva.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, -1));

        btnBusRe.setText("Buscar");
        btnBusRe.setEnabled(false);
        jPanelRegistrarReserva.add(btnBusRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelParametrosCabania.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Fecha Final de Reserva:");
        jPanelParametrosCabania.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txtFechaReservaFC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtFechaReservaFC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelParametrosCabania.add(txtFechaReservaFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 98, -1));

        jLabel10.setText("Fecha Inicio Reserva:");
        jPanelParametrosCabania.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        txtFechaReservaIC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtFechaReservaIC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelParametrosCabania.add(txtFechaReservaIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 98, -1));

        jLayeredPane2.add(jPanelParametrosCabania, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 150));

        jPanelParametrosRestaurante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Fecha Inicio Reserva:");
        jPanelParametrosRestaurante.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 20));

        txtFechaReservaIR.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtFechaReservaIR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanelParametrosRestaurante.add(txtFechaReservaIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 98, 20));

        jPanelParametrosRestaurante.add(jComboRestaurantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 100, -1));

        jLabel4.setText("Restaurantes");
        jPanelParametrosRestaurante.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel5.setText("Hora Final:");
        jPanelParametrosRestaurante.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));
        jPanelParametrosRestaurante.add(txtHoraFinalR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 100, -1));

        jLabel12.setText("Hora Inicio:");
        jPanelParametrosRestaurante.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));
        jPanelParametrosRestaurante.add(txtHoraInicioR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, -1));

        jLayeredPane2.add(jPanelParametrosRestaurante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 150));

        jPanelRegistrarReserva.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 360, 150));

        jPanelBuscarEliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Cédula/Pasaporte:");
        jPanelBuscarEliminar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jComboTipoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cabaña", "Mesa en Restaurante", "Spa", "Parasoles", "Toallas", "Traslado" }));
        jPanelBuscarEliminar.add(jComboTipoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel15.setText("Tipo de Reserva:");
        jPanelBuscarEliminar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        btnEliminar.setText("Cancelar");
        jPanelBuscarEliminar.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        btnBuscar.setText("Buscar");
        jPanelBuscarEliminar.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jTablaBuscarE.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaBuscarE.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTablaBuscarE);

        jPanelBuscarEliminar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 220));

        try {
            txtIDBuscar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanelBuscarEliminar.add(txtIDBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 150, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Búsqueda y Cancelación de Reservación");
        jPanelBuscarEliminar.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanelReservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablaReservaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaReservaciones.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablaReservaciones);

        jPanelReservas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 406));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Reservaciones");
        jPanelReservas.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLayeredReservas.setLayer(jPanelRegistrarReserva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredReservas.setLayer(jPanelBuscarEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredReservas.setLayer(jPanelReservas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredReservasLayout = new javax.swing.GroupLayout(jLayeredReservas);
        jLayeredReservas.setLayout(jLayeredReservasLayout);
        jLayeredReservasLayout.setHorizontalGroup(
            jLayeredReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
            .addGroup(jLayeredReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredReservasLayout.createSequentialGroup()
                    .addComponent(jPanelRegistrarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
            .addGroup(jLayeredReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredReservasLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBuscarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jLayeredReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelReservas, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
        );
        jLayeredReservasLayout.setVerticalGroup(
            jLayeredReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(jLayeredReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelRegistrarReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredReservasLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanelBuscarEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jLayeredReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        MenuRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icos/flechaAtras.png"))); // NOI18N
        MenuRetroceder.add(jSeparator1);

        jMenuBar1.add(MenuRetroceder);

        jMenuRegistrarR.setText("Registrar");
        jMenuBar1.add(jMenuRegistrarR);

        jMenuCancelarR.setText("Buscar/Cancelar");
        jMenuBar1.add(jMenuCancelarR);

        jMenuMReservaCabania.setText("Cabaña");

        jMenuReservaCabania.setText("Mostrar Reservaciones");
        jMenuMReservaCabania.add(jMenuReservaCabania);

        jMenuBar1.add(jMenuMReservaCabania);

        jMenu2.setText("Restaurante");

        jMenuMesasRestaurante.setText("Mostrar Reservaciones");
        jMenu2.add(jMenuMesasRestaurante);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Servicio");

        jMenuReservasServicios.setText("Mostrar Reservaciones");
        jMenu3.add(jMenuReservasServicios);

        jMenuBar1.add(jMenu3);

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
    public javax.swing.JMenu MenuRetroceder;
    public javax.swing.JButton btnBusRe;
    public javax.swing.JButton btnBuscar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnFindAfi;
    public javax.swing.JButton btnFindHues;
    public javax.swing.JButton btnReservar;
    public javax.swing.JComboBox<String> jComboRestaurantes;
    public javax.swing.JComboBox<String> jComboTipoB;
    public javax.swing.JComboBox<String> jComboTipoRe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelDeseados;
    public javax.swing.JLabel jLabelDisponibles;
    public javax.swing.JLabel jLabelDisponiblesCantidad;
    public javax.swing.JLabel jLabelIndicacionR;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredReservas;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenu jMenuCancelarR;
    public javax.swing.JMenuItem jMenuCargar;
    public javax.swing.JMenuItem jMenuGrabar;
    private javax.swing.JMenu jMenuMReservaCabania;
    public javax.swing.JMenuItem jMenuMesasRestaurante;
    public javax.swing.JMenu jMenuRegistrarR;
    public javax.swing.JMenuItem jMenuReservaCabania;
    public javax.swing.JMenuItem jMenuReservasServicios;
    public javax.swing.JPanel jPanelBuscarEliminar;
    public javax.swing.JPanel jPanelCabaniaRestaurante;
    public javax.swing.JPanel jPanelParametrosCabania;
    public javax.swing.JPanel jPanelParametrosRestaurante;
    public javax.swing.JPanel jPanelRegistrarReserva;
    public javax.swing.JPanel jPanelReservas;
    public javax.swing.JPanel jPanelServicios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JTable jTablaBuscarE;
    public javax.swing.JTable jTablaDisponibles;
    public javax.swing.JTable jTablaReservaciones;
    public javax.swing.JFormattedTextField txtCantidadDeseada;
    public javax.swing.JFormattedTextField txtFechaReservaFC;
    public javax.swing.JFormattedTextField txtFechaReservaIC;
    public javax.swing.JFormattedTextField txtFechaReservaIR;
    public javax.swing.JFormattedTextField txtHoraFinalR;
    public javax.swing.JFormattedTextField txtHoraInicioR;
    public javax.swing.JFormattedTextField txtIDBuscar;
    public javax.swing.JFormattedTextField txtIDHuesped;
    public javax.swing.JLabel txtSetApellido;
    public javax.swing.JLabel txtSetNombre;
    // End of variables declaration//GEN-END:variables
}
