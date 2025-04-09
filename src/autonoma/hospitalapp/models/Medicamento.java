/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase abstracta que representa un medicamento dentro del sistema hospitalario.
 * Define atributos básicos comunes para cualquier tipo de medicamento como nombre, 
 * descripción, costo y precio de venta. Delega la lógica de cálculo del precio de 
 * venta a sus clases hijas.
 * 
 * @author Tomas
 * Versión 1.0 
 * since@ 2025-04-09
 */
public abstract class Medicamento {
    
    /**
     * Nombre del medicamento.
     */
    private String nombre;

    /**
     * Descripción general del medicamento, incluyendo usos o componentes.
     */
    private String descripcion;

    /**
     * Costo de adquisición del medicamento.
     */
    private double costo;

    /**
     * Precio al que se venderá el medicamento. Este valor se debe calcular
     * en las clases hijas mediante el método {@code calcularPrecioVenta()}.
     */
    protected double precioVenta;

    /**
     * Constructor que inicializa un medicamento con nombre, descripción y costo.
     * El precio de venta no se define en este constructor y debe calcularse aparte.
     * 
     * @param nombre Nombre del medicamento.
     * @param descripcion Descripción del medicamento.
     * @param costo Costo de adquisición del medicamento.
     */
    public Medicamento(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    /**
     * Obtiene el nombre del medicamento.
     * 
     * @return Nombre del medicamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna un nuevo nombre al medicamento.
     * 
     * @param nombre Nuevo nombre del medicamento.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del medicamento.
     * 
     * @return Descripción del medicamento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Asigna una nueva descripción al medicamento.
     * 
     * @param descripcion Nueva descripción del medicamento.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el precio de venta del medicamento.
     * 
     * @return Precio de venta.
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Establece el precio de venta del medicamento.
     * 
     * @param precioVenta Nuevo precio de venta.
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * Devuelve el costo del medicamento.
     * 
     * @return Costo de adquisición.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Establece el costo del medicamento.
     * 
     * @param costo Nuevo costo del medicamento.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Método abstracto que obliga a las subclases a implementar 
     * la lógica para calcular el precio de venta del medicamento.
     */
    protected abstract void calcularPrecioVenta();
}
