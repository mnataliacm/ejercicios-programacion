package tema06.del11_20;
/**
 * Tema 6 Ejercicio 15 Programa generador de melodía con las siguientes
 * condiciones: Notas al azar, 7 notas num aleatorio de notas >= 4, <=28 y
 * siempre multiplo de 4 (4,8,12,...) Agrupadas de 4 en 4 y separadas con | La
 * última nota debe coincidir con la primera
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio15 {
  public static void main(String[] args) {

    System.out.println("___Programa generador de melodías___");
    // variables
    String nota = "";
    String notaFin = "";
    int conteo = 0;
    // notas
    System.out.println();
    int melodia = 4 * (int)(Math.random() * 7 + 1);
    for (conteo = 1; conteo <= melodia; conteo++) {
      int nota1 = (int)(Math.random() * 7) + 1;
      switch (nota1) {
      case 1:
        nota = "do ";
        break;
      case 2:
        nota = "re ";
        break;
      case 3:
        nota = "mi ";
        break;
      case 4:
        nota = "fa ";
        break;
      case 5:
        nota = "sol ";
        break;
      case 6:
        nota = "la ";
        break;
      case 7:
        nota = "si ";
        break;
      default:
        break;
      }
      //guardo primera nota
      if (conteo == 1) {
        notaFin = nota;
      }
      //imprimir ultima nota
      if (conteo == melodia) {
        nota = notaFin;
      }
      //imprimir melodias
      System.out.print(nota);
      //separaciones
      if (conteo == melodia) {
        System.out.print("||"); 
      } else if (conteo % 4 == 0) {
      System.out.print("| ");
      } 
    }
    System.out.println();
  }
}
