import java.util.HashMap;
import java.util.Scanner;
/**
 * Tema 10
 * Ejercicio 6
 * Control de acceso a zona restringida. Pedir usuario y contraseña.
 * Máximo de 3 intentos para la contraseña. Nombres almacenados usando clase HashMap
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    HashMap<String, String> usuarios = new HashMap<String, String>();
    Scanner s = new Scanner(System.in);
    String nombre, contrasena;
    int conteo = 3;

    usuarios.put("Juan", "jjjjj");
    usuarios.put("María", "12345");
    usuarios.put("Lucía", "12345");

    do {
      System.out.print("Introduce el nombre de usuario: ");
      nombre = s.nextLine();
      if (!usuarios.containsKey(nombre)) {
        System.out.println("Usuario no registrado, intentelo de nuevo.");
      } else {
        System.out.print("Introduce la contraseña: ");
        contrasena = s.nextLine();
        if (usuarios.get(nombre).equals(contrasena)) {
          System.out.println("Ha accedido a la zona restringida");
          conteo = 0;
          break;
        } else {
          conteo--;
          System.out.println("Error, los datos introducidos no son correctos, te quedan " + conteo + " intentos.");
        }
      }
    } while (conteo > 0);
    System.out.println("\nLo siento, no tiene acceso al área restringida");
  }
}
