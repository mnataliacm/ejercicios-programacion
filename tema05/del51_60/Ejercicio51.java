/**
 * Tema 5
 * Ejercicio 51
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8.
 * Programa que tras pedir un número muestra el resultado trar el paso del gusano, si no come debe salir msj.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio51 {
  public static void main(String[] args) {

    System.out.println("___Gusano Numérico que come rosquillas (0 y 8)___");
    System.out.print("Introduce un número entero(mayor que 0): ");
    int numero = Integer.parseInt(System.console().readLine());
    //Variables
    Boolean gusano = false;
    int num = numero;
    int numeroReves = 0;
    //Voltear y comprobar si es rosquilla
    while( num > 0 ) {
      if ((num % 10 != 0) && (num % 10 != 8)) {
        numeroReves = (numeroReves * 10) + (num % 10);
      } else {
        gusano = true;
      }
      num /= 10;
    }
    //Pongo derecho
    num = numeroReves;
    numeroReves = 0;
    while (num > 0) {
      numeroReves = (numeroReves * 10) + (num % 10);
      num /= 10;
    }
    if (gusano) {
      System.out.print("Después de haber sido comido por el gusano numérico");
      System.out.println(" se queda en " + numeroReves);
    } else {
      System.out.println("El gusano numérico no se ha comido ningún dígito.");
    }











    //Comprobando dígitos
    // for (int i = 0; i < 10; i++) {
    //   aparece = false;
    //   num = numero;
    //   while (num > 0) {
    //     if (num % 10 == i) {
    //       aparece = true;
    //     }
    //     num /= 10;
    //   }
    //   if (aparece || num == 0 || num == 8) {
    //     System.out.print("Después de haber sido comido por el gusano numérico se queda en ");
    //     System.out.print(i);
    //   } else {
    //     System.out.println("El gusano numérico no se ha comido ningún dígito.");
    //   }
    // }
    
    
    
    
    
    
    
    
    // for (int i = 0; i < 10; i++) {
    //   num = numero;
    //   while (num > 0) {
    //     if (num % 10 == i) {
    //       if (num == 0 || num == 8) {
    //         gusano = numero % corte;
    //       } else {
    //         gusano = numero;
    //         corte *= 10;
    //       }
    //     }
    //     num /= 10;
    //   }
    // }
    System.out.println();
    System.out.println(num);
    System.out.println(gusano);
    //comprobar números
    //if ((alto < 2) || (ancho < 2)) {}
    //int palo = (int)(Math.random() * 4) + 1;
    // int numero = Integer.parseInt(System.console().readLine());

  }
}

