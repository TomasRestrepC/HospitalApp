/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Representa una medicina utilizada en el sistema hospitalario.
 * @author Santiago Calderon Murillo
 * Versión 1.0 
 * since@ 2025-04-07
 */
public class Medicina {
    
   /**
    * Nombre de la medicina
    */
    private String nombre;
    
    /**
     * Descripción de la medicina
     */
    private String descripcion;
    
    /**
     *  Nombre de la enfermedad que esta medicina ayuda a superar
     */
    private String enfermedadSuperada;

    /**
     * Constructor de la clase Medicina.
     * s
     * @param nombre Nombre de la medicina.
     * @param descripcion Descripción de la medicina.
     * @param enfermedadSuperada Enfermedad que esta medicina trata o supera.
     */
    public Medicina(String nombre, String descripcion, String enfermedadSuperada) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfermedadSuperada = enfermedadSuperada;
    }

    /**
     * Obtiene el nombre de la medicina.
     * 
     * @return Nombre actual de la medicina.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para la medicina.
     * 
     * @param nombre Nuevo nombre de la medicina.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la medicina.
     * 
     * @return Descripción actual.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece una nueva descripción para la medicina.
     * 
     * @param descripcion Nueva descripción.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el nombre de la enfermedad que esta medicina ayuda a superar.
     * 
     * @return Nombre de la enfermedad asociada.
     */
    public String getEnfermedadSuperada() {
        return enfermedadSuperada;
    }

    /**
     * Establece una nueva enfermedad que esta medicina puede superar.
     * 
     * @param enfermedadSuperada Nombre de la enfermedad.
     */
    public void setEnfermedadSuperada(String enfermedadSuperada) {
        this.enfermedadSuperada = enfermedadSuperada;
    }

    /**
     * Asocia una enfermedad a esta medicina utilizando una instancia de {@link Enfermedad}.
     * 
     * @param enfermedad Objeto de tipo Enfermedad a asociar.
     */
    public void asociarEnfermedad(Enfermedad enfermedad) {
        this.enfermedadSuperada = enfermedad.getNombre();
    }

}

