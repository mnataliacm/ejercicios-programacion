/**
 * Tema 4
 * Ejercicio 12 
 * Minicuestionario con 10 preguntas tipo test sobre las asignaturas del curso.
 * Cada pregunta acertada suma 1 punto. Mostrar resultados.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    
    String respuesta;
    int puntos = 0;
    
    System.out.println("***** Minicuestionario *****");
    System.out.println("----------------------------");

    System.out.println(" Pregunta nº 1: UC+ALU se llaman:");
    System.out.println("     a) RAM");
    System.out.println("     b) CPU");
    System.out.println("     c) Nucleo");
    System.out.print("Introduce tu respuesta: ");
    respuesta = System.console().readLine();
    if ("c".equals(respuesta)) {
      puntos++;
      System.out.println("Bien hecho!!, respuesta correcta.");
    } else {
      System.out.println("Lo siento, respuesta incorrecta.");
    }
    /*resultado = respuesta.equals("a") ? resultado + 1 */
    
    System.out.println(" Pregunta nº 2: ¿Qué simbolo ponemos delante del nombre de la Foreing Key?:");
    System.out.println("     a) +");
    System.out.println("     b) *");
    System.out.println("     c) #");
    System.out.print("Introduce tu respuesta: ");
    respuesta = System.console().readLine();
    if ("b".equals(respuesta)) {
      puntos++;
      System.out.println("Bien hecho!!, respuesta correcta.");
    } else {
      System.out.println("Lo siento, respuesta incorrecta.");
    }
    
    System.out.println(" Pregunta nº 3: ¿Qué aplicacion web usamos para como diario en ED?:");
    System.out.println("     a) Notion");
    System.out.println("     b) Teams");
    System.out.println("     c) Github");
    System.out.print("Introduce tu respuesta: ");
    respuesta = System.console().readLine();
    if ("a".equals(respuesta)) {
      puntos++;
      System.out.println("Bien hecho!!, respuesta correcta.");
    } else {
      System.out.println("Lo siento, respuesta incorrecta.");
    }

    System.out.println(" Pregunta nº 4: ¿Qué simbolo ponemos para que emmet nos ayude a empezar el index.html?:");
    System.out.println("     a) /");
    System.out.println("     b) !");
    System.out.println("     c) ?");
    System.out.print("Introduce tu respuesta: ");
    respuesta = System.console().readLine();
    if ("b".equals(respuesta)) {
      puntos++;
      System.out.println("Bien hecho!!, respuesta correcta.");
    } else {
      System.out.println("Lo siento, respuesta incorrecta.");
    }
    
    System.out.println(" Pregunta nº 5: ¿Qué hay que poner como class al programar en java?:");
    System.out.println("     a) Cualquier cosa");
    System.out.println("     b) Tu nombre");
    System.out.println("     c) El nombre del archivo");
    System.out.print("Introduce tu respuesta: ");
    respuesta = System.console().readLine();
    if ("c".equals(respuesta)) {
      puntos++;
      System.out.println("Bien hecho!!, respuesta correcta.");
    } else {
      System.out.println("Lo siento, respuesta incorrecta.");
    }
    
    if (puntos == 5) {
      System.out.printf("\n¡¡¡ENHORABUENA!!! Las has acertado todas, tienes %d puntos", puntos);
    } else {
      System.out.printf("\nHas conseguido %d puntos", puntos);
      }

  }
}
