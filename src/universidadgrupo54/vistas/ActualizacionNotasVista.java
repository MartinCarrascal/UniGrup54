/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.vistas;


import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo54.accesoDatos.*;
import universidadgrupo54.entidades.*;


/**
 *
 * @author Ideapad 5
 */
public final class ActualizacionNotasVista extends javax.swing.JInternalFrame {
    AlumnoData ad;
    InscripcionData ma;
    MateriaData md;
    public DefaultTableModel modelo = new DefaultTableModel();
   
    public ActualizacionNotasVista() {
        initComponents();    
        
        ad = new AlumnoData ();
        ma = new InscripcionData();  
        llenarCombo();        
        armarCabecera();     
        borraFilasTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcBSelecAlumno = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListarMaterias = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Seleccione Alumno");

        jcBSelecAlumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jcBSelecAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBSelecAlumnoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jListarMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jListarMaterias.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jListarMateriasComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(jListarMaterias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcBSelecAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcBSelecAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //PREPARADO
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    //PREPARADO
    private void jListarMateriasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jListarMateriasComponentAdded
        // TODO add your handling code here:
        jListarMaterias.clearSelection();
        jListarMaterias.setEnabled(true);
        jListarMaterias.transferFocusDownCycle();        
    }//GEN-LAST:event_jListarMateriasComponentAdded
    
    //PREPARADO
    private void jcBSelecAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBSelecAlumnoActionPerformed
        borraFilasTabla();
        llenarTabla();
    }//GEN-LAST:event_jcBSelecAlumnoActionPerformed

    //PREPARADO JTABLE
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada = jListarMaterias.getSelectedRow();
        if(filaSeleccionada != -1){
            AlumnoEntidades a = (AlumnoEntidades)jcBSelecAlumno.getSelectedItem();
            MateriaEntidades m=new MateriaEntidades();
            int idInscripcion=(Integer) modelo.getValueAt(filaSeleccionada, 0);
            m = (MateriaEntidades) modelo.getValueAt(filaSeleccionada, 1);
            double nota = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 2).toString());
            InscripcionEntidades cursada;
            System.out.println(nota);
             System.out.println(m);            
             System.out.println(a);
            cursada = ma.buscarInscripcion(idInscripcion);
            cursada.setNota(nota);
            cursada.setMateria(m);
            cursada.setAlumno(a);

            ma.actualizarNota(cursada.getAlumno().getIdAlumno(),cursada.getMateria().getIdMateria(),cursada.getNota());          
            
            borraFilasTabla();
            JOptionPane.showMessageDialog(null, "Se cambio la nota");
            jListarMaterias.clearSelection ();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable jListarMaterias;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<AlumnoEntidades> jcBSelecAlumno;
    // End of variables declaration//GEN-END:variables

    //PREPARADO
    private void armarCabecera() {
        ArrayList<Object> columnas = new ArrayList <Object>();
        columnas.add("Cursada");
        columnas.add("Materia");
        columnas.add("Nota");
        for (Object it:columnas){
            modelo.addColumn(it);
        }       
        jListarMaterias.setModel(modelo);
    }
    
    public void llenarCombo(){
        List<AlumnoEntidades> listado= ad.listarAlumnos();
        for(AlumnoEntidades alumno: listado){
            jcBSelecAlumno.addItem(alumno);
        }
        
    }
    
    //PREPARADO
    public void borraFilasTabla(){
        int a = modelo.getRowCount()-1;
        
        for(int i=a; i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    //PREPARADO
    public void llenarTabla(){
         AlumnoEntidades elegida=(AlumnoEntidades)jcBSelecAlumno.getSelectedItem();
         //System.out.println(elegida);
         if(elegida!=null){
             for(InscripcionEntidades it:ma.obtenerInscripcionNoRepetida(elegida.getIdAlumno())){
                 modelo.addRow(new Object[]{it.getMateria().getIdMateria(),it.getMateria(),it.getNota()});
             }
         }
     }
    

}
