/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesej11enriquediaz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Enrique
 */
public class App {

    private Random aleatorio = new Random();

    private int codigo;
    private String nombre;
    private String descripcion;
    private Double tamanioKB;
    private LocalDate fecCreacion;

    public App() {
        codigo++;
    }

    public App(int codigo, String nombre, String descripcion, Double tamanioKB, LocalDate fecCreacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanioKB = tamanioKB;
        this.fecCreacion = fecCreacion;
        codigo++;
    }

    public LocalDate getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(LocalDate fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    public Random getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(Random aleatorio) {
        this.aleatorio = aleatorio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getTamanioKB() {
        return tamanioKB;
    }

    public void setTamanioKB(Double tamanioKB) {
        this.tamanioKB = tamanioKB;
    }

    @Override
    public String toString() {
        return aleatorio + "\t" + codigo + "\t" + nombre + "\t" + descripcion + "\t" + tamanioKB + "\t" + fecCreacion;
    }

    // Método para crear app aleatorias.
    public App crearAppAleatoria() {        
        int contador = codigo;
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        int numLetraAbec = aleatorio.nextInt(abecedario.length());
        String nomb = "app" + contador + abecedario.charAt(numLetraAbec);
        String descripcionApp = descripcionAleatorio();
        Double tamanioFinal = aleatorio.doubles(1, 100.0, 1024.0).sum();        
        LocalDate fecAleatoria = fechasAleatorias();

        App appAleatoria = new App(contador,nomb,descripcionApp,tamanioFinal,fecAleatoria);
        
        return appAleatoria;
    }

    // Método para que escoja devuelva aleatoriamente uno de los string del arrayList.
    public String descripcionAleatorio() {
        ArrayList<String> descripciones = new ArrayList<>();
        descripciones.add("Aplicacion de Desarrollo");
        descripciones.add("Aplicacion de Cuentas");
        descripciones.add("Aplicacion de Viajes");
        descripciones.add("Aplicacion de Compras");
        descripciones.add("Aplicacion de Videos");
        descripciones.add("Aplicacion de Mensajeria");
        descripciones.add("Aplicacion de Red_Social");
        descripciones.add("Aplicacion de Juegos");
        descripciones.add("Aplicacion de Llamadas");
        descripciones.add("Aplicacion de Creación");

        String descripcionApp = descripciones.get(aleatorio.nextInt(descripciones.size()));
        return descripcionApp;
    }

    // Método que crea fechas aleatorios
    public LocalDate fechasAleatorias() {
        // Obtener un número entre las 30 siguientes iteraciones a 1995
        int año = aleatorio.nextInt(30)+1995;
        // Obtener un valor de 1 al 12
        int mes = aleatorio.nextInt(12) + 1;
        int dia = 0;
        // Creamos un switch para que dependiendo del mes pueda tener más o menso días
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dia = aleatorio.nextInt(31) + 1;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dia = aleatorio.nextInt(30) + 1;
                break;
            case 2:
                if (año % 4 == 0) {
                    dia = aleatorio.nextInt(29) + 1;
                } else {
                    dia = aleatorio.nextInt(28) + 1;
                }
                break;
        }

        return LocalDate.of(año, mes, dia);
    }
}
