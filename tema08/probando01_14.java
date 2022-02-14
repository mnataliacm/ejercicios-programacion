package tema08;

import java.util.Scanner;

/**
 * Tema 8
 * 
 * Probar las funciones ejercicios 1-14
 *
 * @author Natalia Castillo Muñoz
 */
public class probando01_14 {
  public static void main(String[] args) {

    // variables
    Scanner s = new Scanner(System.in);
    long n = 0;
    int d = 0;
    int i = 0;
    int f = 0;
    long r = 0;
    int conteo = 0;

    //ES CAPICÚA
    System.out.println("COMPROBAR SI ES CAPICÚO");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    if (Ejercicio01_14.esCapicua(n)) {
    System.out.println("El número " + n + " es capicúo.");
    } else {
    System.out.println("El número " + n + " no es capicúo.");
    }

    //SI ES PRIMO
    System.out.println("COMPROBAR SI ES PRIMO");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    if (Ejercicio01_14.esPrimo(n)) {
    System.out.println("El número " + n + " es primo.");
    } else {
    System.out.println("El número " + n + " no es primo.");
    }

    //SIGUIENTE PRIMO
    System.out.println("BUSCAR SIGUIENTE PRIMO");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    long primo = Ejercicio01_14.siguientePrimo(n);
    System.out.println("El siguiente número primo es " + primo);

    //POTENCIA
    System.out.println("CALCULAR LA POTENCIA");
    System.out.print("Introduce la base: ");
    n = s.nextInt();
    System.out.print("Introduce el exponente: ");
    int e = s.nextInt();
    long resultado = Ejercicio01_14.potencia(n, e);
    System.out.println("La potencia es: " + resultado);

    //CONTAR DÍGITOS
    System.out.println("CONTAR DÍGITOS DE UN NÚMERO");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    conteo = Ejercicio01_14.digitos(n);
    System.out.println("El número " + n + " tiene " + conteo + " dígitos.");

    //VOTEAR NÚMERO
    System.out.println("DÁ LA VUELTA A UN NÚMERO");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    long volteo = Ejercicio01_14.voltea(n);
    System.out.println("El número " + n + " del revés: " + volteo);

    //POSICIÓN DEL DÍGITO N
    System.out.println("POSICIÓN DE UN DÍGITO");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextLong();
    System.out.print("Introduce la posición: ");
    int p = s.nextInt();
    long digito = Ejercicio01_14.digitoN(n, p);
    System.out.println("En la posición " + p + " está el dígito " + digito);

    //BUSCA POSICIÓN DEL DÍGITO DADO
    System.out.println("POSICIÓN DE UN DÍGITO");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    System.out.print("Introduce el dígito a buscar: ");
    d = s.nextInt();
    r = Ejercicio01_14.posicionDigito(n, d);
    System.out.println("El dígito " + d + " está en la posición " + r);

    //QUITAR n DÍGITOS POR LA DERECHA
    System.out.println("QUITAR DÍGITOS POR LA DERECHA");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    System.out.print("¿Cuantos dígitos quieres quitar?: ");
    d = s.nextInt();
    r = Ejercicio01_14.quitaPorDetras(n, d);
    System.out.println("El resultado es: " + r);

    //QUITAR n DÍGITOS POR LA IZQUIERDA
    System.out.println("QUITAR DÍGITOS POR LA IZQUIERDA");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    System.out.print("¿Cuantos dígitos quieres quitar?: ");
    d = s.nextInt();
    r = Ejercicio01_14.quitaPorDelante(n, d);
    System.out.println("El resultado es: " + r);

    //PEGAR UN DÍGITO POR LA DERECHA
    System.out.println("QUITAR DÍGITOS POR LA DERECHA");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    System.out.print("Introduce el dígito para añadir detrás: ");
    d = s.nextInt();
    r = Ejercicio01_14.pegaPorDetras(n, d);
    System.out.println("El resultado es: " + r);

    //PEGAR UN DÍGITO POR LA IZQUIERDA
    System.out.println("QUITAR DÍGITOS POR LA IZQUIERDA");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    System.out.print("Introduce el dígito para añadir delante: ");
    d = s.nextInt();
    r = Ejercicio01_14.pegaPorDelante(n, d);
    System.out.println("El resultado es: " + r);

    //CORTA UN TROZO DE UN NÚMERO
    System.out.println("TROZO DE UN NÚMERO");
    System.out.print("Introduce un número: ");
    n = s.nextInt();
    System.out.print("Introduce el primer dígito: ");
    i = s.nextInt();
    System.out.print("Introduce el último dígito: ");
    f = s.nextInt();
    r = Ejercicio01_14.trozoDeNumero(n, i, f);
    System.out.println("El resultado es: " + r);

    //JUNTA DOS NÚMEROS
    System.out.println("JUNTA DOS NÚMERO");
    System.out.print("Introduce un número: ");
    n = s.nextInt();
    System.out.print("Introduce otro número: ");
    i = s.nextInt();
    r = Ejercicio01_14.juntaNumeros(n, i);
    System.out.println("El resultado es: " + r);
    System.out.println("");
    s.close();
  }
}