package autonoma.hospitalapp.models;

import java.util.List;

/**
 * Clase que representa un paciente del hospital.
 * Contiene información personal, su estado de salud, y el historial de enfermedades y medicamentos.
 * Permite agregar enfermedades y aplicar medicamentos para curarlas.
 * 
 * @author santiago calderon
 * @version 1.0
 * @since 2025-04-07
 */
public class Paciente {

    private String nombre;
    private String documento;
    private int edad;
    private String telefono;
    private String correo;
    private String estado;
    private List<Enfermedad> enfermedades;
    private List<Medicamento> medicamentos;

    /**
     * Constructor de la clase Paciente.
     * 
     * @param nombre Nombre del paciente.
     * @param documento Documento de identificación.
     * @param edad Edad del paciente.
     * @param telefono Número de teléfono del paciente.
     * @param correo Correo electrónico del paciente.
     * @param estado Estado actual del paciente (saludable, crítico, etc).
     * @param enfermedades Lista de enfermedades que padece el paciente.
     * @param medicamentos Lista de medicamentos que ha recibido el paciente.
     */
    public Paciente(String nombre, String documento, int edad, String telefono, String correo, String estado, List<Enfermedad> enfermedades, List<Medicamento> medicamentos) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.estado = estado;
        this.enfermedades = enfermedades;
        this.medicamentos = medicamentos;
    }

    /**
     * Devuelve el nombre del paciente.
     * @return Nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del paciente.
     * @param nombre Nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el documento del paciente.
     * @return Documento del paciente.
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Establece el documento del paciente.
     * @param documento Documento a asignar.
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Devuelve la edad del paciente.
     * @return Edad del paciente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del paciente.
     * @param edad Edad a asignar.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Devuelve el teléfono del paciente.
     * @return Teléfono del paciente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del paciente.
     * @param telefono Teléfono a asignar.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve el correo del paciente.
     * @return Correo electrónico.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo del paciente.
     * @param correo Correo a asignar.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Devuelve el estado actual del paciente.
     * @return Estado del paciente.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del paciente.
     * @param estado Estado a asignar.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve la lista de enfermedades del paciente.
     * @return Lista de enfermedades.
     */
    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    /**
     * Establece la lista de enfermedades del paciente.
     * @param enfermedades Enfermedades a asignar.
     */
    public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    /**
     * Devuelve la lista de medicamentos recetados al paciente.
     * @return Lista de medicamentos.
     */
    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    /**
     * Establece la lista de medicamentos del paciente.
     * @param medicamentos Medicamentos a asignar.
     */
    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    /**
     * Agrega una enfermedad a la lista del paciente.
     * El estado del paciente se actualiza a "crítico".
     * 
     * @param enfermedad Enfermedad a agregar.
     */
    public void agregarEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
        estado = "critico";
    }

    /**
     * Intenta curar una enfermedad con un medicamento.
     * Si el paciente no tiene la enfermedad, o si ya ha sido tratado con el medicamento, se notifica y no se realiza la curación.
     * Si se cura, se elimina la enfermedad y se registra el medicamento.
     * Si el paciente queda sin enfermedades, su estado se actualiza a "saludable".
     * 
     * @param medicamento Medicamento utilizado para tratar la enfermedad.
     * @param enfermedad Enfermedad que se desea curar.
     */
    public void curarEnfermedad(Medicamento medicamento, Enfermedad enfermedad) {
        boolean tieneEnfermedad = false;
        for (Enfermedad e : enfermedades) {
            if (e.getNombre().equals(enfermedad.getNombre())) {
                tieneEnfermedad = true;
                break;
            }
        }

        if (!tieneEnfermedad) {
            System.out.println(" El paciente no tiene la enfermedad '" + enfermedad.getNombre() + "'.");
            estado = "critico";
            return;
        }

        for (Medicamento m : medicamentos) {
            if (m.getNombre().equals(medicamento.getNombre())) {
                System.out.println("️ El medicamento '" + medicamento.getNombre() + "' ya fue recetado.");
                estado = "critico";
                return;
            }
        }

        enfermedades.removeIf(e -> e.getNombre().equals(enfermedad.getNombre()));
        medicamentos.add(medicamento);
        System.out.println(" Enfermedad '" + enfermedad.getNombre() + "' curada con " + medicamento.getNombre() + ".");

        if (enfermedades.isEmpty()) {
            estado = "saludable";
        }
    }
}

