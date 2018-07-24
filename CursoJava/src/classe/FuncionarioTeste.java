package classe;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario caracteristica = new Funcionario() ;
		caracteristica.nome = "Peterson";
		caracteristica.salario = 500.0;
		caracteristica.funcao = "Teste";
		
		Funcionario dados = new Funcionario("Cesar", 200.0, "Programador");
		
		System.out.println(caracteristica.formatar());
		System.out.println(dados.formatar());
	}
}
