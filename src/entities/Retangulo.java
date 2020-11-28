package entities;

public class Retangulo {
	// Variaveis ==============================================================
	private double altura;
	private double largura;
	
	// Construtores ===========================================================
	public Retangulo() {
	}
	
	public Retangulo(double a, double l) {
		this.altura=a;
		this.largura=l;
	}

	// Getters & Setters ======================================================
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	// Metodo para retornar a area do retangulo ===============================
	public double area() {
		return altura * largura;
	}
	
	// Metodo para retornar o perímetro do retangulo ==========================
	public double perimetro() {
		return (altura + largura) * 2;
	}
	
	// Metodo para retornar a diagonal do retangulo ===========================
	public double diagonal() {
		return Math.sqrt((altura*altura)+(largura*largura));
	}
	
	
}
