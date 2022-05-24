package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;

public class Main {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println("Escolha uma opção ");

			System.out.println("0 - Sair");
			System.out.println("1 - Aprender classes");
			System.out.println("2 - Aprender herança");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindoo...");
				break;
			case 1:
				aprenderClassesObjetos();
				break;
			case 2:
				aprenderHeranca();
				
				break;
			default:
				System.out.println("Escolha uma opção valida.");
				break;

			}

		} while (opcao != 0);

	}

	public static void aprenderClassesObjetos() {

		Diretor diretor1 = new Diretor();
		
		diretor1.realizarApresentacao();
		Diretor diretor2 = new Diretor();

		Diretor diretor3 = new Diretor("Paulo",(byte)80);
		Aluno alunoTeste = new Aluno();

		Aluno outroAluno = new Aluno();

		Aluno alunoNovato = new Aluno();

		Aluno alunoObjeto;

		alunoObjeto = new Aluno();

		alunoObjeto.idade = 18;

		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = entrada.next();

		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = entrada.nextByte();

		System.out.println("Bem vindo " + alunoNovato.nome);

	}

	public static void aprenderHeranca() {

	}
}
