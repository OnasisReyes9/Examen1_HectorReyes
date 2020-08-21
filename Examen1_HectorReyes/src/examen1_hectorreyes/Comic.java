/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_hectorreyes;

import java.awt.Color;

/**
 *
 * @author Onasis Reyes
 */
public class Comic extends Articulo {

    private int numVolumen;
    private String descripcionComic;
    private int estado;

    public Comic() {
        super();
    }

    public Comic(int numVolumen, String descripcionComic, int estado, String titulo, Color color, String descripcion, String editorial, double tamaño, double puntuacion, Persona persona) {
        super(titulo, color, descripcion, editorial, tamaño, puntuacion, persona);
        this.numVolumen = numVolumen;
        this.descripcionComic = descripcionComic;
        this.estado = estado;
    }

    public int getNumVolumen() {
        return numVolumen;
    }

    public void setNumVolumen(int numVolumen) {
        this.numVolumen = numVolumen;
    }

    public String getDescripcionComic() {
        return descripcionComic;
    }

    public void setDescripcionComic(String descripcionFigura) {
        this.descripcionComic = descripcionFigura;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Comic{" + "numVolumen=" + numVolumen + ", descripcionComic=" + descripcionComic + ", estado=" + estado + '}';
    }

}
