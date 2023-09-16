/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.vistas;

import javax.swing.JOptionPane;
import universidadgrupo54.accesoDatos.MateriaData;
import universidadgrupo54.entidades.Materia;

/**
 *
 * @author Pablo
 */
public class Materias extends javax.swing.JInternalFrame {

    /**
     * Creates new form Materias
     */
    public Materias() {
        initComponents();
    }

    Materia mat = new Materia();
    MateriaData matD = new MateriaData();
    boolean banderaModificar = false;

    private void mensaje(String mensaje) {
        JOptionPane.showConfirmDialog(null, mensaje);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jTNombreMat = new javax.swing.JTextField();
        jTAnio = new javax.swing.JTextField();
        jREstadoMat = new javax.swing.JRadioButton();
        jBNuevoMat = new javax.swing.JButton();
        jBEliminarMat = new javax.swing.JButton();
        jBGuardarMat = new javax.swing.JButton();
        jBSalirMat = new javax.swing.JButton();
        jBBuscarMat = new javax.swing.JButton();

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Materia");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año");

        jLabel5.setText("Estado");

        jTNombreMat.setEnabled(false);

        jTAnio.setEnabled(false);

        jREstadoMat.setEnabled(false);

        jBNuevoMat.setText("Nuevo");
        jBNuevoMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoMatActionPerformed(evt);
            }
        });

        jBEliminarMat.setText("Eliminar");
        jBEliminarMat.setEnabled(false);
        jBEliminarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarMatActionPerformed(evt);
            }
        });

        jBGuardarMat.setText("Guardar");
        jBGuardarMat.setEnabled(false);
        jBGuardarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarMatActionPerformed(evt);
            }
        });

        jBSalirMat.setText("Salir");
        jBSalirMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirMatActionPerformed(evt);
            }
        });

        jBBuscarMat.setText("Buscar");
        jBBuscarMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarMatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNombreMat, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jREstadoMat)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                                .addComponent(jBBuscarMat))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jBNuevoMat)
                        .addGap(68, 68, 68)
                        .addComponent(jBEliminarMat)
                        .addGap(73, 73, 73)
                        .addComponent(jBGuardarMat)
                        .addGap(76, 76, 76)
                        .addComponent(jBSalirMat)))
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarMat))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTNombreMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jREstadoMat)
                    .addComponent(jLabel5))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevoMat)
                    .addComponent(jBEliminarMat)
                    .addComponent(jBGuardarMat)
                    .addComponent(jBSalirMat))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // ELIMINAR METODO
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jBBuscarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarMatActionPerformed
        int codigo = Integer.parseInt(jTCodigo.getText());
        Materia mat = matD.buscarMateria(codigo);
        jTNombreMat.setEnabled(true);
        jTAnio.setEnabled(true);
        jREstadoMat.setEnabled(true);
        jTNombreMat.setText(mat.getNombre());
        jTAnio.setText(mat.getAnio() + " ");
        boolean banderaModificar = true;
        jREstadoMat.setSelected(true);
        jBGuardarMat.setEnabled(true);
        jBEliminarMat.setEnabled(true);
    }//GEN-LAST:event_jBBuscarMatActionPerformed

    private void jBNuevoMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoMatActionPerformed
        jTCodigo.setEnabled(false);
        jTAnio.setEnabled(true);
        jTNombreMat.setEnabled(true);
        jREstadoMat.setEnabled(true);
        jBGuardarMat.setEnabled(true);
        jTAnio.setText("");
        jTCodigo.setText("");
        jTNombreMat.setText("");
        jREstadoMat.setSelected(true);


    }//GEN-LAST:event_jBNuevoMatActionPerformed

    private void jBGuardarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarMatActionPerformed
        jREstadoMat.setSelected(false);

        if (mat.getNombre() == jTNombreMat.getText()) {
            mensaje("Esa materia ya existe");
        } else if (banderaModificar) {

            String nombre = jTNombreMat.getText();
            int anio = Integer.parseInt(jTAnio.getText());
            Materia mat = new Materia(nombre, anio, true);
            matD.modificarMateria(mat);
        } else {
            String nombre = jTNombreMat.getText();
            int anio = Integer.parseInt(jTAnio.getText());
            Materia mat = new Materia(nombre, anio, true);
            matD.guardarMateria(mat);
        }
    }//GEN-LAST:event_jBGuardarMatActionPerformed

    private void jBEliminarMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarMatActionPerformed
        int idMateria = Integer.parseInt(jTCodigo.getText());
        matD.eliminarMateria(idMateria);
        jTAnio.setText("");
        jTCodigo.setText("");
        jTNombreMat.setText("");
        jREstadoMat.setSelected(false);
    }//GEN-LAST:event_jBEliminarMatActionPerformed

    private void jBSalirMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirMatActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirMatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarMat;
    private javax.swing.JButton jBEliminarMat;
    private javax.swing.JButton jBGuardarMat;
    private javax.swing.JButton jBNuevoMat;
    private javax.swing.JButton jBSalirMat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jREstadoMat;
    private javax.swing.JTextField jTAnio;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombreMat;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
