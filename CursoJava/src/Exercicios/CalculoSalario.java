package Exercicios;

import java.util.Scanner;

public class CalculoSalario {

	// 1 - Escreva um programa efetuar o c�lculo do sal�rio bruto e do sal�rio
	//
	// l�quido de um empregado. Os dados fornecidos s�o:
	//
	//
	//
	// - O valor do sal�rio hora
	//
	// - O n�mero de horas trabalhadas no m�s
	//
	// - O percentual de desconto do INSS

	public static void main  (String[] args) {

		String nomeFuncionario;
		double salBruto, salLiquido, horasTrab, valorHTrab;
		double inss = 1.10;

		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Programa:::");
		System.out.println("Calcula Sal�rio Bruto e Salario Liquido");
		
		System.out.println("\nEntre com o nome do Funcion�rio: ");
		nomeFuncionario = entradaDados.nextLine();
		
		System.out.println("Informe a Quantidade de horas Trabalhadas: ");
		horasTrab = entradaDados.nextDouble();
		
		System.out.println("Informe o valor das horas Trabalhadas : R$ ");
		valorHTrab = entradaDados.nextDouble();
		
		salBruto = ( horasTrab * valorHTrab );
		salLiquido = (salBruto - inss);
		System.out.println("\n\n:::: Exibi��o dos dados informados ::::::::::");
		System.out.println("Nome: "+nomeFuncionario);
		System.out.printf("Sal�rio Bruto: R$ %.2f", salBruto);
		System.out.printf("\nSal�rio Liquido: R$ %.2f", salLiquido);
		System.out.println("\n:::::::::::::::::::::::::::::::::::::::::::::");

		System.out.println("\nAutor: Mois�s Tedeschi");
		System.out.println("Fim do Programa!!!");
	}
	}
