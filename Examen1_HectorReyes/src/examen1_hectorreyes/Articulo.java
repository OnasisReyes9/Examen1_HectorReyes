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
public class Articulo {

    private String titulo;
    private Color color;
    private String descripcion, editorial;
    private double tamaño, puntuacion;
    private Persona persona;

    public Articulo() {
    }

    public Articulo(String titulo, Color color, String descripcion, String editorial, double tamaño, double puntuacion, Persona persona) {
        this.titulo = titulo;
        this.color = color;
        this.descripcion = descripcion;
        this.editorial = editorial;
        this.tamaño = tamaño;
        this.puntuacion = puntuacion;
        this.persona = persona;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Articulo{" + "titulo=" + titulo + ", color=" + color + ", descripcion=" + descripcion + ", editorial=" + editorial + ", tama\u00f1o=" + tamaño + ", puntuacion=" + puntuacion + ", persona=" + persona + '}';
    }

}
