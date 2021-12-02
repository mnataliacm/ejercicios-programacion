/**
 * Tema 6
 * Ejercicio 16
 * Programa que simula máquina tragaperras simplificada. Requisitos:
 * 1.mostrar tirada de 3 figuras de 5: corazón, diamante, herradura, campana y limón.
 * 2.Si las 3 figuras son diferentes mostrar mensaje "Lo siento, ha perdido"
 * Si hay dos iguales mensaje "Bien, ha recuperado su moneda"
 * Si las 3 son iguales mostrar "Enhorabuena, ha ganado 10 monedas"
 * 💜 💎 🧲 🔔 🍋
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio16 {
  public static void main(String[] args) {

    System.out.println("___MÁQUINA TRAGAPERRAS___");
    //variables
    String dibujo = "";
    String figura1 = "";
    String figura2 = "";
    String figura3 = "";
    //3 tiradas
    System.out.println();
    for (int tirada = 0; tirada < 3; tirada++) {
      int figura = (int)(Math.random() * 5 + 1);
      switch (figura) {
        case 1:
          dibujo = "💜";
          break;
        case 2:
          dibujo = "💎";
          break;        
        case 3:
          dibujo = "🧲";
          break;
        case 4:
          dibujo = "🔔";
          break;
        case 5:
          dibujo = "🍋";
          break;      
        default:
          break;
      }
      if (tirada == 0) {
        figura1 = dibujo;
      } else if (tirada == 1) {
        figura2 = dibujo;
      } else if (tirada == 2) {
        figura3 = dibujo;
      }
      //System.out.print(dibujo);
      
    }
    System.out.println("╔════╗ ╔════╗ ╔════╗");
    System.out.println("║ " + figura1 + " ║ ║ " + figura2 + " ║ ║ " + figura3 + " ║");
    System.out.println("╚════╝ ╚════╝ ╚════╝");
    System.out.println();
    if (figura1.equals(figura2) && (figura2.equals(figura3))) {
      System.out.println("Enhorabuena, ha ganado 10 monedas");
    } else if (figura1.equals(figura2) || figura1.equals(figura3) || figura2.equals(figura3)) {
      System.out.println("Bien, ha recuperado su moneda");
    } else {
      System.out.println("Lo siento, ha perdido");
    }
  }
}

// ╔════╗ ╔════╗ ╔════╗
// ║    ║ ║    ║ ║    ║
// ╚════╝ ╚════╝ ╚════╝
