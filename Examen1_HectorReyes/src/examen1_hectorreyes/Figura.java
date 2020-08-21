/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_hectorreyes;

/**
 *
 * @author Onasis Reyes
 */
public class Figura extends Articulo {

    private String descripcionFigura, instruccionesArmado, tGarantia;

    public String getDescripcionFigura() {
        return descripcionFigura;
    }

    public void setDescripcionFigura(String descripcionFigura) {
        this.descripcionFigura = descripcionFigura;
    }

    public String getInstruccionesArmado() {
        return instruccionesArmado;
    }

    public void setInstruccionesArmado(String instruccionesArmado) {
        this.instruccionesArmado = instruccionesArmado;
    }

    public String gettGarantia() {
        return tGarantia;
    }

    public void settGarantia(String tGarantia) {
        this.tGarantia = tGarantia;
    }

    @Override
    public String toString() {
        return "Figura{" + "descripcionFigura=" + descripcionFigura + ", instruccionesArmado=" + instruccionesArmado + ", tGarantia=" + tGarantia + '}';
    }

}
