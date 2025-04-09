/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.exceptions;

/**
 * Clase que tiene la Cita del paciente en el hospital
 * @author Tomas
 * versión 1.0
 * since@ 2025-04-07
 */

public class MalaFormulacionException extends Exception {
    /**
     * excepcion de MalaFormulación Excepción para
     * cuando no se da de forma correcta la formulacíon medica
     * @param mensaje 
     */
    public MalaFormulacionException(String mensaje) {
        super("Error en la formulación médica:");
    }
}
