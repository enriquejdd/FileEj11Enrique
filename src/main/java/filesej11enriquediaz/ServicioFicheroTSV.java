/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesej11enriquediaz;

import java.util.ArrayList;

/**
 *
 * @author Enrique
 */
public class ServicioFicheroTSV {
    public void crearArchivo(ArrayList<App> a, String rutaYNombreArchivo){
        
    }
    
    public ArrayList<App> crearListaApps(int numeroApps){
        ArrayList<App> listaAplicaciones = new ArrayList<>();
        for (int i = 0; i < numeroApps; i++) {
            App appNueva = new App();            
            listaAplicaciones.add(appNueva.crearAppAleatoria());
        }
        return listaAplicaciones;
    }
    
    // PRueba de funcionamiento
//    public static void main(String[] args) {
//        int numeroApps = 15;
//        ArrayList<App> listaAplicaciones = new ArrayList<>();
//        for (int i = 0; i < numeroApps; i++) {
//            App appNueva = new App();            
//            listaAplicaciones.add(appNueva.crearAppAleatoria());
//        }
//        
//        listaAplicaciones.forEach(System.out::println);
//    }
}
