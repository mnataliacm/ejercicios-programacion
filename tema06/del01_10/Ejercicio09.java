/**
 * Tema 5
 * Ejercicio 9
 * Programa que genera números aleatorios pares entre 0 y 100.
 * No para hasta que saque el 24. Decir total de números generados.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio09 {
  public static void main(String[] args) {

    System.out.println("___Programa que genera números pares entre 0 y 100___");
    int conteo = 0;
    int numero = 0;
    System.out.println();
    do { 
        numero = (int)(Math.random() * 101);
        conteo++;
        if (numero % 2 == 0) {
          System.out.print(numero + " ");
          
        }
    } while (numero != 24);

    System.out.printf("\nEn total se han generado:%d números\n", conteo);
  }
}

