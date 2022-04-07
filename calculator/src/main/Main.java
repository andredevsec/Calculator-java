package main;

import java.util.List;

import java.util.Scanner;

import model.Calc;

public class Main {

	public static void main(String[] args) {
		
		int opcao = 0;
		Calc calculadora = new Calc();
		Number  resultado = 0;
		Scanner leitor = new Scanner(System.in);
		
		while(opcao != 5 ) {
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Divisão");
			System.out.println("4 - Multiplicação");
			System.out.println("5 - Sair");
			opcao = leitor.nextInt();
			
			Number valorUm =0;
			Number valorDois =0;
			if (opcao >0 && opcao < 5) {
				System.out.println("Valor 1: ");
				valorUm = leitor.nextDouble();
				System.out.println("Valor 2: ");
				valorDois = leitor.nextDouble();
			}
			
			
			switch (opcao) {
			case 1: {
				resultado = calculadora.sum(valorUm, valorDois);
				break;
			}
			case 2: {
				resultado = calculadora.sub(valorUm, valorDois);
				break;
			}
			case 3: {
				resultado = calculadora.div(valorUm, valorDois);
				break;
			}
			case 4 : {
				resultado = calculadora.mult(valorUm, valorDois);
				break;
			}
			case 5: {
				System.out.println("Operações realizadas");
				for (String operacao : calculadora.getLastOperations())
				{
					System.out.println(operacao);
				}
				continue;
			}
			default: 
				System.out.println("Opção inválida!");
				continue;
			}
			System.out.println("Resultado: " + resultado);
		}
	}

}