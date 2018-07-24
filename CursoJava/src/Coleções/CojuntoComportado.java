package Coleções;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CojuntoComportado {

	public static void main(String[] args) {
		Set<String> aprovados = new TreeSet<>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");

		for (Object nome : aprovados) {
			System.out.println(nome);
		}
	}
}
