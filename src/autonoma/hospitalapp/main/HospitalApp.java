/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.main;

import autonoma.hospitalapp.views.VentanaPrincipal;

/**
 * Clase principal que lanza la ventana de la aplicación.
 * @author Santiago Calderón
 * @version 1.0
 * @since 2025-04-08
 */
public class HospitalApp {

    public static void main(String[] args) {
        // Lanza la interfaz gráfica en el hilo de eventos
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }
}

