/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo54.vistas;

import universidadgrupo54.accesoDatos.AlumnoData;

/**
 *
 * @author Pablo
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {

        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        GestionAlumnos = new javax.swing.JMenu();
        MenuAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jManejoInscripcion = new javax.swing.JMenuItem();
        jActualizacionNotas = new javax.swing.JMenuItem();
        jConsultaAlumMateria = new javax.swing.JMenu();
        jMConsAlumMat = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1045, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
        );

        GestionAlumnos.setText("Alumno");
        GestionAlumnos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        GestionAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionAlumnosActionPerformed(evt);
            }
        });

        MenuAlumno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        MenuAlumno.setText("Formulario de alumno");
        MenuAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlumnoActionPerformed(evt);
            }
        });
        GestionAlumnos.add(MenuAlumno);

        jMenuBar1.add(GestionAlumnos);

        jMenu2.setText("Materia");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jMMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMMateria.setText("Formulario de materia");
        jMMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jMMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jManejoInscripcion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jManejoInscripcion.setText("Manejo de inscripcion");
        jManejoInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManejoInscripcionActionPerformed(evt);
            }
        });
        jMenu3.add(jManejoInscripcion);

        jActualizacionNotas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jActualizacionNotas.setText("Manipulacion de notas");
        jActualizacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizacionNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jActualizacionNotas);

        jMenuBar1.add(jMenu3);

        jConsultaAlumMateria.setText("Consultas");
        jConsultaAlumMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jConsultaAlumMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaAlumMateriaActionPerformed(evt);
            }
        });

        jMConsAlumMat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMConsAlumMat.setText("Alumnos por materia");
        jMConsAlumMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsAlumMatActionPerformed(evt);
            }
        });
        jConsultaAlumMateria.add(jMConsAlumMat);

        jMenuBar1.add(jConsultaAlumMateria);

        jMenu1.setText("Salir");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jCheckBoxMenuItem1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCheckBoxMenuItem1.setText("Salir");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionAlumnosActionPerformed
//        escritorio.removeAll();
//        escritorio.repaint();
//       
//        Alumnos ventana = new Alumnos();
//        ventana.setVisible(true);
//        escritorio.add(ventana);
//        escritorio.moveToFront(ventana);
    }//GEN-LAST:event_GestionAlumnosActionPerformed

    private void MenuAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlumnoActionPerformed

        escritorio.removeAll();
        escritorio.repaint();

        AlumnoVista ventana = new AlumnoVista();
        ventana.setVisible(true);
        escritorio.add(ventana);
        escritorio.moveToFront(ventana);
    }//GEN-LAST:event_MenuAlumnoActionPerformed

    private void jMMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MateriaVista ventanaMat = new MateriaVista();
        ventanaMat.setVisible(true);
        escritorio.add(ventanaMat);
        escritorio.moveToFront(ventanaMat);
    }//GEN-LAST:event_jMMateriaActionPerformed

    private void jManejoInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManejoInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        InscripcionVista ventanaMat = new InscripcionVista();
        ventanaMat.setVisible(true);
        escritorio.add(ventanaMat);
        escritorio.moveToFront(ventanaMat);
    }//GEN-LAST:event_jManejoInscripcionActionPerformed

    private void jActualizacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizacionNotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ActualizacionNotasVista actNot = new ActualizacionNotasVista();
        actNot.setVisible(true);
        escritorio.add(actNot);
        escritorio.moveToFront(actNot);
    }//GEN-LAST:event_jActualizacionNotasActionPerformed

    private void jMConsAlumMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsAlumMatActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaAlumnosPorMateriaVista conAluMat = new ConsultaAlumnosPorMateriaVista();
        conAluMat.setVisible(true);
        escritorio.add(conAluMat);
        escritorio.moveToFront(conAluMat);
    }//GEN-LAST:event_jMConsAlumMatActionPerformed

    private void jConsultaAlumMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaAlumMateriaActionPerformed
     // eliminar este action

    }//GEN-LAST:event_jConsultaAlumMateriaActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
       dispose();
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu GestionAlumnos;
    private javax.swing.JMenuItem MenuAlumno;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jActualizacionNotas;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jConsultaAlumMateria;
    private javax.swing.JMenuItem jMConsAlumMat;
    private javax.swing.JMenuItem jMMateria;
    private javax.swing.JMenuItem jManejoInscripcion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
