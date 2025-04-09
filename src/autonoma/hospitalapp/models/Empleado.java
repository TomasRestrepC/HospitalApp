package autonoma.hospitalapp.models;

/**
 * Clase abstracta que representa a un empleado genérico en el hospital.
 * Contiene atributos comunes a todos los empleados y un método abstracto para calcular el salario.
 * 
 * @author Santiago Calderon
 * @version 1.0
 * @since 2025-04-07
 */
public abstract class Empleado {

  
    /**
     * Nombre completo del empleado.
     */
    private String nombre;

    /**
     * Edad del empleado.
     */
    private int edad;

    /**
     * Número de documento de identidad del empleado.
     */
    private String numeroDocumento;

    /**
     * Número de teléfono del empleado.
     */
    private String telefono;

    /**
     * Salario base común para todos los empleados.
     */
    private final double salarioBase = 50000;

    /**
     * Salario actual del empleado.
     */
    private double salario;
    
    
    /**
     * Constructor  de la clase Empleado.
     * 
     * @param nombre Nombre completo del empleado
     * @param edad Edad del empleado
     * @param numeroDocumento Número de documento de identidad
     * @param telefono Número de teléfono
     * @param salario Salario actual del empleado
     */
    public Empleado(String nombre, int edad, String numeroDocumento, String telefono, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.salario = salario;
    }

    /**
     * @return Nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Nuevo nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Edad del empleado
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad Nueva edad del empleado
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return Número de documento del empleado
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * @param numeroDocumento Nuevo número de documento del empleado
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    /**
     * @return Número de teléfono del empleado
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono Nuevo número de teléfono del empleado
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return Salario actual del empleado
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario Nuevo salario del empleado
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return Salario base predeterminado para todos los empleados
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    /**
     * Método abstracto que se debe implementar en las subclases para calcular el salario real.
     * 
     * @return Salario calculado del empleado
     */
    public abstract double calcularSalario();
}
