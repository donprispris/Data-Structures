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
public class Profesor {
    protected String nombre;
    protected int horas;
    protected String preferencia;
    protected int cuprofesor;

    public Profesor(String nombre, int horas, String preferencia, int cuprofesor) {
        this.nombre = nombre;
        this.horas = horas;
        this.preferencia = preferencia;
        this.cuprofesor = cuprofesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public int getCuprofesor() {
        return cuprofesor;
    }

    public void setCuprofesor(int cuprofesor) {
        this.cuprofesor = cuprofesor;
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", horas=" + horas + ", preferencia=" + preferencia + ", cuprofesor=" + cuprofesor + '}';
    }
    
    
}
