import java.util.ArrayList;

/**
 * Tema 10
 * Ejercicio 1
 * Crea un ArraList con los nombres de 6 companeros de clase. 
 * Muestra los nombres. Usa un bucle for que recorra el ArrayList
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    ArrayList<String> clase = new ArrayList<>();

    clase.add("Joseph");
    clase.add("Natalia");
    clase.add("Cueto");
    clase.add("Fran");
    clase.add("Antúnez");
    clase.add("Morales");

    //System.out.println(clase);

    for (String c : clase) {
      System.out.println(c);
    }
    
  }
}