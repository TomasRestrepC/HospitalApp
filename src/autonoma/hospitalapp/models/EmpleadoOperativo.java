/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

/**
 * Representa a un empleado que trabaja en el área operativa del hospital.
 * @author Tomas
 * @version 1.0
 * @since 2025-04-09
 *  
 */
public class EmpleadoOperativo extends Empleado {

    /**
     * Área del hospital donde trabaja el empleado operativo.
     * Ejemplos: limpieza, seguridad, mantenimiento.
     */
    private String area;

    /**
     * Constructor de EmpleadoOperativo con todos los datos necesarios.
     * 
     * @param area Área de trabajo del empleado
     * @param nombre Nombre del empleado
     * @param edad Edad del empleado
     * @param numeroDocumento Número de documento de identidad
     * @param telefono Número de teléfono del empleado
     * @param salario Salario base del empleado
     */
    public EmpleadoOperativo(String area, String nombre, int edad, String numeroDocumento, String telefono, double salario) {
        super(nombre, edad, numeroDocumento, telefono, salario);
        this.area = area;
    }

    /**
     * Obtiene el área en la que trabaja el empleado operativo.
     * 
     * @return Nombre del área de trabajo
     */
    public String getArea() {
        return area;
    }

    /**
     * Establece el área de trabajo del empleado operativo.
     * 
     * @param area Nueva área de trabajo
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Calcula el salario del empleado operativo.
     * 
     * Como los empleados operativos no tienen especialidades ni horas variables,
     * este método simplemente retorna el salario actual asignado.
     * 
     * @return Salario del empleado operativo
     */
    @Override
    public double calcularSalario() {
        return getSalario();
    }
}

