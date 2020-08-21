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
public class PersonalGeneral extends Persona {

    private String ocupacion, horarioTrabajo, tiempoTrabajando;
    private Double sueldo;

    public PersonalGeneral() {
        super();
    }

    public PersonalGeneral(String ocupacion, String horarioTrabajo, String tiempoTrabajando, Double sueldo, String identificacion, String nombre, int edad, String sexo, String estadoCivil, double altura, double peso) {
        super(identificacion, nombre, edad, sexo, estadoCivil, altura, peso);
        this.ocupacion = ocupacion;
        this.horarioTrabajo = horarioTrabajo;
        this.tiempoTrabajando = tiempoTrabajando;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getTiempoTrabajando() {
        return tiempoTrabajando;
    }

    public void setTiempoTrabajando(String tiempoTrabajando) {
        this.tiempoTrabajando = tiempoTrabajando;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "PersonalGeneral{" + "ocupacion=" + ocupacion + ", horarioTrabajo=" + horarioTrabajo + ", tiempoTrabajando=" + tiempoTrabajando + ", sueldo=" + sueldo + '}';
    }

}
