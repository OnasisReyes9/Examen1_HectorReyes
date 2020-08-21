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
public class Juego extends Articulo {

    private int edicion;
    private String casaElaboracion, paisCreado;

    public Juego() {
        super();
    }

    public Juego(int edicion, String casaElaboracion, String paisCreado, String titulo, Color color, String descripcion, String editorial, double tamaño, double puntuacion, Persona persona) {
        super(titulo, color, descripcion, editorial, tamaño, puntuacion, persona);
        this.edicion = edicion;
        this.casaElaboracion = casaElaboracion;
        this.paisCreado = paisCreado;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCasaElaboracion() {
        return casaElaboracion;
    }

    public void setCasaElaboracion(String casaElaboracion) {
        this.casaElaboracion = casaElaboracion;
    }

    public String getPaisCreado() {
        return paisCreado;
    }

    public void setPaisCreado(String paisCreado) {
        this.paisCreado = paisCreado;
    }

    @Override
    public String toString() {
        return "Juego{" + "edicion=" + edicion + ", casaElaboracion=" + casaElaboracion + ", paisCreado=" + paisCreado + '}';
    }

}
