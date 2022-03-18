package c_ArraysDeObjetos.Ejercicio01;

public class Gato {
  private String nombre;
  private String color;


  public Gato() {
  }

  public Gato(String nombre, String color, String raza) {
    this.nombre = nombre;
    this.color = color;
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

}
