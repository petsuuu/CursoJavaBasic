package controle;

public class SuiteSemBreak {
	public static void main(String[] args) {
		String faixa = "amarela";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei fazer o 'Bassai-DAi/Jion/Kanku-Dai'");
		case "marrom":
			System.out.println("Sei fazer o 'Tekki Shodan'");
		case "roxa":
			System.out.println("Sei fazer o 'Heian Godan'");
		case "verde":
			System.out.println("Sei fazer o 'Heian Yondan'");
		case "laranja":
			System.out.println("Sei fazer o 'Heian Sandan'");
		case "vermelho":
			System.out.println("Sei fazer o 'Hein Nidan'");
		case "amarela":
			System.out.println("Sei fazer o Hein Shodan'");
		default:
			System.out.println("Não sei nada");
		}
	
	}
}
