/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase que representa un medicamento genérico dentro del sistema hospitalario.
 * @author Tomas
 * Versión 1.0 
 * since@ 2025-04-09

 */
public class MedicamentoGenerico extends Medicamento {

    /**
     * Constructor que inicializa un medicamento genérico con nombre, descripción y costo.
     * 
     * @param nombre Nombre del medicamento.
     * @param descripcion Breve descripción del medicamento.
     * @param costo Costo base de adquisición del medicamento.
     */
    public MedicamentoGenerico(String nombre, String descripcion, double costo) {
        super(nombre, descripcion, costo);
    }

    /**
     * Calcula el precio de venta del medicamento genérico.
     * Este precio se establece como un 10% adicional sobre el costo base.
     */
    @Override
    public void calcularPrecioVenta() {
        super.precioVenta = super.getCosto() * 1.10;
    }
}

