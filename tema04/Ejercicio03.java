package tema04;
/**
 * Tema 4
 * Ejercicio 3
 * Programa que indicando un numero del 1 al 7 escriba el dia de la semana.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    
    System.out.println("__Indica un número del 1 al 7 para saber que dia de la semana es__");
    System.out.print("Introduce el número del 1 al 7: ");
  
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaSemana;
    
    switch (dia) {
      case 1:
        diaSemana = "Es lunes";
        break;
      case 2:
        diaSemana = "Es martes";
        break;
      case 3:
        diaSemana = "Es miercoles";
        break;
      case 4:
        diaSemana = "Es jueves";
        break;
      case 5:
        diaSemana = "Es viernes";
        break;
      case 6:
        diaSemana = "Es sábado";
        break;
      case 7:
        diaSemana = "Es domingo";
        break;
      default:
        diaSemana = "Solo puedes usar un número del 1 al 7";
    }

    System.out.println(diaSemana);
    
  }
}
