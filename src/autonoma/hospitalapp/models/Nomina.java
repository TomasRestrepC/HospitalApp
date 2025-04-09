/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import autonoma.hospitalapp.exceptions.DeclararQuiebraException;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase que representa una nómina de empleados en un hospital. 
 * Contiene los datos del grupo de empleados, la fecha de generación y el total de los salarios.
 * Se encarga también de descontar el valor de la nómina del presupuesto del hospital.
 * @author  Santiago Calderon Murillo
 * @version 1.0
 * @since 2025-04-07
 */
public class Nomina {

    private int id;
    private static int contadorId = 1;
    private Date fecha;
    private double totalSalarioNomina;
    private ArrayList<Empleado> empleados;

    /**
     * Constructor de la clase Nomina.
     * Asigna un ID único y calcula el total de los salarios de los empleados.
     * 
     * @param empleados Lista de empleados que forman parte de la nómina.
     */
    public Nomina(ArrayList<Empleado> empleados) {
        this.id = contadorId++;
        this.fecha = new Date();
        this.empleados = empleados;
        this.totalSalarioNomina = calcularTotalSalario();
    }

    /**
     * Devuelve el ID de la nómina.
     * 
     * @return ID de la nómina.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el ID de la nómina.
     * 
     * @param id Nuevo valor para el ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve la fecha de la nómina.
     * 
     * @return Fecha en que fue generada la nómina.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece una nueva fecha para la nómina.
     * 
     * @param fecha Nueva fecha para la nómina.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Devuelve el total de salario de la nómina.
     * 
     * @return Valor total a pagar en la nómina.
     */
    public double getTotalSalarioNomina() {
        return totalSalarioNomina;
    }

    /**
     * Establece un nuevo valor total para la nómina.
     * 
     * @param totalSalarioNomina Nuevo valor total de salarios.
     */
    public void setTotalSalarioNomina(double totalSalarioNomina) {
        this.totalSalarioNomina = totalSalarioNomina;
    }

    /**
     * Devuelve la lista de empleados incluidos en la nómina.
     * 
     * @return Lista de empleados.
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Establece una nueva lista de empleados para la nómina.
     * 
     * @param empleados Lista de empleados a asignar.
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Calcula el total de los salarios de todos los empleados de la nómina.
     * 
     * @return Suma total de los salarios.
     */
    private double calcularTotalSalario() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }
        return total;
    }

    /**
     * Genera nuevamente la nómina, actualizando la fecha y recalculando el total de salarios.
     */
    public void generarNomina() {
        this.totalSalarioNomina = calcularTotalSalario();
        this.fecha = new Date();
    }

    /**
     * Descuenta el valor de la nómina del presupuesto del hospital.
     * Si el presupuesto queda en negativo, lanza una excepción y marca al hospital como en quiebra.
     * 
     * @param hospital Hospital al cual se le descontará el presupuesto.
     * @throws DeclararQuiebraException Excepción lanzada si el presupuesto queda en negativo.
     */
    public void descontarNomina(Hospital hospital) throws DeclararQuiebraException {
        double totalSalarios = 0;
        for (Empleado empleado : empleados) {
            totalSalarios += empleado.calcularSalario();
        }
        hospital.setPresupuesto(hospital.getPresupuesto() - totalSalarios);

        if (hospital.getPresupuesto() < 0) {
            hospital.setEstado(false);
            throw new DeclararQuiebraException();
        }
    }
}

