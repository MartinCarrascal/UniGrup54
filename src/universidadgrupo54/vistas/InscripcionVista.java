/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.vistas;

import universidadgrupo54.accesoDatos.AlumnoData;
import universidadgrupo54.accesoDatos.InscripcionData;
import universidadgrupo54.entidades.AlumnoEntidades;

/**
 *
 * @author Ideapad 5
 */
public class InscripcionVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form Inscripcion
     */
    public InscripcionVista() {
          initComponents();
          buttonGroup3.add(jRInscripSi);
          buttonGroup3.add(jRInscripNo);
    }
    
    AlumnoData aluD = new AlumnoData();
    InscripcionData insD = new InscripcionData();
    AlumnoEntidades alu = new AlumnoEntidades();
    /**
     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRInscripSi = new javax.swing.JRadioButton();
        jRInscripNo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jCBSelecAlumno = new javax.swing.JComboBox<>();
        jBInscripcion = new javax.swing.JButton();
        jBAnuInscripcion = new javax.swing.JButton();
        jBSalirInsc = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione un alumno");

        jRInscripSi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRInscripSi.setText("Materia Inscripta");
        jRInscripSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRInscripSiActionPerformed(evt);
            }
        });

        jRInscripNo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jRInscripNo.setText("Materia No Inscripta");
        jRInscripNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRInscripNoActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Listado de Materia");

        jCBSelecAlumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCBSelecAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSelecAlumnoActionPerformed(evt);
            }
        });

        jBInscripcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBInscripcion.setText("Inscripcion");

        jBAnuInscripcion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBAnuInscripcion.setText("Anular Inscripcion");

        jBSalirInsc.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBSalirInsc.setText("Salir");
        jBSalirInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirInscActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBInscripcion)
                        .addGap(89, 89, 89)
                        .addComponent(jBAnuInscripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalirInsc))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRInscripSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRInscripNo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBSelecAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(286, 286, 286))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRInscripSi)
                    .addComponent(jRInscripNo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalirInsc)
                    .addComponent(jBAnuInscripcion)
                    .addComponent(jBInscripcion))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRInscripSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRInscripSiActionPerformed
        // Traer la lista de alumnos activos
    }//GEN-LAST:event_jRInscripSiActionPerformed

    private void jRInscripNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRInscripNoActionPerformed
        // Traer la lista de alumnos NO activos
    }//GEN-LAST:event_jRInscripNoActionPerformed

    private void jCBSelecAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSelecAlumnoActionPerformed
      
        for (AlumnoEntidades alu : aluD.listarAlumnos()) {
            jCBSelecAlumno.addItem(alu.getNombre());
        }
        
    }//GEN-LAST:event_jCBSelecAlumnoActionPerformed

    private void jBSalirInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirInscActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirInscActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jBAnuInscripcion;
    private javax.swing.JButton jBInscripcion;
    private javax.swing.JButton jBSalirInsc;
    private javax.swing.JComboBox<String> jCBSelecAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRInscripNo;
    private javax.swing.JRadioButton jRInscripSi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
