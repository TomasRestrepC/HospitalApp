/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * La clase tiene datos especificos sobre alguna enfermedad
 * que pueda llegar a tener un paciente
 * 
 * @author Santiago Calderon Murillo
 * @ versión 1.0
 * @since 2025-04-07
 */
public class Enfermedad {

    /**
     * Nombre de la enfermedad (por ejemplo: Gripe, Diabetes, COVID-19).
     */
    private String nombre;

    /**
     * Descripción general de los síntomas o características de la enfermedad.
     */
    private String descripcion;

    /**
     * Crea una nueva instancia de enfermedad con su nombre y descripción.
     * 
     * @param nombre Nombre de la enfermedad
     * @param descripcion Breve explicación o síntomas de la enfermedad
     */
    public Enfermedad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Devuelve el nombre de la enfermedad.
     * 
     * @return Nombre de la enfermedad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la descripción de la enfermedad.
     * 
     * @return Descripción de la enfermedad
     */
    public String getDescripcion() {
        return descripcion;
    }

}