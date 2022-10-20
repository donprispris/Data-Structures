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
public class Bicicleta extends Vehiculo {
    protected int numeroVelocidades;
    protected boolean sirveParaCompetir;
    public int getNumeroVelocidades(){
        return numeroVelocidades;
    }
    public void setNumeroVelocidades(int numeroVelocidades){
        this.numeroVelocidades=numeroVelocidades;
    }
    public boolean isSirveParaCompetir(){
        return sirveParaCompetir;
    }
    public void setSirveParaCompetir(boolean sirveParaCompetir){
        this.sirveParaCompetir=sirveParaCompetir;
    }
}
