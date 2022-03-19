package tema09.b_POOenJava.ejercicio12;

public abstract class Publicacion {

	protected String isbn;
	protected String titulo;
	protected int ano;
	
	public Publicacion(String isbn, String titulo, int ano) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.ano = ano;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "ISBN: " + getIsbn() + ", título: " + getTitulo() + ", año de publicación: " + getAno();
	}
	
	
}
