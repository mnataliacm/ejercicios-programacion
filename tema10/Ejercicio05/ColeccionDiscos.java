package tema10.Ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * Tema 10
 * Ejercicio05
 * Realiza de nuevo la coleccion de discos pero con ArrayList
 * 
 * @author Natalia Castillo Muñoz
 */
public class ColeccionDiscos {
  public static void main(String[] args) {
    ArrayList<Disco> c = new ArrayList<Disco>();

    Scanner s = new Scanner(System.in);
    String autorD, tituloD, generoD, duracionD;
    int ID, opcion, conteo;

    c.add(new Disco(1, "Extremoduro", "Ley Innata", "Rock", "46.15"));
    c.add(new Disco(2, "Mecano", "Aidalai", "Pop", "58.45"));
    c.add(new Disco(3, "Frank T", "Frankattack", "Hip-Hop", "60,55"));
    c.add(new Disco(4, "Björk", "Vespertine", "Alternativa", "75,33"));
    c.add(new Disco(5, "The Doors", "L.A. Woman", "Rock", "48,25"));
    
    do {
      System.out.println("       Discografía         ");
      System.out.println("***************************");
      System.out.println("1. Ver lista de discos");
      System.out.println("2. Ordenar discos por Autor");
      System.out.println("3. Añadir un disco");
      System.out.println("4. Eliminar un disco");
      System.out.println("5. Salir");
      System.out.println("***************************");
      System.out.print(" Elije una opción:  ");
      opcion = s.nextInt();
      conteo = c.size();
      switch (opcion) {
        case 1:  
          System.out.println("Hay " + conteo + " discos en la colección.");
          System.out.println(c);
          break;
        case 2:
          ArrayList discosOrdenados = (ArrayList) c.clone();
          Collections.sort(discosOrdenados);
          System.out.println(discosOrdenados);
          break;
        case 3:
          System.out.println("Datos del nuevo disco");
          System.out.println("Introduce los valores separador por un espacio: ");
          System.out.println("Autor Título Género Duración");
          ID = conteo + 1;
          autorD = s.next();
          tituloD = s.next();
          generoD = s.next();
          duracionD = s.next();
          c.add(new Disco(ID, autorD, tituloD, generoD, duracionD));
          break;
        case 4:
          System.out.print("Introduce la ID del disco a borrar: ");
          int borrar = s.nextInt() - 1;
          c.remove(borrar);
          break;
        case 5:
          System.out.println();
          break;
        default:
          break;
      }
    } while (opcion != 5);
    s.close();
  }
}