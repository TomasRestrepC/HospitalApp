/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.models;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase  que proporciona  métodos para manejar archivos del sistema hospitalario.
 * @author Santiago Calderon Murillo
 * Versión 1.0 
 * since@ 2025-04-07
 */
public class MetodosArchivos {

    /**
     * Crea un archivo vacío con el nombre especificado.
     * 
     * @param archivo Nombre o ruta del archivo a crear.
     */
    public void crearArchivo(String archivo) {
        File f1 = new File(archivo);
        try {
            PrintWriter pw = new PrintWriter(f1);
            pw.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Escribe texto en un archivo, agregando el contenido al final.
     * 
     * @param archivo Nombre o ruta del archivo.
     * @param texto Texto a escribir en el archivo.
     */
    public void escribirArchivo(String archivo, String texto) {
        File f1 = new File(archivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
            pw.print(texto);
            pw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Lee todas las líneas de un archivo y las devuelve en una lista.
     * 
     * @param archivo Ruta del archivo a leer.
     * @return Lista con las líneas del archivo.
     */
    public List<String> leerArchivo(String archivo) {
        List<String> lineas = new ArrayList<>();
        File f1 = new File(archivo);

        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return lineas;
    }



    /**
     * Lista todos los archivos y carpetas de un directorio especificado.
     * 
     * @param directorio Ruta del directorio.
     */
    public void archivosDirectorio(String directorio) {
        File f1 = new File(directorio);
        String[] archivos = f1.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println(archivos[i]);
        }
    }

    /**
     * Guarda los datos de una nómina en un archivo.
     * 
     * @param archivo Archivo donde se escribirá la información.
     * @param nomina Objeto con la información a guardar.
     */
    public void guardarNomina(String archivo, Nomina nomina) {
        File f1 = new File(archivo);
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f1, true));
            pw.println("ID Nomina: " + nomina.getId());
            pw.println("Fecha: " + nomina.getFecha());
            pw.println("Empleados:");
            for (Empleado e : nomina.getEmpleados()) {
                pw.println("Nombre: " + e.getNombre() + ", Salario: " + e.calcularSalario());
            }
            pw.println("Total Nomina: " + nomina.getTotalSalarioNomina());
            pw.println("----------------------------------");
            pw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Carga los atributos de un hospital desde un archivo de texto.
     * 
     * @param archivo Ruta del archivo que contiene los datos del hospital.
     * @return Objeto
     */
    public Hospital asignarAtributosHospital(String archivo) {
        Hospital hospital = new Hospital();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(": ");
                if (partes.length == 2) {
                    String nombreCampo = partes[0];
                    String valorCampo = partes[1];
                    switch (nombreCampo) {
                        case "Nombre" -> hospital.setNombre(valorCampo);
                        case "Direccion" -> hospital.setDireccion(valorCampo);
                        case "Telefono" -> hospital.setTelefono(valorCampo);
                        case "Presupuesto" -> hospital.setPresupuesto(Double.parseDouble(valorCampo));
                        case "Fecha de Fundacion" -> hospital.setFechaFundacion(valorCampo);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hospital;
    }

    /**
     * Carga los atributos de un gerente desde un archivo de texto.
     * 
     * @param archivo Ruta del archivo que contiene los datos del gerente.
     * @return Objeto  
     */
    public Gerente asignarAtributosGerente(String archivo) {
        Gerente gerente = new Gerente();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(": ");
                if (partes.length == 2) {
                    String nombreCampo = partes[0];
                    String valorCampo = partes[1];
                    switch (nombreCampo) {
                        case "Nombre" -> gerente.setNombre(valorCampo);
                        case "Numero de documento" -> gerente.setDocumentoIdentidad(valorCampo);
                        case "Edad" -> gerente.setEdad(Integer.parseInt(valorCampo));
                        case "Carrera" -> gerente.setCarrera(valorCampo);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gerente;
    }

    /**
     * Carga los atributos de una localización desde un archivo de texto.
     * 
     * @param archivo Ruta del archivo que contiene los datos de localización.
     * @return Objeto 
     */
    public Localizacion asignarAtributosLocalizacion(String archivo) {
        Localizacion localizacion = new Localizacion();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(": ");
                if (partes.length == 2) {
                    String nombreCampo = partes[0];
                    String valorCampo = partes[1];
                    switch (nombreCampo) {
                        case "Latitud" -> localizacion.setLatitud(Double.parseDouble(valorCampo));
                        case "Longitud" -> localizacion.setLongitud(Double.parseDouble(valorCampo));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return localizacion;
    }
}

