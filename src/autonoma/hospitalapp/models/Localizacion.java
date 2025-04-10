/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Representa una localización geográfica a través de coordenadas.
 * Contiene los valores de latitud y longitud.
 * 
 * @author Santiago Calderón Murillo
 * Versión 1.0
 * @since 2025-04-07
 */

public class Localizacion {

    /**
     * Coordenada longitudinal del punto geográfico.
     */
    private double longitud;

    /**
     * Coordenada latitudinal del punto geográfico.
     */
    private double latitud;

    /**
     * Constructor que inicializa una localización con latitud y longitud.
     * 
     * @param longitud 
     * @param latitud
     */
    public Localizacion(double longitud, double latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }

    /**
     * Constructor vacío que inicializa latitud y longitud en cero.
     * 
     * Se utiliza principalmente cuando se cargan los datos desde archivos
     * o se crea una instancia por defecto.
     */
    public Localizacion() {
        this.longitud = 0;
        this.latitud = 0;
    }
    
    /**
     * Obtiene el valor de la longitud.
     * 
     * @return longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Asigna un nuevo valor a la longitud.
     * 
     * @param longitud 
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    /**
     * Obtiene el valor de la latitud.
     * 
     * @return Latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Asigna un nuevo valor a la latitud.
     * 
     * @param latitud
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
}
