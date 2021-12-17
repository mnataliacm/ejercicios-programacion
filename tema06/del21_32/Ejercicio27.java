/**
 * Tema 6
 * Ejercicio 27
 * 
 * Juego piedra papel o tijera
 * Usuario introduce tirada y luego el ordenador genera al azar la suya.
 * Error si el usuario introduce una opción incorrecta
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

    //PROGRAMA
    System.out.println("PIEDRA PAPEL O TIJERA");
    System.out.println("Introduce tu jugada!!");
    System.out.println();
    //COMPROBAR DATOS
    do {
      System.out.print("Turno del jugador (piedra, papel o tijera): ");
      jugador = System.console().readLine();
      if ((jugador.equals("piedra") || (jugador.equals("papel") || (jugador.equals("tijera"))))) {
        jugadaValida = true;
      } else {
        System.out.println("Solo puedes introducir: piedra, papel o tijera");
        System.out.println("Intentalo de nuevo ...");
        jugadaValida = false;
      } 
    } while (!jugadaValida);

    switch (jugadaPc) {
      case 1:
        pc = "piedra";
        break;
      case 2:
        pc = "papel";
        break;
      case 3:
        pc = "tijera";
        break;
      default:
        break;
    }
    System.out.println("Turno del ordenador: " + pc);
    if (jugador.equals(pc)) {
      System.out.print("Empate");
    }
    if ((jugador.equals("papel")) && (pc.equals("piedra")) || (jugador.equals("piedra")) && (pc.equals("tijera")) || (jugador.equals("tijera")) && (pc.equals("papel"))) {
      System.out.print("Gana el jugador");
    }
    if ((pc.equals("papel")) && (jugador.equals("piedra")) || (pc.equals("piedra")) && (jugador.equals("tijera")) || (pc.equals("tijera")) && (jugador.equals("papel"))) {
      System.out.print("Gana el ordenador");
    }
    System.out.println();
  }
}

