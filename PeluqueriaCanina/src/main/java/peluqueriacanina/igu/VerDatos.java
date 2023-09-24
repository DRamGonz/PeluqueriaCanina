package peluqueriacanina.igu;

import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import peluqueriacanina.logica.Controladora;
import peluqueriacanina.logica.Mascota;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class VerDatos extends javax.swing.JFrame {

    Controladora control = null;

    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMascota = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 102, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ver Datos Mascotas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(214, 214, 214))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaMascota);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 770, 290));

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
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 120, -1));

        btnEditar.setBackground(new java.awt.Color(0, 153, 51));
        btnEditar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/editar.png"))); // NOI18N
        btnEditar.setToolTipText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 180, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tabla de Datos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        btnExportar.setBackground(new java.awt.Color(0, 153, 51));
        btnExportar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/excel.png"))); // NOI18N
        btnExportar.setToolTipText("Exportar");
        btnExportar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExportar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jPanel1.add(btnExportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 170, 50));

        btnEliminar.setBackground(new java.awt.Color(0, 153, 51));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/eliminar.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 170, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Peluquería Canina - Datos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed

        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

          //Contro que la tabla no este vacía.
        if (TablaMascota.getRowCount() > 0) {
            //contro que tenga seleccionado un registro.
            if (TablaMascota.getSelectedRow() != -1) {
                
                int num_cliente = Integer.parseInt(String.valueOf(TablaMascota.getValueAt(TablaMascota.getSelectedRow(), 0)));
                
                EditarDatos pantallaEditar = new EditarDatos (num_cliente);
                pantallaEditar.setVisible(true);
                pantallaEditar.setLocationRelativeTo(null);
                this.dispose();                
                
                
            }else {
            
                mostrarMensaje("No ha seleccionado ninguna mascota", "Error", "Error al eliminar.");
                
            }

        } else{
        
            mostrarMensaje("No hay nada para eliminar en la tabla.", "Error", "Error al eliminar.");
        }
        

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed

        try {
            // Crear un nuevo libro de Excel
            XSSFWorkbook workbook = new XSSFWorkbook();

            // Crear una hoja en el libro de Excel
            XSSFSheet sheet = workbook.createSheet("DatosMascotas");

            // Obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) TablaMascota.getModel();

            // Obtener el número de filas y columnas en la tabla
            int numRows = model.getRowCount();
            int numCols = model.getColumnCount();

            // Crear una fila para encabezados
            XSSFRow headerRow = sheet.createRow(2);

            // Agregar encabezados a la fila
            for (int col = 0; col < numCols; col++) {
                XSSFCell cell = headerRow.createCell(col);
                cell.setCellValue(model.getColumnName(col));
            }

            // Llenar la hoja de Excel con los datos de la tabla
            for (int row = 0; row < numRows; row++) {
                XSSFRow excelRow = sheet.createRow(row + 3); // +1 para omitir la fila de encabezados

                for (int col = 0; col < numCols; col++) {
                    XSSFCell cell = excelRow.createCell(col);
                    cell.setCellValue(model.getValueAt(row, col).toString());
                }
            }

            // Guardar el libro de Excel en un archivo
            FileOutputStream fileOut = new FileOutputStream("DatosMascotas.xlsx");
            workbook.write(fileOut);
            fileOut.close();

            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Los datos se han exportado a Excel correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error al exportar los datos a Excel.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Abrir el archivo Excel con la aplicación predeterminada
        File file = new File("DatosMascotas.xlsx");
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(VerDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //Contro que la tabla no este vacía.
        if (TablaMascota.getRowCount() > 0) {
            //contro que tenga seleccionado un registro.
            if (TablaMascota.getSelectedRow() != -1) {
                int num_cliente = Integer.parseInt(String.valueOf(TablaMascota.getValueAt(TablaMascota.getSelectedRow(), 0)));
                
                //Se crea dos una para borrar en la tabla mascota o otra para borrar en la tabla dueño.
                control.borrarMascota(num_cliente);
                control.borrarDuenio(num_cliente);
                
                mostrarMensaje("Mascota eliminada correctamente","Info", "Borrado de mascota");
                
                //Papra que vuelva a cargar la tabla con los datos actualizados. 
                cargarTabla();

            }else {
            
                mostrarMensaje("No ha seleccionado ninguna mascota", "Error", "Error al eliminar.");
                
            }

        } else{
        
            mostrarMensaje("No hay nada para eliminar en la tabla.", "Error", "Error al eliminar.");
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaMascota;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel() {

            //Con esto las final y las columnas no son editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        //Establesemos los nombres de la columnas.
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alérgico", "At. Esp.l", "Dueño", "Teléfono"};
        modeloTabla.setColumnIdentifiers(titulos);

        //carga datos desde la base de datos. Como me va a llegar más de un dato tengo que almacenarlo por lo que creo una List.
        List<Mascota> listaMascotas = control.traerMascotas();

        //recore la lista y muestra los elemento en la tabla
        if (listaMascotas != null) {

            for (Mascota masco : listaMascotas) {

                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(), masco.getRaza(),
                    masco.getAlergico(), masco.getAtencion_especial(), masco.getUnDuenio().getNombre(),
                    masco.getUnDuenio().getTelefono()};
                //el punto y como se pone al final porque estoy creando un array.

                modeloTabla.addRow(objeto);

            }

        }

        TablaMascota.setModel(modeloTabla);

        //Formato de la tabla.
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        TableCellRenderer rightRenderer;

        //si quiero que sean todas iguales
        //TablaMascota.setDefaultRenderer(Object.class, centerRenderer);
        //Si quiero personalizar una a una
        TablaMascota.getColumnModel().getColumn(0).setCellRenderer(centerRenderer); // Columna "Num"
        TablaMascota.getColumnModel().getColumn(4).setCellRenderer(centerRenderer); // Columna "Alérgico"
        TablaMascota.getColumnModel().getColumn(5).setCellRenderer(centerRenderer); // Columna "Atención especial"
        TablaMascota.getColumnModel().getColumn(7).setCellRenderer(centerRenderer); // Columna "Teléfono"

        // Cambiar el tamaño de las columnas (ajusta los anchos según tus necesidades)
        TablaMascota.getColumnModel().getColumn(0).setPreferredWidth(9); // Columna "Num"
        TablaMascota.getColumnModel().getColumn(1).setPreferredWidth(100); // Columna "Nombre"
        TablaMascota.getColumnModel().getColumn(2).setPreferredWidth(100); // Columna "Color"
        TablaMascota.getColumnModel().getColumn(4).setPreferredWidth(20); // Columna "Alérgico"
        TablaMascota.getColumnModel().getColumn(5).setPreferredWidth(20); // Columna "At.Especial"

        // Cambiar el color del título
        JTableHeader header = TablaMascota.getTableHeader();
        header.setBackground(Color.red); // Cambia YOUR_COLOR_HERE al color deseado
        header.setForeground(Color.WHITE); // Cambia a un color de texto que contraste con el fondo

    }
}
