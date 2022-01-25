package tema06.del21_32;
/**
 * Tema 6
 * Ejercicio 31
 * 
 * Juego "Craps"
 * Pedir apuesta.
 * Las reglas son: se tiran dos dados y:
 * si suman 7 u 11, dobla apuesta y fin partida.
 * si suman 2, 3 o 12, lo pierde todo y fin partida.
 * si saca 4, 5, 6, 8 o 9 el juego pasa a la segunda etapa.
 * Aquí el jugador debe sacar el mismo número. Si sale 7 pierde. Si sale otro
 * número sigue tirando. 
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio31 {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("                _____CRAPS_____");
    System.out.println("╭──────────────────────────────────────────────╮");
    System.out.println("│             *Reglas del juego*               │");
    System.out.println("├──────────────────────────────────────────────┤");
    System.out.println("│   Fase 1:                                    │");
    System.out.println("│    - Para doblar apuesta debes sacar 7 u 11  │");
    System.out.println("│    - Pierdes si sacas 2, 3 o 12              │");
    System.out.println("├──────────────────────────────────────────────┤");
    System.out.println("│   Fase 2:                                    │");
    System.out.println("│    - Para ganar debes sacar igual que fase 1 │");
    System.out.println("│    - Si sacas un 7 pierdes                   │");
    System.out.println("╰──────────────────────────────────────────────╯");
    System.out.println();
    System.out.println("                  ¡¡ SUERTE !!");
    System.out.println();
    // VARIABLES
    int apuesta = 0;
    int suma = 0;
    int suma2 = 0;
    int dado1 = 0;
    int dado2 = 0;
    // PEDIR DATOS
    System.out.print("¿Cuanto quieres apostar? ");
    apuesta = Integer.parseInt(System.console().readLine());
    // PROGRAMA
    dado1 = (int) (Math.random() * 6) + 1;
    dado2 = (int) (Math.random() * 6) + 1;
    suma = dado1 + dado2;
    System.out.println(" Dado1 = " + dado1 + "  Dado2 = " + dado2 + "  Suman = " + suma);
    switch (suma) {
      case 7:
      case 11:
        System.out.println("\nEnhorabuena! has doblado tu apuesta, te llevas: " + (apuesta * 2));
        break;
      case 2:
      case 3:
      case 12:
        System.out.println("\nLo siento, lo has perdido todo.");
        break;
      case 4:
      case 5:
      case 6:
      case 8:
      case 9:
      case 10:
        System.out.println("\nPasas a la segunda fase, gana sacando otro " + suma);
        do {
          dado1 = (int) (Math.random() * 6) + 1;
          dado2 = (int) (Math.random() * 6) + 1;
          suma2 = dado1 + dado2;
          System.out.println(" Dado1 = " + dado1 + "  Dado2 = " + dado2 + "  Suman = " + suma2);
        } while ((suma2 != 7) || (suma == suma2));
        
        break;
      default:
        break;
    }
    if (suma2 == 7) {
      System.out.println("\nLo siento, lo has perdido todo.");
    } else {
      System.out.println("\nEnhorabuena! has doblado tu apuesta, te llevas: " + (apuesta * 2));
    }
    System.out.println();
  }
}
