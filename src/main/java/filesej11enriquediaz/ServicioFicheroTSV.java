/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesej11enriquediaz;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class ServicioFicheroTSV {

    public static void crearArchivosTSV(ArrayList<App> arrayListApps, String rutaYNombreArchivo) { 

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(rutaYNombreArchivo))) {
            String respuesta = "";
            for (int i = 0; i < arrayListApps.size(); i++) {
                respuesta = arrayListApps.get(i).toString();
                flujo.write(respuesta);
                flujo.newLine();
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<App> crearListaAppsTSV(int numeroApps) {
        ArrayList<App> listaAplicaciones = new ArrayList<>();
        for (int i = 0; i < numeroApps; i++) {
            listaAplicaciones.add(App.crearAppAleatoria());
        }
        return listaAplicaciones;
    }

    // Prueba de funcionamiento
//    public static void main(String[] args) {
//        String destinoArchivo = "./ficheroTSV.tsv";
//        int numeroApps = 15;
//        ArrayList<App> listaAplicaciones = crearListaAppsTSV(numeroApps);
//        
////        listaAplicaciones.forEach(System.out::println);
//        crearArchivosTSV(listaAplicaciones, destinoArchivo);
//    }
}
