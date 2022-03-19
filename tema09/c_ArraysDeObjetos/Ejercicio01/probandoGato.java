package tema09.c_ArraysDeObjetos.Ejercicio01;

import java.util.Scanner;

/**
 * Tema 9
 * Ejercicio 1
 * 
 * Crea la clase Gato para que incluya un array de cuatro gatos e introduce llos datos de cada uno de ellos mediante un bucle. Muestra los datos con otro bucle
 * 
 * @author Natalia Castillo Muñoz
 */
public class probandoGato {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in); 
    Gato[] cat = new Gato[4];
    String nombreG, colorG;
    
    //pedir los datos
    System.out.println("Introduce los datos de los 4 gatos:");
    for (int i = 0; i < cat.length; i++) {
      cat[i] = new Gato();
      System.out.println("Gato número " + (i + 1));
      System.out.print("Nombre: ");
      nombreG = s.nextLine();
      (cat[i]).setNombre(nombreG);
      System.out.print("Color: ");
      colorG = s.nextLine();
      (cat[i]).setColor(colorG);
    }

    //imprimir los datos
    for (int i = 0; i < cat.length; i++) {
      System.out.println("-----------------");
      System.out.println("  Gato " + (i + 1));
      System.out.println("  Nombre: " + cat[i].getNombre());
      System.out.println("  Color:  " + cat[i].getColor());
    }
    System.out.println("-----------------");
    s.close();
  }
}
