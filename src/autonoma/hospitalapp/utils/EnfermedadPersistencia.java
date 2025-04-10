/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.utils;

/**
 *
 * @author tomas
 */
import autonoma.hospitalapp.models.Enfermedad;

import java.io.*;
import java.util.ArrayList;

public class EnfermedadPersistencia {

    /**
     * Guarda una lista de enfermedades (nombre y descripción).
     */
    public static void guardarEnfermedades(ArrayList<Enfermedad> enfermedades, String ruta) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

        for (Enfermedad e : enfermedades) {
            bw.write(e.getNombre() + ";" + e.getDescripcion() + "\n");
        }

        bw.close();
    }

    /**
     * Carga enfermedades desde archivo (nombre y descripción).
     */
    public static ArrayList<Enfermedad> cargarEnfermedades(String ruta) throws IOException {
        ArrayList<Enfermedad> enfermedades = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(";");
            String nombre = partes[0];
            String descripcion = partes[1];

            enfermedades.add(new Enfermedad(nombre, descripcion));
        }

        br.close();
        return enfermedades;
    }
}
