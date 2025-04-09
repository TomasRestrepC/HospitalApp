/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Representa a un empleado que trabaja en el área de la salud dentro del hospital.
 * 
 * @author Tomas
 * @version 1.0
 * @since 2025-04-09.
 */
public class EmpleadoSalud extends Empleado {

    /**
     * Especialidad médica del empleado, como pediatría, cardiología, etc.
     */
    private String especialidad;

    /**
     * Número de horas trabajadas por el empleado.
     */
    private int horasTrabajadas;

    /**
     * Constructor para crear un empleado del área de salud.
     * 
     * @param especialidad Especialidad médica del empleado
     * @param horasTrabajadas Cantidad de horas trabajadas
     * @param nombre Nombre del empleado
     * @param edad Edad del empleado
     * @param numeroDocumento Documento de identidad
     * @param telefono Teléfono del empleado
     * @param salario Salario base (aunque es recalculado)
     */
    public EmpleadoSalud(String especialidad, int horasTrabajadas, String nombre, int edad, String numeroDocumento, String telefono, double salario) {
        super(nombre, edad, numeroDocumento, telefono, salario);
        this.especialidad = especialidad;
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Obtiene la especialidad médica del empleado.
     * 
     * @return Nombre de la especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad médica del empleado.
     * 
     * @param especialidad Nueva especialidad médica
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Obtiene el número de horas trabajadas.
     * 
     * @return Cantidad de horas trabajadas
     */
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    /**
     * Establece el número de horas trabajadas.
     * 
     * @param horasTrabajadas Nueva cantidad de horas trabajadas
     */
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    /**
     * Calcula el salario del empleado de salud.
     *
     * 
     * @return Salario calculado según las horas trabajadas
     */
    @Override
    public double calcularSalario() {
        return this.horasTrabajadas * 0.012;
    }
}

