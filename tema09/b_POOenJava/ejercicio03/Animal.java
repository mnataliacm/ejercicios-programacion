package tema09.b_POOenJava.ejercicio03;

/**
 *
 * @author Natalia Castillo Muñoz
 */
public abstract class Animal {
  private String nombre;
  private String color;
  private int edad;
  

  public Animal(String nombre, String color, int edad) {
    this.nombre = nombre;
    this.color = color;
    this.edad = edad;
  }


  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  
}
