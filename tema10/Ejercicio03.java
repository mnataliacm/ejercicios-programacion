package tema10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * Tema 10
 * Ejercicio 3
 * Programa que ordene 10 números enteros dados por teclado y almacenados en ArrayList
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    int num;

    System.out.println("Introduce 10 números aleatorios: ");
    for (int i = 0; i < 10; i++) {
      num = Integer.parseInt(System.console().readLine());
      numeros.add(num);
    }
    System.out.println("aleatorios: " + numeros);
    Collections.sort(numeros);
    System.out.println("ordenados: " + numeros);
    s.close();
  }
}
