/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa el inventario de medicamentos disponible en la farmacia de un hospital.
 * Permite agregar medicamentos y simular su venta, manteniendo registro del año de actualización.
 * 
 * author Tomas
 * Versión 1.0
 * @since 2025-04-09
 */
public class InventarioFarmacia {

    private List<Medicamento> listaMedicamentos;
    private int añoUltimaActualizacion;

    /**
     * Constructor que inicializa el inventario vacío con el año actual por defecto.
     */
    public InventarioFarmacia() {
        this.listaMedicamentos = new ArrayList<>();
        this.añoUltimaActualizacion = 2025;
    }

    /**
     * Agrega un medicamento al inventario si hay suficiente presupuesto en el hospital.
     *
     * @param medicamento Objeto Medicamento que se desea agregar.
     * @param hospital Hospital al que pertenece el inventario.
     * @return true si el medicamento fue agregado correctamente, false en caso contrario.
     */
    public boolean agregarMedicamento(Medicamento medicamento, Hospital hospital) {
        if (medicamento == null || hospital == null) {
            return false;
        }

        double costo = medicamento.getCosto();

        if (hospital.getPresupuesto() >= costo) {
            try {
                listaMedicamentos.add(medicamento);
                hospital.descontarPresupuesto(costo);
                return true;
            } catch (Exception e) {
                // Loguear error si se requiere
                return false;
            }
        }

        return false;
    }

    /**
     * Vende un medicamento del inventario, retirándolo de la lista si se encuentra.
     *
     * @param nombre Nombre del medicamento a vender.
     * @param hospital Hospital solicitante.
     * @return Objeto Medicamento si fue encontrado y retirado; null si no existe o hay errores.
     */
    public Medicamento venderMedicamento(String nombre, Hospital hospital) {
        if (nombre == null || hospital == null || listaMedicamentos.isEmpty()) {
            return null;
        }

        for (Medicamento m : listaMedicamentos) {
            if (nombre.equalsIgnoreCase(m.getNombre())) {
                listaMedicamentos.remove(m);
                return m;
            }
        }

        return null;
    }

    /**
     * Obtiene la lista de medicamentos disponibles.
     * 
     * @return Lista de medicamentos en el inventario.
     */
    public List<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    /**
     * Establece una nueva lista de medicamentos.
     * 
     * @param listaMedicamentos Nueva lista de medicamentos a usar.
     */
    public void setListaMedicamentos(List<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    /**
     * Obtiene el año de la última actualización del inventario.
     *
     * @return Año como entero.
     */
    public int getAñoUltimaActualizacion() {
        return añoUltimaActualizacion;
    }

    /**
     * Establece el año de la última actualización del inventario.
     *
     * @param añoUltimaActualizacion Año nuevo a asignar.
     */
    public void setAñoUltimaActualizacion(int añoUltimaActualizacion) {
        this.añoUltimaActualizacion = añoUltimaActualizacion;
    }
}
