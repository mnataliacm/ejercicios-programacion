/**
 * Tema 6
 * Ejercicio 29
 * 
 * Programa que muestra una previsión del tiempo para mañana en Málaga.
 * Temperatura max y min aleatorias rango en a la tabla de abajo.
 * Temp min debe ser <= max
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio29 {
  public static void main(String[] args) {

    //VARIABLES
    int minima = (int)(Math.random() * 4) + 1;
    int maxima = (int)(Math.random() * 4) + 1;
    int prob = (int)(Math.random() * 101);
    boolean sol = false;
    //DATOS
    System.out.println();
    System.out.println("PREVISION TIEMPO EN MÁLAGA");
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación: ");
    int estacion = Integer.parseInt(System.console().readLine());
    //PROGRAMA
    switch (estacion) {
      case 1:
        do {
        minima = (int)(Math.random() * 30) + 15;
        maxima = (int)(Math.random() * 30) + 15;
        } while (minima > maxima);
        if (prob <= 60) {
          sol = true;
        } else {
          sol = false;
        }
        break;
      case 2:
      do {
        minima = (int)(Math.random() * 45) + 25;
        maxima = (int)(Math.random() * 45) + 25;
        } while (minima > maxima);
        if (prob <= 80) {
          sol = true;
        } else {
          sol = false;
        }
        break;
      case 3:
      do {
          minima = (int)(Math.random() * 30) + 20;
          maxima = (int)(Math.random() * 30) + 20;
          } while (minima > maxima);
          if (prob <= 40) {
            sol = true;
          } else {
            sol = false;
          }
        break;
      case 4:
      do {
          minima = (int)(Math.random() * 25) + 0;
          maxima = (int)(Math.random() * 25) + 0;
          } while (minima > maxima);
          if (prob <= 20) {
            sol = true;
          } else {
            sol = false;
          }
        break;
      default:
        break;
    }

    System.out.println();
    System.out.println("Previsión del tiempo para mañana");
    System.out.println("--------------------------------");
    System.out.println("Temperatura mínima: " + minima + "ºC");
    System.out.println("Temperatura máxima: " + maxima + "ºC");
    if (sol) {
      System.out.println("🌞");
    } else {
      System.out.println("🌥️");
    }
      
    System.out.println();
  }
}

//AÑADIR BOOLEAN PARA SOL Y NUBES