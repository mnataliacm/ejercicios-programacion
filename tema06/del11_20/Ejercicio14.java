/**
 * Tema 6
 * Ejercicio 14
 * Programa que hace lo contrario al ejercicio 6, el programa adivinará un número que pensemos entre 0 y 100, tiene 5 oportunidades. Cada fallo debe preguntar si es mayor o menor.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio14 {
  public static void main(String[] args) {

    System.out.println("___Programa que intenta adivinar el número que pienses___");
    System.out.println();
    int numero = 0;
    int conteo = 1;
    boolean acierto = false;
    do { 
        numero = (int)(Math.random() * 101);
        System.out.println("¿el número que has pensado es: " + numero + " ?");
        String respuesta = System.console().readLine().toLowerCase();
        if (respuesta.equals("si")) {
          acierto = true;
          conteo = 6;
        } else {
          System.out.println("He gastado " + conteo + " de 5 intentos");
          System.out.println("¿el número es mayor o menor que " + numero + " ?");
          respuesta = System.console().readLine().toLowerCase();
          conteo++;

          if (respuesta.equals("mayor")) {
            numero = (int)(Math.random() * 101 + numero);
          } else {
            numero = (int)(Math.random() * numero);
          }
        }
    } while (conteo <= 5);
    if (acierto) {
      System.out.println("Bien!, he acertado tu número.");
    } else {
        System.out.println("Lo siento, no he podido acertar.");

    }
  }
}

