/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.utils;

/**
 *
 * @author tomas
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogPersistencia {

    /**
     * Agrega un nuevo mensaje al archivo de log con marca de tiempo.
     *
     * @param mensaje Mensaje a registrar
     * @param rutaLog Ruta del archivo log (ej: "log.txt")
     * @throws IOException Si ocurre un error al escribir
     */
    public static void registrarEvento(String mensaje, String rutaLog) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(rutaLog, true)); // true = append

        LocalDateTime ahora = LocalDateTime.now();
        String marcaTiempo = ahora.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        bw.write("[" + marcaTiempo + "] " + mensaje + "\n");
        bw.close();
    }
}
