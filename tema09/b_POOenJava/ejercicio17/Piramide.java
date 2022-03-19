package tema09.b_POOenJava.ejercicio17;

public class Piramide {

	int altura;
	char dibujo = '*';
	static int piramidesCreadas;
	
	public Piramide(int a) {
		this.altura = a;
		Piramide.piramidesCreadas++;
	}
	
public static int getPiramidesCreadas() {		
		return piramidesCreadas;
	}
	
	@Override
	public String toString() {
		System.out.println();
		return piramide(altura, dibujo);
	}

 	
	//PIRÁMIDE
	/**
   * Dibuja una pirámide con la altura dada y con el caracter introducido
   *
   * @return dibujo piramide con la altura dada
   */
  public String piramide(int altura, char dibujo) {
    String resultado = "";
    for (int linea = 0; linea <= altura; linea++) {
      for (int espacio = 0; espacio <= altura - linea; espacio++) {
        resultado += " ";
      }
      for (int i = 0; i <= (linea * 2) - 2; i++) {
        resultado += dibujo;
      }
      resultado += "\n";
    }

    return resultado;
  }

}
