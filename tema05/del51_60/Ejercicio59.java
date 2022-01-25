package tema05.del51_60;
/**
 * 
 * Programa que pinta un arbol de navidad con adornos
 * Pedir altura, en ella va incluida la estrella y el tronco
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio59 {
  public static void main(String[] args) {

    System.out.println("___Árbol de Navidad___");
    //🌟, 🔔, 🎁, 🧦, 

    System.out.print("Introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    //variables
    int linea = 0;
    int espacio = altura;
    String caracter = "\033[32m^\033[39;49m";
    //espacios
    System.out.println();
    for (espacio = 0; espacio <= altura - 1; espacio++) {
      System.out.print(" ");
    }
    //estrella
    System.out.println("\033[93m✭\033[39;49m");
    //espacios
    for (espacio = 0; espacio <= altura - 1; espacio++) {
      System.out.print(" ");
    }
    //pico arbol
    System.out.print(caracter);
    //cuerpo arbol
    for (linea = 1; linea <= altura; linea++) {
      System.out.println();
      for (espacio = 1; espacio <= altura - linea; espacio++) { 
        System.out.print(" ");
      }
      System.out.print(caracter);
      for (int hueco = 1; hueco <= (linea * 2) - 1; hueco++) { 
        System.out.print(" ");
      }
      System.out.print(caracter);
    }
    System.out.println();
    //base arbol
    for (int dibujo = 2; dibujo <= (linea * 2); dibujo++) {
      System.out.print(caracter);
    }
    System.out.println();
    //tronco arbol
    for (int dibujo = 0; dibujo <= (linea - 3); dibujo++) {
      System.out.print(" ");
    }
    System.out.print("\033[33mYYY\033[39;49m");
    System.out.println();
  }
}

