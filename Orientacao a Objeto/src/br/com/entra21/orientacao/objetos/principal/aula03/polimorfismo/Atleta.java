package br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo;

public class Atleta {
	private String nome;
	private byte age;
	private int qtdWin;
	private int qtdLoss;
	public Atleta () {
		
	}
	
	public Atleta(String nome, byte age, int qtdWin, int qtdLoss) {
		super();
		this.nome = nome;
		this.age = age;
		this.qtdWin = qtdWin;
		this.qtdLoss = qtdLoss;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getQtdWin() {
		return qtdWin;
	}

	public void setQtdWin(int qtdWin) {
		this.qtdWin = qtdWin;
	}

	public int getQtdLoss() {
		return qtdLoss;
	}

	public void setQtdLoss(int qtdLoss) {
		this.qtdLoss = qtdLoss;
	}
	public void comemorarVitoria() {
		System.out.println("Obrigado Deus!");
		this.qtdWin++;
	}

	public void aprenderComDerrota() {
		System.out.println("Mais Sorte na proxima");
		this.qtdLoss++;
	}
}
