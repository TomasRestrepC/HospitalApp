/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.utils;

/**
 *
 * @author tomas
 */
import java.io.*;
import java.util.ArrayList;

public class NominaPersistencia {

    /**
     * Guarda registros de nómina en un archivo de texto.
     *
     * @param registros Lista de líneas (una por empleado) con los datos de nómina.
     * @param ruta Ruta del archivo a escribir.
     * @throws IOException Si ocurre un error al escribir.
     */
    public static void guardarNomina(ArrayList<String> registros, String ruta) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

        for (String linea : registros) {
            bw.write(linea + "\n");
        }

        bw.close();
    }

    /**
     * Carga registros de nómina desde un archivo de texto.
     *
     * @param ruta Ruta del archivo a leer.
     * @return Lista de líneas con los datos de nómina.
     * @throws IOException Si ocurre un error al leer.
     */
    public static ArrayList<String> cargarNomina(String ruta) throws IOException {
        ArrayList<String> registros = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String linea;

        while ((linea = br.readLine()) != null) {
            registros.add(linea);
        }

        br.close();
        return registros;
    }
}
