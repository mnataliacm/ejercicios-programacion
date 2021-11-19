/**
 * Tema 6
 * Ejercicio 6
 * Programa "Adivina el número"
 * Entre 0 y 100, 5 oportunidades
 * Indicar cuantas quedan y si el numero es mayor o menor que el secreto.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.println("___Adivina el número secreto (0-100)___");
    System.out.print("Adivina el número secreto: ");
    int numero = Integer.parseInt(System.console().readLine());
    int secreto = (int)(Math.random() * 101);
    for (int i = 4; i >= 0; i++) {
      if (numero == secreto) {
        System.out.println("Enhorabuena!, has acertado.");
      }
      while (numero != secreto) {
        if (numero > secreto) {
          System.out.println("El número secreto es menor, te quedan " + i + " intentos.");
          System.out.print("Adivina el número secreto: ");
          numero = Integer.parseInt(System.console().readLine());
        } else {
          System.out.println("El número secreto es mayor, te quedan " + i + " intentos.");
          System.out.print("Adivina el número secreto: ");
          numero = Integer.parseInt(System.console().readLine());
        }
        
      }
    }
    
    
    System.out.println();
  }
}

