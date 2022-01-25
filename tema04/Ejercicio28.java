package tema04;
/**
 * Tema 4 
 * Ejercicio 28
 * Programa que implementa el juego piedra papel o tijera.
 * 2 usuarios introducen su entrada, si la opcion es incorrecta debe dar mensaje de error.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio28 {
  public static void main(String[] args) {

    String jugador1, jugador2;
    String resultado = "";

    System.out.println("___PIEDRA, PAPEL O TIJERA___");
    System.out.print("Turno del jugador 1 (piedra, papel o tijera): ");
    jugador1 = System.console().readLine().toLowerCase();
    System.out.print("Turno del jugador 2 (piedra, papel o tijera): ");
    jugador2 = System.console().readLine().toLowerCase();
    
    if (jugador1.equals(jugador2)) {
      resultado = "Empate";
    } else if ((jugador1.equals("papel")) && (jugador2.equals("tijera"))) {
      resultado = "Gana jugador 2";
    } else if ((jugador1.equals("papel")) && (jugador2.equals("piedra"))) {
      resultado = "Gana jugador 1";
    } else if ((jugador1.equals("tijera")) && (jugador2.equals("papel"))) {
      resultado = "Gana jugador 1";
    } else if ((jugador1.equals("tijera")) && (jugador2.equals("piedra"))) {
      resultado = "Gana jugador 2";
    } else if ((jugador1.equals("piedra")) && (jugador2.equals("papel"))) {
      resultado = "Gana jugador 2";
    } else if ((jugador1.equals("piedra")) && (jugador2.equals("tijera"))) {
      resultado = "Gana jugador 1";
    } else {
      System.out.println("Alguno de los datos no es correcto");
    }

    System.out.println(resultado);

  }
}

