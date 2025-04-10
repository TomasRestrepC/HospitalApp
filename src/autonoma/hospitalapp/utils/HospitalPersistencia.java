/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.utils;

/**
 *
 * @author tomas
 */

import autonoma.hospitalapp.models.Hospital;
import autonoma.hospitalapp.models.Localizacion;
import autonoma.hospitalapp.models.Gerente;

import java.io.*;

public class HospitalPersistencia {

    public static Hospital cargarHospital(String ruta) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        Hospital hospital = new Hospital();
        Localizacion localizacion = new Localizacion();
        Gerente gerente = new Gerente();

        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(":", 2);
            if (partes.length < 2) continue;

            switch (partes[0]) {
                case "Nombre": hospital.setNombre(partes[1]); break;
                case "Dirección": hospital.setDireccion(partes[1]); break;
                case "Teléfono": hospital.setTelefono(partes[1]); break;
                case "Presupuesto": hospital.setPresupuesto(Double.parseDouble(partes[1])); break;
                case "MetaVentasAnual": hospital.setMetaDeventasAnual(Double.parseDouble(partes[1])); break;
                case "FechaFundacion": hospital.setFechaFundacion(partes[1]); break;
                case "Estado":
                    hospital.setEstado(partes[1].equalsIgnoreCase("activo"));
                    break;
                case "Localización":
                    String[] coords = partes[1].split(",");
                    localizacion.setLatitud(Double.parseDouble(coords[0]));
                    localizacion.setLongitud(Double.parseDouble(coords[1]));
                    break;
                case "GerenteNombre": gerente.setNombre(partes[1]); break;
                case "GerenteDocumento": gerente.setDocumentoIdentidad(partes[1]); break;
                case "GerenteEdad": gerente.setEdad(Integer.parseInt(partes[1])); break;
                case "GerenteCarrera": gerente.setCarrera(partes[1]); break;
            }
        }

        hospital.setGerente(gerente);
        hospital.setLocalizacion(localizacion);

        br.close();
        return hospital;
    }

    public static void guardarHospital(Hospital hospital, String ruta) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));
        bw.write("Nombre:" + hospital.getNombre() + "\n");
        bw.write("Dirección:" + hospital.getDireccion() + "\n");
        bw.write("Teléfono:" + hospital.getTelefono() + "\n");
        bw.write("Presupuesto:" + hospital.getPresupuesto() + "\n");
        bw.write("MetaVentasAnual:" + hospital.getMetaDeventasAnual() + "\n");
        bw.write("FechaFundacion:" + hospital.getFechaFundacion() + "\n");
        bw.write("Estado:" + (hospital.isEstado() ? "activo" : "inactivo") + "\n");
        bw.write("Localización:" + hospital.getLocalizacion().getLatitud() + "," +
                                   hospital.getLocalizacion().getLongitud() + "\n");

        Gerente g = hospital.getGerente();
        bw.write("GerenteNombre:" + g.getNombre() + "\n");
        bw.write("GerenteDocumento:" + g.getDocumentoIdentidad() + "\n");
        bw.write("GerenteEdad:" + g.getEdad() + "\n");
        bw.write("GerenteCarrera:" + g.getCarrera() + "\n");
        bw.close();
    }
}
