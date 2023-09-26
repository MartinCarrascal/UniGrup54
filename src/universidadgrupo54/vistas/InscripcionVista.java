/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.vistas;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import universidadgrupo54.accesoDatos.AlumnoData;
import universidadgrupo54.accesoDatos.InscripcionData;
import universidadgrupo54.accesoDatos.MateriaData;
import universidadgrupo54.entidades.AlumnoEntidades;
import universidadgrupo54.entidades.InscripcionEntidades;
import universidadgrupo54.entidades.MateriaEntidades;

/**
 *
 * @author Pablo
 */
public class InscripcionVista extends javax.swing.JInternalFrame {

   private AlumnoData ad;
   private DefaultTableModel modelo; 
   private AlumnoEntidades alumnoSeleccionado;
   private MateriaData md;
   private MateriaEntidades matSelec;
   private InscripcionData id;
    
    public InscripcionVista() {
        initComponents();
       
        ad = new AlumnoData();
        md = new MateriaData();
        id = new InscripcionData();
        
        cargarCombo();   
        jRInscripSi.setSelected(true);
        //Hago un evento que escuche al seleccinar un item
        jcbSelecAlumno.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                //comparo el estado de cambio es un evento tipo seleccion
                if (ie.getStateChange() == ItemEvent.SELECTED) {
                    jRInscripSi.setSelected(true);
                    alumnoSeleccionado = (AlumnoEntidades) jcbSelecAlumno.getSelectedItem();
                    cargarTabla();
                }
            }
        });
        // Cambia el estado del boton inscripto
          jRInscripNo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                jRInscripSi.setSelected(false);
                cargarTabla();
            }
        });
          //evento cuando selleciono una fila de la tabla
          jTListarMaterias.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                //Filtra un solo evento y sellecina el ultimo, por eso negado
                if (!lse.getValueIsAdjusting()) {
                    matSelec = null;
                    //Si la fila esta vacia el getselecteR me devuelve menos 1
                    int filaSel = jTListarMaterias.getSelectedRow();
                    if (filaSel > -1) {
                        //guardo el objeto de la materia seleccionada de la fila y columna
                        matSelec =(MateriaEntidades) jTListarMaterias.getValueAt(filaSel, 3);
                    }
                }
            }
        });
          // Boton salir
          jBSalir.addActionListener(e -> dispose() );
          
           dibujarTabla();
    }
    
    private void cargarCombo() {
        //Remuevo para limpiar 
        jcbSelecAlumno.removeAllItems();
        //Voy recorriendo la lista de alumnos y cada alumno lo cargo en el combo
        for (AlumnoEntidades  al: ad.listarAlumnos()) {
            jcbSelecAlumno.addItem(al);
        }
        //Pregunto si tiene cargado algun alumno y el primero seleccinado lo guardo en la variable
        if (jcbSelecAlumno.getItemCount()>0) {
            alumnoSeleccionado =(AlumnoEntidades)jcbSelecAlumno.getSelectedItem();
        }
    }
    
    
    private void cargarTabla() {
        
        String where;
        modelo.setRowCount(0);
        //pregunto si el jr esta seleccinado
        if (jRInscripSi.isSelected()) {
            where = "AND m.idMateria IN (SELECT i.idMateria FROM inscripcion i WHERE i.idAlumno = " + alumnoSeleccionado.getIdAlumno()+") ORDER BY m.idMateria";
        }else{
            
            where= "AND m.idMateria NOT IN (SELECT i.idMateria FROM inscripcion i WHERE i.idAlumno = " + alumnoSeleccionado.getIdAlumno()+") ORDER BY m.idMateria";
        }
        for ( MateriaEntidades mat : md.listarMateriaConWhere(where)) {
            //le cargo la lista al modelo
         
            modelo.addRow(new Object[]{mat.getIdMateria(),mat.getNombre(),mat.getAnio(),mat});
        }
        //Pregunto si la cantidad de filas de la tabla es mayor a 0
        if (jTListarMaterias.getRowCount()>0) {
            //selecciono la primera
            jTListarMaterias.setRowSelectionInterval(0,0);
            matSelec =(MateriaEntidades)jTListarMaterias.getValueAt(0, 3);
            if (jRInscripSi.isSelected()) {
                jBAnular.setEnabled(true);
                jBInscribir.setEnabled(false);
            }else {
                jBAnular.setEnabled(false);
                jBInscribir.setEnabled(true);
            }
        }else {
             jBInscribir.setEnabled(false);
             jBAnular.setEnabled(false);
        }
            
        }
    
    
    private void dibujarTabla() {
        //traigo el modelo que cree de la tabla visualmente y se lo paso al modelo casteandolo
        modelo =(DefaultTableModel)jTListarMaterias.getModel();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jcbSelecAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRInscripNo = new javax.swing.JRadioButton();
        jRInscripSi = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListarMaterias = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAnular = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setTitle("Formulario Inscripciones");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Seleccione un alumno");

        jcbSelecAlumno.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jcbSelecAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSelecAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Listado de materias");

        buttonGroup.add(jRInscripNo);
        jRInscripNo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRInscripNo.setText("Materias No inscriptas");

        buttonGroup.add(jRInscripSi);
        jRInscripSi.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRInscripSi.setText("Materias inscriptas");

        jTListarMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Anio", "Materia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListarMaterias);
        if (jTListarMaterias.getColumnModel().getColumnCount() > 0) {
            jTListarMaterias.getColumnModel().getColumn(0).setResizable(false);
            jTListarMaterias.getColumnModel().getColumn(1).setResizable(false);
            jTListarMaterias.getColumnModel().getColumn(2).setResizable(false);
            jTListarMaterias.getColumnModel().getColumn(3).setMinWidth(0);
            jTListarMaterias.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTListarMaterias.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        jBInscribir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBInscribir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pablo\\Desktop\\imagenProyecto\\inscribir2.png")); // NOI18N
        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnular.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBAnular.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pablo\\Desktop\\imagenProyecto\\noInscribir.png")); // NOI18N
        jBAnular.setText("Anular");
        jBAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pablo\\Desktop\\imagenProyecto\\sign-emergency-code-sos_14_icon-icons.com_57231.png")); // NOI18N
        jBSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRInscripSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRInscripNo)
                        .addGap(144, 144, 144))))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jBInscribir)
                .addGap(116, 116, 116)
                .addComponent(jBAnular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jcbSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRInscripNo)
                    .addComponent(jRInscripSi))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAnular)
                    .addComponent(jBSalir))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSelecAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSelecAlumnoActionPerformed
//        Borrar metodo
    }//GEN-LAST:event_jcbSelecAlumnoActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
      int fila = jTListarMaterias.getSelectedRow();
        if (fila >= 0) {
          //  System.out.println(matSelec);
             id.guardarInscripcion(new InscripcionEntidades(alumnoSeleccionado, matSelec, 0));
             //remuevo la fila seleccinada para actualizar la tabla ni inscriba dos veces 
             modelo.removeRow(fila);
        }
       
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularActionPerformed
        int fila = jTListarMaterias.getSelectedRow() ;
        if (fila >= 0) {
            System.out.println(matSelec);
             id.borrarInscripcionMateriaAlumno(alumnoSeleccionado.getIdAlumno(), matSelec.getIdMateria());
             modelo.removeRow(fila);
        }
    }//GEN-LAST:event_jBAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jBAnular;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRInscripNo;
    private javax.swing.JRadioButton jRInscripSi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListarMaterias;
    private javax.swing.JComboBox<AlumnoEntidades> jcbSelecAlumno;
    // End of variables declaration//GEN-END:variables
}
