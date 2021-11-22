import javax.xml.transform.stream.StreamSource;

/**
 * Tema 6
 * Ejercicio 11
 * Programa que muestra 20 notas al azar.
 * Mostrar notas: suspenso, suficiente, bien, notable o sobresaliente.
 * Al final mostrar total de suspensos, suficientes, etc.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra notas aleatorias___");
    System.out.println();
    String nota = "";
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    for (int i = 0; i < 20; i++) {
      int caracter = (int)(Math.random() * 5) + 1;
      switch (caracter) {
        case 1:
          nota = "suspenso";
          suspenso++;      
          break;
        case 2:
            nota = "suficiente";
            suficiente++;          
          break;
        case 3:
          nota = "bien";
          bien++;          
          break;
        case 4:
          nota = "notable";
          notable++;
          break;
        case 5:
          nota = "sobresaliente";
          sobresaliente++;
          break;
        default:
          break;
      }
      System.out.print(nota + ", ");
    }
    System.out.println();
    System.out.println("Total de suspensos: " + suspenso); 
    System.out.println("Total de suficientes: " + suficiente);
    System.out.println("Total de bien: " + bien);
    System.out.println("Total de notable: " + notable);
    System.out.println("Total de sobresaliente: " + sobresaliente);
    System.out.println("Total: " + (suspenso + suficiente + bien + notable + sobresaliente));
  }
}

