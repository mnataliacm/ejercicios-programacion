package tema10;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Tema 10
 * Ejercicio 10
 * Diccionario español-inglés. que contenga al menos 20 palabras.
 * Utiliza un objeto de la clase hashmap para almacenar las parejas de palabras
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio10 {
  public static void main(String[] args) {

    HashMap<String, String> diccionario = new HashMap<String, String>();
    Scanner s = new Scanner(System.in);
    String traduce;

    diccionario.put("españa", "spain");
    diccionario.put("desarrollar", "develop");
    diccionario.put("programar", "program");
    diccionario.put("español", "spanish");
    diccionario.put("sistema", "system");
    diccionario.put("aplicación", "application");
    diccionario.put("entornos", "environments");
    diccionario.put("base de datos", "database");
    diccionario.put("consulta", "query");
    diccionario.put("iteración", "iteration");
    diccionario.put("bucle", "loop");
    diccionario.put("estructura", "framework");
    diccionario.put("rojo", "red");
    diccionario.put("verde", "green");
    diccionario.put("azul", "blue");
    diccionario.put("blanco", "white");
    diccionario.put("negro", "black");
    diccionario.put("ayuda", "help");
    diccionario.put("hola", "hello");
    diccionario.put("adios", "good bye");

    System.out.println("DICCIONARIO ESPAÑOL/INGLÉS");
    System.out.println("Pulsa enter para salir o escribe una palabra en español:");
    do {
      System.out.print("Que palabra quieres traducir: ");
      traduce = s.nextLine();
      if (traduce.equals("")) {

      }
      if (!diccionario.containsKey(traduce)) {
        System.out.println("Esa palabra no está en el diccionario, pruebe con otra");
      } else {
        System.out.println(traduce + " traducida " + diccionario.get(traduce));
      }
    } while (!traduce.equals(""));
    s.close();
  }
}
