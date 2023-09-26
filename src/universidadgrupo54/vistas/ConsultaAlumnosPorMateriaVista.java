/*
 */
package universidadgrupo54.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidadgrupo54.accesoDatos.AlumnoData;
import universidadgrupo54.accesoDatos.InscripcionData;
import universidadgrupo54.accesoDatos.MateriaData;
import universidadgrupo54.entidades.AlumnoEntidades;
import universidadgrupo54.entidades.MateriaEntidades;

/**
 *
 * @author Ideapad 5
 */
public class ConsultaAlumnosPorMateriaVista extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private MateriaData ad;
    private InscripcionData inData;
    private MateriaEntidades materiaSeleccionada;
    private DefaultComboBoxModel comboModel = new DefaultComboBoxModel();

    List<MateriaEntidades> materia;

    /**
     * Creates new form Consulta_Alumnos_por_Materia
     */
    public ConsultaAlumnosPorMateriaVista() {
        initComponents();
        modelo = new DefaultTableModel();
        ad = new MateriaData();
        materia = ad.listarMateria();
        inData = new InscripcionData();
        materiaSeleccionada = new MateriaEntidades();
        armarCabecera();
        cargarCombo(materia);
    }

    /**
     *
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
        jBSalida.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enzo Torresi\\Desktop\\Iconos\\sign-emergency-code-sos_14_icon-icons.com_57231.png")); // NOI18N
        jBSalida.setText("Salida");
        jBSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalidaActionPerformed(evt);
            }
        });

        jTListarMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "APELLIDO", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTListarMaterias);
        if (jTListarMaterias.getColumnModel().getColumnCount() > 0) {
            jTListarMaterias.getColumnModel().getColumn(0).setResizable(false);
            jTListarMaterias.getColumnModel().getColumn(1).setResizable(false);
            jTListarMaterias.getColumnModel().getColumn(2).setResizable(false);
            jTListarMaterias.getColumnModel().getColumn(3).setResizable(false);
        }

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
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(jCBSelecMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(jBSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        llenar();
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
        ArrayList<Object> filaC = new ArrayList<>();
        filaC.add("ID");
        filaC.add("DNI");
        filaC.add("Apellido");
        filaC.add("Nombre");
        for (Object o : filaC) {
            modelo.addColumn(o);
        }
        jTListarMaterias.setModel(modelo);

//        modelo.addColumn("ID");
//        modelo.addColumn("DNI");
//        modelo.addColumn("Apellido");
//        modelo.addColumn("Nombre");
//        jTListarMaterias.setModel(modelo);
    }

    private void cargarCombo(List<MateriaEntidades> materia) {
      
        for (MateriaEntidades listarMateria : materia) {
             comboModel.addElement(listarMateria);
         
        }
          jCBSelecMateria.setModel(comboModel);
    }

    public void llenar() {
         if (jTListarMaterias.getRowCount() != 0) {
             for (int i = jTListarMaterias.getRowCount() -1; i >= 0; i--) {
                 modelo.removeRow(i);
             }
        }
   
        MateriaEntidades selec =(MateriaEntidades)jCBSelecMateria.getSelectedItem();
        List<AlumnoEntidades> lista = inData.obtenerAlumnosPorMateria(selec.getIdMateria());
        for (AlumnoEntidades alu: lista) {
            modelo.addRow(new Object[] {alu.getIdAlumno(), alu.getDni(), alu.getApellido(), alu.getNombre()});
        }
       
        }
    }

