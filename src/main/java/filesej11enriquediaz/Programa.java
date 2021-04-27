/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesej11enriquediaz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class Programa {

    public static void main(String[] args) {
        int numeroApps = 50;

        System.out.println("Creamos las listas de aplicaciones");
        System.out.println("");
        ArrayList<App> listaApps = new ArrayList<>();
        for (int i = 0; i < numeroApps; i++) {
            listaApps.add(App.crearAppAleatoria());
        }

        System.out.println("Creamos los directorios");
        System.out.println("");
        Path appstsv = Paths.get("./appstsv");
        Path appsxml = Paths.get("./appsxml");
        Path appsjson = Paths.get("./appsjson");
        Path c = Paths.get("./copias");
        Path aplicaciones = Paths.get("./aplicaciones");
        try {
            Files.createDirectory(appstsv);
            Files.createDirectory(appsxml);
            Files.createDirectory(appsjson);
            Files.createDirectory(appsjson);
            Files.createDirectory(aplicaciones);
        } catch (IOException e) {
            System.out.println("Problema creando el directorio.");
            System.out.println(e.toString());
        }

        String destinoArchivoTSV = "./appstsv/aplicaciones.tsv";
        String destinoArchivoXML = "./appsxml/aplicaciones.xml";
        String destinoArchivoJSON = "./appsjson/aplicaciones.json";
        
        
        System.out.println("Creamos los archivos de cada uno de los tipos");
        System.out.println("");
        ServicioFicheroTSV.crearArchivosTSV(listaApps, destinoArchivoTSV);
        ServicioFicheroXML.crearArchivosXML(listaApps, destinoArchivoXML);
        ServicioFicheroJSON.crearArchivosJSON(listaApps, destinoArchivoJSON);
        
        
    }
}
