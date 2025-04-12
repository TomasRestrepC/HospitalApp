/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package autonoma.hospitalapp.views;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Santiago calderon murillo
 * Versión 1.0 
 * since@ 2025-04-08
 */

public class ModuloFarmacia extends javax.swing.JDialog {
public static List<String> listaMedicamentos = new ArrayList<>();


    
    public ModuloFarmacia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);        
        initComponents();
        cargarMedicamentos();
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaFarmacia.getModel();
modelo.setRowCount(0);

for (String medicamento : listaMedicamentos) {
    // Ejemplo: "Ibuprofeno, 50"
    String[] partes = medicamento.split(",");
    if (partes.length >= 2) {
        String nombre = partes[0].trim();
        String cantidad = partes[1].trim();
        modelo.addRow(new Object[]{nombre, cantidad, "-"});
    }
}

        campoNombreMedicamento.setText("Nombre del medicamento");
    campoNombreMedicamento.setForeground(java.awt.Color.GRAY);
    campoNombreMedicamento.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (campoNombreMedicamento.getText().equals("Nombre del medicamento")) {
                campoNombreMedicamento.setText("");
                campoNombreMedicamento.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (campoNombreMedicamento.getText().isEmpty()) {
                campoNombreMedicamento.setForeground(java.awt.Color.GRAY);
                campoNombreMedicamento.setText("Nombre del medicamento");
            }
        }
    });

    
    campoCantidad.setText("Cantidad");
    campoCantidad.setForeground(java.awt.Color.GRAY);
    campoCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (campoCantidad.getText().equals("Cantidad")) {
                campoCantidad.setText("");
                campoCantidad.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (campoCantidad.getText().isEmpty()) {
                campoCantidad.setForeground(java.awt.Color.GRAY);
                campoCantidad.setText("Cantidad");
            }
        }
    });

    
    campoProveedor.setText("Proveedor");
    campoProveedor.setForeground(java.awt.Color.GRAY);
    campoProveedor.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (campoProveedor.getText().equals("Proveedor")) {
                campoProveedor.setText("");
                campoProveedor.setForeground(java.awt.Color.BLACK);
            }
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (campoProveedor.getText().isEmpty()) {
                campoProveedor.setForeground(java.awt.Color.GRAY);
                campoProveedor.setText("Proveedor");
            }
        }
    });
        
        
    }

    ModuloFarmacia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtext1 = new javax.swing.JLabel();
        jText2 = new javax.swing.JLabel();
        jtext3 = new javax.swing.JLabel();
        botonRegistrarMedicamento = new javax.swing.JButton();
        botonEliminarMedicamento = new javax.swing.JButton();
        campoNombreMedicamento = new javax.swing.JTextField();
        campoCantidad = new javax.swing.JTextField();
        campoProveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFarmacia = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtext1.setBackground(new java.awt.Color(0, 204, 255));
        jtext1.setText("Nombre medicamento");
        getContentPane().add(jtext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jText2.setText("Cantidad");
        getContentPane().add(jText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 96, -1, -1));

        jtext3.setText("Provedor");
        getContentPane().add(jtext3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 155, -1, -1));

        botonRegistrarMedicamento.setBackground(new java.awt.Color(0, 255, 255));
        botonRegistrarMedicamento.setText("Registrar");
        botonRegistrarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarMedicamentoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, -1));

        botonEliminarMedicamento.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminarMedicamento.setText("EliminarMedicamento");
        botonEliminarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarMedicamentoActionPerformed(evt);
            }
        });
        getContentPane().add(botonEliminarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        campoNombreMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreMedicamentoActionPerformed(evt);
            }
        });
        getContentPane().add(campoNombreMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 62, 83, -1));

        campoCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(campoCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 121, 80, -1));

        campoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(campoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 177, 83, -1));

        jLabel4.setText("FARMACIA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        tablaFarmacia.setBackground(new java.awt.Color(0, 255, 51));
        tablaFarmacia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicamento", "Cantidad", "provedor"
            }
        ));
        jScrollPane1.setViewportView(tablaFarmacia);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 340, 370));

        jButton1.setText("->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 50, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonEliminarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarMedicamentoActionPerformed
int fila = tablaFarmacia.getSelectedRow();
if (fila != -1) {
    javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaFarmacia.getModel();
    modelo.removeRow(fila);
} else {
    JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar.");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarMedicamentoActionPerformed

    private void botonRegistrarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarMedicamentoActionPerformed
    String nombre = campoNombreMedicamento.getText();
    String cantidadTexto = campoCantidad.getText();
    String proveedor = campoProveedor.getText();

    if (!nombre.isEmpty() && !cantidadTexto.isEmpty() && !proveedor.isEmpty()) {
        try {
            int cantidad = Integer.parseInt(cantidadTexto);
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(this, "La cantidad debe ser un número positivo.");
                return;
            }

            ModuloFarmacia.listaMedicamentos.add(nombre + ", " + cantidad);


            javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tablaFarmacia.getModel();
            modelo.addRow(new Object[]{nombre, cantidad, proveedor});

            campoNombreMedicamento.setText("");
            campoCantidad.setText("");
            campoProveedor.setText("");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Cantidad inválida. Usa solo números.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Completa todos los campos.");
    }// TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarMedicamentoActionPerformed

    private void campoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoProveedorActionPerformed

    private void campoNombreMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreMedicamentoActionPerformed

    private void campoCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        guardarMedicamentos();
        this.dispose(); // Cierra esta ventana
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cargarMedicamentos() {
        listaMedicamentos.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("data/medicamentos.txt"))) {
            String linea;
        while ((linea = br.readLine()) != null) {
            listaMedicamentos.add(linea);
            }
            } catch (IOException e) {
            System.out.println("No se encontró el archivo de medicamentos. Se creará uno nuevo al guardar.");
        }
    }   
    
    private void guardarMedicamentos() {
        try (PrintWriter writer = new PrintWriter("data/medicamentos.txt")) {
            for (String med : listaMedicamentos) {
                writer.println(med);
        }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar medicamentos: " + e.getMessage());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarMedicamento;
    private javax.swing.JButton botonRegistrarMedicamento;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JTextField campoNombreMedicamento;
    private javax.swing.JTextField campoProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jText2;
    private javax.swing.JLabel jtext1;
    private javax.swing.JLabel jtext3;
    private javax.swing.JTable tablaFarmacia;
    // End of variables declaration//GEN-END:variables
}
