package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Fantasma implements Individuo{
	private String assustar;

	public Fantasma() {
		super();
	}

	public Fantasma(String assustar) {
		super();
		this.assustar = assustar;
	}

	public String getAssustar() {
		return assustar;
	}

	public void setAssustar(String assustar) {
		this.assustar = assustar;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.assustar+"Não me alimento pois eu so assusto.");
		
	}

	@Override
	public void locomover() {
		System.out.println("Me locomovo de modo assustador aparecendo onde vc menos espera...");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println("Buuuuuuu...");
		
	}
	

}
