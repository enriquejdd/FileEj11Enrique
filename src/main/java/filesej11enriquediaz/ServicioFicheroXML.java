/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesej11enriquediaz;

import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Enrique
 */
public class ServicioFicheroXML {

    // Crea un archivo XML usando Marshall en la ubicacion de la ruta para el archivo con los datos del array
    public static void crearArchivoXMLMarshall(ArrayList<App> arrayListAppsXML, String rutaArchivo) throws JAXBException {
        
        AppXML apps = new AppXML();
        apps.setLista(arrayListAppsXML);
        // Crea el contexto JAXB. Se encarga de definir los objetos 
        // que vamos a guardar.
        JAXBContext contexto = JAXBContext.newInstance(AppXML.class);

        // Crear un objeto Marshaller, que sirve para generar la estructura del fichero XML
        Marshaller serializador = contexto.createMarshaller();

        // Especificamos que la propiedad del formato de salida
        // del serializador sea true, lo que implica que el formato se 
        // realiza con indentación y saltos de línea
        serializador.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // Volcado al fichero xml
        serializador.marshal(apps, new File(rutaArchivo));
    }
}
