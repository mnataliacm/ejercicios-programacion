/**
 * Tema 4
 * Ejercicio 16
 * Programa que haga cuestionario sobre infidelidad pareja.
 * Cada pregunta contestada como verdadera suma 3 puntos, las falso no suman.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    
    String respuesta;
    int puntos = 0;
    
    System.out.println("¿tu pareja te es infiel? responde con verdadero o falso: ");
    
    System.out.println(" 1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente");
    respuesta = System.console().readLine();
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println(" 2. Ha aumentado sus gastos en vestuario");
    respuesta = System.console().readLine();    
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println(" 3. ¿Ha perdido el interés que mostraba anteriormente por tí?");
    respuesta = System.console().readLine();
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println(" 4. ¿Ahora se afeita y asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)?");
    respuesta = System.console().readLine();
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println(" 5. ¿No te deja que mires la agenda de su teléfono móvil?");
    respuesta = System.console().readLine();
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println(" 6. A veces tiene llamadas que dice no querer contestar cuando estás delante.");
    respuesta = System.console().readLine();
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println(" 7. Últimamente se preocupa más de cuidar la línea y/o estar bronceado/a.");
    respuesta = System.console().readLine();
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println(" 8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
    respuesta = System.console().readLine();
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println(" 9. Has notado que últimamente se perfuma más.");
    respuesta = System.console().readLine();
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println("10. ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo?");
    respuesta = System.console().readLine();
    if ("verdadero".equals(respuesta)) {
      puntos = puntos + 3;
    }
    System.out.println("\n*************************");

    if ((puntos >= 0) && (puntos <= 10)) {
      System.out.println("\n¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if ((puntos >=11) && (puntos <= 22)) {
      System.out.println("\nQuizás exista peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
    } else if ((puntos >22) && (puntos <= 30)) {
      System.out.println("\nTu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que pasa por su cabeza");
    }
    
    System.out.println("TOTAL: " + puntos);
  }
}
