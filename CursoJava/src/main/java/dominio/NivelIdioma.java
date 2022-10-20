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
public class NivelIdioma {
    private Idiomas idioma;
    private int nivel;
    public Idiomas getIdioma(){
        return idioma;
    }
    public void setIdioma(Idiomas idioma){
        this.idioma=idioma;
    }
    public int getNivel(){
        return nivel;
    }
    public void setNivel(int nivel){
        this.nivel=nivel;
    }
}
