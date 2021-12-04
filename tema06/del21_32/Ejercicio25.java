/**
 * Tema 6
 * Ejercicio 25
 * 
 * Programa que muestra por pantalla 100 números enteros separados por espacios
 * Generados aleatoriamente en el rango 10 - 200 ambos incluidos
 * Los primos debe aparecer entre # #
 * Los múltiplos de 5 entre [ ]
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio25 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra 100 números___");
    //genero 100 números
    for (int i = 0; i < 100; i++) {
      int numero = (int)(Math.random() * 200) + 10;
      //compruebo primo
      boolean primo = true;
      for (int n = 2; n < numero; n++) {
        if (numero % n == 0){
         primo = false;
        } 
      }
      if (primo){
        System.out.print("#" + numero + "# ");
      } else if (numero % 5 == 0) {
        System.out.print("[" + numero + "] ");
      } else {
        System.out.print(numero + " ");
      }
    }
    System.out.println();
  }
}

