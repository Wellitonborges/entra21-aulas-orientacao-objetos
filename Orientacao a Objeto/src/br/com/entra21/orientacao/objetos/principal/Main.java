package br.com.entra21.orientacao.objetos.principal;

import java.util.Scanner;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacao.objetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacao.objetos.principal.aula02.heranca.Pessoa;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacao.objetos.principal.aula03.polimorfismo.Velocista;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitospoo.Ponto;
import br.com.entra21.orientacao.objetos.principal.aula04.conceitospoo.Reta;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Aviao;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Capivara;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Fantasma;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Gato;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Humano;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Peixe;
import br.com.entra21.orientacao.objetos.principal.aula04.interfaces.Planta;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, ent�o � um obj
	// porem o System.in � uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;
		System.out.println("aprendendo sobre orienta��o a objetos");

		do {
			System.out.println("");
			System.out.println("Escolha uma op��o");
			System.out.println("0 - Sair");
			System.out.println("1 - Classes e objetos");
			System.out.println("2 - Heran�a");
			System.out.println("3 - Polimorfismo");
			System.out.println("4 - Aprender conceitos Poo");
			System.out.println("5 - Aprender Polimorfismo Com Interface");
			opcao = entrada.nextByte();

			switch (opcao) {
			case 0:

				break;
			case 1:
				aprenderClasses();
				break;
			case 2:
				aprenderHeranca();
				break;

			case 3:
				aprenderPolimorfismo();

				break;
			case 4:
				aprenderConceitosPOO();
				break;
			case 5:
				aprenderPolimorfismoComInterface();
				break;

			default:
				System.out.println("Escolha um menu correto...");
				break;
			}

		} while (opcao != 0);

	}

	private static void aprenderClasses() {

		// instanciando um objeto da classe Professor na variavel professorJava
		Professor professorJava = new Professor();

		// instanciando um objeto da classe Professor na variavel professoraIngles
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		// Acessando os atributos com encapsulamento
		System.out.println("Nome dela = " + professoraIngles.getNome());
		professoraIngles.setNome("Isabelle 2");
		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela � " + professoraIngles.getIdade());

		// Acessando o atributo est�tico da Classe Professor, atributos est�ticos ou
		// metodos estatico n�o pertencem aos objetos da Classe
		// dessa forma � possivel acessar em a necessidade de criar um objeto com new
		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		// Criando varios objetos da classe Aluno nas variaveis
		// cada variavel � independente e possui seus atributos e metodos
		Aluno alunoTeste = new Aluno();
		Aluno outroAluno = new Aluno();
		Aluno alunoNovato = new Aluno();
		Aluno alunoObjeto;
		alunoObjeto = new Aluno();

		// as altera��es aqui s� afetam esse objeto
		alunoObjeto.idade = 18;

		// as altera��es aqui s� afetam esse objeto
		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		// as altera��es aqui s� afetam esse objeto
		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";

		// Executando varias vezes o metodo desse objeto
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		// Interagindo com o usuario para preencher os atributos do Aluno que ainda n�o
		// tem encapsulamento
		System.out.println("Qual o nome do aluno novato?");
		alunoNovato.nome = entrada.next();

		System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		alunoNovato.idade = entrada.nextByte();

		System.out.println("Bem vindo " + alunoNovato.nome);

	}

	private static void aprenderHeranca() {
		Pessoa pessoa1 = new Pessoa();

		Diretor diretor1 = new Diretor("Paulo", (byte) 80, "08938491212", "Entra21", (byte) 10);
		diretor1.setNome("Paulo");

		Funcionario funcionario1 = new Funcionario();
		funcionario1.setIdade((byte) 22);
		funcionario1.setObservacao("novato");

		Funcionario funcionario2 = new Funcionario("Fulano", (byte) 18, "07821199901", "Junin", 4000.05f);
		funcionario2.getCpf();

	}

	private static void aprenderPolimorfismo() {
		// padrao de polimorfismo para comportamento (m�todo)

		Atleta cr7 = new Atleta();
		cr7.comemorarVitoria();
		cr7.aprenderComDerrota();

		Nadador welliton = new Nadador("Welliton", (byte) 30, 2, 2, "Mar", "Sunga");
		welliton.comemorarVitoria();
		welliton.aprenderComDerrota();
		welliton.setNome("Welliton B");

		Velocista flash = new Velocista();
		flash.setMarcaCalcado("Adidas");
		flash.setNome("Barry Allen");
		flash.comemorarVitoria();
		flash.aprenderComDerrota();

	}

	private static void aprenderConceitosPOO() {

		// a classe ponto tem alta coes�o pois ele � preciso nas suas responsabilidade
		Ponto pontoAlto = new Ponto(30, 10000);
		Ponto esquerdaBaixo = new Ponto(-20, -100);

		// a Classe reta � agregada por pontos que podem n�o estar inicializados.
		// a asocia��o de reta e ponto e de um para muitos respectivamente
		Reta torta = new Reta();
		Reta retaDiagonal = new Reta(pontoAlto, esquerdaBaixo);

	}

	private static void aprenderPolimorfismoComInterface() {

		Humano welliton = new Humano();
		welliton.setNome("Welliton");
		welliton.apresentarSe();
		welliton.alimentar("Ma�a");
		welliton.locomover();
		welliton.comunicar("Oie");

		Gato vezu = new Gato("vezu", new Pessoa("Rubem", (byte) 33, ""));

		vezu.alimentar("rcao");
		vezu.comunicar("Quero racao");
		vezu.locomover();

		Capivara robson = new Capivara();
		robson.alimentar("Agua");
		robson.locomover();

		Planta maracuja = new Planta("Passiflora edulis Sims");

		maracuja.comunicar("t");
		maracuja.alimentar("Carne");
		maracuja.locomover();
		
		Peixe greenTerror = new Peixe();
		greenTerror.alimentar("Ra��o");
		greenTerror.comunicar("N�o consigo me comunicar com pessoas.");
		greenTerror.locomover();
		
		
		
		Fantasma gaspar = new Fantasma();
		gaspar.alimentar("N�o me alimento");
		gaspar.comunicar("Buuuuu........");
		gaspar.locomover();
		
		
		Aviao comercial= new Aviao();
		comercial.setModelo("Boeing 737");
		System.out.println(comercial.freiar());
		comercial.acelerar(870.5f);
		System.out.println(comercial.getVelocidadeAtual());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}


