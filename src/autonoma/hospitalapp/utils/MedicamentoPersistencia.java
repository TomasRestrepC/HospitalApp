/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.utils;

/**
 *
 * @author tomas
 */
import autonoma.hospitalapp.models.Medicamento;
import autonoma.hospitalapp.models.MedicamentoMarca;
import autonoma.hospitalapp.models.MedicamentoGenerico;

import java.io.*;
import java.util.ArrayList;

public class MedicamentoPersistencia {

    public static void guardarMedicamentos(ArrayList<Medicamento> medicamentos, String ruta) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(ruta));

        for (Medicamento m : medicamentos) {
            if (m instanceof MedicamentoGenerico) {
                bw.write("Generico;" + m.getNombre() + ";" + m.getDescripcion() + ";" + m.getCosto() + "\n");
            } else if (m instanceof MedicamentoMarca) {
                MedicamentoMarca mm = (MedicamentoMarca) m;
                bw.write("Marca;" + mm.getNombre() + ";" + mm.getDescripcion() + ";" +
                         mm.getCosto() + ";" + mm.getFabricante() + "\n");
            }
        }

        bw.close();
    }

    public static ArrayList<Medicamento> cargarMedicamentos(String ruta) throws IOException {
        ArrayList<Medicamento> medicamentos = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(";");
            String tipo = partes[0];
            String nombre = partes[1];
            String descripcion = partes[2];
            double costo = Double.parseDouble(partes[3]);

            if (tipo.equalsIgnoreCase("Generico")) {
                MedicamentoGenerico mg = new MedicamentoGenerico(nombre, descripcion, costo);
                mg.calcularPrecioVenta();  // necesita ser público
                medicamentos.add(mg);
            } else if (tipo.equalsIgnoreCase("Marca")) {
                String fabricante = partes[4];
                MedicamentoMarca mm = new MedicamentoMarca(nombre, descripcion, costo, fabricante);
                mm.calcularPrecioVenta();  // necesita ser público
                medicamentos.add(mm);
            }
        }

        br.close();
        return medicamentos;
    }
}
