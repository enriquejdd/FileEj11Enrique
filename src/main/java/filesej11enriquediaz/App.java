/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesej11enriquediaz;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Enrique
 */
public class App {
    int codigo;
    String nombre;
    String descripcion;
    Double tamanioKB;
    LocalDate fecCreacion;

    public App() {
    }

    public App(int codigo, String nombre, String descripcion, Double tamanioKB, LocalDate fecCreacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanioKB = tamanioKB;
        this.fecCreacion = fecCreacion;
    }

}
