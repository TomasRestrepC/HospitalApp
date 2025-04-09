/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Clase que tiene la Cita del paciente en el hospital
 * 
 * @author Tomas
 * versión 1.0
 * since@ 2025-04-09
 */

public class Cita {
    /**
     * Objeto Paciente que recibe como parametro un paciente
     */
    private Paciente paciente;
    
    /**
     * Objeto Medico que recibe como parametro con un medico
     */
    private Medico medico;
    
    /**
     * Fecha de la cita
     */
    private String fecha;
    
    /**
     * Valor de la cita
     */
    private double valor;

    /**
     * Constructor de Cita
     * @param paciente
     * @param medico
     * @param fecha
     * @param valor 
     */
    public Cita(Paciente paciente, Medico medico, String fecha, double valor) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
        this.valor = valor;
    }

    /**
     * Obtiene el valor de la cita
     * @return valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Obtiene el Paciente
     * @return paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Obtiene el medico
     * @return medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * Obtiene la fecha de la cita
     * @return 
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * para modificar el valor de la cita
     * @param valor 
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Para modificar al paciente
     * @param paciente 
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
     
    /**
     * Para moficiar al medico
     * @param medico 
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * Para modificar la fecha de la cita
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Método atender cita para dar datos exactos del paciente
     *  y la cita
     */
    public void atenderCita() {
        System.out.println("El médico " + medico.getNombre() +
                           " está atendiendo al paciente " + paciente.getNombre() +
                           " el día " + fecha);
    }

    public static class Medico {
        // nombre del paciente
        private String nombre;

        /**
         * Llamo al paciente con el this
         * @param nombre 
         */
        public Medico(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Obtengo el nombre del Medico
         * @return nombre
         */
        public String getNombre() {
            return nombre;
        }
    }
}

