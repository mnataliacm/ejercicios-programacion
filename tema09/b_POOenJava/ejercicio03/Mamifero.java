package ejercicios.tema09.b_POOenJava.ejercicio03;

/**
 *
 * @author Natalia Castillo Muñoz
 */
public abstract class Mamifero extends Animal {
  private int mesesDeGestacion;

  protected Mamifero (String nombre, String color, int edad, int mesesDeGestacion) {
    super(nombre, color, edad);
    this.mesesDeGestacion = mesesDeGestacion;
  }

  public int getMesesDeGestacion() {
    return mesesDeGestacion;
  }

  public void setMesesDeGestacion(int mesesDeGestacion) {
    this.mesesDeGestacion = mesesDeGestacion;
  }

  
}
