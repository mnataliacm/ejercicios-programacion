package tema05.del21_30;
/**
 * Tema 5
 * Ejercicio 24
 * Programa que lea un numero "n" e imprima una pirámide de números con "n" filas
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio24 {
  public static void main(String[] args) {

    System.out.println("___Programa que imprime pirámide de números___");
    System.out.print("Introduce un número: ");
    int altura = Integer.parseInt(System.console().readLine());

    System.out.println();
    
    for (int linea = 0; linea <= altura; linea++) {
      //espacios izquierda, dan forma
      for (int espacio = 0; espacio <= altura - linea; espacio++) { 
        System.out.print(" ");
      }
      //pirámide    
        for (int dibujo = 1; dibujo <= linea; dibujo++) {         
            System.out.print(dibujo);
        }
        for (int dibujo = linea - 1; dibujo >= 1; dibujo--) {
            System.out.print(dibujo);
        }
      System.out.println();
    }
  }
}
