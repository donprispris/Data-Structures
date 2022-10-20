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
public class Vehiculo {
    protected int numeroRuedas;
    protected int masaMaximaSoportable;
    protected int velocidadMaximaAlcanzable;
    public int getNumeroRuedas(){
        return numeroRuedas;
    }
    public void setNumeroRuedas(int numeroRuedas){
        this.numeroRuedas=numeroRuedas;
    }
    public int getMasaMaximaSoportable(){
        return masaMaximaSoportable;
    }
    public void setMasaMaximaSoportable(int masaMaximaSoportable){
        this.masaMaximaSoportable=masaMaximaSoportable;
    }
    public int getVelocidadMaximaAlcanzable(){
        return velocidadMaximaAlcanzable;
    }
    public void setVelocidadMaximaAlcanzable(int velocidadMaximaAlcanzable){
        this.velocidadMaximaAlcanzable=velocidadMaximaAlcanzable;
    }
}
