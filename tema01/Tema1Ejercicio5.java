/**
 * Horario de clase en color
 * 
  * @author Natalia Castillo Muñoz
 */
public class Tema1Ejercicio5 {
  public static void main(String[] args) {

    String PRO = "\033[32m PRO \033[39;49m";
    String ED = "\033[93m ED \033[39;49m";
    String LM = "\033[33m LM \033[39;49m";
    String BBDD = "\033[31m BBDD \033[39;49m";
    String SINF = "\033[35m SINF \033[39;49m";
    String FOL = "\033[34m FOL \033[39;49m";

    System.out.println("\u2500\u2500\u2500\u2500\u2500");

    System.out.println("********************************************");
    System.out.println("| LUNES | MARTES|MIERCOLES| JUEVES| VIERNES|");
    System.out.println("********************************************");
    System.out.print("| " + PRO + " | " + PRO + " |  " + SINF + " | " + PRO + " | " + SINF + " |\n");
    System.out.println("--------------------------------------------");
    System.out.print("| " + PRO + " | " + PRO + " |  " + SINF + " | " + PRO + " | " + SINF + " |\n");
    System.out.println("--------------------------------------------");
    System.out.print("| " + ED + "  | " + PRO + " |  " + SINF + " | " + PRO + " | " + SINF + " |\n");
    System.out.println("--------------------------------------------");
    System.out.print("| " + ED + "  | " + BBDD + "|  " + ED + "   | " + BBDD + "| " + FOL + "  |\n");
    System.out.println("--------------------------------------------");
    System.out.print("| " + LM + "  | " + BBDD + "|  " + LM + "   | " + BBDD + "| " + FOL + "  |\n");
    System.out.println("--------------------------------------------");
    System.out.print("| " + LM + "  | " + BBDD + "|  " + LM + "   | " + BBDD + "| " + FOL + "  |\n");
    System.out.println("********************************************");
  }
}

