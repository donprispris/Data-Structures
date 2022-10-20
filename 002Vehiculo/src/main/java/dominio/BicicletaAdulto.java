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
public class BicicletaAdulto extends Bicicleta {
    protected boolean profesionalAmateur;
    public boolean isProfesionalAmateur(){
        return profesionalAmateur;
    }
    public void setProfesionalAmateur(boolean profesionalAmateur){
        this.profesionalAmateur=profesionalAmateur;
    }
}
