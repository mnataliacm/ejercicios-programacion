/**
 * Tema 5
 * Ejercicio 37
 * Programa que convierte del sistema decimal al sistema de "palotes"
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio37 {
  public static void main(String[] args) {

    System.out.println("___Conversor de decimal a 'palotes'___");
    System.out.print("Introduce un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());
    //variables
    int num = numero;
    int conteo = 1;
    int num1 = 1;
    int numeroReves = 0;   
    //Contar dígitos
    while (num > 1) {
      num = num / 10;
      conteo++;
    }
    num = numero;
    //voltear números
    while (num > 0){
      numeroReves = ((numeroReves * 10) + (num % 10));
      num /=10;
    }
    num = numeroReves; 
    System.out.println(conteo);
    //convirtiendo a palote 
    do {
      
      num1 = num % 10;
      for (int i = 0; i < num1; i++) {
        System.out.print("|");
      }
      System.out.print("-");
      conteo--;
      num = num / 10;
    } while (conteo > 0);
    System.out.println();


  }
}

//sobra un guión al final?????
