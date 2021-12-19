/**
 * Tema 6
 * Ejercicio 27
 * 
 * Juego piedra papel o tijera
 * Usuario introduce tirada y luego el ordenador genera al azar la suya.
 * Error si el usuario introduce una opción incorrecta
 * 🪨 📄 🗡️
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio27 {
  public static void main(String[] args) {

    //VARIABLES
    int jugadaPc = (int)(Math.random() * 3) + 1;
    boolean jugadaValida = false;
    String jugador = "";
    String pc = "";
    String yo = "";
    String jugada = "";

    //PROGRAMA
    System.out.println("PIEDRA PAPEL O TIJERA");
    System.out.println("Introduce tu jugada!!");
    System.out.println();
    //COMPROBAR DATOS
    do {
      System.out.print("Turno del jugador (piedra, papel o tijera): ");
      jugador = System.console().readLine().toLowerCase();
      if ((jugador.equals("piedra") || (jugador.equals("papel") || (jugador.equals("tijera"))))) {
        jugadaValida = true;
      } else {
        System.out.println("Solo puedes introducir: piedra, papel o tijera");
        System.out.println("Intentalo de nuevo ...");
        jugadaValida = false;
      } 
    } while (!jugadaValida);
    switch (jugador) {
      case "piedra":
        yo = "🪨 ";
        break;
      case "papel":
        yo = "📄";
        break;
      case "tijera":
        yo = "🗡️ ";
        break;
      default:
        break;
    }
    switch (jugadaPc) {
      case 1:
        pc = "🪨 ";
        jugada = "piedra";
        break;
      case 2:
        pc = "📄";
        jugada = "papel";
        break;
      case 3:
        pc = "🗡️ ";
        jugada = "tijera";
        break;
      default:
        break;
    }
    //System.out.println("Turno del ordenador: " + pc);
    
    System.out.println();
    System.out.println("   YO     PC");
    System.out.println(" ╔════╗ ╔════╗ ");
    System.out.printf(" ║ %s ║ ║ %s ║\n", yo, pc);
    System.out.println(" ╚════╝ ╚════╝");

    if (jugador.equals(jugada)) {
      System.out.print("    Empate   ");
    }
    if ((jugador.equals("papel")) && (jugada.equals("piedra")) || (jugador.equals("piedra")) && (jugada.equals("tijera ")) || (jugador.equals("tijera")) && (jugada.equals("papel"))) {
      System.out.print("Gana el jugador");
    }
    if ((jugada.equals("papel")) && (jugador.equals("piedra")) || (jugada.equals("piedra")) && (jugador.equals("tijera")) || (jugada.equals("tijera")) && (jugador.equals("papel"))) {
      System.out.print("Gana el ordenador");
    }
    System.out.println();
  }
}
