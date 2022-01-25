package tema04;
/**
 * Dado un dia de la semana, y una hora, calcula los minutos hasta el fin de semana.
 * 
 *  
 * @author Ale Cueto, Natalia Castillo
 */
public class Tema04Ejercicio22AleCueto {
  public static void main(String[] args) {

    System.out.println("Calcular los minutos hasta el fin de semana");
    System.out.print("Indica el número de un día de laborable (1-5): ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Indica la hora: ");
    int horas = Integer.parseInt(System.console().readLine());
    System.out.print("Indica los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
   
    int diasHastaV = 0, horasHastaV, minutosHastaV;

    switch(dia){
        case 1: 
            diasHastaV = 4;
            break;
        case 2: 
            diasHastaV = 3;
            break;
        case 3: 
            diasHastaV = 2;
            break;
        case 4: 
          diasHastaV = 1;
            break;
        case 5:
            diasHastaV = 0;
    }

    horasHastaV = diasHastaV * 24 - 1 + 15 - horas;
    minutosHastaV = horasHastaV * 60 + (60 - minutos);
    
    System.out.println("¡Quedan " + minutosHastaV + " minutos hasta el viernes a las 15:00h!");
    
  }
}