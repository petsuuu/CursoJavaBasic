package Exercicios;

import java.util.Scanner;

public class NotasAluno {
	// 4 - Escreva um programa para ler 3 notas diferentes de um aluno e informar
	//
	// o valor da sua maior nota.
	//
	//
	//
	// Altere este programa para informar tamb�m se a maior nota foi a

	// primeira, a segunda ou a terceira.

	public static void main(String[] args) {
		String nomealuno,p,s,t;
		double nota1, nota2, nota3;

		p = "Primeiro";
		s = "Segunda";
		t = "Terceira";
		
		Scanner aluno =  new Scanner(System.in);
		
		System.out.println("Digite o Nome do Aluno");
		nomealuno = aluno.nextLine();
		
		System.out.println("Digite a "+p+" nota: ");
		Scanner p1 =  new Scanner(System.in);
		nota1=p1.nextDouble();

		System.out.println("Digite a "+s+" nota: ");
		Scanner p2 = new Scanner(System.in);
		nota2 = p2.nextDouble();
		
		System.out.println("Digite a "+t+" nota: ");
		Scanner p3 =  new Scanner(System.in);
		nota3 = p3.nextDouble();
		
		if(nota1 > nota2 && nota2 > nota3) { //id descrobir a maior nota
			System.out.println("A maior nota do aluno " +nomealuno+" � "+nota1+" "+p+ "Nota digitada!" );
		}
		else if( nota2 > nota1 && nota2 > nota3){
			System.out.println("A MAIOR NOTA DO ALUNO "+ nomealuno+ " � : " + nota2 +" "+ s + " NOTA DIGITADA! ");
			}
			else if( nota3 > nota2 && nota3 > nota1){
				System.out.println("A MAIOR NOTA DO ALUNO "+ nomealuno + " � : " + nota3 +" "+ t + " NOTA DIGITADA! ");
			}
			else 
				System.out.println("N�O H� MAIOR NOTA!! AS NOTAS DO ALUNO " + nomealuno+ " S�O: " + nota1 + "   " + nota2 +"   "+ nota3);
		System.exit(0);	//finalizando o programa
		
		
	}
}
