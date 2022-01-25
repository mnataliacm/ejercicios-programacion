package tema06.del01_10;
/**
 * Tema 6
 * Ejercicio 10
 * Programa que pinte 10 líneas formadas por caracteres
 * Carácter aleatorio: * - = . | @
 * Longitud aleatoria entre 1 y 40 caracteres
 *  
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta lineas___");
    String dibujo = "";
    System.out.println();
    for (int i = 0; i < 10; i++) {
      int caracter = (int)(Math.random() * 7) + 1;
      switch (caracter) {
        case 1:
          dibujo = "*";
          break;
        case 2:
          dibujo = "-";
          break;
        case 3:
          dibujo = "=";
          break;
        case 4:
          dibujo = ".";
          break;
        case 5:
          dibujo = "|";
          break;
        case 6:
         dibujo = "@";
          break;
        default:
          break;
      }
      int longitud = (int)(Math.random() * 41) + 1;
      while (longitud != 0) {
        System.out.print(dibujo);
        longitud--;
    }
    System.out.println();
    }
    
  }
}

