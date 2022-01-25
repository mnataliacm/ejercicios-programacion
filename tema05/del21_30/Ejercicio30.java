package tema05.del21_30;
/**
 * Tema 5
 * Ejercicio 30
 * Programa que calcula las horas entre dos días y dos horas dadas.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio30 {
  public static void main(String[] args) {

    //variables
    int dia1 = 0;
    int dia2 = 0;
    int correcto = 1;
    int suma = 0;
    int totalHoras = 0;

    //Solicitar Datos
    System.out.println("___Programa que calcula horas___");
    System.out.print("Introduce el primer día: ");
    String primero = System.console().readLine().toLowerCase();
    System.out.print("Introduce la primera hora: ");
    int hora1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo día: ");
    String segundo = System.console().readLine().toLowerCase();
    System.out.print("Introduce la segunda hora: ");
    int hora2 = Integer.parseInt(System.console().readLine());
    //Convertir nombre en número
    switch (primero) {
      case "lunes":
      dia1 = 1;
      break;
      case "martes":
      dia1 = 2;
      break;
      case "miercoles":
      dia1 = 3;
      break;
      case "jueves":
      dia1 = 4;
      break;
      case "viernes":
      dia1 = 5;
      break;
      case "sabado":
      dia1 = 6;
      break;
      case "domingo":
      dia1 = 7;
      break;
      default:
        break;
    }
    switch (segundo) {
      case "lunes":
      dia2 = 1;
      break;
      case "martes":
      dia2 = 2;
      break;
      case "miercoles":
      dia2 = 3;
      break;
      case "jueves":
      dia2 = 4;
      break;
      case "viernes":
      dia2 = 5;
      break;
      case "sabado":
      dia2 = 6;
      break;
      case "domingo":
      dia2 = 7;
      break;
      default:
        break;
    }
    //Comprobar número del día
    while (correcto == 1) {
      if ((dia1 >= 1) && (dia1 <= 7)) {
        if ((dia2 >= 1) && (dia2 <= 7)) {
          if (dia1 < dia2) {
            correcto = 0;   
          } else {
            System.out.println("No se puede calcular, el segundo día introducido es anterior al primero");
            correcto = 0;
          }
        } else {
          System.out.println("El segundo día introducido no es un día de la semana");
          correcto = 0;
        }
      } else {
          System.out.println("El primer día introducido no es un día de la semana");
          correcto = 0;
      } 
    } 
    //Calcular horas
    int sumaDias = dia2 - dia1;
    for (int i = 0; i <= sumaDias - 1; i++) {
      suma = suma + 24;
      totalHoras = (24 - hora1) + (hora2 - 24) + suma;
    }
    System.out.println();
    System.out.printf("Entre las %d:00 h. del %s y las %d:00 h. del %s hay %s hora/s", hora1, primero, hora2, segundo, totalHoras);
    System.out.println();
  }
}
