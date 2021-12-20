/**
 *
 * Tema 7
 * Ejercicio 14
 * 
 * Programa que pide 8 palabras y las almacena en array.
 * Los colores al principio y el resto al final.
 * Tantos arrays auxiliares como necesites.
 * Los colores: verde, rojo, azul, amarillo, naranja, rosa, negro, blanco y morado.
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    
    //VARIABLES
    String[] n = new String[8];
    String[] r = new String[8];
    String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
    int conteo = 0;
    
    //PROGRAMA
    System.out.println("Introduce 8 palabras entre ellas alguno de los siguientes colores");
    System.out.print("(");
    for (int i = 0; i < 9; i++) {
      System.out.print(colores[i] + " ");
    }
    System.out.print(")\n");
    System.out.println("Pulsa enter tras cada palabra ...");
    for (int i = 0; i < 8; i++) {
      n[i] = System.console().readLine();
      //comprobar si es color
      for (String c : colores) {
        if (n[i].equals(c)) {
          r[conteo] = c;
          conteo++;
        }//POR QUE NO PUEDO USAR EL ELSE en vez del siguiente for????
      }
    }
    for (int i = 0; i < 8; i++) {
      boolean colorSi = false;
      for (String c : colores) {
        if (n[i].equals(c)) {
        colorSi = true;
        } 
      }
      if (!colorSi) {
        r[conteo++] = n[i];
      }
    }
    //MUESTRO ARRAY ORIGINAL
    System.out.println("\n");
    System.out.println("Array original:");
    System.out.println("\n┌───────────┬───────────┬───────────┬───────────┬──────────┬───────────┬───────────┬───────────┐");
    System.out.print("│");
    for (int i = 0; i < 8; i++) { 
      System.out.printf("%11d│", i);
    }
    System.out.println("\n├───────────┼───────────┼───────────┼───────────┼──────────┼───────────┼───────────┼───────────┤");
    System.out.print("│");
    for (int i = 0; i < 8; i++) {
      System.out.printf("  %-10s│", n[i]);
    }
    System.out.println("\n└───────────┴───────────┴───────────┴───────────┴──────────┴───────────┴───────────┴───────────┘");
    System.out.println();
    //MUESTRO ARRAY RESULTADO
    System.out.println("\n");
    System.out.println("Array resultado:");
    System.out.println("\n┌───────────┬───────────┬───────────┬───────────┬──────────┬───────────┬───────────┬───────────┐");
    System.out.print("│");
    for (int i = 0; i < 8; i++) { 
      System.out.printf("%11d│", i);
    }
    System.out.println("\n├───────────┼───────────┼───────────┼───────────┼──────────┼───────────┼───────────┼───────────┤");
    System.out.print("│");
    for (int i = 0; i < 8; i++) {
      System.out.printf("  %-9s│", r[i]);
    }
    System.out.println("\n└───────────┴───────────┴───────────┴───────────┴──────────┴───────────┴───────────┴───────────┘");
    System.out.println(); 
  } 
}
