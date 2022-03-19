package tema10.Ejercicio08;

import java.util.ArrayList;

/**
 * Tema 10
 * Ejercicio 8
 * Programa que escoja al azar 10 cartas de la baraja española (10 objetos clase
 * Carta)
 * Usar objeto clase ArrayList para almacenar y que no se repitan.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio08 {
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
    for (Cartas carta : c) {
      System.out.println(carta);
    }
  }
}
