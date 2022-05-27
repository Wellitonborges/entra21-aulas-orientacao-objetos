package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Capivara implements Individuo {

	// quando eu não escreevo o meu construtor vazio é pqq ele já tem por padrão
	// pore, quando eu crio um contrutoir eu perco meu contrutor 
	// padrão e sou obrigado a criar um manualmente
	@Override
	public void alimentar(String alimento) {
	System.out.println("A Capivara come mato e "+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println("A capivara anda, corre e nada");
		
	}

	@Override
	public void comunicar(String conteudo) {
System.out.println("....");
		
	}

}
