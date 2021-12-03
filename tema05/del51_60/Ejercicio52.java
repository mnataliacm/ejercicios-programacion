/**
 * Tema 5
 * Ejercicio 52
 * Programa que desplaza todos los dígitos de un número de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a dar la vuelta y se colocaría a la derecha. Si tiene 1 dígito se queda igual.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio52 {
  public static void main(String[] args) {

    System.out.println("___Programa que desplaza primer dígito a la derecha___");
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
      numero1 = num / dividir;
      numero2 = numero - (numero1 * dividir);
      System.out.println("El número resultado es " + numero2 + numero1);
    }
  }
}

