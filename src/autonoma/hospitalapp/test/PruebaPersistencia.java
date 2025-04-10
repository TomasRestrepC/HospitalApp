/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.hospitalapp.test;

/**
 *
 * @author tomas
 */


//Esta clase simplemente era probar la parte de persistencia, se puede eliminar en cualquier momento


import autonoma.hospitalapp.models.*;
import autonoma.hospitalapp.utils.*;

import java.io.IOException;
import java.util.ArrayList;

public class PruebaPersistencia {

    public static void main(String[] args) {
        try {
            // Crear hospital ficticio
            Hospital hospital = new Hospital();
            hospital.setNombre("Hospital San Jose");
            hospital.setDireccion("Calle Falsa 123");
            hospital.setTelefono("3001234567");
            hospital.setPresupuesto(5000000);
            hospital.setMetaDeventasAnual(10000000);
            hospital.setFechaFundacion("1999-08-12");
            hospital.setEstado(true);

            Gerente gerente = new Gerente("Laura Restrepo", "111222333", 45, "Administracion");
            hospital.setGerente(gerente);
            hospital.setLocalizacion(new Localizacion(74.06, 4.61)); // Bogotá

            // Crear empleados
            ArrayList<Empleado> empleados = new ArrayList<>();
            empleados.add(new EmpleadoSalud("Cardiologia", 40, "Carlos Perez", 35, "12345678", "3124567890", 5000));
            empleados.add(new EmpleadoOperativo("Mantenimiento", "Laura Gomez", 28, "87654321", "3119876543", 3000));
            hospital.setEmpleados(empleados);

            // Crear pacientes
            ArrayList<Paciente> pacientes = new ArrayList<>();
            ArrayList<Enfermedad> enfermedades = new ArrayList<>();
            enfermedades.add(new Enfermedad("COVID-19", "Viral aguda"));
            ArrayList<Medicamento> medicamentos = new ArrayList<>();
            medicamentos.add(new MedicamentoGenerico("Paracetamol", "Analgesico", 1000));
            pacientes.add(new Paciente("Juan Perez", "90123456", 45, "3101112233", "juan@gmail.com", "critico", enfermedades, medicamentos));

            // Crear más medicamentos
            ArrayList<Medicamento> inventario = new ArrayList<>();
            inventario.add(new MedicamentoGenerico("Ibuprofeno", "Antiinflamatorio", 1200));
            inventario.add(new MedicamentoMarca("Amoxicilina", "Antibiotico", 1500, "Pfizer"));

            // Guardar en archivos
            HospitalPersistencia.guardarHospital(hospital, "hospital.txt");
            EmpleadoPersistencia.guardarEmpleados(hospital.getEmpleados(), "empleados.txt");
            PacientePersistencia.guardarPacientes(pacientes, "pacientes.txt");
            MedicamentoPersistencia.guardarMedicamentos(inventario, "medicamentos.txt");
            EnfermedadPersistencia.guardarEnfermedades(enfermedades, "enfermedades.txt");

            LogPersistencia.registrarEvento("Datos de prueba guardados correctamente", "log.txt");

            // Cargar desde archivos
            Hospital hospitalCargado = HospitalPersistencia.cargarHospital("hospital.txt");
            ArrayList<Empleado> empleadosCargados = EmpleadoPersistencia.cargarEmpleados("empleados.txt");
            ArrayList<Paciente> pacientesCargados = PacientePersistencia.cargarPacientes("pacientes.txt");
            ArrayList<Medicamento> medicamentosCargados = MedicamentoPersistencia.cargarMedicamentos("medicamentos.txt");
            ArrayList<Enfermedad> enfermedadesCargadas = EnfermedadPersistencia.cargarEnfermedades("enfermedades.txt");

            // Mostrar lo cargado en consola
            System.out.println("\n--- Hospital Cargado ---");
            System.out.println("Nombre: " + hospitalCargado.getNombre());
            System.out.println("Gerente: " + hospitalCargado.getGerente().getNombre());

            System.out.println("\n--- ️ Empleados Cargados ---");
            for (Empleado e : empleadosCargados) {
                System.out.println("- " + e.getNombre() + " (" + e.getClass().getSimpleName() + ")");
            }

            System.out.println("\n--- Pacientes Cargados ---");
            for (Paciente p : pacientesCargados) {
                System.out.println("- " + p.getNombre() + ", estado: " + p.getEstado());
            }

            System.out.println("\n--- Medicamentos Cargados ---");
            for (Medicamento m : medicamentosCargados) {
                System.out.println("- " + m.getNombre() + " (" + m.getClass().getSimpleName() + "), Precio: " + m.getPrecioVenta());
            }

            System.out.println("\n--- Enfermedades Cargadas ---");
            for (Enfermedad e : enfermedadesCargadas) {
                System.out.println("- " + e.getNombre() + ": " + e.getDescripcion());
            }

        } catch (IOException e) {
            System.err.println(" Error durante la prueba: " + e.getMessage());
        }
    }
}
