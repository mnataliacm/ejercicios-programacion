/**
 * Tema 3
 * Ejercicio 12
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.println("---CALCULAR NOTA MEDIA PONDERADA---");
    
    System.out.print("Introduce la nota del primer examen: ");
    double examen = Double.parseDouble(System.console().readLine());
    System.out.print("¿que nota quieres sacar en el trimestre? ");
    double notaTrimestre = Double.parseDouble(System.console().readLine());
    
    double nota = ((notaTrimestre*1)-(examen*0.4))/0.6;
    
    System.out.printf(" Para tener "+notaTrimestre+" necesitas sacar en el segundo examen un " +nota);
    
  }
}
