package ejercicios.tema09.b_POOenJava.ejercicio14;

public class FichaDomino {

	int arriba;
	int abajo;
	//constructor
	public FichaDomino(int i, int d) {
		this.arriba = i;
		this.abajo = d;		
	}	
	//imprime contenido
	@Override
	public String toString() {
		return " ╔═╗\n ║" + (arriba == 0 ? " " : arriba) +  "║\n ╠═╣\n ║" + (abajo == 0 ? " " : abajo) + "║\n ╚═╝";
	}
	//metodo volea
	String voltea() {
		int n = this.arriba;
		this.arriba = this.abajo;
		this.abajo = n;
		return " -----\n Volteo\n" + this.imprime(arriba, abajo) + "\n -----";
	}
	//metodo comprueba fichas
	String encaja(FichaDomino f) {
		if ((this.arriba != f.abajo) && (this.abajo != f.arriba)) {
			return "No se pueden emparejar";
		} else if (this.arriba == f.abajo) {
			System.out.println("ENCAJAN");
			return imprime(f.arriba, f.abajo) + " \n" + imprime(this.arriba, this.abajo);	
		} else if (this.abajo == f.arriba) {
			return " *****\n ENCAJAN\n" + imprime(this.arriba, this.abajo) + " \n" + imprime(f.arriba, f.abajo) + "\n *****"; 	
		}
		return null;
	}
	/**
	 * Imprime las fichas de dominó
	 * 
	 * @param a número de arriba
	 * @param b número de abajo
	 * @return ficha de domino
	 */
	public String imprime(int a, int b) {		
		return " ╔═╗\n ║" + (a == 0 ? " " : a) +  "║\n ╠═╣\n ║" + (b == 0 ? " " : b) + "║\n ╚═╝";
	}
}
