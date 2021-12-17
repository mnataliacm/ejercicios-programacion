/**
 * Tema 6
 * Ejercicio 32
 * 
 * Programa que pinta un sendero aleatorio. Los bordes con "|".
 * Ancho 2 bordes y 4 espacios. A cada metro puede seguir recto, curvar a izquierda o curvar a derecha aleatoriamente.
 * Cada Metro = linea, puede haber obstaculo o no, posibilidad del 50%.
 * Posicion obstaculo aleatoria y solo uno por linea.
 * Obstaculos: planta = *, piedra = O.
 * Pedir longitud en metros.
 *
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio32 {
  public static void main(String[] args) {

    //PEDIR DATOS
    System.out.println();
    System.out.println("___Programa que dibuja un sendero___\n");
    System.out.print("Introduce los metros que quieres que tenga el sendero: ");
    int metros = Integer.parseInt(System.console().readLine());
    System.out.println();
    //VARIABLES
    int ancho = 4;
    int delante = 10;
    String planta = "*";
    String piedra = "O";
    int obstaculo = 0;
    int posicionObstaculo = -1;
    int quePongo = 0;
    int curva = 0;
    //PROGRAMA
    for (int i = 0; i < metros; i++) {
    //ESPACIOS DELANTE
      for (int j = 0; j < delante; j++) {
        System.out.print(" ");
      }
      delante = 10;
    //margen izquierdo
      System.out.print("|");
      obstaculo = (int)(Math.random() * 2) + 1;
      posicionObstaculo = (int)(Math.random() * 4) + 1;
      for (int j = 1; j < ancho; j++) {
    //zona centro
        if ((obstaculo == 1) && (posicionObstaculo == j)) {
          quePongo = (int)(Math.random() * 2) + 1;
          if (quePongo == 1)  {
            System.out.print(planta);
          } else if (quePongo == 2) {
            System.out.print(piedra);
          } 
        } else {
          System.out.print(" ");
        }
      } 
    //margen derecho
        System.out.print("|");
        System.out.println();
    //curvas
      curva = (int)(Math.random() * 2);
      if (curva == 1) {
        delante--;
      } else if (curva == 2) {
        delante++;
      } else {
        delante = 10;
      }
    }
    System.out.println();
  }
}

