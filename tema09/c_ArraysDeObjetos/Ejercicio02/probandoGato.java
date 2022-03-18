package c_ArraysDeObjetos.Ejercicio02;

import java.util.Scanner;

/**
 * Tema 9
 * Ejercicio 2
 * 
 * Modifica el ejercicio anterior para que los datos se introduzcan directamente. 
 * Muestra los datos con un bucle
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class probandoGato {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in); 
    Gato[] cat = new Gato[4];
        
    //datos
    cat[0] = new Gato ("Lala", "blanco");
    cat[1] = new Gato ("Lolo", "canela");
    cat[2] = new Gato ("Bolita", "tricolor");
    cat[3] = new Gato ("Luna", "negro");
    
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
