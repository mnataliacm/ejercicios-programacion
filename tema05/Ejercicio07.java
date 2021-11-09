/**
 * Tema 5
 * Ejercicio 7
 * Programa que realiza el control de acceso a una caja fuerte.
 * Pedir combinación de 4 cifras, "Lo siento combinación erronea" o "Se abrió satisfactoriamente"
 * Hay 4 oportunidades.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.println("___CAJA FUERTE___");
    System.out.println("Introduzca contraseña de 4 dígitos: ");
    int pass = Integer.parseInt(System.console().readLine());

    int conteo = 1;
    while (conteo != 4) {
      if (pass != 4567) {
        conteo++;
        System.out.println("Lo siento, contraseña erronea, intento: " + conteo + "/4");
        System.out.println("Introduzca contraseña de 4 dígitos: ");
        pass = Integer.parseInt(System.console().readLine());
      } else {
        System.out.println("La caja fuerte se abrió correctamente");
      }
    }
  }
}

