/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalapp.views;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import autonoma.hospitalapp.models.Paciente;
import autonoma.hospitalapp.utils.PacientePersistencia;



/**
 * 
 * @author Santiago calderon murillo
 * Versión 1.0 
 * since@ 2025-04-08
 */

public class ModuloPacientes extends javax.swing.JDialog {
    
    public static List<autonoma.hospitalapp.models.Paciente> listaPacientes = new ArrayList<>();


    
    public ModuloPacientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        try {
    listaPacientes = PacientePersistencia.cargarPacientes("data/pacientes.txt"); // Ajusta la ruta si hace falta
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Error al cargar pacientes: " + e.getMessage());
}

// Mostrar en tabla
javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaPacientes.getModel();
modelo.setRowCount(0); // Limpiar tabla

for (Paciente p : listaPacientes) {
    modelo.addRow(new Object[]{p.getNombre(), p.getEdad(), p.getEstado()});
}

  

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

    
    jTextField2.setText("Edad");
    jTextField2.setForeground(java.awt.Color.GRAY);
    jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (jTextField2.getText().equals("Edad")) {
                jTextField2.setText("");
                jTextField2.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (jTextField2.getText().isEmpty()) {
                jTextField2.setForeground(java.awt.Color.GRAY);
                jTextField2.setText("Edad");
            }
        }
    });

    
    jTextField3.setText("Enfermedad");
    jTextField3.setForeground(java.awt.Color.GRAY);
    jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (jTextField3.getText().equals("Enfermedad")) {
                jTextField3.setText("");
                jTextField3.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (jTextField3.getText().isEmpty()) {
                jTextField3.setForeground(java.awt.Color.GRAY);
                jTextField3.setText("Enfermedad");
            }
        }
    });
}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoEdad = new javax.swing.JLabel();
        campoEnfermedad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        campoEdad.setText("Edad");
        getContentPane().add(campoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 34, -1));

        campoEnfermedad.setText("Enfermedad");
        getContentPane().add(campoEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setText("Gestion de pacientes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 20));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 50, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, -1));

        botonRegistrar.setBackground(new java.awt.Color(0, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        botonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminar.setText("Eliminar seleccionado");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tablaPacientes.setBackground(new java.awt.Color(0, 255, 51));
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Enfermedad"
            }
        ));
        jScrollPane2.setViewportView(tablaPacientes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 330, 300));

        jButton1.setText("->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
    String nombre = jTextField1.getText();
    String edadTexto = jTextField2.getText();
    String enfermedad = jTextField3.getText();

    if (!nombre.isEmpty() && !edadTexto.isEmpty() && !enfermedad.isEmpty()) {
        try {
            int edad = Integer.parseInt(edadTexto);
            if (edad <= 0) {
                JOptionPane.showMessageDialog(this, "La edad debe ser un número positivo.");
                return;
            }

            Paciente nuevoPaciente = new Paciente(
                nombre, "123", edad, "000", "correo@ejemplo.com", enfermedad,
                new ArrayList<>(), new ArrayList<>()
            );
            listaPacientes.add(nuevoPaciente);

            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaPacientes.getModel();
            modelo.addRow(new Object[]{nombre, edad, enfermedad});

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Edad inválida. Usa solo números.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Completa todos los campos.");
    }// TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
     int fila = tablaPacientes.getSelectedRow();
    if (fila != -1) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaPacientes.getModel();
        modelo.removeRow(fila);
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
    }// TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarPacientes();
        this.dispose(); // Cierra esta ventana
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guardarPacientes() {
        try {
            PacientePersistencia.guardarPacientes((ArrayList<Paciente>) listaPacientes, "data/pacientes.txt");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar pacientes: " + e.getMessage());
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel campoEdad;
    private javax.swing.JLabel campoEnfermedad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables
}
