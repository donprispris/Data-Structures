/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author UsX
 */
public class Materia {
    protected String clave;
    protected String materia;
    protected int horas;
    protected int semestre;
    protected String periodo;
    protected String carrera;
    protected String tipo;

    public Materia(String clave, String materia, int horas, int semestre, String periodo, String carrera, String tipo) {
        this.clave = clave;
        this.materia = materia;
        this.horas = horas;
        this.semestre = semestre;
        this.periodo = periodo;
        this.carrera = carrera;
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Materia{" + "clave=" + clave + ", materia=" + materia + ", horas=" + horas + ", semestre=" + semestre + ", periodo=" + periodo + ", carrera=" + carrera + ", tipo=" + tipo + '}';
    }
    
    
}
