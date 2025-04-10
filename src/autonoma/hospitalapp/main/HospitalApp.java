/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp;
import javax.swing.SwingUtilities;
import autonoma.hospitalapp.views.VentanaPrincipal;

/**
 * Representa la clase Main donde correran las ventanas 
 * de la capa de presentación
 * @author Santiago calderon murillo
 * Versión 1.0 
 * since@ 2025-04-08
 */

public class HospitalApp {

    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
    
}