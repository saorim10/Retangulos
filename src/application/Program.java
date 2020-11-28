package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

/* Fazer um programa para ler os valores da largura e altura
   de um retângulo. Em seguida, mostrar na tela o valor de
   sua área, perímetro e diagonal. */

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("Entre com a largura e altura do retangulo: ");
		ret.setLargura(sc.nextDouble());
		ret.setAltura(sc.nextDouble());
		
		System.out.println();
		System.out.printf("Area: %.2f%n", ret.area());
		System.out.printf("Perimetro: %.2f%n", ret.perimetro());
		System.out.printf("Diagonal: %.2f%n", ret.diagonal());
		
		sc.close();
	}

}
