package peluqueriacanina.igu;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import peluqueriacanina.logica.Controladora;

public class CargarDatos extends javax.swing.JFrame {

    Controladora control = new Controladora();

    public CargarDatos() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bntLimpiar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtTelefonoDuenio = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbEspecial = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbAlergia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreDueno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cargar Datos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 102, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cargar Datos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 690, 70));

        bntLimpiar.setBackground(new java.awt.Color(51, 255, 102));
        bntLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bntLimpiar.setForeground(new java.awt.Color(51, 255, 102));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/veterinary.gif"))); // NOI18N
        jLabel2.setText("jLabel2");

        btnLimpiar.setBackground(new java.awt.Color(0, 153, 51));
        btnLimpiar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/limpieza.png"))); // NOI18N
        btnLimpiar.setToolTipText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Guardar1.png"))); // NOI18N
        btnGuardar.setToolTipText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(51, 255, 102));
        btnVolver.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/volver.png"))); // NOI18N
        btnVolver.setToolTipText("Volver");
        btnVolver.setBorder(null);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bntLimpiarLayout = new javax.swing.GroupLayout(bntLimpiar);
        bntLimpiar.setLayout(bntLimpiarLayout);
        bntLimpiarLayout.setHorizontalGroup(
            bntLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(bntLimpiarLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(bntLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bntLimpiarLayout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bntLimpiarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bntLimpiarLayout.setVerticalGroup(
            bntLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bntLimpiarLayout.createSequentialGroup()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(bntLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(bntLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 270, 380));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Atención Especial:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 160, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tlf. dueño:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Raza(*):");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, -1, 20));

        txtColor.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        jPanel1.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 230, -1));

        txtTelefonoDuenio.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtTelefonoDuenio.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefonoDuenio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefonoDuenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoDuenioActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefonoDuenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, -1));

        txtRaza.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));
        txtRaza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaActionPerformed(evt);
            }
        });
        jPanel1.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 230, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Color(*):");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        cmbEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Si", "No" }));
        jPanel1.add(cmbEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nombre del dueño(*):");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 170, -1));

        cmbAlergia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Si", "No" }));
        cmbAlergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlergiaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbAlergia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Alergía(*):");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 230, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Observaciones:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre(*):");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 95, -1, -1));

        txtNombreDueno.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtNombreDueno.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreDueno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDuenoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreDueno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 150, -1));

        txtObservacion.setColumns(20);
        txtObservacion.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtObservacion.setForeground(new java.awt.Color(0, 0, 0));
        txtObservacion.setRows(5);
        jScrollPane1.setViewportView(txtObservacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 290, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void txtTelefonoDuenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoDuenioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoDuenioActionPerformed

    private void txtRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDuenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDuenoActionPerformed

    private void cmbAlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlergiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAlergiaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarDatos();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    //Creo el método limpiar porque lo voy a usar más de una vez. 
    private void limpiarDatos() {

        txtNombre.setText(" ");
        txtRaza.setText(" ");
        txtColor.setText(" ");
        txtNombreDueno.setText(" ");
        txtTelefonoDuenio.setText(" ");
        txtObservacion.setText(" ");
        cmbAlergia.setSelectedIndex(0);
        cmbEspecial.setSelectedIndex(0);

    }

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);

        this.dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombreMaco = txtNombre.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String observacion = txtObservacion.getText();
        String nombredunio = txtNombreDueno.getText();
        String telefono = txtTelefonoDuenio.getText();
        String alergico = (String) cmbAlergia.getSelectedItem();
        String especial = (String) cmbEspecial.getSelectedItem();

        /*Compruebo que los datos más importanes estes rellenos.
        * Se puede hacer de dos manera: (|| o - && y)*/
        //if(nombreMaco.equals("") || raza.equals("") ||  color.equals("") ||nombredunio.equals("") || telefono.equals("") || alergico.equals("--"))
        if (nombreMaco.isEmpty() || raza.isEmpty() || color.isEmpty() || nombredunio.isEmpty() || telefono.isEmpty()
                || alergico.equals("--")) {

            mostrarMensaje("Los datos obligatorios (*) no estan rellenos.", "Error", "Registro no Agregado.");

        } else {

            control.guardar(nombreMaco, raza, color, observacion, nombredunio, telefono, alergico, especial);
            mostrarMensaje("Registro agreagado correctamente.", "Info", "Agragado correctamente.");
            //Limpio el formulario. 
            limpiarDatos();

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    //metodo para enviar mensajes de errores, etc..
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bntLimpiar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAlergia;
    private javax.swing.JComboBox<String> cmbEspecial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreDueno;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefonoDuenio;
    // End of variables declaration//GEN-END:variables
}
