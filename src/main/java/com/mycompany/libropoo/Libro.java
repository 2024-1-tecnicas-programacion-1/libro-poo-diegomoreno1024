package com.mycompany.libropoo;

import java.time.LocalDate;

public class Libro {
        
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean leido=false ;
    private String genero;
    //Este constructor tiene una complejidad constante, O(1).
    public Libro(String titulo,String autor,int anioPublicacion,String genero){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
        this.genero=genero;
    }
    //La complejidad de este método es constante, O(1).
    public String mostrarInformacion(){
        return "Título: "+this.titulo+",Autor: "+this.autor+",Año de publicación: "+this.anioPublicacion+",Género: "+this.genero;
    }
    //La complejidad de este método es constante, O(1).
    public void marcarLeido(){
        this.leido=true;
    }
    //La complejidad de este método es constante, O(1).
    public String getLeido(){
        if(this.leido==true){
            return "El libro fue leido.";
        }else
            return "El libro no fue leido";
    }
    //La complejidad de este método es constante, O(1).
    public boolean esAntiguo(){
        int anioActual=LocalDate.now().getYear();
        if(this.anioPublicacion>=0){
            if(anioActual-this.anioPublicacion>50){
                return true;
            }else if(this.anioPublicacion-anioActual<50){
                return false;
            }
        }else if(this.anioPublicacion<0){
            return true;
        }
        return false;
    }
}
