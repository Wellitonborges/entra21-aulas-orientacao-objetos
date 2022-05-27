package br.com.entra21.orientacao.objetos.principal.aula04.interfaces;

public class Planta implements Individuo {
	private String nomeCientifico;

	public Planta() {
		super();
	}

	public Planta(String nomeCientifico) {
		super();
		this.nomeCientifico = nomeCientifico;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	@Override
	public void alimentar(String alimento) {
		System.out.println(this.nomeCientifico+" Eu n�o preciso de "+alimento+" Pois fa�o PhotoSintese");
		
	}

	@Override
	public void locomover() {
System.out.println(this.nomeCientifico+"... N�o preciso mexer, pois consigo tudo sem sair daki.  ");
		
	}

	@Override
	public void comunicar(String conteudo) {
		System.out.println(this.nomeCientifico+" Planta n�o fala Porque ainda � Muda");
		
	}
	

}
