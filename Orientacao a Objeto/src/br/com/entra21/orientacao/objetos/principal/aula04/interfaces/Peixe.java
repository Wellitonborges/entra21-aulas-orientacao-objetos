package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Peixe implements Individuo{
	private String habitate;

	public Peixe() {
		super();
	}

	public Peixe(String habitate) {
		super();
		this.habitate = habitate;
	}

	public String getHabitate() {
		return habitate;
	}

	public void setHabitate(String habitate) {
		this.habitate = habitate;
	}

	@Override
	public void alimentar(String alimento) {
System.out.println(this.habitate+"Outros peixes, ou ração"+alimento);
		
	}

	@Override
	public void locomover() {
		System.out.println(this.habitate+" Sou um peixe e nada melhor que qualwuer um");
		
	}

	@Override
	public void comunicar(String conteudo) {
System.out.println(this.habitate+" Não me comunico com humanos...");
		
	}
	

}
