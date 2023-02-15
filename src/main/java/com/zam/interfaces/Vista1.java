/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.zam.interfaces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class Vista1 extends javax.swing.JFrame {

    JFileChooser selector;
    FileOutputStream fos;
    File file;
    File file2;
    PrintWriter pw;
    BufferedReader br;
    FileReader fr;
    String ruta;

    public Vista1() {
        this.file = null;
        this.pw = null;
        this.br = null;
        this.ruta = null;
        this.file2 = null;
        initComponents();
        //Metodo para poder eliminar las pestañas superiores de un JTabbedPane
        jTabbedPane1.setUI(new BasicTabbedPaneUI() {
            @Override
            protected int calculateTabAreaHeight(int tab_placement, int run_count, int max_tab_height) {
                return 0; // Establecer la altura de la pestaña en 0 para ocultarlas
            }
        });
        this.selector = new JFileChooser();
        this.setLocationRelativeTo(null);
        txtTexto1.setEditable(false);
        txtNombre.setEditable(false);
        btnGuardar1.setEnabled(false);
        btnEditarArchivo.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCambiar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCrearArchivo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTexto = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnAbrirSelector = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTexto1 = new javax.swing.JTextArea();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnEditarArchivo = new javax.swing.JButton();
        btnCambiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearArchivo.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\crear_archivo.png")); // NOI18N
        btnCrearArchivo.setText("Crear fichero");
        btnCrearArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrearArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 40));

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\abrir_archivo.png")); // NOI18N
        jButton3.setText("Abrir fichero");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\logo_alesso.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 130));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\alesso.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenido al App archivos ZAM");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 36, -1, -1));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Texto:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 76, -1, -1));

        txtTexto.setColumns(20);
        txtTexto.setRows(5);
        jScrollPane1.setViewportView(txtTexto);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 111, 410, 220));

        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\guardar.png")); // NOI18N
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, 40));

        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\actualizar.png")); // NOI18N
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 80, 40));

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setText("Bienvenido al App archivos ZAM");

        btnAbrirSelector.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\abrir_archivo.png")); // NOI18N
        btnAbrirSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirSelectorActionPerformed(evt);
            }
        });

        txtTexto1.setColumns(20);
        txtTexto1.setRows(5);
        jScrollPane2.setViewportView(txtTexto1);

        jLabel6.setText("Nombre: ");

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\eliminar.png")); // NOI18N
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGuardar1.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\guardar.png")); // NOI18N
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        btnEditarArchivo.setIcon(new javax.swing.ImageIcon("C:\\Zam Projects\\App_Archivos\\src\\main\\java\\com\\zam\\img\\editar_archivo.png")); // NOI18N
        btnEditarArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarArchivoActionPerformed(evt);
            }
        });

        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAbrirSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(btnEditarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAbrirSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnCambiar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("tab2", jPanel4);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 460, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtTexto.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int resultado = selector.showSaveDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {
                ruta = selector.getSelectedFile().toString();
                file = new File(ruta + ".txt");
                if (!file.exists()) {
                    file.createNewFile();
                    pw = new PrintWriter(file);
                    pw.write(txtTexto.getText());
                    pw.close();
                    JOptionPane.showMessageDialog(null, "El archivo se ha creado con exito", "Proceso exitoso!!", 1);
                    txtTexto.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo ya existe", "Atencion!!", 2);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        txtNombre.setText("");
        txtTexto1.setText("");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCrearArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArchivoActionPerformed
        if (txtNombre.isEditable() || txtTexto1.isEditable()) {
            JOptionPane.showMessageDialog(null, "No ha guardado los cambios", "Atencion!!", 2);
        } else {
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnCrearArchivoActionPerformed

    private void btnAbrirSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirSelectorActionPerformed
        this.abrirSelector();
    }//GEN-LAST:event_btnAbrirSelectorActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        if (txtNombre.getText().isBlank() && txtTexto1.getText().isBlank()) {
            this.abrirSelector();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        String nombre = txtNombre.getText();
        String texto = txtTexto1.getText();

        try {
            fos = new FileOutputStream(file);
            fos.write(texto.getBytes());
            fos.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", 2);
            ex.printStackTrace();
        }

        btnGuardar1.setEnabled(false);
        btnEliminar.setEnabled(true);
        btnAbrirSelector.setEnabled(true);
        btnEditarArchivo.setEnabled(true);
        btnCambiar.setEnabled(true);
        txtNombre.setEditable(false);
        txtTexto1.setEditable(false);
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnEditarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarArchivoActionPerformed
        this.txtTexto1.setEditable(true);
        btnAbrirSelector.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar1.setEnabled(true);
        btnEditarArchivo.setEnabled(false);
        btnCambiar.setEnabled(false);
        txtTexto1.requestFocus();
    }//GEN-LAST:event_btnEditarArchivoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int seleccion = JOptionPane.showOptionDialog(
                null, //Componenete
                "Esta seguro que desea eliminar el fichero seleccionado?", //Mensaje
                "Intento de eliminacion", //Titulo
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, //Icono... al poner null el icono sera por defecto
                new Object[]{"Si", "No"},
                "Si");
        if (seleccion == 0) {
            this.file.delete();
            JOptionPane.showMessageDialog(null, "Se ha eliminado el fichero con exito", "Eliminacion exitosa", 1);
            this.txtNombre.setText("");
            this.txtTexto1.setText("");
            btnEditarArchivo.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnCambiar.setEnabled(false);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        if (btnCambiar.getText().equals("Cambiar")) {
            txtNombre.setEditable(true);
            txtNombre.requestFocus();
            btnCambiar.setText("Guardar");

            btnEditarArchivo.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnAbrirSelector.setEnabled(false);
        } else if (btnCambiar.getText().equals("Guardar")) {
            String nombre = txtNombre.getText();
            file2 = new File(ruta + "" + nombre + ".txt");
            file.renameTo(file2);
            file = new File(file2.getAbsolutePath());
            txtNombre.setEditable(false);
            btnCambiar.setText("Cambiar");

            btnEditarArchivo.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnAbrirSelector.setEnabled(true);
        }
    }//GEN-LAST:event_btnCambiarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirSelector;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCrearArchivo;
    private javax.swing.JButton btnEditarArchivo;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtTexto;
    private javax.swing.JTextArea txtTexto1;
    // End of variables declaration//GEN-END:variables

    private void abrirSelector() {
        selector.addChoosableFileFilter(new FileNameExtensionFilter("Archivos de texto", "txt"));
        int resultado = selector.showOpenDialog(null);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            btnEditarArchivo.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnCambiar.setEnabled(true);
            try {
                txtTexto1.setText("");
                ruta = selector.getSelectedFile().toString();
                file = new File(ruta);
                fr = new FileReader(file);
                br = new BufferedReader(fr);

                String texto;
                while ((texto = br.readLine()) != null) {
                    txtTexto1.append(texto + "\n");
                }

                String nombre = file.getName();
                int i = file.getName().lastIndexOf(".");
                nombre = nombre.substring(0, i);
                txtNombre.setText(nombre);

                char letra = nombre.charAt(0);
                int index_caracter = ruta.lastIndexOf(letra);
                ruta = ruta.substring(0, index_caracter);
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
