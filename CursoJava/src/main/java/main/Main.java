/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import dominio.*;
/**
 *
 * @author UsX
 */
public class Main {
    public static void main(String[] args) {
        Persona ismael=new Persona();
        ismael.cambiarColorPelo(ColorPelo.NEGRO);
        ismael.cambiarColorGafas(ColorGafas.NEGRO);
        ismael.aprenderIdioma(Idiomas.CASTELLANO);
        ismael.aprenderIdioma(Idiomas.INGLES);
        ismael.aprenderIdioma(Idiomas.PORTUGUES);
        NivelIdioma nivelIdiomaCastellano= new NivelIdioma();
        NivelIdioma nivelIdiomaIngles= new NivelIdioma();
        NivelIdioma nivelIdiomaPortugues= new NivelIdioma();
        nivelIdiomaCastellano.setIdioma(Idiomas.CASTELLANO);
        nivelIdiomaCastellano.setNivel(5);
        nivelIdiomaIngles.setIdioma(Idiomas.INGLES);
        nivelIdiomaIngles.setNivel(3);
        nivelIdiomaPortugues.setIdioma(Idiomas.PORTUGUES);
        nivelIdiomaPortugues.setNivel(2);
        ismael.mejorarIdioma(nivelIdiomaIngles);
        ismael.mejorarIdioma(nivelIdiomaCastellano);
        ismael.mejorarIdioma(nivelIdiomaPortugues);
        ismael.detectarAlergia(Alergias.ACAROS);
        ismael.detectarAlergia(Alergias.ACAROS);
        ismael.detectarAlergia(Alergias.ACAROS);
        ismael.mostrarPersona();
        
        
    }
    
}
