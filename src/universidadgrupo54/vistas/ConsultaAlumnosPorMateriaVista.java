/*
 */
package universidadgrupo54.vistas;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo54.accesoDatos.AlumnoData;
import universidadgrupo54.accesoDatos.MateriaData;
import universidadgrupo54.entidades.AlumnoEntidades;
import universidadgrupo54.entidades.MateriaEntidades;

/**
 *
 * @author Ideapad 5
 */
public class ConsultaAlumnosPorMateriaVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    MateriaData ad = new MateriaData();
    List<MateriaEntidades> materia = ad.listarMateria();

    /**
     * Creates new form Consulta_Alumnos_por_Materia
     */
    public ConsultaAlumnosPorMateriaVista() {
        initComponents();
        armarCabecera();
        cargarCombo(materia);
    }

    /**
   
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBSelecMateria = new javax.swing.JComboBox<>();
        jBSalida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTListarMaterias = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Listado de Alumnos por Materia");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione una Materia");

        jCBSelecMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCBSelecMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBSelecMateriaActionPerformed(evt);
            }
        });

        jBSalida.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBSalida.setText("Salida");
        jBSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalidaActionPerformed(evt);
            }
        });

        jTListarMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DNI", "APELLIDO", "NOMBRE"
            }
        ));
        jScrollPane2.setViewportView(jTListarMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(552, 552, 552)
                                .addComponent(jBSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(jCBSelecMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBSelecMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jBSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalidaActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalidaActionPerformed

    private void jCBSelecMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBSelecMateriaActionPerformed
        // Eliminar este método
    }//GEN-LAST:event_jCBSelecMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalida;
    private javax.swing.JComboBox<String> jCBSelecMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTListarMaterias;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jTListarMaterias.setModel(modelo);
    }

    private void cargarCombo(List<MateriaEntidades> materia) {
        System.out.println(materia);
        for (MateriaEntidades listarMateria : materia) {
            String nombres = listarMateria.getNombre();
            jCBSelecMateria.addItem(nombres);
        }

    }

}
