package tema09.b_POOenJava.ejercicio17;

public class Rectangulo {

	int base;
	int altura;
	char dibujo = '*';
	static int rectangulosCreados;
			
	public Rectangulo(int b, int h) {
			this.base = b;
			this.altura = h;
			Rectangulo.rectangulosCreados++;
		}
	
	public static int getRectangulosCreados() {
		return rectangulosCreados;
	}
	
	@Override
	public String toString() { 
		System.out.println();
		return rectangulo(base, altura, dibujo);
	}
	
	
//DIBUJA UN RECTÁNGULO
 /**
  * Dibuja un rectángulo dada la altura, el ancho y el carácter a dibujar
  *
  * @param altura del rectángulo
  * @param ancho  del resctángulo
  * @param dibujo carácter a usar para dibujar
  * @return dibujo del rectángulo
  */
 public String rectangulo(int base, int altura, char dibujo) {
   String resultado = " ";
   
   for (int h = 0; h < altura; h++) {
  	 resultado += " ";
     for (int i = 0; i < base; i++) {
       resultado += dibujo;
     }
     resultado += "\n";
     resultado += " ";
   }

   return resultado;
 }

}
