/**
 * Tema 4
 * Ejercicio 11
 * Programa que dada una hora determinada (horas y minutos)
 * calcule los segundos que falta para la medianoche
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("__Calcular los segundos hasta la medianoche__");
    System.out.print("Introduce la hora(24h): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce lo minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundos = (24-hora)*3600 + (60-minutos)*60;
    
    System.out.print("Hasta medianoche faltan: " + segundos + " segundos");
     
  }
}
