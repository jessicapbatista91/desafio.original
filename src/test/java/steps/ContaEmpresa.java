package steps;

import metodos.Metodos;

public class ContaEmpresa {

	public static void main(String[] args) {

		Metodos metodo = new Metodos();

		metodo.abrirNavegador();
		metodo.clicar("Fale conosco");
		metodo.clicar("Saiba Mais");
		metodo.clicar("Bem vindo");
		metodo.clicar("100% digital");
		metodo.clicar("100% Humano");
		metodo.clicar("Crédito");
		metodo.clicar("Cobrança");
		metodo.clicar("Soluções");
		metodo.clicar("Dia a Dia");
		metodo.clicar("Investimentos");
		metodo.clicar("Pacotes");
		metodo.clicar("Abrir conta");

	}
}
