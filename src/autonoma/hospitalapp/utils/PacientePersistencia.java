/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.utils;

/**
 *
 * @author tomas
 */

import autonoma.hospitalapp.models.Paciente;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PacientePersistencia {

    /**
     * Guarda pacientes en archivo de texto.
     */
    public static void guardarPacientes(ArrayList<Paciente> pacientes, String ruta) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
        for (Paciente p : pacientes) {
            bw.write(p.getNombre() + ";" +
                     p.getDocumento() + ";" +           // Corregido
                     p.getEdad() + ";" +
                     p.getCorreo() + ";" +
                     p.getTelefono() + ";" +
                     p.getEstado() + "\n");
        }
        bw.close();
    }

    /**
     * Carga pacientes desde archivo.
     */
    public static ArrayList<Paciente> cargarPacientes(String ruta) throws IOException {
<<<<<<< HEAD
        ArrayList<Paciente> pacientes = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(";");
            String nombre = partes[0];
            String documento = partes[1];
            int edad = Integer.parseInt(partes[2]);
            String correo = partes[3];
            String telefono = partes[4];
            String estado = partes[5];

            // Se pasan listas vacías por ahora
            List<autonoma.hospitalapp.models.Enfermedad> enfermedades = new ArrayList<>();
            List<autonoma.hospitalapp.models.Medicamento> medicamentos = new ArrayList<>();

            Paciente paciente = new Paciente(nombre, documento, edad, telefono, correo, estado, enfermedades, medicamentos);
            pacientes.add(paciente);
        }

        br.close();
        return pacientes;
    }
=======
    ArrayList<Paciente> pacientes = new ArrayList<>();

    // Verifica si el archivo y carpeta existen, y si no, los crea
    File archivo = new File(ruta);
    archivo.getParentFile().mkdirs(); // crea carpeta si no existe
    if (!archivo.exists()) {
        archivo.createNewFile(); // crea archivo vacío si no existe
    }

    BufferedReader br = new BufferedReader(new FileReader(archivo));
    String linea;

    while ((linea = br.readLine()) != null) {
        String[] partes = linea.split(";");
        if (partes.length < 6) continue; // prevención de errores

        String nombre = partes[0];
        String documento = partes[1];
        int edad = Integer.parseInt(partes[2]);
        String correo = partes[3];
        String telefono = partes[4];
        String estado = partes[5];

        List<autonoma.hospitalapp.models.Enfermedad> enfermedades = new ArrayList<>();
        List<autonoma.hospitalapp.models.Medicamento> medicamentos = new ArrayList<>();

        Paciente paciente = new Paciente(nombre, documento, edad, telefono, correo, estado, enfermedades, medicamentos);
        pacientes.add(paciente);
    }

    br.close();
    return pacientes;
}
>>>>>>> afd0b1e (Capa de presentacion)
}