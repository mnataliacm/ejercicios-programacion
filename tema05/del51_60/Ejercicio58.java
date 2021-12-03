import javax.xml.transform.stream.StreamSource;

/**
 * Tema 5
 * Ejercicio 58
 * Programa que calcula la media de los dígitos del número entero introducido por teclado.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio58 {
  public static void main(String[] args) {

    System.out.println("___Programa que calcula la media de los dígitos introducidos___");
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    //variables
    Boolean aparece;
    int num = numero;
    double sumar = 0;
    int conteo = 0;
    int i = 0;
    //comprobar y suma digitos aparecen
    for (i = 0; i < 10; i++) {
      aparece = false;
      num = numero;
      while (num > 0) {
        if (num % 10 == i) {
          aparece = true;
          conteo++;
        }
        num /= 10;
      }
      if (aparece) {
        sumar += i;
      }
    }
    System.out.println("La media de los dígitos es: " + sumar / conteo);
  }
}

