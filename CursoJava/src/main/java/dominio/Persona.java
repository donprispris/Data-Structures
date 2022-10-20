/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author UsX
 */
public class Persona {
    private ColorPelo colorPelo;
    private ColorGafas colorGafas;
    private List<NivelIdioma> idiomas;
    private List <Alergias> alergias;
    public Persona(){ //constructor de la clase
        this.colorPelo=ColorPelo.CASTANO;
        this.colorGafas=ColorGafas.NEGRO;
        this.idiomas=new ArrayList<NivelIdioma>();
        this.alergias=new ArrayList<Alergias>();
    }
    public void cambiarColorPelo(ColorPelo nuevoColor){
        this.colorPelo=nuevoColor;
    }
    public void cambiarColorGafas(ColorGafas nuevoColor){
        this.colorGafas=nuevoColor;
    }
    // prerrequisitos:el idioma debe de estar en la lista
    //si no existe se añadira como nuevo idioma
    public void mejorarIdioma(NivelIdioma nivelIdioma){
        Idiomas idioma= nivelIdioma.getIdioma();
        int LugarLista=this.encontrarIdioma(idioma);
        if(LugarLista==-1){
            this.idiomas.add(nivelIdioma);
        }else{
            NivelIdioma nivelIdiomaEncontrado
                   =this.idiomas.get(LugarLista);
            nivelIdiomaEncontrado.setNivel(nivelIdioma.getNivel());
        }
        
    }
    //prerrequisito: el idioma no debe estae en la lista.
    //si existe no se añadira
    public void aprenderIdioma(Idiomas nuevoIdioma){
        int LugarLista = this.encontrarIdioma(nuevoIdioma);
        if(LugarLista==-1){
            NivelIdioma nivelIdioma=new NivelIdioma();
            nivelIdioma.setIdioma(nuevoIdioma);
            nivelIdioma.setNivel(0);
            this.idiomas.add(nivelIdioma);
        }
    }
    //Prerrequisito: la alergia no debe estar en la lista.
    //Si existe en la lista no se añadira.
    public void detectarAlergia(Alergias nuevaAlergia){
        if(!this.encontrarAlergia(nuevaAlergia)){
            this.alergias.add(nuevaAlergia);
        }
    }
    public void mostrarPersona(){
        System.out.print("Los datos de la"+"Persona son los siguientes.");
        System.out.print("El color del pelo es: ");
        if(this.colorPelo== ColorPelo.NEGRO){
            System.out.print("negro");
        }else if(this.colorPelo==ColorPelo.RUBIO){
            System.out.print("rubio");
        }else if(this.colorPelo==ColorPelo.CASTANO){
            System.out.print("Castaño");
        }else if(this.colorPelo==ColorPelo.PELIRROJO){
            System.out.print("Pelirrojo");
        }
        
        System.out.print("El color de sus gafas es: ");
        if(this.colorGafas == ColorGafas.AZUL){
            System.out.print("Azul");
        }else if(this.colorGafas== ColorGafas.GRIS){
            System.out.print("Gris");
        }else if(this.colorGafas== ColorGafas.NEGRO){
            System.out.print("Negro");
        }else if(this.colorGafas==ColorGafas.ROJO){
            System.out.print("Rojo");
        }
        Iterator it=this.idiomas.iterator();
        if(!it.hasNext()){
            System.out.print("No habla idiomas");
        }else{
            System.out.print("Los idiomas que habla son: ");
            while(it.hasNext()){
                NivelIdioma nivelEsteIdioma=(NivelIdioma)it.next();
                Idiomas idioma = nivelEsteIdioma.getIdioma();
                int nivelEsteIdiomaValor = nivelEsteIdioma.getNivel();
                if(idioma== Idiomas.ALEMAN){
                    System.out.print("-"+"Aleman"+"-Nivel:" +nivelEsteIdiomaValor +".");
                }
                if(idioma== Idiomas.CASTELLANO){
                    System.out.print("-"+"Castellano"+"-Nivel:" +nivelEsteIdiomaValor +".");
                }
                if(idioma== Idiomas.CHINO){
                    System.out.print("-"+"Chino"+"-Nivel:" +nivelEsteIdiomaValor +".");
                }
                if(idioma== Idiomas.FRANCES){
                    System.out.print("-"+"Frances"+"-Nivel:" +nivelEsteIdiomaValor +".");
                }
                if(idioma== Idiomas.INGLES){
                    System.out.print("-"+"Ingles"+"-Nivel:" +nivelEsteIdiomaValor +".");
                }
                if(idioma== Idiomas.PORTUGUES){
                    System.out.print("-"+"Portugues"+"-Nivel:" +nivelEsteIdiomaValor +".");
                }
            }
        }
        it= this.alergias.iterator();
        if(!it.hasNext()){
            System.out.print("No tiene alergias");
        }else{
            System.out.print("La persona sufre las siguientes alergias:");
            while(it.hasNext()){
                Alergias estaAlergia= (Alergias)it.next();
                if(estaAlergia == Alergias.ACAROS){
                    System.out.print("-Alérgico a los ácaros del polvo");
                }else if (estaAlergia == Alergias.GRAMINEAS){
                    System.out.print("-Alérgico a las gramineas");
                }else if (estaAlergia == Alergias.LACTOSA){
                    System.out.print("-Intolerante a la lactosa");
                }else if (estaAlergia == Alergias.POLEN){
                    System.out.print("-Alérgico al polen");
                }
            }
        }
    }
    
    private int encontrarIdioma(Idiomas idioma){
        int i=0;
        boolean encontrado=false;
        Iterator it=this.idiomas.iterator();
        while(it.hasNext()&& !encontrado){
            NivelIdioma esteNivelIdioma= (NivelIdioma) it.next();
            Idiomas esteIdioma=esteNivelIdioma.getIdioma();
            if(esteIdioma== idioma){
                encontrado= true;
            }else{
                i++;
            }
        }
        if(!encontrado){
            i=-1;
        }
        return i;
    }
    private boolean encontrarAlergia(Alergias alergia){
        boolean encontrado=false;
        int n=1;
        Iterator it=this.alergias.iterator();
        while(it.hasNext()&& !encontrado){
            Alergias estaAlergia=(Alergias) it.next();
            if(estaAlergia == alergia){
                encontrado= true;
            }
        }
        return encontrado;
    }
}
