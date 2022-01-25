package tema05.del21_30;
/**
 * Tema 5
 * Ejercicio 26
 * Programa que pide un número de varios dígitos. Luego pide un dígito.
 * Calcular la posicion o posiciones contando de izq a dere
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio26 {
  public static void main(String[] args) {

    System.out.println("___Programa que calcula la posición de un dígito___");
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un dígito: ");
    int digito = Integer.parseInt(System.console().readLine());
    //variables
    int num = numero;
    int cortar = 1;
    //Contar dígitos
    while (num != 0) {
      num = num / 10;
      cortar *= 10;
    }
    System.out.print("El dígito " + digito + " está en la/s posición/es: ");
    //comprobar digitos
    cortar = cortar / 10;
    num = numero / cortar;
    int posicion = 1;
    if (num == digito) {
      System.out.print(posicion + ", ");
    }
    while (cortar >= 10) {
      posicion++; 
      cortar = cortar / 10;
      num = (numero / cortar) % 10;
      if (num == digito) {
        System.out.print(posicion + ", ");
      }
    }
    System.out.println();
  }
}

