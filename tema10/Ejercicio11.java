import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Tema 10
 * Ejercicio 11
 * Diccionario español-inglés. que contenga al menos 20 palabras.
 * Utiliza un objeto de la clase hashmap para almacenar las parejas de palabras
 * 
 * Cambiado de manera que elige 5 palabras en español al azar
 * Pedirá la traducción al usuario y luego mostrará resultados.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio11 {
  public static void main(String[] args) {

    HashMap<String, String> diccionario = new HashMap<String, String>();
    Scanner s = new Scanner(System.in);

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

    String[] p = diccionario.keySet().toArray(new String[0]);
    int num;

    ArrayList<Integer> n = new ArrayList<Integer>();
    n.add((int) (Math.random() * 20));
    for (int j = 0; j < 4; j++) {
      do {
        num = (int) (Math.random() * 20);
      } while (n.contains(num));
      n.add(num);
    }

    int aciertos = 0;
    int errores = 0;
    String palabra = "";
    String respuesta = "";
    System.out.println("TRADUCIR DE ESPAÑOL A INGLÉS");
    System.out.println("Pulsa enter para salir");
    for (int j = 0; j < 5; j++) {
      palabra = p[n.get(j)];
      System.out.println("Cuál sería la traduccion de : " + palabra);
      respuesta = s.nextLine();
      if (!diccionario.get(palabra).equals(respuesta)) {
        System.out.println("Traducción erronea.");
        System.out.println(palabra + " en inglés es " + diccionario.get(palabra));
        errores++;
      } else {
        System.out.println("Traducción correcta");
        aciertos++;
      }
    }
    System.out.println("Test terminado, tus resultados son: ");
    System.out.println("Aciertos: " + aciertos);
    System.out.println("Errores:  " + errores);
    if (aciertos > errores){
      System.out.println("ENHORABUENA!");
    } else {
      System.out.println("Lo siento pero necesitas repasar inglés!");
    }
    System.out.println();
  }
}
