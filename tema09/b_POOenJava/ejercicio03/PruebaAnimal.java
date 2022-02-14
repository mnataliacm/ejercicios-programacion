package tema09.b_POOenJava.ejercicio03;

/**
 * Tema 9
 * Ejercicio 3
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto.
 * Crea 3 métodos específicos de cada clase y redefine los que sean necesarios.
 * Compruebalo todo.
 * 
 * @author Natalia Castillo Muñoz
 */
public class PruebaAnimal {
  public static void main(String[] args) {

    Perro luna = new Perro("Luna", "blanco", 2, 6, "grave");
    System.out.println(luna);

    Canario limon = new Canario("Limon", "amarillo", 1, 5, "fuerte");
    System.out.println(limon);

    Gato bolita = new Gato("Bolita", "tricolor", 3, 3, "agudo");
    System.out.println(bolita);

    


  }

}
