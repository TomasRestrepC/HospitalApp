/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Representa un medicamento de marca dentro del sistema hospitalario 
 * @author Santiago Calderon Murillo
 * Versión 1.0 
 * since@ 2025-04-07

 */
public class MedicamentoMarca extends Medicamento {

   /**
    * Nombre del fabricante del medicamento.
    */
    private String fabricante;

    /**
     * Constructor que inicializa un medicamento de marca con los atributos necesarios.
     * 
     * @param nombre Nombre del medicamento.
     * @param descripcion Descripción detallada del medicamento.
     * @param costo Costo base del medicamento.
     * @param fabricante Nombre del laboratorio o fabricante del medicamento.
     */
    public MedicamentoMarca(String nombre, String descripcion, double costo, String fabricante) {
        super(nombre, descripcion, costo);
        this.fabricante = fabricante;
    }

    /**
     * Obtiene el nombre del fabricante del medicamento.
     * 
     * @return Nombre del fabricante.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Calcula el precio de venta del medicamento de marca.
     * El precio se establece como un 25% adicional al costo base.
     */
    @Override
    public void calcularPrecioVenta() {
        this.precioVenta = super.getCosto() * 1.25;
    }
}

