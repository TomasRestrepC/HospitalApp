package autonoma.hospitalapp.models;

import java.util.ArrayList;

/**
 * La clase Hospital representa una entidad hospitalaria, con información
 * administrativa como nombre, dirección, contacto, presupuesto, empleados,
 * gerente, localización y nómina
 * 
 * @author Santiago Calderón Murillo
 * Versión 1.0
 * since 2025-04-07
 */
public class Hospital {


    /**
     * Nombre del hospital
     */
    private String nombre;

     /**
      * Dirección del hospital
      */
    private String direccion;

     /**
      * Telefono del hospital
      */
    private String telefono;

    /**
     * Presupuesto disponible del hospital
     */
    private double presupuesto;

    /**
     * Meta de ventas anual establecida para el hospital 
     */
    private double metaDeventasAnual;

    /**
     * Fecha en que se fundo el hospital
     */
    private String fechaFundacion;

    /**
     * Estado del hospital (activo o inactivo)
     */
    private boolean estado;

    /**
     * Gerente a cargo del hospital
     */
    private Gerente gerente;

   /**
    * Localización geográfica del hospital
    */
    private Localizacion localizacion;

    /**
     *  Lista de empleados que trabajan en el hospital
     */
    private ArrayList<Empleado> empleados;

   /**
    *  Nómina del hospital, utilizada para pagos y administración de empleados
    */
    private Nomina nomina;


    /**
     * Constructor completo que inicializa el hospital con parámetros clave.
     * 
     * @param metaDeventasAnual Meta anual de ventas.
     * @param estado Estado actual del hospital.
     * @param gerente Gerente a cargo.
     * @param localizacion Ubicación física del hospital.
     */
    public Hospital(double metaDeventasAnual, boolean estado, Gerente gerente, Localizacion localizacion) {
        this.metaDeventasAnual = metaDeventasAnual;
        this.estado = estado;
        this.gerente = gerente;
        this.localizacion = localizacion;
        this.empleados = new ArrayList<>();
        this.nomina = new Nomina(this.empleados);
    }

    /**
     * Constructor vacío que inicializa listas vacías y nómina por defecto.
     */
    public Hospital() {
        this.empleados = new ArrayList<>();
        this.nomina = new Nomina(this.empleados);
    }

       /**
     * Obtiene el nombre del hospital.
     * @return nombre Nombre del hospital.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del hospital.
     * @param nombre Nombre a asignar al hospital.
     * No debe ser null ni estar vacío.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del hospital.
     * @return direccion Dirección del hospital (calle, ciudad, etc). 
     * Puede ser null si no ha sido registrada aún.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del hospital.
     * @param direccion Dirección física del hospital.
     * Puede incluir calle, ciudad y número.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número telefónico del hospital.
     * @return telefono Número de contacto institucional del hospital.
     * Puede ser null si no se ha definido aún.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número telefónico del hospital.
     * @param telefono Número telefónico válido (formato local o internacional).
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la meta de ventas anual del hospital.
     * @return metaDeventasAnual Valor numérico de la meta propuesta para el año.
     */
    public double getMetaDeventasAnual() {
        return metaDeventasAnual;
    }

    /**
     * Establece la meta de ventas anual del hospital.
     * @param metaDeventasAnual Valor positivo como objetivo económico anual.
     */
    public void setMetaDeventasAnual(double metaDeventasAnual) {
        this.metaDeventasAnual = metaDeventasAnual;
    }

    /**
     * Obtiene la fecha de fundación del hospital.
     * @return fechaFundacion Fecha en formato texto (por ejemplo: "01/01/2000").
     * Puede ser null si no se ha registrado.
     */
    public String getFechaFundacion() {
        return fechaFundacion;
    }

    /**
     * Establece la fecha de fundación del hospital.
     * @param fechaFundacion Fecha en formato String (ejemplo: "01/01/2000").
     */
    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    /**
     * Obtiene el estado actual del hospital.
     * @return estado true si está operativo, false si está inactivo.
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado del hospital.
     * @param estado true para activo, false para inactivo.
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el gerente actual del hospital.
     * @return gerente Objeto Gerente asignado al hospital.
     * Puede ser null si no hay gerente asignado.
     */
    public Gerente getGerente() {
        return gerente;
    }

    /**
     * Establece el gerente del hospital.
     * @param gerente Objeto Gerente que administrará el hospital.
     */
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    /**
     * Obtiene el presupuesto del hospital.
     * @return presupuesto Valor numérico del presupuesto actual.
     */
    public double getPresupuesto() {
        return presupuesto;
    }

    /**
     * Establece el presupuesto del hospital.
     * @param presupuesto Valor numérico igual o mayor a cero.
     */
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * Obtiene la localización del hospital.
     * @return localizacion Objeto Localizacion que representa la ubicación geográfica.
     */
    public Localizacion getLocalizacion() {
        return localizacion;
    }

    /**
     * Establece la localización del hospital.
     * @param localizacion Objeto Localizacion con coordenadas o ciudad.
     */
    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * Obtiene la lista de empleados del hospital.
     * @return empleados Lista de objetos Empleado actualmente vinculados.
     * Nunca debe ser null, aunque puede estar vacía.
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Establece la lista de empleados del hospital.
     * @param empleados Lista de objetos Empleado.
     * No debe ser null. Puede estar vacía.
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    /**
     * Obtiene la nómina del hospital.
     * @return nomina Objeto Nomina que gestiona los pagos y empleados.
     */
    public Nomina getNomina() {
        return nomina;
    }

    /**
     * Establece la nómina del hospital.
     * @param nomina Objeto Nomina que administra los pagos.
     */
    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

  
    /**
     * Agrega un nuevo empleado al hospital si no está registrado previamente.
     * 
     * @param nuevoEmpleado Empleado a agregar.
     * @return true si el empleado fue agregado, false si ya existe.
     */
    public boolean agregarEmpleado(Empleado nuevoEmpleado) {
        for (Empleado e : empleados) {
            if (e.getNumeroDocumento().equalsIgnoreCase(nuevoEmpleado.getNumeroDocumento())) {
                return false;
            }
        }
        empleados.add(nuevoEmpleado);
        return true;
    }

    /**
     * Busca un empleado a partir de su número de documento.
     * 
     * @param documento Número de documento del empleado.
     * @return El objeto Empleado si se encuentra, de lo contrario null.
     */
    public Empleado obtenerEmpleadoPorDocumento(String documento) {
        return empleados.stream()
                .filter(e -> e.getNumeroDocumento().equalsIgnoreCase(documento))
                .findFirst()
                .orElse(null);
    }

    /**
     * Actualiza los datos básicos de un empleado.
     * 
     * @param documento Documento del empleado a modificar.
     * @param nuevoNombre Nuevo nombre a asignar.
     * @param nuevoTelefono Nuevo número de teléfono.
     * @return true si se actualizó correctamente, false si no se encontró.
     */
    public boolean actualizarEmpleado(String documento, String nuevoNombre, String nuevoTelefono) {
        Empleado empleadoEncontrado = obtenerEmpleadoPorDocumento(documento);
        if (empleadoEncontrado != null) {
            empleadoEncontrado.setNombre(nuevoNombre);
            empleadoEncontrado.setTelefono(nuevoTelefono);
            return true;
        }
        return false;
    }

    /**
     * Elimina un empleado utilizando su número de documento.
     * 
     * @param numeroDocumento Número de documento del empleado a eliminar.
     * @return true si fue eliminado correctamente, false si no se encontró.
     */
    public boolean eliminarEmpleado(String numeroDocumento) {
        return empleados.removeIf(e -> e.getNumeroDocumento().equalsIgnoreCase(numeroDocumento));
    }

    /**
     * Retorna una cadena con la lista de todos los empleados.
     * 
     * @return Cadena con información de empleados.
     */
    public String listarEmpleados() {
        StringBuilder sb = new StringBuilder();
        for (Empleado e : empleados) {
            sb.append(e).append("\n");
        }
        return sb.toString();
    }

    /**
     * Aumenta el presupuesto del hospital en una cantidad específica.
     * 
     * @param precioVenta Monto a sumar al presupuesto.
     */
    public void aumentarPresupuesto(double precioVenta) {
        this.presupuesto += precioVenta;
    }

    /**
     * Reduce el presupuesto del hospital en una cantidad específica.
     * 
     * @param costo Monto a descontar del presupuesto.
     */
    public void descontarPresupuesto(double costo) {
        this.presupuesto -= costo;
    }

    /**
     * Obtiene el valor del presupuesto redondeado a número entero.
     * 
     * @return Presupuesto en formato entero.
     */
    public int getPresupuestoInt() {
        return (int) presupuesto;
    }

    /**
     * Permite establecer manualmente el estado del hospital.
     * 
     * @param b Valor booleano que indica el nuevo estado (true = activo).
     */
    public void setEstadoManual(boolean b) {
        this.estado = b;
    }

    /**
     * Permite modificar manualmente el valor del presupuesto.
     * 
     * @param d Nuevo valor de presupuesto.
     */
    public void setPresupuestoManual(double d) {
        this.presupuesto = d;
    }
}
