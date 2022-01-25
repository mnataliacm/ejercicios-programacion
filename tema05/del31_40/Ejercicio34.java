package tema05.del31_40;
/**
 * Tema 5
 * Ejercicio 34
 * Programa que pide dos números y los mezcla devolviendo dos numero diferentes uno con los pares y otro los impares (en orden)
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio34 {
  public static void main(String[] args) {

    System.out.println("___Programa que separa pares e impares___");
    System.out.print("Introduce el primer número: ");
    long numero1 = Long.parseLong(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    long numero2 = Long.parseLong(System.console().readLine());
    //variables
    long num1 = numero1;
    long num2 = numero2;
    long cortar1 = 1;
    long cortar2 = 1;
    long cortar11 = 1;
    long cortar22 = 1;
    //Contar dígitos num1
    while (num1 != 0) {
      num1 = num1 / 10;
      cortar1 *= 10;
    }
    //Contar dígitos num2
    while (num2 != 0) {
      num2 = num2 / 10;
      cortar2 *= 10;
    }
    //comprobar digitos pares
    System.out.println();
    System.out.print("Dígitos pares forman número: ");
    //comprobar primer dígito de numero1 es par
    cortar11 = cortar1 / 10;
    num1 = numero1 / cortar11;
    if (num1 % 2 == 0) {
      System.out.print(num1);
    }
    //comprobar primer dígito de numero2 es par
    cortar22 = cortar2 / 10;
    num2 = numero2 / cortar22;
    if (num2 % 2 == 0) {
      System.out.print(num2);
    }
    //comprobar resto dígitos pares de numero1 y numero2
    while ((cortar11 >= 10) ||  (cortar22 >= 10)) {
      cortar11 = cortar11 / 10;
      num1 = (numero1 / cortar11) % 10;
      if (num1 % 2 == 0) {
        System.out.print(num1);
      }
      cortar22 = cortar22 / 10;
      num2 = (numero2 / cortar22) % 10;
      if (num2 % 2 == 0) {
        System.out.print(num2);
      }
    }
    //comprobar digitos impares
    System.out.println();
    System.out.print("Dígitos impares forman número: ");
    //comprobar primer dígito de numero1 es impar
    cortar11 = cortar1 / 10;
    num1 = numero1 / cortar11;
    if (num1 % 2 != 0) {
      System.out.print(num1);
    }
    //comprobar primer dígito de numero2 es impar
    cortar22 = cortar2 / 10;
    num2 = numero2 / cortar22;
    if (num2 % 2 != 0) {
      System.out.print(num2);
    }
    //comprobar resto dígitos impares de numero1 y numero2
    while ((cortar11 >= 10) ||  (cortar22 >= 10)){
      cortar11 = cortar11 / 10;
      num1 = (numero1 / cortar11) % 10;
      if (num1 % 2 != 0) {
        System.out.print(num1);
      }
      cortar22 = cortar22 / 10;
      num2 = (numero2 / cortar22) % 10;
      if (num2 % 2 != 0) {
        System.out.print(num2);
      }
    }
    System.out.println();
  }
}

