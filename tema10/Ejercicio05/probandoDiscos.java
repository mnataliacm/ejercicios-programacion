package Ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Tema 10
 * Ejercicio05
 *  
 * @author Natalia Castillo Muñoz
 */
public class probandoDiscos {
  public static void main(String[] args) {

    ArrayList<Disco> discos = new ArrayList<Disco>();
    Scanner s = new Scanner(System.in);
    int opcion;
    int conteo = 6;

    discos.add(new Disco(1, "Led Zeppelin"));
    discos.add(new Disco(2, "Cat Stevens"));
    discos.add(new Disco(3, "Extremoduro"));
    discos.add(new Disco(4, "Mecano"));
    discos.add(new Disco(5, "Metallica"));

    System.out.println(discos);
    Collections.sort(discos);
    System.out.println(discos);

    System.out.println("Discografía");
    System.out.println("***********");
    System.out.println("1. Mostrar listado de discos");
    System.out.println("2. Ordenar discos por nombre");
    System.out.println("3. Añadir un disco");
    System.out.println("4. Eliminar un disco");
    System.out.println("5. Salir");

    do {
      System.out.println("Elije una opción:");
      opcion = Integer.parseInt(s.nextLine());
      switch (opcion) {
        case 1:
          System.out.println(get(discos));
          break;
        case 2:
          Collections.sort(discos);
          System.out.println(discos);
          break;
        case 3:
          System.out.println("Introduce el nombre del disco nuevo: ");
          String nuevo = s.nextLine();
          discos.add(new Disco(conteo, nuevo));
          break;
        case 4:
          
          break;
        case 5:
          System.out.println();
          break;
        default:
          break;
      }

    } while (opcion != 5);
    System.out.println("Hay: " + conteo + " discos");
    System.out.println(discos);
    s.close();
  }

  private static char[] get(ArrayList<Disco> discos) {
    return null;
  }
}
