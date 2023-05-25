package steps;

import metodos.Metodos;

public class ContaCorporate {

	public static void main(String[] args) {

		Metodos metodo = new Metodos();
		

		metodo.abrirNavegador();
		metodo.clicar("Entrar em contato");
		metodo.clicar("Saiba mais");
		metodo.validarTexto("Capitais e regioes metropolitanas 4004-0800");

	}
}
