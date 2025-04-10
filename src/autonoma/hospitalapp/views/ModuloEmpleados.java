/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.hospitalapp.views;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

/**
 *
* @author Santiago calderon murillo
 * Versión 1.0 
 * since@ 2025-04-08
 */

public class ModuloEmpleados extends javax.swing.JFrame {
public static List<String> listaEmpleados = new ArrayList<>();
   
    public ModuloEmpleados() {
        initComponents();
         
    jTextField1.setText("Nombre");
    jTextField1.setForeground(java.awt.Color.GRAY);
    jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (jTextField1.getText().equals("Nombre")) {
                jTextField1.setText("");
                jTextField1.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (jTextField1.getText().isEmpty()) {
                jTextField1.setForeground(java.awt.Color.GRAY);
                jTextField1.setText("Nombre");
            }
        }
    });

    jTextField2.setText("Cargo");
    jTextField2.setForeground(java.awt.Color.GRAY);
    jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (jTextField2.getText().equals("Cargo")) {
                jTextField2.setText("");
                jTextField2.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (jTextField2.getText().isEmpty()) {
                jTextField2.setForeground(java.awt.Color.GRAY);
                jTextField2.setText("Cargo");
            }
        }
    });

    jTextField3.setText("Área");
    jTextField3.setForeground(java.awt.Color.GRAY);
    jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (jTextField3.getText().equals("Área")) {
                jTextField3.setText("");
                jTextField3.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (jTextField3.getText().isEmpty()) {
                jTextField3.setForeground(java.awt.Color.GRAY);
                jTextField3.setText("Área");
            }
        }
    });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtext1 = new javax.swing.JLabel();
        jtext2 = new javax.swing.JLabel();
        jtext3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        botonRegistrarEmpleado = new javax.swing.JButton();
        botonEliminarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtext1.setText("Nombre Empleado");
        getContentPane().add(jtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 58, -1, -1));

        jtext2.setText("Cargo");
        getContentPane().add(jtext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jtext3.setText("Area");
        getContentPane().add(jtext3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setText("EMPLEADOS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 130, 100, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 180, 100, -1));

        botonRegistrarEmpleado.setBackground(new java.awt.Color(0, 255, 255));
        botonRegistrarEmpleado.setText("Registrar");
        botonRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        botonEliminarEmpleado.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminarEmpleado.setText("eliminar empleado");
        botonEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        tablaEmpleados.setBackground(new java.awt.Color(0, 255, 51));
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cargo", "Area"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 38, 280, 240));

        jButton1.setText("->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEmpleadoActionPerformed
String nombre = jTextField1.getText();
    String cargo = jTextField2.getText();
    String area = jTextField3.getText();

    if (!nombre.isEmpty() && !cargo.isEmpty() && !area.isEmpty()) {
        // Agregar a la lista compartida
        ModuloEmpleados.listaEmpleados.add(nombre);

        // Agregar a la tabla visual
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaEmpleados.getModel();
        modelo.addRow(new Object[]{nombre, cargo, area});

        // Limpiar campos
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos.");
    }    // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarEmpleadoActionPerformed

    private void botonEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEmpleadoActionPerformed
int fila = tablaEmpleados.getSelectedRow();
    if (fila != -1) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaEmpleados.getModel();
        modelo.removeRow(fila);
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarEmpleadoActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose(); // Cierra esta ventana
    new autonoma.hospitalapp.views.VentanaPrincipal().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarEmpleado;
    private javax.swing.JButton botonRegistrarEmpleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel jtext1;
    private javax.swing.JLabel jtext2;
    private javax.swing.JLabel jtext3;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables
}
