/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author UsX
 */
import dominio.BicicletaCarretera;
public class Main {
    public static void main(String[] args) {
        //definiendolo de tipo bicivletaCarretera podemos ver que
        //tiene todos los métodos públicos de su ancestros
        BicicletaCarretera miBicicletaCarretera = new BicicletaCarretera();
        miBicicletaCarretera.setVelocidadMaximaAlcanzable(90);
        miBicicletaCarretera.setMasaMaximaSoportable(160);
        miBicicletaCarretera.setNumeroRuedas(2);
        miBicicletaCarretera.setNumeroVelocidades(12);
        miBicicletaCarretera.setSirveParaCompetir(false);
        miBicicletaCarretera.setProfesionalAmateur(false);
        
        //mostrar datos por consola
    }
}
