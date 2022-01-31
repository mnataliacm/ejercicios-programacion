package misFunciones;

/**
 * Funciones para dibujos:
 * pirámides, rectángulo, cuadrante, etc
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Figuras {

  // DIBUJAR UNA LINEA
  /**
   * Dibuja una linea de tamaño n con el caracter dibujo
   *
   * @param n tamaño de la linea
   * @param borde comienzo y fin de la linea
   * @param centro caracter a dibujar
   * @return una linea de tamaño n con el simbolo dado
   */
  public static String linea(int n, char borde, char centro) {
    String resultado = "";
    if (n == 1) {
      resultado += "" + borde;
    } else {
      resultado += "" + borde;
      for (int i = 0; i < n - 2; i++) {
      resultado += "" + centro;
      }
      resultado += "" + borde;
    }
    return resultado;
  }
  
   // DIBUJAR espacios
  /**
   * Dibuja espacios en blanco
   *
   * @param n tamaño de la linea
   * @return espacios 
   */
  public static String espacios(int n) {
    return linea(n, ' ', ' ');
  }

  // VACIO DECRECIENTE
  /**
   * Dibuja espacios a la izquierda del dibujo de manera decreciente
   *
   * @param altura de los huecos
   * @return dibujo de los espacios
   */
  public static String espacioDecrece(int altura) {
    String resultado = "";
    for (int espacio = 1; espacio < altura; espacio++) {
      resultado += " ";
    }
    return resultado;
  }

  // VACIO CRECIENTE
  /**
   * Dibuja espacios a la izquierda del dibujo de manera creciente
   *
   * @param altura de los huecos
   * @return dibujo de los espacios
   */
  public static String espacioCrece(int altura) {
    String resultado = "";
    for (int espacio = altura; espacio > 0; espacio--) {
      resultado += " ";
    }
    return resultado;
  }

  // PIRÁMIDE NORMAL
  /**
   * Dibuja una pirámide con la altura dada y con el caracter introducido
   *
   * @param altura de la pirámide
   * @param dibujo carácter a dibujar
   * @return dibujo piramide con la altura dada
   */
  public static String piramide(int altura, char dibujo) {
    String resultado = "";
    for (int linea = 0; linea <= altura; linea++) {
      for (int espacio = 0; espacio <= altura - linea; espacio++) {
        resultado += " ";
      }
      for (int i = 0; i <= (linea * 2) - 2; i++) {
        resultado += dibujo;
      }
      resultado += "\n";
    }

    return resultado;
  }

  // PIRÁMIDE HUECA
  /**
   * Dibuja una pirámide hueca con la altura dada y con el caracter introducido
   *
   *
   * @param altura de la pirámide
   * @param dibujo carácter a dibujar
   * @return dibujo de la piramide
   */
  public static String piramideHueca(int altura, char dibujo) {
    //espacios pico
    String resultado = "\n";
    for (int espacio = 1; espacio < altura; espacio++) { 
      resultado += " ";
    }
    //pico pirámide
    resultado += dibujo;
    resultado += "\n";
    //cuerpo pirámide
    for (int linea = 1; linea < altura - 1; linea++) {
      for (int espacio = 1; espacio < altura - linea; espacio++) { 
        resultado += " ";
      }
      resultado += dibujo;
      for (int espacio = 0; espacio < (linea * 2) -  1; espacio++) { 
        resultado += " ";
      }
      resultado += dibujo;
      resultado += "\n";
    }
    //base pirámide
    altura = altura *2 -3;
    resultado += linea(altura, dibujo, dibujo);
    return resultado;
  }
  
  // DIBUJA UN RECTÁNGULO
  /**
   * Dibuja un rectángulo dada la altura, el ancho y el carácter a dibujar
   *
   * @param altura del rectángulo
   * @param ancho del resctángulo
   * @param dibujo carácter a usar para dibujar
   * @return dibujo del rectángulo
   */
  public static String rectangulo(int altura, int ancho, char dibujo) {
    String resultado = "";
    //parte superior
      resultado += linea(ancho - 1, dibujo, dibujo);
    resultado += "\n";
    //parte central
    for (int h = 0; h < altura / 2 + 1; h++) {
      resultado += dibujo;
      for (int i = 1; i < (ancho - 2); i++) {
        resultado += " ";
      }
      resultado += dibujo + "\n";
    }
    //parte inferior
    resultado += linea(ancho - 1, dibujo, dibujo);
    return resultado;
  }
  
  // 6. DIBUJA UN RECTÁNGULO
  /**
   * Dibuja un rectángulo dada la altura, el ancho y el carácter a dibujar
   *
   *
   * @param altura del rectángulo
   * @param ancho del rectángulo
   * @param dibujo carácter a dibujar
   * @return dibujo del rectángulo
   */
//  public static String rectangulo(int altura, int ancho, char dibujo) {
//    String resultado = "";
//    //parte superior
//      resultado += linea(ancho - 1, dibujo, dibujo);
//    resultado += "\n";
//    //parte central
//    for (int h = 0; h < altura / 2 + 1; h++) {
//      resultado += dibujo;
//      for (int i = 1; i < (ancho - 2); i++) {
//        resultado += " ";
//      }
//      resultado += dibujo + "\n";
//    }
//    //parte inferior
//    resultado += linea(ancho - 1, dibujo, dibujo);
//    return resultado;
//  }
  
  
  
  
  
  // XX FUNCIÓN QUE GENERA UN CUADRANTE
  /**
   * Genera el array con las posiciones e imprime el tablero de juego
   *
   * @param array[][] array
   */
  public static void cuadrante(int array[][]) {

    //linea superior
    System.out.print("╭━━━━━━");
    for (int i = 0; i < array.length - 2; i++) {
      System.out.print("┬━━━━━━");
    }
    System.out.print("┬━━━━━╮\n");
    //linea datos
    for (int i = 0; i < array.length; i++) {
      System.out.print("┃");
      for (int j = 0; j < array.length; j++) {
        System.out.printf(" %3s ┃", array[i][j]);
      }
      //lineas centrales
      if (i < array.length - 1) {
        System.out.print("\n├━━━━━━");
        for (int k = 0; k < array.length - 2; k++) {
          System.out.print("┼━━━━━━");
        }
        System.out.print("┼━━━━━┤\n");
      } else {
        //linea inferior
        System.out.print("\n╰━━━━━━");
        for (int k = 0; k < array.length - 2; k++) {
          System.out.print("┴━━━━━━");
        }
        System.out.print("┴━━━━━╯\n");
      }
    }
    
  }
}
