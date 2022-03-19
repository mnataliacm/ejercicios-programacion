package tema10.Ejercicio09;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Tema 10
 * Ejercicio 9
 * Mejora el programa anterior para que muestre las cartas ordenadas.
 * Primero por palo y luego por número.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio09 {
  public static void main(String[] args) {

    ArrayList<Cartas> c = new ArrayList<Cartas>();

    Cartas nuevaCarta = new Cartas();
    c.add(nuevaCarta);

    for (int i = 0; i < 9; i++) {
      do {
        nuevaCarta = new Cartas();
      } while (c.contains(nuevaCarta));

      c.add(nuevaCarta);
    }

    Collections.sort(c);
    
    for (Cartas carta : c) {
      System.out.println(carta);
    }
  }
}
