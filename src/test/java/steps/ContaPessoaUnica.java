package steps;

import metodos.Metodos;

public class ContaPessoaUnica {

public static void main(String[] args) {
	
		Metodos metodo = new Metodos ();

		   metodo.abrirNavegador() ;
		   metodo.clicar("Abra sua conta");
		   metodo.escrever("Nome completo", "Jéssica Batista");
	       metodo.escrever("Celular", "35 99764-4879");
	       metodo.escrever("Email", "jessicapereirabatista@gmail.com");
	       metodo.escrever("CPF", "09672333641");
	       metodo.clicar("Quero ser cliente");
	
	
	
	
  }
}
