/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesej11enriquediaz;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class ServicioFicheroJSON {

    // Crea un archivo JSON en la ubicacion de la ruta para el archivo con los datos del array
    public static void crearArchivosJSON(ArrayList<App> arrayListApps, String rutaYNombreArchivo) throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
        // Escribe en un fichero JSON el catálogo de muebles
        mapeador.writeValue(new File(rutaYNombreArchivo), arrayListApps);
    }

    // Crea tantos ficheros JSON como el tamaño del array que se le pase. Usaran la ruta del archivo pero el nombre será el de la app.
    public static void crearJSONporApp(ArrayList<App> arrayListApps, String rutaYNombreArchivo) throws IOException {
        for (int i = 0; i < arrayListApps.size(); i++) {
            String rutaArchivo = rutaYNombreArchivo + "/" + arrayListApps.get(i).getNombre() + ".json";
            ObjectMapper mapeador = new ObjectMapper();
            mapeador.configure(SerializationFeature.INDENT_OUTPUT, true);
            mapeador.writeValue(new File(rutaArchivo), arrayListApps.get(i).toString());
        }
    }
}
