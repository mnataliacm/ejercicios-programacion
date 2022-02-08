package ejercicios.tema09.b_POOenJava; 

/**
 * Caballo.java
 * Implementar la clase Caballo
 * @author Natalia
 */
public class Caballo {
  //atributos
  private String nombre;
  private String color;
  private String sexo;
  private String raza;
  private Double peso;
  private String arre;
  private int edad;
  
  /**
   * Hace que el caballo relinche
   */
  void relincha() {
    System.out.println("Hhiiiiiii");
  }
  
  /**
   * Hace que el caballo trote, galope o pare
   */
  void anda(String arre) {
    if (arre.equals("galope")) {
      System.out.println("al galooopeeee!!!");   
    } else if (arre.equals("trote")) {
      System.out.println("pues al trote");
    } else {
      System.out.println("no me muevo");
    }
  }
  
   //comer
  void come(String comida){
    if (comida.equals("zanahoria")) {
      
    }
  }
  
}
