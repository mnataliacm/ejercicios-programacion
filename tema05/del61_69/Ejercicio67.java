/**
 * Tema 5
 * Ejercicio 67
 * Programa que pinta una escalera que va descendiendo de izquierda a derecha.
 * Pedir número de escalones y altura de los mismos.
 * El ancho es siempre 4 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio67 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta una escalera___");
    System.out.print("Introduce el número de escalones: ");
    int escalon = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la altura de cada escalón: ");
    int altura = Integer.parseInt(System.console().readLine());
    //variables
    String caracter = "****";
    //pintar escalera
    for (int i = 1; i <= escalon; i++) {
      for (int j = 1; j <= altura; j++) {
        for (int k = 0; k < i; k++) {
          System.out.print(caracter);
        }
        System.out.println(); 
      }
    }
  }
}

