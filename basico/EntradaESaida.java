package cursoJava.basico;

import java.util.Scanner;

public class EntradaESaida {

	public static void main(String[] args) {
		
		//Ciação de variáveis
		String nome;
		int idade;
		double altura;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		
		nome = leitor.nextLine();
		
		System.out.println("Digite sua idade: ");
		
		idade = leitor.nextInt();
		
		System.out.println("Digite sua altura: ");
		
		altura = leitor.nextDouble();
		
		System.out.println(nome);
		System.out.println(idade);
		System.out.println(altura);
		System.out.println("modificado");
		System.out.println("modificado outa vez");
	}

}
