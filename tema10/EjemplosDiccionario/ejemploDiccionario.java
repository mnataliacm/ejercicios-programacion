package tema10.EjemplosDiccionario;

import java.util.HashMap;
import java.util.Scanner;

public class ejemploDiccionario {
  public static void main(String[] args) {
    HashMap<String, String> asignaturas = new HashMap<String, String>();
    Scanner s = new Scanner(System.in);
    String codigoIntroducido, asignaturaNueva;

    asignaturas.put("PRO", "Programación");
    asignaturas.put("LM", "Lenguajes de Marcas");
    asignaturas.put("BBDD", "Bases de Datos");
    asignaturas.put("ED", "Entornos de Desarrollo");
    asignaturas.put("FOL", "Formación y Orientación Laboral");

    do {
      System.out.print("\nIntroduzca el código de la asignatura (Escribe 0 para salir): ");
      codigoIntroducido = s.nextLine().toUpperCase();
      if (!codigoIntroducido.equals("0")) {
        if (!asignaturas.containsKey(codigoIntroducido)) {
          System.out.println("Esa asignatura no está registrada.");
          System.out.print("¿Quieres registrarla? ");
          String respuesta = s.nextLine().toUpperCase();
          if (respuesta.equals("SI")) {
            System.out.print("Introduce el nombre de la asignatura: ");
            asignaturaNueva = s.nextLine();
            asignaturas.put(codigoIntroducido, asignaturaNueva);
          }
        } else {
          System.out.print("Al código " + codigoIntroducido);
          System.out.print(" le corresponde la asignatura ");
          System.out.print(asignaturas.get(codigoIntroducido) + ".\n");
        }
      }
    } while (!codigoIntroducido.equals("0"));
    s.close();
  }
}
