/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.utils;

/**
 *
 * @author tomas
 */

import autonoma.hospitalapp.models.Empleado;
import autonoma.hospitalapp.models.EmpleadoOperativo;
import autonoma.hospitalapp.models.EmpleadoSalud;

import java.io.*;
import java.util.ArrayList;

public class EmpleadoPersistencia {

    /**
     * Guarda una lista de empleados (salud y operativos) en un archivo de texto plano.
     * Cada línea representa un empleado con formato delimitado por punto y coma.
     *
     * @param empleados Lista de empleados a guardar
     * @param ruta Ruta del archivo de salida
     * @throws IOException Si ocurre un error al escribir el archivo
     */
    public static void guardarEmpleados(ArrayList<Empleado> empleados, String ruta) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

        for (Empleado e : empleados) {
            if (e instanceof EmpleadoSalud) {
                EmpleadoSalud es = (EmpleadoSalud) e;
                bw.write("Salud;" + es.getNombre() + ";" + es.getNumeroDocumento() + ";" +
                        es.getEdad() + ";" + es.getSalarioBase() + ";" + es.getEspecialidad() + ";" +
                        es.getHorasTrabajadas() + ";" + es.getTelefono() + "\n");
            } else if (e instanceof EmpleadoOperativo) {
                EmpleadoOperativo eo = (EmpleadoOperativo) e;
                bw.write("Operativo;" + eo.getNombre() + ";" + eo.getNumeroDocumento() + ";" +
                        eo.getEdad() + ";" + eo.getSalarioBase() + ";" + eo.getArea() + ";" +
                        eo.getTelefono() + "\n");
            }
        }

        bw.close();
    }

    /**
     * Carga empleados desde un archivo de texto plano y los devuelve como una lista.
     *
     * @param ruta Ruta del archivo a leer
     * @return Lista de empleados reconstruidos desde el archivo
     * @throws IOException Si ocurre un error al leer el archivo
     */
    public static ArrayList<Empleado> cargarEmpleados(String ruta) throws IOException {
        ArrayList<Empleado> empleados = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(";");
            String tipo = partes[0];
            String nombre = partes[1];
            String documento = partes[2];
            int edad = Integer.parseInt(partes[3]);
            double salarioBase = Double.parseDouble(partes[4]);

            if (tipo.equalsIgnoreCase("Salud")) {
                String especialidad = partes[5];
                int horas = Integer.parseInt(partes[6]);
                String telefono = partes[7];
                empleados.add(new EmpleadoSalud(especialidad, horas, nombre, edad, documento, telefono, salarioBase));
            } else if (tipo.equalsIgnoreCase("Operativo")) {
                String area = partes[5];
                String telefono = partes[6];
                empleados.add(new EmpleadoOperativo(area, nombre, edad, documento, telefono, salarioBase));
            }
        }

        br.close();
        return empleados;
    }
}
