/**
 * Tema 5
 * Ejercicio 55
 * Programa que desplaza todos los dígitos de un número de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a dar la vuelta y se colocaría a la izquierda. Si tiene 1 dígito se queda igual.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio55 {
  public static void main(String[] args) {

    System.out.println("___Programa que desplaza último dígito a la izquierda");
    System.out.print("Introduce un número: ");
    long numero = Long.parseLong(System.console().readLine());
    //variables
    int conteo = 0;
    long num = numero;
    long dividir = 0;
    long numero1 = 0;
    long numero2 = 0;
    //contar dígitos
    while (num > 0) {
      num /= 10;
      conteo++;
    }
    num = numero;
    System.out.println();
    if (num / 10 == 0) {
      System.out.println("Un dígito no se puede mover");
    } else {
      conteo--;
      dividir = (long)(Math.pow(10, conteo));
      numero1 = num % 10;
      numero2 = numero / 10;
      System.out.println("El número resultado es " + numero1 + numero2);
    }
  }
}

