package Coleções;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
	Stack<String> pilha = new Stack<>();
	
	pilha.push("O pequeno Principe");
	pilha.push("o Hobbit");
	pilha.push("Don Quixote");
	
	System.out.println("peek..");
	System.out.println(pilha.peek());
	System.out.println("pop..");
	System.out.println(pilha.pop());
	System.out.println(pilha.pop());
	System.out.println(pilha.pop());
	pilha.pop();
//	System.out.println(pilha.pop());

	
	
	
	}
}
