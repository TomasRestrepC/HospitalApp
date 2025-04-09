/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase que Representa el Gerente el Hospital
 * @author Santiago Calderon Murillo
 * versión 1.0
 * since 2025-04-07
 */
public class Gerente {

    /**
     * Nombre completo del gerente.
     */
    private String nombre;

    /**
     * Número de documento de identidad del gerente.
     */
    private String documentoIdentidad;

    /**
     * Edad del gerente.
     */
    private int edad;

    /**
     * Carrera profesional del gerente (por ejemplo: Administración, Medicina).
     */
    private String carrera;

    /**
     * Constructor principal que crea un gerente con todos sus datos.
     *
     * @param nombre Nombre completo del gerente.
     * @param documentoIdentidad Documento de identidad del gerente.
     * @param edad Edad del gerente.
     * @param carrera Carrera profesional del gerente.
     */
    public Gerente(String nombre, String documentoIdentidad, int edad, String carrera) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    /**
     * Constructor vacío que crea un gerente sin datos definidos.
     * Se utiliza cuando aún no se tiene información inicial.
     */
    public Gerente() {
        this.nombre = "";
        this.documentoIdentidad = "";
        this.edad = 0;
        this.carrera = "";
    }

    /**
     * Permite actualizar todos los datos del gerente en una sola llamada.
     *
     * @param nombre Nuevo nombre.
     * @param documentoIdentidad Nuevo documento de identidad.
     * @param edad Nueva edad.
     * @param carrera Nueva carrera profesional.
     */
    public void actualizarDatos(String nombre, String documentoIdentidad, int edad, String carrera) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.edad = edad;
        this.carrera = carrera;
    }

    /**
     * Obtiene el nombre del gerente.
     *
     * @return El nombre del gerente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo nombre para el gerente.
     *
     * @param nombre El nuevo nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el documento de identidad del gerente.
     *
     * @return El documento de identidad.
     */
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    /**
     * Establece un nuevo documento de identidad.
     *
     * @param documentoIdentidad El nuevo documento a asignar.
     */
    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    /**
     * Obtiene la edad del gerente.
     *
     * @return La edad actual.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece una nueva edad para el gerente.
     *
     * @param edad La nueva edad.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene la carrera profesional del gerente.
     *
     * @return El nombre de la carrera.
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Establece una nueva carrera profesional.
     *
     * @param carrera La nueva carrera a asignar.
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Devuelve una representación en texto de los datos del gerente.
     *
     * @return Cadena con todos los datos concatenados.
     */
    @Override
    public String toString() {
        return "Gerente: " + nombre + " | Documento: " + documentoIdentidad +
               " | Edad: " + edad + " | Carrera: " + carrera;
    }

    /**
     * Retorna los datos del gerente en una sola línea de texto.
     *
     * @return Información básica del gerente.
     */
    public String obtenerDatos() {
        return "Nombre: " + nombre + " | Documento: " + documentoIdentidad +
               " | Edad: " + edad + " | Carrera: " + carrera;
    }
}