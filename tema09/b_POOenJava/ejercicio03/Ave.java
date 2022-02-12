package ejercicios.tema09.b_POOenJava.ejercicio03;

/**
 *
 * @author Natalia Castillo Muñoz
 */
public abstract class Ave extends Animal {
  private int mesesDeIncuvacion;

  protected Ave (String nombre, String color, int edad, int mesesDeIncuvacion) {
    super(nombre, color, edad);
    this.mesesDeIncuvacion = mesesDeIncuvacion;
  }

  public int getMesesDeIncuvacion() {
    return mesesDeIncuvacion;
  }

  public void setMesesDeIncuvacion(int mesesDeIncuvacion) {
    this.mesesDeIncuvacion = mesesDeIncuvacion;
  }
  
}
