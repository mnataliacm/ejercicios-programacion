package tema07a;
/**
 * Tema 7
 * Ejercicio 4
 * 
 * Define 3 arrays de 20 números. Nombres: numero, cuadrado y cubo.
 * Carga el array numero con valores aleatorios entre 0 y 100.
 * En el array cuadrado almacena los cuadrados de valores en numero
 * Y en cubo guarda los cubos de los valores de numero
 * Muestra en contenido de los 3 arrays en 3 columnas
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio04 {
  public static void main(String[] args) {

    //variables
    int numero[] = new int[20];
    int cuadrado[] = new int[20];
    int cubo[] = new int[20];
    //genero num aleatorios
    for (int i = 0; i < 20; i++) {
      int num = (int)(Math.random() * 101);
      numero[i] = num;
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    System.out.println();
    System.out.print("Los números generados son: \n");
    System.out.println();
    System.out.println("  n     n²      n³   ");
    System.out.println("╭────┬─────┬────────╮");
    for (int i = 0; i < 20; i++) {
      System.out.printf("│%4d│%5d│%8d│\n", numero[i], cuadrado[i], cubo[i]);
    }
    System.out.println("╰────┴─────┴────────╯");
    System.out.println(); 
  }
}

