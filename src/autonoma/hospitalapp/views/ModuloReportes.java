/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.hospitalapp.views;

/**
 *
 * @author Santiago calderon murillo
 * Versión 1.0 
 * since@ 2025-04-08
 */

public class ModuloReportes extends javax.swing.JFrame {

    public ModuloReportes() {
        initComponents();
        botonActualizarReportesActionPerformed(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoTotalPacientes = new javax.swing.JTextField();
        campoTotalEmpleados = new javax.swing.JTextField();
        campoTotalMedicamentos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResumenGeneral = new javax.swing.JTextArea();
        botonActualizarReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Repotes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 6, -1, -1));

        jLabel2.setText("Pacientes Registrados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 40, -1, -1));

        jLabel3.setText("Empleados Registrados");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel4.setText("Medicamentos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 40, -1, -1));

        campoTotalPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTotalPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(campoTotalPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 62, 120, -1));

        campoTotalEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTotalEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(campoTotalEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 62, 130, -1));

        campoTotalMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTotalMedicamentosActionPerformed(evt);
            }
        });
        getContentPane().add(campoTotalMedicamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 62, 80, -1));

        areaResumenGeneral.setColumns(20);
        areaResumenGeneral.setRows(5);
        jScrollPane1.setViewportView(areaResumenGeneral);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 102, -1, -1));

        botonActualizarReportes.setText("Actualizar");
        botonActualizarReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarReportesActionPerformed(evt);
            }
        });
        getContentPane().add(botonActualizarReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 206, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarReportesActionPerformed
    int totalPacientes = ModuloPacientes.listaPacientes.size();
    int totalEmpleados = ModuloEmpleados.listaEmpleados.size();
    int totalMedicamentos = ModuloFarmacia.listaMedicamentos.size();

    campoTotalPacientes.setText(String.valueOf(totalPacientes));
    campoTotalEmpleados.setText(String.valueOf(totalEmpleados));
    campoTotalMedicamentos.setText(String.valueOf(totalMedicamentos));

    areaResumenGeneral.setText("Resumen actualizado:\n"
        + "Pacientes: " + totalPacientes + "\n"
        + "Empleados: " + totalEmpleados + "\n"
        + "Medicamentos: " + totalMedicamentos);      // TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarReportesActionPerformed

    private void campoTotalPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTotalPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTotalPacientesActionPerformed

    private void campoTotalEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTotalEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTotalEmpleadosActionPerformed

    private void campoTotalMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTotalMedicamentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTotalMedicamentosActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaResumenGeneral;
    private javax.swing.JButton botonActualizarReportes;
    private javax.swing.JTextField campoTotalEmpleados;
    private javax.swing.JTextField campoTotalMedicamentos;
    private javax.swing.JTextField campoTotalPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
