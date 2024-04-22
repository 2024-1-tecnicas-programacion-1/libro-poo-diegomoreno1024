package com.mycompany.libropoo;

import java.util.Scanner;
import java.time.LocalDate;

public class Principal {
    
     public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
         
         System.out.println("Ingrese el título del libro");
         String titulo=leer.nextLine();
         System.out.println("Ingrese el autor del libro");
         String autor=leer.nextLine();
         System.out.println("Ingrese el género del libro");
         String genero= leer.nextLine();
         System.out.println("Ingrese el año de publicación del libro");
         int anioPublicacion=leer.nextInt();
         if(anioPublicacion>LocalDate.now().getYear()){
             System.out.println("Año invalido");
         }else{         
             Libro libroIngresado = new Libro(titulo,autor,anioPublicacion,genero);
             libroIngresado.marcarLeido();
             System.out.println(libroIngresado.mostrarInformacion());
             System.out.println(libroIngresado.getLeido());
             if(libroIngresado.esAntiguo()==true){
                 System.out.println("El libro es antiguo.");
             }else
                 System.out.println("El libro no es antiguo.");
            }
    }
}


