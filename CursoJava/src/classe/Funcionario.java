package classe;

public class Funcionario {

	String nome;
	Double salario;
	String funcao;
	
	Funcionario(){
		
	}
	
	 Funcionario(String n,Double s, String f){
		nome = n;
		salario = s;
		funcao = f;
	 }
		String formatar() {
			return String.format("Nome: %s Salario: %f Função: %s", nome, salario, funcao);
		
	}
	
}
