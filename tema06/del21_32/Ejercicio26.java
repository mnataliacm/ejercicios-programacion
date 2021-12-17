import java.util.Scanner;

import javax.xml.transform.stream.StreamSource;
/**
 * Tema 6
 * Ejercicio 26
 * 
 * Programa que pinta una tableta de turrón con un bocado aleatorio.
 * Pedir ancho y alto.
 * El bocado se da en el contorno.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio26 {
  public static void main(String[] args) {

    //VARIABLES
    int num = (int)(Math.random() * 4) + 1;
    Scanner s = new Scanner (System.in);
    int ancho = 0;
    int alto = 0;
    int aPos = (int)(Math.random() * ancho);
    int hPos = (int)(Math.random() * alto);
    //PROGRAMA
    System.out.println();
    System.out.print("Introduce el ancho de la tableta de turrón: ");
    ancho = s.nextInt();
    System.out.print("Introduce el alto de la tableta de turrón: ");
    alto = s.nextInt();
    //CALCULO BOCADO
    do {
      aPos = (int)(Math.random() * ancho) + 1;
      
    } while ((!(aPos < 2)) && (!(aPos == alto)));
    do {
      hPos = (int)(Math.random() * alto) + 1;
    } while ((!(hPos < 2)) && (!(hPos == ancho)));
    //DIBUJO TURRON Y BOCADO
    System.out.println();
    for (int i = 1; i <= alto; i++) {
      for (int j = 1; j <= ancho; j++) {
        if ((aPos == j) && (hPos == i)) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
    System.out.println(aPos + " " + hPos);


    
       
    
    System.out.println();
  }
}

