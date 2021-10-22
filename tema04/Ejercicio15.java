/**
 * Tema 4
 * Ejercicio 15
 * Programa que pinte una piramide rellena con un caracter dado por teclado.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.println("___Programa que dibuja una piramide___");
    System.out.print("Introduce una letra, número o símbolo: ");
    String x = System.console().readLine();
    
    System.out.println("------------------------------------------------");
    System.out.println("Elije hacia donde quieres que apunte el vértice:");
    System.out.println("------------------------------------------------");
    System.out.println("   1. Hacia arriba");
    System.out.println("   2. Hacia abajo");
    System.out.println("   3. Hacia la izquierda");
    System.out.println("   4. Hacia la derecha");
    System.out.println("------------------------------------------------");
    System.out.print(" Elije una opción (1-4): ");
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.println("\n         "+x);
        System.out.println("        "+x+x+x);
        System.out.println("       "+x+x+x+x+x);
        System.out.println("      "+x+x+x+x+x+x+x);
        System.out.println("     "+x+x+x+x+x+x+x+x+x);
        break;
      
      case 2:
        System.out.println("\n     "+x+x+x+x+x+x+x+x+x);
        System.out.println("      "+x+x+x+x+x+x+x);
        System.out.println("       "+x+x+x+x+x);
        System.out.println("        "+x+x+x);
        System.out.println("         "+x);
        break;
      
      case 3:
        System.out.println("\n             "+x);
        System.out.println("           "+x+x+x);
        System.out.println("         "+x+x+x+x+x);
        System.out.println("      "+x+x+x+x+x+x+x+x);
        System.out.println("         "+x+x+x+x+x);
        System.out.println("           "+x+x+x);
        System.out.println("             "+x);
        break;
      
      case 4:
        System.out.println("\n     "+x);
        System.out.println("     "+x+x+x);
        System.out.println("     "+x+x+x+x+x);
        System.out.println("     "+x+x+x+x+x+x+x+x);
        System.out.println("     "+x+x+x+x+x);
        System.out.println("     "+x+x+x);
        System.out.println("     "+x);
        break;
    }

  }
}
