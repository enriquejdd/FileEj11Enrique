/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filesej11enriquediaz;

import java.time.LocalDate;
import java.time.Month;
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
    }

    public App(int codigo, String nombre, String descripcion, Double tamanioKB, LocalDate fecCreacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamanioKB = tamanioKB;
        this.fecCreacion = fecCreacion;
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

}
